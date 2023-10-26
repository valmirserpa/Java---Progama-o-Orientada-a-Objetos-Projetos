import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitorScanner = new Scanner(System.in);

		int funcid, horastrabalhadas;
		float valorhora, salario;

		System.out.println("Digite seu número de identificação: ");
		funcid = leitorScanner.nextInt();
		System.out.println("Quantas horas trabalhadas: ");
		horastrabalhadas = leitorScanner.nextInt();
		System.out.println("Digite o valor da hora de tabalho: ");
		valorhora = leitorScanner.nextFloat();

		salario = valorhora * horastrabalhadas;

		System.out.printf(funcid + " recebe U$ %.2f%n", + salario);
		
		leitorScanner.close();

	}

}
