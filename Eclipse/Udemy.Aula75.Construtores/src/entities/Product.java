package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	
	
	public Product(String name, double price, int quantity) {
		
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		
		/*O construtor � uma opera��o executada no momento da estancia��o,
		 * serve para permitir ou obrigar que valores seja inseridos.
		 * 
		 * Estrutura: public -para ser acessado por outras classes + nome da
		 * classe	 
		 * */		
	}
	
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}