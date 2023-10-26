/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/

package Exercicio13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		System.out.print("DIGITE A SENHA: ");
		int senha = scanner.nextInt();

		while (senha != 2022) {
			System.out.print("SENHA INCORRETA! DIGITE NOVAMENTE: ");
			senha = scanner.nextInt();
		}

		System.out.println("SENHA CORRETA!");

		scanner.close();

	}

}
