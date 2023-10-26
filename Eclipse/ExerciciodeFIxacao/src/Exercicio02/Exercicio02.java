/*

Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

*/

package Exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		double area, raio;
		double pi = 3.14159;

		System.out.println("Informe o raio: ");
		raio = leitor.nextDouble();

		area = (raio * raio) * pi;
		System.out.printf("A Ã¡rea do cÃ­rculo Ã©: %.2f", area);

		leitor.close();

	}

}
