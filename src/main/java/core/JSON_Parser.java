package core;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.DecimalFormat;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

public class JSON_Parser {
	
	public static void main(String[] args) throws IOException {
		
				
		//final String element_01 = "id";
		final String element_02 = "Rate";
		
		String item_01_name = "Soccer Ball";
		Double item_01_usd_price = 35.00;
		
		String item_02_name = "Monitor";
		Double item_02_usd_price = 119.00;
		
		String item_03_name = "Galaxy Tab 4";
		Double item_03_usd_price = 146.99;
		
		String item_04_name = "HERO3+";
		Double item_04_usd_price = 399.00;
		
		String item_05_name = "Apple iPhone 5s";
		Double item_05_usd_price = 657.98;
		
		String ip_address_01 = "88.191.179.56";
		String ip_address_02 = "61.135.248.220";
		String ip_address_03 = "92.40.254.196";
		String ip_address_04 = "93.183.203.67";
		String ip_address_05 = "213.87.141.36";
		
		final String country_name = "geoplugin_countryName";
		final String currency_code = "geoplugin_currencyCode";
		String country_01_name = null;    // "France"
		String country_02_name = null;    // "China"
		String country_03_name = null;    // "United Kingdom"
		String country_04_name = null;    // "Ukraine"
		String country_05_name = null;    // "Russia "
		
		String us_code = "USD";
		
		String country_01_code = null;    // EUR => us_code + country_01_code = USDEUR
		String country_02_code = null;    // CNY
		String country_03_code = null;    // GBP
		String country_04_code = null;    // UAH
		String country_05_code = null;    // RUB
		
		Double item_01_eur_price = null; // 25.73
		Double item_01_cny_price = null; // 217.49
		Double item_01_gbp_price = null; // 20.39
		Double item_01_uah_price = null; // 414.61
		Double item_01_rub_price = null; // 1200.97
		
		Double item_02_eur_price = null; 
		Double item_02_cny_price = null; 
		Double item_02_gbp_price = null; 
		Double item_02_uah_price = null; 
		Double item_02_rub_price = null; 
		
		Double item_03_eur_price = null; 
		Double item_03_cny_price = null; 
		Double item_03_gbp_price = null; 
		Double item_03_uah_price = null; 
		Double item_03_rub_price = null;
		
		Double item_04_eur_price = null; 
		Double item_04_cny_price = null; 
		Double item_04_gbp_price = null; 
		Double item_04_uah_price = null; 
		Double item_04_rub_price = null;
		
		Double item_05_eur_price = null; 
		Double item_05_cny_price = null; 
		Double item_05_gbp_price = null; 
		Double item_05_uah_price = null; 
		Double item_05_rub_price = null;
		
		URL url1 = new URL("http://www.geoplugin.net/json.gp?ip=" + ip_address_01);
		URL url2 = new URL("http://www.geoplugin.net/json.gp?ip=" + ip_address_02);
		URL url3 = new URL("http://www.geoplugin.net/json.gp?ip=" + ip_address_03);
		URL url4 = new URL("http://www.geoplugin.net/json.gp?ip=" + ip_address_04);
		URL url5 = new URL("http://www.geoplugin.net/json.gp?ip=" + ip_address_05);
		
		InputStream is1 = url1.openStream();
		JsonParser parser1 = Json.createParser(is1);

		while (parser1.hasNext()) {

		Event e1 = parser1.next();

		if (e1 == Event.KEY_NAME) {

			switch (parser1.getString()) {

			case country_name:
				parser1.next();
				country_01_name = parser1.getString();
			break;

			case currency_code:
				parser1.next();
				country_01_code = parser1.getString();
			break;
			
			}

		}
	}
		InputStream is2 = url2.openStream();
		JsonParser parser2 = Json.createParser(is2);

		while (parser2.hasNext()) {

		Event e2 = parser2.next();

		if (e2 == Event.KEY_NAME) {

			switch (parser2.getString()) {

			case country_name:
				parser2.next();
				country_02_name = parser2.getString();
			break;

			case currency_code:
				parser2.next();
				country_02_code = parser2.getString();
			break;
			
			}

		}
	}
		InputStream is3 = url3.openStream();
		JsonParser parser3 = Json.createParser(is3);

		while (parser3.hasNext()) {

		Event e3 = parser3.next();

		if (e3 == Event.KEY_NAME) {

			switch (parser3.getString()) {

			case country_name:
				parser3.next();
				country_03_name = parser3.getString();
			break;

			case currency_code:
				parser3.next();
				country_03_code = parser3.getString();
			break;
			
			}

		}
	}
		InputStream is4 = url4.openStream();
		JsonParser parser4 = Json.createParser(is4);

		while (parser4.hasNext()) {

		Event e4 = parser4.next();

		if (e4 == Event.KEY_NAME) {

			switch (parser4.getString()) {

			case country_name:
				parser4.next();
				country_04_name = parser4.getString();
			break;

			case currency_code:
				parser4.next();
				country_04_code = parser4.getString();
			break;
			
			}
			

		}
	}
		
		InputStream is5 = url5.openStream();
		JsonParser parser5 = Json.createParser(is5);

		while (parser5.hasNext()) {

		Event e5 = parser5.next();

		if (e5 == Event.KEY_NAME) {

			switch (parser5.getString()) {

			case country_name:
				parser5.next();
				country_05_name = parser5.getString();
			break;

			case currency_code:
				parser5.next();
				country_05_code = parser5.getString();
			break;
			
			}
			

		}
	}
		URL url_01_rate = new URL("http://query.yahooapis.com/v1/public/yql?q"
				+ "=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20%28%22"
				+ us_code + country_01_code + "%22%29&format=json&env=store:"
						+ "//datatables.org/alltableswithkeys");
		URL url_02_rate = new URL("http://query.yahooapis.com/v1/public/yql?q"
				+ "=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20%28%22"
				+ us_code + country_02_code + "%22%29&format=json&env=store:"
						+ "//datatables.org/alltableswithkeys");
		URL url_03_rate = new URL("http://query.yahooapis.com/v1/public/yql?q"
				+ "=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20%28%22"
				+ us_code + country_03_code + "%22%29&format=json&env=store:"
						+ "//datatables.org/alltableswithkeys");
		URL url_04_rate = new URL("http://query.yahooapis.com/v1/public/yql?q"
				+ "=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20%28%22"
				+ us_code + country_04_code + "%22%29&format=json&env=store:"
						+ "//datatables.org/alltableswithkeys");
		URL url_05_rate = new URL("http://query.yahooapis.com/v1/public/yql?q"
				+ "=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20%28%22"
				+ us_code + country_05_code + "%22%29&format=json&env=store:"
						+ "//datatables.org/alltableswithkeys");
		
		InputStream is = url_01_rate.openStream();
		JsonParser parser = Json.createParser(is);

		while (parser.hasNext()) {

		Event e = parser.next();

		if (e == Event.KEY_NAME) {

			switch (parser.getString()) {

			case element_02:
				parser.next();
				item_01_eur_price = (Double.parseDouble(parser.getString())) * item_01_usd_price;
				item_02_eur_price = (Double.parseDouble(parser.getString())) * item_02_usd_price;
				item_03_eur_price = (Double.parseDouble(parser.getString())) * item_03_usd_price;
				item_04_eur_price = (Double.parseDouble(parser.getString())) * item_04_usd_price;
				item_05_eur_price = (Double.parseDouble(parser.getString())) * item_05_usd_price;
			break;

			}

		}
	}
		
		InputStream is_02 = url_02_rate.openStream();
		JsonParser parser_02 = Json.createParser(is_02);

		while (parser_02.hasNext()) {

		Event e = parser_02.next();

		if (e == Event.KEY_NAME) {

			switch (parser_02.getString()) {

			case element_02:
				parser_02.next();
				item_01_cny_price = (Double.parseDouble(parser_02.getString())) * item_01_usd_price;
				item_02_cny_price = (Double.parseDouble(parser_02.getString())) * item_02_usd_price;
				item_03_cny_price = (Double.parseDouble(parser_02.getString())) * item_03_usd_price;
				item_04_cny_price = (Double.parseDouble(parser_02.getString())) * item_04_usd_price;
				item_05_cny_price = (Double.parseDouble(parser_02.getString())) * item_05_usd_price;
				
			break;

			}

		}
	}
		
		InputStream is_03 = url_03_rate.openStream();
		JsonParser parser_03 = Json.createParser(is_03);

		while (parser_03.hasNext()) {

		Event e = parser_03.next();

		if (e == Event.KEY_NAME) {

			switch (parser_03.getString()) {

			case element_02:
				parser_03.next();
				item_01_gbp_price = (Double.parseDouble(parser_03.getString())) * item_01_usd_price;
				item_02_gbp_price = (Double.parseDouble(parser_03.getString())) * item_02_usd_price;
				item_03_gbp_price = (Double.parseDouble(parser_03.getString())) * item_03_usd_price;
				item_04_gbp_price = (Double.parseDouble(parser_03.getString())) * item_04_usd_price;
				item_05_gbp_price = (Double.parseDouble(parser_03.getString())) * item_05_usd_price;
				
			break;

			}

		}
	}
		
		InputStream is_04 = url_04_rate.openStream();
		JsonParser parser_04 = Json.createParser(is_04);

		while (parser_04.hasNext()) {

		Event e = parser_04.next();

		if (e == Event.KEY_NAME) {

			switch (parser_04.getString()) {

			case element_02:
				parser_04.next();
				item_01_uah_price = (Double.parseDouble(parser_04.getString())) * item_01_usd_price;
				item_02_uah_price = (Double.parseDouble(parser_04.getString())) * item_02_usd_price;
				item_03_uah_price = (Double.parseDouble(parser_04.getString())) * item_03_usd_price;
				item_04_uah_price = (Double.parseDouble(parser_04.getString())) * item_04_usd_price;
				item_05_uah_price = (Double.parseDouble(parser_04.getString())) * item_05_usd_price;
				
			break;

			}

		}
	}
		
		InputStream is_05 = url_05_rate.openStream();
		JsonParser parser_05 = Json.createParser(is_05);

		while (parser_05.hasNext()) {

		Event e = parser_05.next();

		if (e == Event.KEY_NAME) {

			switch (parser_05.getString()) {

			case element_02:
				parser_05.next();
				item_01_rub_price = (Double.parseDouble(parser_05.getString())) * item_01_usd_price;
				item_02_rub_price = (Double.parseDouble(parser_05.getString())) * item_02_usd_price;
				item_03_rub_price = (Double.parseDouble(parser_05.getString())) * item_03_usd_price;
				item_04_rub_price = (Double.parseDouble(parser_05.getString())) * item_04_usd_price;
				item_05_rub_price = (Double.parseDouble(parser_05.getString())) * item_05_usd_price;
				
			break;

			}

		}
	}
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Country: " + country_01_name + "; Local Price: " + df.format(item_01_eur_price));
		System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Country: " + country_02_name + "; Local Price: " + df.format(item_01_cny_price));
		System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Country: " + country_03_name + "; Local Price: " + df.format(item_01_gbp_price));
		System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Country: " + country_04_name + "; Local Price: " + df.format(item_01_uah_price));
		System.out.println("Item_01: " + item_01_name + "; US Price: " + item_01_usd_price + "; Country: " + country_05_name + "; Local Price: " + df.format(item_01_rub_price));
		
		System.out.println("=============================================================================================================================================");
		
		System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Country: " + country_01_name + "; Local Price: " + df.format(item_02_eur_price));
		System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Country: " + country_02_name + "; Local Price: " + df.format(item_02_cny_price));
		System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Country: " + country_03_name + "; Local Price: " + df.format(item_02_gbp_price));
		System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Country: " + country_04_name + "; Local Price: " + df.format(item_02_uah_price));
		System.out.println("Item_02: " + item_02_name + "; US Price: " + item_02_usd_price + "; Country: " + country_05_name + "; Local Price: " + df.format(item_02_rub_price));
		
        System.out.println("=============================================================================================================================================");
		
		System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Country: " + country_01_name + "; Local Price: " + df.format(item_03_eur_price));
		System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Country: " + country_02_name + "; Local Price: " + df.format(item_03_cny_price));
		System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Country: " + country_03_name + "; Local Price: " + df.format(item_03_gbp_price));
		System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Country: " + country_04_name + "; Local Price: " + df.format(item_03_uah_price));
		System.out.println("Item_03: " + item_03_name + "; US Price: " + item_03_usd_price + "; Country: " + country_05_name + "; Local Price: " + df.format(item_03_rub_price));
	
        System.out.println("=============================================================================================================================================");
		
		System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Country: " + country_01_name + "; Local Price: " + df.format(item_04_eur_price));
		System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Country: " + country_02_name + "; Local Price: " + df.format(item_04_cny_price));
		System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Country: " + country_03_name + "; Local Price: " + df.format(item_04_gbp_price));
		System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Country: " + country_04_name + "; Local Price: " + df.format(item_04_uah_price));
		System.out.println("Item_04: " + item_04_name + "; US Price: " + item_04_usd_price + "; Country: " + country_05_name + "; Local Price: " + df.format(item_04_rub_price));
	
        System.out.println("=============================================================================================================================================");
		
		System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Country: " + country_01_name + "; Local Price: " + df.format(item_05_eur_price));
		System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Country: " + country_02_name + "; Local Price: " + df.format(item_05_cny_price));
		System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Country: " + country_03_name + "; Local Price: " + df.format(item_05_gbp_price));
		System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Country: " + country_04_name + "; Local Price: " + df.format(item_05_uah_price));
		System.out.println("Item_05: " + item_05_name + "; US Price: " + item_05_usd_price + "; Country: " + country_05_name + "; Local Price: " + df.format(item_05_rub_price));
	}
}
