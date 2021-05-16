package stockwatcher.controller;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import stockwatcher.shared.StockPrice;
import stockwatcher.shared.StockPriceServiceEndpoint;

@CrossOrigin
@RestController
public class StockPriceRestController {
	
	private static Logger logger = Logger.getLogger(StockPriceRestController.class.getName());

	public StockPrice[] prices = new StockPrice[] { new StockPrice("AMZN", 100, 0.3), new StockPrice("MSFT", 10, 0.5) };
	
	private static final double MAX_PRICE = 100.0; // $100.00
	private static final double MAX_PRICE_CHANGE = 0.02; // +/- 2%

	@GetMapping(StockPriceServiceEndpoint.STOCK_PRICE_REST)
	public StockPrice[] getPrices(@RequestParam String[] symbols) {
		logger.info("Symbols: " + Arrays.toString(symbols));
		
		if (symbols.length > 0) {
			Random rnd = new Random();

			StockPrice[] prices = new StockPrice[symbols.length];
			for (int i = 0; i < symbols.length; i++) {
				double price = rnd.nextDouble() * MAX_PRICE;
				double change = price * MAX_PRICE_CHANGE * (rnd.nextDouble() * 2f - 1f);

				prices[i] = new StockPrice(symbols[i], price, change);
			}
			
			return prices;
		}
		
		return prices; // default
	}

	@GetMapping(StockPriceServiceEndpoint.HELLO_REST + "/{id}")
	public Integer hello(@PathVariable int id) {
		return ++id;
	}
}
