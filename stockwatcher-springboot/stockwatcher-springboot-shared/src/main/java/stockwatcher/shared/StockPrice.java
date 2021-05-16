package stockwatcher.shared;

import java.io.Serializable;

import org.dominokit.jackson.annotation.JSONMapper;

import com.fasterxml.jackson.annotation.JsonIgnore;

@JSONMapper
public class StockPrice implements Serializable {

	private static final long serialVersionUID = 1L;

	private String symbol;
	private double price;
	private double change;

	public StockPrice() {
	}

	public StockPrice(String symbol, double price, double change) {
		this.symbol = symbol;
		this.price = price;
		this.change = change;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public double getPrice() {
		return this.price;
	}

	public double getChange() {
		return this.change;
	}

	@JsonIgnore
	public double getChangePercent() {
		return 100.0 * this.change / this.price;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setChange(double change) {
		this.change = change;
	}

	@Override
	public String toString() {
		return "StockPrice [symbol=" + symbol + ", price=" + price + ", change=" + change + "]";
	}
	
}
