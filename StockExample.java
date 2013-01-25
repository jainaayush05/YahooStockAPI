import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.aayush.StockAPI;
import com.aayush.StockModel;


public class StockExample {

  /**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the Company Code, Eg.\"GOOG\" :");
		InputStreamReader irs = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(irs);
		String symbol = in.readLine();
		StockModel stock= StockAPI.getStockData(symbol);
		System.out.println("Name :"+stock.getName());
		System.out.println("Price :"+stock.getPrice());
		System.out.println("Change :"+stock.getChange());
		System.out.println("Day High :"+stock.getDayHigh());
		System.out.println("Day Low :"+stock.getDayLow());
		System.out.println("Year High :"+stock.getYearHigh());
		System.out.println("Year Low :"+stock.getyearLow());
		System.out.println("Open :"+stock.getOpen());
		System.out.println("Close :"+stock.getPrevClose());
		System.out.println("ChangePercent :"+stock.getChangePercent());
		System.out.println("Market Cap :"+stock.getMarketCap());
		System.out.println("Volume :"+stock.getVolume());
		
		//Display Plot
		BufferedImage img = ImageIO.read(new URL(stock.getChartUrlLarge()));
		ImageIcon icon = new ImageIcon();
		icon.setImage(img);
		JOptionPane.showMessageDialog(null, icon);
		
		
	}

}
