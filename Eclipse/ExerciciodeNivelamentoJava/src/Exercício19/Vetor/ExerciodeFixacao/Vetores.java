/*
 A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos n�meros 0 a 9.

Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o n�mero de estudantes que v�o
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de O a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relat�rio de todas ocupa��es do pensionato, por ordem de quarto,
conforme exemplo.
 */

package Exerc�cio19.Vetor.ExerciodeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.println("How many rooms will be rented? ");
		int n = scanner.nextInt();

		for (int i = 1; i < n; i++) {

			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.println("Email: ");
			String email = scanner.next();
			System.out.println("Room: ");
			int roomNumber = scanner.nextInt();

			vect[roomNumber] = new Rent(name, email);

		}

		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if(vect[i]!=null)
			System.out.println(i +": "+vect[i]);
		}
		
		
		scanner.close();

	}

}
