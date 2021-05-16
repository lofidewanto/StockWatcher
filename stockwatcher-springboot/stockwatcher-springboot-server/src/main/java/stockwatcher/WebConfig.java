package stockwatcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import stockwatcher.server.StockPriceServiceImpl;
import stockwatcher.shared.StockPriceServiceEndpoint;

@Configuration
public class WebConfig {

	private final Logger logger = LoggerFactory.getLogger(WebConfig.class);

	@Bean
	public ServletRegistrationBean<StockPriceServiceImpl> servletRegistrationBean() {
		logger.info("Registering " + StockPriceServiceEndpoint.SERVER_SEPARATOR
				+ StockPriceServiceEndpoint.SERVER_CONTEXT_NAME + StockPriceServiceEndpoint.STOCK_PRICE_RPC + "/*");

		return new ServletRegistrationBean<StockPriceServiceImpl>(new StockPriceServiceImpl(),
				StockPriceServiceEndpoint.STOCK_PRICE_RPC + "/*");
	}

}