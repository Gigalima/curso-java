package datas;

import java.util.Calendar;

public class CalendarioExemplo {
	public static void main(String[] args) {
		Calendar agora = Calendar.getInstance();
		
		agora.add(Calendar.DATE, 11);
		System.out.println(agora.getTime());
		
		agora.add(Calendar.MONTH, 6 );
		System.out.println(agora.getTime());
		
		agora.add(Calendar.YEAR, -29);
		System.out.println(agora.getTime());
		
		
		System.out.printf("%tD\n", agora); // Formato mm / dd / aa
		System.out.printf("%tF\n", agora); // Formato aaaa-dd-mm
		System.out.printf("%tT\n", agora); // Mostra hora no formato de 24h
		System.out.printf("%tr\n", agora); // Mostra hora com AM/PM



	}

}
