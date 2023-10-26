import java.util.Locale;
import java.util.Scanner;

import org.w3c.dom.UserDataHandler;



public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	Scanner leitor = new Scanner(System.in);
	
	String a;
	int b;
	float c;
	double d;
	boolean e;
	

	System.out.println("Digite uma palavra:");
	a=leitor.next();
	System.out.println("Você digitou: "+ a);
	System.out.println("======================================");
		
	
	
	
	
		leitor.close();
		
	}

}
