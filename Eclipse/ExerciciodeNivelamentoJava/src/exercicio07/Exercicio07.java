/*
Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
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
