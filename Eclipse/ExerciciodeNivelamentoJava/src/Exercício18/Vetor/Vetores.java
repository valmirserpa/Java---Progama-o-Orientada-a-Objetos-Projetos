/*
 * Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 10) e depois N n�meros inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os n�meros negativos lidos. 
 * */

package Exerc�cio18.Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantos n�meros vc ir� digitar? ");
		int n = scanner.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			vect[i] = scanner.nextInt();

		}

		System.out.println("N�meros negativos");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {

				System.out.println(vect[i]);
			}

		}

		scanner.close();

	}

}
