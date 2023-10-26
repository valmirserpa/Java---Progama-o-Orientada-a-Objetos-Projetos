package program;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		LocalDate textoData = LocalDate.parse("2023-10-24");
		LocalDateTime textoDataHora = LocalDateTime.parse("2023-10-24T14:25:30");
		
		System.out.println(textoData.getDayOfMonth());
		System.out.println(textoData.getMonthValue());
		System.out.println(textoData.getYear());
		
		System.out.println(textoDataHora.getHour());
		System.out.println(textoDataHora.getMinute());
		System.out.println(textoDataHora.getSecond());
	}

}
