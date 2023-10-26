package doWhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int senha;

		do {

			System.out.println("Digite a senha correta com 2 dígitos: ");
			senha = scanner.nextInt();
			if (senha != 30) {
				System.out.println("Senha errada! Tente novamente!");
			}

		} while (senha != 30);

		System.out.println("Senha correta! Ganhou um ingresso");

		scanner.close();

	}

}
