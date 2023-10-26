package Application;

public class lacoforeach {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria, ", "Valmir, ",
				"Teresa" }; /*
							 * Desta forma estou criando um vetor já informando os seus dados
							 */

		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i]);
		}

		System.out.println("----------------------");
		
		for (String obj : vect) {

			System.out.println(obj);

			/*
			 * String - Deve inserir o tipo de dados que estão no vertor, nesse caso texto;
			 * obj - Depois informa um apelido para cada dado do vertor, pode ser qualquer
			 * nome; Coleção - que neste caso é nome do vetor, ou seja vect
			 * 
			 * Este for vai percorrer cada elemento do vetor, chamando os dados de obj
			 * 
			 * Leitura: para cada objeetio "obj" contido no vect, faça:
			 */

		}

	}

}
