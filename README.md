YahooStockAPI
=============

A JAVA Interface for Yahoo Finance API


Usage:

Import StockAPI.java and StockModel.java to you package and add it to build path

<pre>

StockModel stock = StockAPI.getStockData("GOOG");
String price= stock.getPrice();
String change= stock.getChange();
String day_high= stock.getDayHigh();
String day_low= stock.getDayLow();
String year_high= stock.getYearHigh();
String year_low= stock.getyearLow();
String open= stock.getOpen();
String close= stock.getPrevClose();
String cap= stock.getMarketCap();
String vol= stock.getVolume();
String last_updated= stock.getLastUpdated();
String change= stock.getChangePercent();
String url_small= stock.getChartUrlSmall();
String url_large= stock.getChartUrlLarge();

</pre>
Download prebuilt jar from here:
http://dl.dropbox.com/u/61561776/YahooAPIAayush.jar

