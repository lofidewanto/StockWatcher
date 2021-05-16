package stockwatcher.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dominokit.rest.shared.request.service.annotations.RequestFactory;

import stockwatcher.shared.StockPrice;
import stockwatcher.shared.StockPriceServiceEndpoint;

@RequestFactory
public interface StockPriceServiceClient {

	@GET
	@Path(StockPriceServiceEndpoint.STOCK_PRICE_REST)
	public StockPrice[] getPrices(@QueryParam("symbols") String[] symbols);
}
