/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
*/

package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num;
		num = scanner.nextInt();

		if (num >= 0) {
			System.out.println("POSITIVO");
		} else {
			System.out.println("NEGATIVO");
		}

		scanner.close();

	}

}
