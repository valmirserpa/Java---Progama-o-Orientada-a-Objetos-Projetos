
/*
 * CRIANDO UM VETOR A PARTIR DE UMA CLASSE 
 *Fazer um programa para ler um n�mero inteiro N e os dados (nome e pre�o) de N Produtos.
 * Armazene os N produtos em um vetor. Em seguida, mostrar o pre�o m�dio dos produtos*/

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class vetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		// Primeiro devemos criar a classe

		int n = scanner.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < n; i++) { /*Podemos substituir o n por vect.lenght, neste caso ir� representar
		//for (int i = 0; i < vect.lenght; i++) automaticamente a quantidade de elementos do vetor*/

			
			
			scanner.nextLine();/*
								 * Como foi utilizado um nextInt(), a quebra de linha ficou pendente, por isso
								 * inserir um nextLine para consumir a quebra de linha primeiro para
								 * depois ter condi��o de inserir um nextLine
								 */

			String name = scanner.nextLine();
			double price = scanner.nextDouble();
			vect[i] = new Product(name, price);

		}

		double sum=0.0;
		for (int i = 0; i < n; i++) {
	//  for (int i = 0; i < vect.lenght; i++)
			sum+=vect[i].getPrice(); // precisamos utilizar o getprice para acessar uma vari�vel private
		}
		
		double avg = sum/n;
	//  double avg = sum/vect.lenght
		
		System.out.println("Average: "+ avg);
		
		scanner.close();

	}

}
