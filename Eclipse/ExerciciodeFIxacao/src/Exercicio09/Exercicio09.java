
/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

cod 1 4.00
cod 2 4.50
cod 3 5.00
cod 4 2.00
cod 5 1.50

*/

package Exercicio09;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int qtd, cod;
		double preco;

		cod = scanner.nextInt();
		qtd = scanner.nextInt();

		if (cod == 1) {
			preco = qtd * 4;
		} else if (cod == 2) {
			preco = qtd * 4.5;
		} else if (cod == 3) {
			preco = qtd * 5;
		} else if (cod == 4) {
			preco = qtd * 2;
		} else {
			preco = qtd * 1.5;
		}

		System.out.printf("O preço final %.2f", preco);

		scanner.close();

	}

}
