/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

package Exercicio03;

import java.util.Scanner;

public class Exercio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int a, b, c, d, prodA, prodB, dif;

		System.out.println("Digite 4 nÃºmeros: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();

		prodA = a * b;
		prodB = c * d;
		dif = prodA - prodB;

		System.out.println(dif);

	}

}
