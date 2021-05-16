package stockwatcher;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import stockwatcher.server.StockPriceServiceImpl;
import stockwatcher.shared.StockPriceServiceEndpoint;

@Configuration
public class WebConfig {

	@Bean
	public ServletRegistrationBean<StockPriceServiceImpl> servletRegistrationBean() {
		return new ServletRegistrationBean<StockPriceServiceImpl>(new StockPriceServiceImpl(),
				StockPriceServiceEndpoint.SERVER_SEPARATOR + StockPriceServiceEndpoint.SERVER_CONTEXT_NAME
						+ StockPriceServiceEndpoint.STOCK_PRICE_RPC + "/*");
	}

}