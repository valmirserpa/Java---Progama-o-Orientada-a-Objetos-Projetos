import java.util.Scanner;

public class Exercicio03 extends ExercioJava {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int a,b,c,d, prod1, prod2, dif;
		
		System.out.println("Digite 4 valores: ");
		a= leitor.nextInt();
		b =leitor.nextInt();
		c=leitor.nextInt();
		d=leitor.nextInt();
		
		prod1=a*b;
		prod2=c*d;
		
		dif=prod1-prod2;
		
		System.out.println(dif);
		
		
		
		
		
		
		
		
		

	}

}
