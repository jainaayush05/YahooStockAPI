package com.aayush;

public class StockModel {
  String ticker;
	String name;
	
	String price;
	String change;
	String dayLow;
	String dayHigh;
	String yearLow;
	String yearHigh;
	String open;
	String prevClose;
	String changePercent; 
	
	String chartUrlSmall;
	String chartUrlLarge;
	
	String marketCap;
	String volume;
	long lastUpdated;
	//Ticker
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	//Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Price
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	//Change
	public String getChange() {
		return change;
	}
	public void setChange(String change) {
		this.change = change;
	}
	//DayHigh
	public String getDayHigh() {
		return dayHigh;
	}
	public void setDayHigh(String dayHigh) {
		this.dayHigh = dayHigh;
	}
	//DayLow
	public String getDayLow() {
		return dayLow;
	}
	public void setDayLow(String dayLow) {
		this.dayLow= dayLow;
	}
	//YearHigh
	public String getYearHigh() {
		return yearHigh;
	}
	public void setYearHigh(String yearHigh) {
		this.yearHigh = yearHigh;
	}
	//YearLow
	public String getyearLow() {
		return yearLow;
	}
	public void setYearLow(String yearLow) {
		this.yearLow= yearLow;
	}
	//open
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open= open;
	}
	//prev close
	public String getPrevClose() {
		return prevClose;
	}
	public void setPrevClose(String prevClose) {
		this.prevClose= prevClose;
	}
	//Change Percent
	public String getChangePercent() {
		return changePercent;
	}
	public void setChangePercent(String changePercent) {
		this.changePercent= changePercent;
	}
	
	//Get small URL IMAGE
	public String getChartUrlSmall() {
		return chartUrlSmall;
	}
	public void setChartUrlSmall(String chartUrlSmall) {
		this.chartUrlSmall = chartUrlSmall;
	}
	//Get Large URL Image
	public String getChartUrlLarge() {
		return chartUrlLarge;
	}
	public void setChartUrlLarge(String chartUrlLarge) {
		this.chartUrlLarge = chartUrlLarge;
	}
	//Market cap
	public String getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(String marketCap) {
		this.marketCap = marketCap;
	}
	
	//Volume
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	//Updated_at
	public long getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(long lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
}
