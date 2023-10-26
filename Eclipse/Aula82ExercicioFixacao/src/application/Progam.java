package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Progam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Account account;

		System.out.println("Enter account number: ");
		int number = sc.nextInt();

		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.println("Is there an initial deposit? Y or N: ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);

			/*
			 * Neste caso vou utilizar o construtor com 3 argumentos, Não posso colocar a
			 * instância dentro do if porque ele ficará restrito ao if, então o tipo
			 * declaramos fora
			 */

		} else {
			account = new Account(number, holder);
			/* Caso contrário, inicio com o construtor com 2 argumentos */
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositeValue = sc.nextDouble();
		account.deposit(depositeValue);/*
										 * Com o valor guardado na variável agora chamamos o método de depósito passando
										 * como parâmetro a varíável que está armazenando o valor
										 */

		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);

		sc.close();

	}

}
