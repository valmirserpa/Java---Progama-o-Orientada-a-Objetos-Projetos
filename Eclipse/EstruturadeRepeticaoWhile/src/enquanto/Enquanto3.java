package enquanto;
import java.util.Scanner;

public class Enquanto3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Digite a sua idade");
	int idade = scanner.nextInt();
				

		while (idade <18) {
			System.out.println("Você é menor de idade, tente novamente");
			idade = scanner.nextInt();
		}
		
		System.out.println("Maioridade, pode entrar!");
		
		scanner.close();
		

	}

}
