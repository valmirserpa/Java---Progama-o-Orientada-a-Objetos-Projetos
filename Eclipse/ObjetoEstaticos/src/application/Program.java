package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159;
	/* O nome de um objeto constante sempre 
	 * deverá ser escrito em letras maiúsculas e 
	 * adicionamos o final para informar que o valor 
	 * deste objeto será constante*/

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		double v = volume(radius);
		
		/* Aqui estou criando 2 funções que receberam 
		 * como parâmetro o raio e o cálculo dessas fusões 
		 * serão criados fora do escopo principal da classe*/
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		sc.close();
	}

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
		
		/* A criação da função sempre deverá ser feita fora 
		 * do escopo main e sempre deverá ser estática por que 
		 * a função irá retornar um valor para uma chamada que 
		 * está dentro do bloco da função main */
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}