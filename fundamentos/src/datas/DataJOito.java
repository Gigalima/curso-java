package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataJOito {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate ontem = hoje.minusDays(1);
		LocalDate amanha = hoje.plusDays(1);
		
		System.out.println("Ontem -> " + ontem);
		System.out.println("Hoje -> " + hoje);
		System.out.println("Amanha -> " + amanha);
		
		
		LocalTime agora = LocalTime.now();
		System.out.println(agora.getHour());
		
		LocalDateTime hojeAgora = LocalDateTime.now();
		LocalTime futuro = agora.minusHours(11).minusMinutes(3).minusSeconds(15);
		System.out.println(hojeAgora);
		System.out.println(futuro);
	}

}
