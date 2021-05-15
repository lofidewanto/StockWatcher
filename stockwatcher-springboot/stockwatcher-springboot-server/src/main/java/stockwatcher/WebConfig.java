package stockwatcher;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import stockwatcher.server.StockPriceServiceImpl;

@Configuration
public class WebConfig {

	@Bean
	public ServletRegistrationBean<StockPriceServiceImpl> servletRegistrationBean() {
		return new ServletRegistrationBean<StockPriceServiceImpl>(new StockPriceServiceImpl(), "/stockwatcher/stockPrice" + "/*");
	}

}