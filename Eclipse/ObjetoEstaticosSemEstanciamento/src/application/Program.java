package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);



		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);

		/* Neste caso eu defini que os métodos da minha classe 
		 * serão static com isso eu não preciso instanciar um novo 
		 * objeto da minha classe bastando somente chamar o método 
		 * pelo nome da minha classe.*/
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();
	}

}