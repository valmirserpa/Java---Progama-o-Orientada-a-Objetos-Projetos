package operacoesComStrings;

public class OperacoesComStrings {

	public static void main(String[] args) {

		String original = "VALMIR Antonio Serpa     ";

// Converter uma string para letras min�sculas

		String minuscula = original.toLowerCase();

		System.out.println("Original: - " + original + "-");
		System.out.println("ToLowerCase: - " + minuscula + "-");
		System.out.println();

// Converter uma string para letras mai�sculas

		String mai�scula = original.toUpperCase();

		System.out.println("Original: - " + original + "-");
		System.out.println("ToUpercase: - " + mai�scula + "-");
		System.out.println();

// Eliminar espa�os

		String eliminarEspacos = original.trim();

		System.out.println("Original: - " + original + "-");
		System.out.println("Trim(): - " + eliminarEspacos + "-");
		System.out.println();

// Iniciar o texto a partir de uma determinada posi��o do caracter

		String subString = original.substring(2);

		System.out.println("Original: - " + original + "-");
		System.out.println("SubString(2): - " + subString + "-");
		System.out.println();
		
// Cortar o texto a partir da posi��o do carcater
		
		String subString1 = original.substring(2, 7);

		System.out.println("Original: - " + original + "-");
		System.out.println("SubString(2,7): - " + subString1 + "-");
		System.out.println();
		
// Substituir uma letra pela a outra
		
		String replace = original.replace('A', 'u');

		System.out.println("Original: - " + original + "-");
		System.out.println("Replace ('A' , 'u'): - " + replace + "-");
		System.out.println();		
		
// Substituir um conjunto de letras		
		
		String replace1 = original.replace("Ant", "CAD");

		System.out.println("Original: - " + original + "-");
		System.out.println("Replace1 (Ant, CAD): - " + replace1 + "-");
		System.out.println();		
		
// Encontrar o posi��o da primeira ocorr�ncia de um caracter		

		int indexOf = original.indexOf('V'); 
		int indexOf1 = original.indexOf("MIR"); 
		/*como ir� retornar um n�mero, a vari�vel dever� ser int*/

		System.out.println("Original: - " + original + "-");
		System.out.println("indexOf('V'): - " + indexOf + "-");
		System.out.println("indexOf(MIR): - " + indexOf1 + "-");
		System.out.println();

// Encontrar a posi��o da �ltima ocorre�ncia de um caracter
	
		int lastIndexOf = original.lastIndexOf('n'); 
		int lastIndexOf1 = original.lastIndexOf("io"); 
		/*como ir� retornar um n�mero, a vari�vel dever� ser int*/

		System.out.println("Original: - " + original + "-");
		System.out.println("indexOf('n'): - " + lastIndexOf + "-");
		System.out.println("indexOf('io'): - " + lastIndexOf1 + "-");
		System.out.println();
		
// Recortar texto e separar por vetor
		
		String [] vect = original.split(" "); 
	
		System.out.println("Original " + original);
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		

	}

}
