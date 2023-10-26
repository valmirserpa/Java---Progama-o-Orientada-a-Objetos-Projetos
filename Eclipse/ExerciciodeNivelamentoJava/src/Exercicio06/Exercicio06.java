/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/

package Exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();

		triangulo = (a * c) / 2;
		circulo = 3.14159 * c * c;
		trapezio = (a + b) / 2 * c;
		quadrado = b * b;
		retangulo = a * b;

		System.out.printf("A área do triângulo é %.3f%n", triangulo);
		System.out.printf("A área do circulo é %.3f%n", circulo);
		System.out.printf("A área do trapézio é %.3f%n", trapezio);
		System.out.printf("A área do quadrado é %.3f%n", quadrado);
		System.out.printf("A área do retângulo é %.3f%n", retangulo);

		scanner.close();

	}

}
