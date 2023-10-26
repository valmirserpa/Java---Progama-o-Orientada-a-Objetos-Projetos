package entities;

public class Products {
	
	// ATRIBUTOS
	private String name;
	private double price;
	private double tax;
	
	
	
	// MÉTODOS
	public double somarValor(Double price) {
		return price+=price;
	}
	
	public double dobrarValor(Double price) {
		return price*price;
	}
	
	// GETTERS AND SETTERS
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setTax(Double tax) {
		this.tax=tax;
	}

	public double getTax() {
		return tax;
	}
	
	// TOSTRING
	
	
}
