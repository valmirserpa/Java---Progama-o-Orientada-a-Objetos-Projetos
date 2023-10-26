package program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate textoData = LocalDate.parse("2023-10-24");
		System.out.println(textoData.format(formatarData));
		
		     	/* Primeiro criamos o nosso formato customizado com DateTimeFormatter
		     	 * 
		     	 * Para definir como eu quero formatar a data, posso informar a fun��o .format
		     	 * e passar como par�metro o objeto DateTimeFormatter*/
		
		
		System.out.println(textoData.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
				/*Tamb�m � poss�vel instaciar o objeto no momento de rodar a linha*/
		
		
		System.out.println(formatarData.format(textoData));
		
				/* Outra forma, chamar primeiro o formato customizado, depois a fun��o .format e
				 * passar como par�metro a vari�rial;
				 * 
				 * */

		System.out.println("=================================");
		
		DateTimeFormatter formatarData1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime textoDataHora = LocalDateTime.parse("2023-10-24T14:25:30");
		
		System.out.println(textoDataHora.format(formatarData1));
		System.out.println(textoDataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		System.out.println(formatarData1.format(textoDataHora));
		
		System.out.println("=================================");
		
		DateTimeFormatter formatarDataInstant =DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		Instant textoDataHoraFuso = Instant.parse("2023-10-24T14:25:30Z");
		System.out.println(formatarDataInstant.format(textoDataHoraFuso));
		
				/*No caso de hor�rios tempo real (instant), ele n�o possui a fun��o format como
				 * os demais, neste caso ser� necess�rio criar um formato customizado com a informa��o de fuso hor�rio.
				 * 
				 * Para imprimir na tela, chama primeiro o nome do formato customizado, para invocar o
				 * .format e passar com par�metro a vari�vel do Instant
				 * */
		
		System.out.println("=================================");
		
		DateTimeFormatter formatarDataModelo = DateTimeFormatter.ISO_DATE;
		System.out.println(textoData.format(formatarDataModelo));
		
		DateTimeFormatter formartarDataHoraModelo = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(textoDataHora.format(formartarDataHoraModelo));
		
		DateTimeFormatter formatarDataHoraFusoModelo = DateTimeFormatter.ISO_INSTANT;
		System.out.println(formatarDataHoraFusoModelo.format(textoDataHoraFuso));
		
		
		/*Tamb�m podemos utilizar os modelos de formata��o de datas/horas dispon�veis no java/*/
		
		//Documenta��o: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		
		
		
	}

}
