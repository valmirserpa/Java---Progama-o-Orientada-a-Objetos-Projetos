package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc	= new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		
		System.out.println("Name: ");
		product.name=sc.nextLine();
		
		System.out.println("Price: ");
		product.price=sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		product.quantity=sc.nextInt();
		
		System.out.println("Product data: " + product.name +", "+product.price+", "+product.quantity);
		System.out.println("====================");
		//or
		System.out.println("Product data: " + product.toString());
		System.out.println("====================");
		//or
		System.out.println("Product data: " + product); 
		/* automaticamente o java detecta que o meu objeto está num contexto que está
		 * esperando uma string e implicitamente irá chamar o toString */
		
		System.out.println("========================");
		System.out.println("Enter the number of product to be added in stock: ");
		int quantity; // or int quantity = sc.nextInt();
		quantity=sc.nextInt();
		product.addProduct(quantity); /*Desta forma estou atualizando o método addProduct na classe product colocando 
									como parâmetro a variável quantity que está recebendo o número 
									de produtos adicionados*/
		
		System.out.println("========================");
		System.out.println("Update data: " + product);
		
		System.out.println("========================");
		System.out.println("Enter the number of product to be removed from stock: ");
		quantity=sc.nextInt();
		product.removeProduct(quantity);
		
		System.out.println("========================");
		System.out.println("Update data: " + product);
		
		sc.close();
		
		

	}

}
