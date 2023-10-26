/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
*/

package Exercicio05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int codigo1, codigo2, qtd1, qtd2;
		double valoruni1, valoruni2, valortotal;

		codigo1 = scanner.nextInt();
		qtd1 = scanner.nextInt();
		valoruni1 = scanner.nextDouble();

		codigo2 = scanner.nextInt();
		qtd2 = scanner.nextInt();
		valoruni2 = scanner.nextDouble();

		valortotal = (qtd1 * valoruni1) + (qtd2 * valoruni2);

		System.out.printf("O valor total é %.2f", valortotal);

		scanner.close();

	}

}
