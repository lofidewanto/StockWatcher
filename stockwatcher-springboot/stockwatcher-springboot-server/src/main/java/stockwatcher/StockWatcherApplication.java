package stockwatcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import stockwatcher.server.StockPriceServiceImpl;

@SpringBootApplication
public class StockWatcherApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockWatcherApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean<StockPriceServiceImpl> servletRegistrationBean() {
		return new ServletRegistrationBean<StockPriceServiceImpl>(new StockPriceServiceImpl(), "/stockwatcher" + "/*");
	}

}
