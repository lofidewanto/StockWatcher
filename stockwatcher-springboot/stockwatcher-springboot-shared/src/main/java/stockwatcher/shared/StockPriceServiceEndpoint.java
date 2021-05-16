package stockwatcher.shared;

public interface StockPriceServiceEndpoint {
	
	String SERVER_SEPARATOR = "/";
	
	String SERVER_CONTEXT_NAME = "server";

	String SERVER_CONTEXT_PATH = "http://localhost:8080/" + SERVER_CONTEXT_NAME;

	String STOCK_PRICE_RPC = "/stockPricesRpc";

	String STOCK_PRICE_REST = "/stockPrices";

	String HELLO_REST = "/hello";
	
}
