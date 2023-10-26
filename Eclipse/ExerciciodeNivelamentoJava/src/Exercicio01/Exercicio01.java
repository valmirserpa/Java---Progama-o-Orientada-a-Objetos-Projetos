/*

Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
mensagem explicativa, conforme exemplos.

*/

package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		int num1, num2, soma;

		System.out.println("Digite o primeiro número: ");
		num1 = leitor.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = leitor.nextInt();

		soma = num1 + num2;

		System.out.println("A soma dos números é: " + soma);

		leitor.close();

	}

}
