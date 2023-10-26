
/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

*/

package Exercicio10;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double valor;

		valor = scanner.nextInt();

		if (valor >= 0 && valor <= 25) {
			System.out.println("Internavaloe entre 0 e 25");
		} else if (valor > 25 && valor <= 50) {
			System.out.println("Internvalo entre 25 e 50");
		} else if (valor > 50 && valor <= 75) {
			System.out.println("Intervalor entre 50 e 75");
		} else if (valor > 75 && valor <= 100) {
			System.out.println("Intervalo entre 75 e 100");
		} else {
			System.out.println("Fora do intervalor");
		}

		scanner.close();
	}

}
