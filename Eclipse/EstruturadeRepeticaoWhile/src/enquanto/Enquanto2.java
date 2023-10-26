package enquanto;
import java.util.Scanner;

public class Enquanto2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Digite a sua senha com 6 digitos!");
	int senha = scanner.nextInt();
				

		while (senha != 611922) {
			System.out.println("Senha errada! Digite novamente!");
			senha = scanner.nextInt();
		}
		
		System.out.println("Senha correta!");
		
		scanner.close();
		

	}

}
