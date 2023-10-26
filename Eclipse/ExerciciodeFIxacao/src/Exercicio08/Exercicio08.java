
/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
*/

package Exercicio08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N;

		N = scanner.nextInt();

		if (N % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}

		scanner.close();
	}

}
