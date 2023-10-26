package utilizandoString;

public class Main {

	public static void main(String[] args) {

		
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		String s01 = original.toLowerCase(); // MINÚSCULO
		String s02 = original.toUpperCase();// MAISCULO
		String s03 = original.trim(); // SEM ESPAÇOS
		String s04 = original.substring(2);//COMEÇAR DEPOIS DO 2 CARCTER
		
				
		System.out.println("ORIGIAL "+ original+"-");
		System.out.println("MINÚSCULA " + s01 + "-");
		System.out.println("MAIÚSCULA " + s02 + "-");
		System.out.println("SEM ESPAÇOS " + s03 + "-");
		System.out.println("A PARTIR DO 3 CARACTER " + s04 + "-");
		

		
		
		
		
	}

}
