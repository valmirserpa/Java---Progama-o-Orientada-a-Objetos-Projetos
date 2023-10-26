
public class Formatar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String original = "abcde FGHIJ ABC abc DEFG";
		
		//Fomatar
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		
		//Cortar
		String s03 = original.trim();
		String s04 = original.substring(2);
		
		//Substituir
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");

		//Buscar
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("Original - "+ original);
		System.out.println("toLowerCase - " + s01);
		System.out.println("toUpperCase - " + s02);
		System.out.println("trim - Eliminar espaços - "+s03);
		System.out.println("Substring (2) - Eliminar carcteres - " + s04);
		System.out.println("Substring (2,9) - Eliminar carctere 2 abaixo do 9 - - " + s05);
		System.out.println("replace('a';'x') - Substituir o a pelo x - "+s06);
		System.out.println("replace(abc, xy)- substitua o abc por xy - " + s07 );
		System.out.println("indexOf(\"bc\") - retornar a primeira posição - "+ i);
		System.out.println("lastIndexOf(\"bc\")- retorna a última posição - " + j);
		
		
		
		
		
		
	}

}
