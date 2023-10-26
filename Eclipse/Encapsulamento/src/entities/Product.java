package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	/*Para encapsular basta definir os atributos
	 * como privados e só serão acessados ou modificados
	 * através dos métodos getters e setters*/

	// Construtor

	public Product() {
		
		/*Construtor opcional*/
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;


		/*
		 * Para diferenciar o atributo do parâmentro do construtos, utilizamos o this.
		 * para fazer refência. Os nomes dos parâmetros são os memos dos atributos por
		 * convenção, ou seja, podem ser outros nomes
		 */
	
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;

		/*
		 * this.quantity= 0; Iniciar o atributo com zero é redundância, visto que por
		 * padrão, quando está vázio automaticamente a classe entende que o seu valor é
		 * zero. Como támbém é desnecessário colocar o this. porque não está ocorrendo
		 * ambiguidade entre o atributo e o parâmetro do construtor. Estão pode retirar
		 * por completo, quando o seu valor inicial é zero
		 */

		/*
		 * Sobrecarga : É disponíbilizar mais de uma operação com o mesmo nome,
		 * a diferença entre elas será lista de parâmentros.
		 * É uma função da classe, com o objetivo de oferecer mais de uma
		 * operação com o mesmo nome, porém com diferentes parâmetros.
		 */
	}

	// Métodos acessores e modificadores
	
	public void setName(String name) {
		this.name=name;
		/* Como é um método que irá acessar o atributo, será "void", porque 
		 * não irá retormar o valor, só modificar, coloco o parâmetro modificador
		 * e depois sinalizado através do this. que irei modificar o atributo da classe*/
	}
	
	public String getName() {
		return name;
		/*Neste caso irá retornar o valor do atributo, por isso preciso infomar o tipo da
		 * variável do atributo que eu quero a acessar e obter a informação*/
	}

	public void setPrice(double price) {
		this.price=price;
		
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	// Métodos
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
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
		/* toString serve para converter para String*/
	}
}