package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	//Construtor
	
	public Product(String name, double price, int quantity) {
		this.name= name;
		this.price= price;
		this.quantity= quantity;
		
		/*Para diferenciar o atributo do parâmentro do construtos,
		 * utilizamos o this. para fazer refência. Os nomes dos parâmetros
		 * são os memos dos atributos por convenção, ou seja, podem ser outros nomes*/
		
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
				+ ", " + quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}