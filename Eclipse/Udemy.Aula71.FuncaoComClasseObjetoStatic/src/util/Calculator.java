package util;

public class Calculator {

	/*Neste caso, as funções não precisam ser statics porque não estão dentro do programa
	 * principal que é um estático. Desta forma, se torna um método comum dentro de uma classe.
	 * 
	 * Colocando as funções dentro de uma classe, deixamos o nosso código mais limpo;
	 * Nesta situação precisamos instacia o objeto da nossa classe.
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
	
	/*Quando o valor é estático, ou seja, não irá variar pelo o ojbeto, podemos
	 * criar uma função static que fica dispensada na necessidade de estanciar
	 * objeto, deixando o código mais objetivo*/
	
	public static double PI() {
		return 3.14;
	}
	
}
