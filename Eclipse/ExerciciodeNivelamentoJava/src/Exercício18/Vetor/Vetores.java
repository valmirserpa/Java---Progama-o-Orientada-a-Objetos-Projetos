/*
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
 * */

package Exercício18.Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantos números vc irá digitar? ");
		int n = scanner.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			vect[i] = scanner.nextInt();

		}

		System.out.println("Números negativos");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {

				System.out.println(vect[i]);
			}

		}

		scanner.close();

	}

}
