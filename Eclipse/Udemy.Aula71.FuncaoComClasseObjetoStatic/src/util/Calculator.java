package util;

public class Calculator {

	/*Neste caso, as fun��es n�o precisam ser statics porque n�o est�o dentro do programa
	 * principal que � um est�tico. Desta forma, se torna um m�todo comum dentro de uma classe.
	 * 
	 * Colocando as fun��es dentro de uma classe, deixamos o nosso c�digo mais limpo;
	 * Nesta situa��o precisamos instacia o objeto da nossa classe.
	 * 
	 * */
	
	
	public double calcularRaio(int valor) {
		return valor * 3.14;
	}

	public int dobrarValor(int valor) {
		return valor *= valor;
	}

	public int condicional(int valor) {

		if (valor % 2 == 0) {
			return valor * 2;
		} else {
			return valor * 3;
		}

	}
	
	/*Quando o valor � est�tico, ou seja, n�o ir� variar pelo o ojbeto, podemos
	 * criar uma fun��o static que fica dispensada na necessidade de estanciar
	 * objeto, deixando o c�digo mais objetivo*/
	
	public static double PI() {
		return 3.14;
	}
	
}
