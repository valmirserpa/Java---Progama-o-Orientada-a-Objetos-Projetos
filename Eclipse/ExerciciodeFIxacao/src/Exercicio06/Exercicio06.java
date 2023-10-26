/*
Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B.
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

		System.out.printf("A �rea do tri�ngulo � %.3f%n", triangulo);
		System.out.printf("A �rea do circulo � %.3f%n", circulo);
		System.out.printf("A �rea do trap�zio � %.3f%n", trapezio);
		System.out.printf("A �rea do quadrado � %.3f%n", quadrado);
		System.out.printf("A �rea do ret�ngulo � %.3f%n", retangulo);

		scanner.close();

	}

}
