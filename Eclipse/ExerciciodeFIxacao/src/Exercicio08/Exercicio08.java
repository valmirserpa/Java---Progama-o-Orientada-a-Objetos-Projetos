
/*
Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
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
			System.out.println("�MPAR");
		}

		scanner.close();
	}

}
