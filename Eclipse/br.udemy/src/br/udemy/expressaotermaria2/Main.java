package br.udemy.expressaotermaria2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantos anos vc tem?");
		Integer idade = scanner.nextInt();

		String resultado = idade > 10 ? "Adolescente" : "Criança";
		System.out.println(resultado);

		scanner.close();

	}

}
