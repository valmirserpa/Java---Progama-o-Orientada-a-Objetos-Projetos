package Application;

public class lacoforeach {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria, ", "Valmir, ",
				"Teresa" }; /*
							 * Desta forma estou criando um vetor j� informando os seus dados
							 */

		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i]);
		}

		System.out.println("----------------------");
		
		for (String obj : vect) {

			System.out.println(obj);

			/*
			 * String - Deve inserir o tipo de dados que est�o no vertor, nesse caso texto;
			 * obj - Depois informa um apelido para cada dado do vertor, pode ser qualquer
			 * nome; Cole��o - que neste caso � nome do vetor, ou seja vect
			 * 
			 * Este for vai percorrer cada elemento do vetor, chamando os dados de obj
			 * 
			 * Leitura: para cada objeetio "obj" contido no vect, fa�a:
			 */

		}

	}

}
