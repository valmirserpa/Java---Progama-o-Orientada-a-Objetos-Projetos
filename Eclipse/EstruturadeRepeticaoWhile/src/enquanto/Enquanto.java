package enquanto;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número");
		Integer number = scanner.nextInt();

		while (number != 0) {
			System.out.println("Perdeu! Digite de novo!");
			number = scanner.nextInt();
		}

		System.out.println("Parabéns! Acertou!");
		scanner.close();

	}

}
