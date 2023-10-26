package program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {

	public static void main(String[] args) {
		
		LocalDate textoData = LocalDate.parse("2023-10-24");
		LocalDateTime textoDataHora = LocalDateTime.parse("2023-10-24T14:25:30");
		Instant textoDataHoraFuso = Instant.parse("2023-10-24T01:25:30Z");
		
		
/*UMA DEMONSTRA��O DOS FUSOS HOR�RIOS DISPON�VEIS NO JAVA
		
		for(String s : ZoneId.getAvailableZoneIds()) { 
			System.out.println(s);}
			
			*/
		
		System.out.println("LocalData:");
		LocalDate converterData = LocalDate.ofInstant(textoDataHoraFuso, ZoneId.systemDefault());
		System.out.println(converterData);
		
		LocalDate converterData1 = LocalDate.ofInstant(textoDataHoraFuso, ZoneId.of("Portugal"));
		System.out.println(converterData1);
		
		LocalDate converterData2 = LocalDate.ofInstant(textoDataHoraFuso, ZoneId.of("America/Toronto"));
		System.out.println(converterData2);
		
		LocalDate converterData3 = LocalDate.ofInstant(textoDataHoraFuso, ZoneId.of("Asia/Srednekolymsk"));
		System.out.println(converterData3);
		System.out.println();
		
		System.out.println("LocalDateTime:");
		LocalDateTime converterData4 = LocalDateTime.ofInstant(textoDataHoraFuso, ZoneId.systemDefault());
		System.out.println(converterData4);
		
		LocalDateTime converterData5 = LocalDateTime.ofInstant(textoDataHoraFuso, ZoneId.of("Portugal"));
		System.out.println(converterData5);
		
		LocalDateTime converterData6 = LocalDateTime.ofInstant(textoDataHoraFuso, ZoneId.of("America/Toronto"));
		System.out.println(converterData6);
		
		LocalDateTime converterData7 = LocalDateTime.ofInstant(textoDataHoraFuso, ZoneId.of("Asia/Srednekolymsk"));
		System.out.println(converterData7);
		
		
				/*Para converter precisamos informar para qual timezone ser� convertido, podemos colocar
				 * o hor�rio do sistema ou especificando o timezone*/
			
		}
	}


