/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/

package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numerofunc;
		double hh, ht, salario;

		System.out.println("Digite o seu número de identificação: ");
		numerofunc = scanner.nextInt();
		System.out.println("Digite quantas horas trabalhou: ");
		ht = scanner.nextDouble();
		System.out.println("Digite o valor da hora trabalhada: ");
		hh = scanner.nextDouble();

		salario = hh * ht;

		System.out.printf("O salário do funcionário " + numerofunc + " é %.2f", salario);

		scanner.close();
	}

}
