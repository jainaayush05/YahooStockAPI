/*Created By Aayush Jain
 * jainaayush05@gmail.com*/
package com.aayush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;

public class StockAPI {
	private static HashMap<String, StockModel> stocks = new HashMap<String, StockModel>();
	
	public static StockModel getStockData(String symbol) {
		try {
			
			URL yahoofin = new URL("http://finance.yahoo.com/d/quotes.csv?s=" + symbol + "&f=snl1c6ghjkj3opp2v&e=.csv");
			URLConnection yc = yahoofin.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
			String inputLine;
			
			while ((inputLine = in.readLine()) != null) {
				String[] yahooStockInfo = inputLine.split(",");
				StockModel stockInfo = new StockModel();
				stockInfo.setTicker(yahooStockInfo[0].replaceAll("\"", ""));
				stockInfo.setName(yahooStockInfo[1].replaceAll("\"", ""));
				stockInfo.setPrice(yahooStockInfo[2].replaceAll("\"", ""));
				stockInfo.setChange(yahooStockInfo[3].replaceAll("\"", ""));
				stockInfo.setDayLow(yahooStockInfo[4].replaceAll("\"", ""));
				stockInfo.setDayHigh(yahooStockInfo[5].replaceAll("\"", ""));
				stockInfo.setYearLow(yahooStockInfo[6].replaceAll("\"", ""));
				stockInfo.setYearHigh(yahooStockInfo[7].replaceAll("\"", ""));
				stockInfo.setMarketCap(yahooStockInfo[8].replaceAll("\"", ""));
				stockInfo.setOpen(yahooStockInfo[9].replaceAll("\"", ""));
				stockInfo.setPrevClose(yahooStockInfo[10].replaceAll("\"", ""));
				stockInfo.setChangePercent(yahooStockInfo[11].replaceAll("\"", ""));
				stockInfo.setVolume(yahooStockInfo[12].replaceAll("\"", ""));
				stockInfo.setChartUrlSmall("http://ichart.finance.yahoo.com/t?s=" + stockInfo.getTicker());
				stockInfo.setChartUrlLarge("http://chart.finance.yahoo.com/w?s=" + stockInfo.getTicker());
				stockInfo.setLastUpdated((new Date()).getTime());
				stocks.put(symbol, stockInfo);
				break;
			}
			in.close();
		} catch (Exception ex) {
			System.out.println("Unable to get stockinfo for: " + symbol + ex);
		}
		return stocks.get(symbol);
     }

}
