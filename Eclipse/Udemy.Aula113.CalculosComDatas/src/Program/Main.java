package Program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        // Manipula��o de LocalDate
        LocalDate textoData = LocalDate.parse("2023-10-24");

        LocalDate diminuirDataLocalDate = textoData.minusDays(7);
        LocalDate aumentarDataLocalDate = textoData.plusDays(7);
        LocalDate diminuirAnoLocalDate = textoData.minusYears(1);
        LocalDate aumentarAnoLocalDate = textoData.plusYears(1);

        System.out.println("LocalDate:");
        System.out.println("Texto original: " + textoData);
        System.out.println("Diminuir 7 dias: " + diminuirDataLocalDate);
        System.out.println("Aumentar 7 dias: " + aumentarDataLocalDate);
        System.out.println("Diminuir 1 ano: " + diminuirAnoLocalDate);
        System.out.println("Aumentar 1 ano: " + aumentarAnoLocalDate);

        System.out.println();

        // Manipula��o de LocalDateTime
        LocalDateTime textoDataHora = LocalDateTime.parse("2023-10-24T14:25:30");

        LocalDateTime diminuirDataLocalDateTime = textoDataHora.minusDays(7);
        LocalDateTime aumentarDataLocalDateTime = textoDataHora.plusDays(7);
        LocalDateTime diminuirHoraLocalDateTime = textoDataHora.minusHours(7);
        LocalDateTime aumentarHoraLocalDateTime = textoDataHora.plusHours(7);

        System.out.println("LocalDateTime:");
        System.out.println("Texto original: " + textoDataHora);
        System.out.println("Diminuir 7 dias: " + diminuirDataLocalDateTime);
        System.out.println("Aumentar 7 dias: " + aumentarDataLocalDateTime);
        System.out.println("Diminuir 7 horas: " + diminuirHoraLocalDateTime);
        System.out.println("Aumentar 7 horas: " + aumentarHoraLocalDateTime);

        System.out.println();

        // Manipula��o de Instant
        Instant textoDataHoraFuso = Instant.parse("2023-10-24T01:25:30Z");

        Instant diminuirDataInstant = textoDataHoraFuso.minus(7, ChronoUnit.DAYS);
        Instant aumentarDataInstant = textoDataHoraFuso.plus(7, ChronoUnit.DAYS);
        Instant diminuirMesInstant = textoDataHoraFuso.minus(1, ChronoUnit.MONTHS);
        Instant aumentarSemanaInstant = textoDataHoraFuso.plus(7, ChronoUnit.WEEKS);

        System.out.println("Instant:");
        System.out.println("Texto original: " + textoDataHoraFuso);
        System.out.println("Diminuir 7 dias: " + diminuirDataInstant);
        System.out.println("Aumentar 7 dias: " + aumentarDataInstant);
        System.out.println("Diminuir 1 m�s: " + diminuirMesInstant);
        System.out.println("Aumentar 7 semanas: " + aumentarSemanaInstant);
        
        /* No caso de datas no formato Instant, vamos utilizar a fun��o minus ou plus, passar o tempo
		 * que desejamos diminuir ou aumentar, seguindo da fun��o ChronoUnit. na qual vamos informar
		 * qual � a unidade cronol�gica*/
		
        
        
    }
}
	