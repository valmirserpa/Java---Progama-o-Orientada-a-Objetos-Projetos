
import java.util.Locale;
import java.util.Scanner;



public class ExercioJava {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		/*
		int x;
		int y;
		int z;
	
		
		
		System.out.println("Digite um número inteiro: ");
		x= leitor.nextInt();
		System.out.println("Digite outro número: ");
		y=leitor.nextInt();
		
		z=x+y;
		
		System.out.println("Resultado= "+z);
		
		System.out.println("===========================================");
		*/
		
		double pi = 3.14159;
		double raio;
		double area;
		
		
		System.out.println("Digite o valor do raio: ");
		raio=leitor.nextDouble();
		
		area=pi*(Math.pow(raio, 2));
		
		
		System.out.printf("%.4f%n", + area );
		System.out.printf("%.2f%n",+area);
		System.out.printf("%.1f%n", + area);
		System.out.printf("%.0f%n", +area);
		
		/*
		System.out.printf("%.20f%n",+ pi);
		System.out.printf("%.19f%n",+ pi);
		System.out.printf("%.18f%n", +pi);
		System.out.printf("%.17f%n", + pi);
		System.out.printf("%.16f%n", + pi);
		*/
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
