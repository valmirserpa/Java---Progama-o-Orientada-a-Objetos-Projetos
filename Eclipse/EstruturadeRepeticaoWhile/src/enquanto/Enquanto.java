package enquanto;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		Integer number = scanner.nextInt();

		while (number != 0) {
			System.out.println("Perdeu! Digite de novo!");
			number = scanner.nextInt();
		}

		System.out.println("Parab�ns! Acertou!");
		scanner.close();

	}

}
