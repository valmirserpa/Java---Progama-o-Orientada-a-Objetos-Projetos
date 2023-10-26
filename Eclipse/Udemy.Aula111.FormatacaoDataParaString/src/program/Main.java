package program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
	
		LocalDate textoHora = LocalDate.parse("2023-10-24");
		System.out.println("Data e hor�rio a partir de um texto: " + textoHora);
		
		LocalDateTime textoHora1 = LocalDateTime.parse("2023-10-24T14:25:30");
		System.out.println("Data e hor�rio a partir de um texto: " + textoHora1);
		
		Instant textoHora2 = Instant.parse("2023-10-24T14:25:30Z");
		System.out.println("Data e hor�rio a partir de um texto: " + textoHora2);
		
		Instant textoHora3 = Instant.parse("2023-10-24T14:25:30-03:00");
		System.out.println("Data e hor�rio a partir de um texto: " + textoHora3);


	}

}
