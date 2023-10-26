package program;

import java.util.Scanner;

import entities.Products;

public class Encapsulamento {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Products produto = new Products();

		System.out.println("Nome do produto: ");
		String name = scanner.nextLine();

		System.out.println("Digite o valor:");
		double price = scanner.nextDouble();
		scanner.nextLine();

		System.out.println(name);
		System.out.println(price);
		System.out.println(produto.dobrarValor(price));
		System.out.println(produto.somarValor(price));
		
		System.out.println("===============================");
		
		System.out.println("Escreva o nome do produto");
		name = scanner.nextLine();
		produto.setName(name);
		
		System.out.println("Digite o segundo valor: ");
		price = scanner.nextDouble();
		produto.setPrice(price);
		
		System.out.println(produto.getName());
		System.out.println(produto.getPrice());

		scanner.close();

	}

}
