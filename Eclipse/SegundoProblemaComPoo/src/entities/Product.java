package entities;

public class Product {

		public String name;
		public double price;
		public int quantity;
		
		public double totalValueInStock() {
			return price*quantity;
			
		}
		
		public void addProduct(int quantity) {
			this.quantity=quantity+this.quantity;
			
		}
		
		
		public void removeProduct(int quantity) {
			this.quantity=this.quantity-quantity; // uso o this para me referir ao quantity do atributo
			
		}
		
		public String toString() { // estou sobrescrevendo o toString padrão
			return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());
			
		}
		
	}


