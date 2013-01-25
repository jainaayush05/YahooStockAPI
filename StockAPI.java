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
				stockInfo.setPrice(Float.valueOf(yahooStockInfo[2]));
				stockInfo.setChange(yahooStockInfo[3]);
				stockInfo.setDayLow(Float.valueOf(yahooStockInfo[4]));
				stockInfo.setDayHigh(Float.valueOf(yahooStockInfo[5]));
				stockInfo.setYearLow(Float.valueOf(yahooStockInfo[6]));
				stockInfo.setYearHigh(Float.valueOf(yahooStockInfo[7]));
				stockInfo.setMarketCap(yahooStockInfo[8]);
				stockInfo.setOpen(Float.valueOf(yahooStockInfo[9]));
				stockInfo.setPrevClose(Float.valueOf(yahooStockInfo[10]));
				stockInfo.setChangePercent(yahooStockInfo[11]);
				stockInfo.setVolume(Long.valueOf(yahooStockInfo[12]));
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
