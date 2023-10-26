package entities;

import java.util.Scanner;

public class Products {
	
	private String name;
	private double price;
	private double tax;
	
	
	public double somarValor(Double price) {
		return price+=price;
	}
	
	public double dobrarValor(Double price) {
		return price*price;
	}
	
	
	public void setName(Scanner scanner) {
		System.out.println("Escreva o nome do produto: ");
		this.name=scanner.nextLine();
	}
	
	public String getName() {
		return name;
	}
	
	

}
