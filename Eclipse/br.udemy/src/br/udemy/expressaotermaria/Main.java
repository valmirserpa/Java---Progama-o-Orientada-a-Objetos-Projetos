package br.udemy.expressaotermaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Homem ou mulher?");
		String sexo = scanner.nextLine();
		
		String resultado = (sexo == "Homem")? "homem":"Mulher";
	
		System.out.println(resultado);

		scanner.close();
		
		

	}

}
