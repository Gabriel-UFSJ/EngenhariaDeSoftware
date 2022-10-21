package Model;

public class Product extends Entity{
	
	private Float PriceProdution;
	private Float PriceSell;
	private Integer QuantityStock;
	
	public Float getPriceProdution() {
		return PriceProdution;
	}
	public void setPriceProdution(Float priceProdution) {
		PriceProdution = priceProdution;
	}
	public Float getPriceSell() {
		return PriceSell;
	}
	public void setPriceSell(Float priceSell) {
		PriceSell = priceSell;
	}
	public Integer getQuantityStock() {
		return QuantityStock;
	}
	public void setQuantityStock(Integer quantityStock) {
		QuantityStock = quantityStock;
	}
	
	
}
