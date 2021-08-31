package datas;

import java.time.Instant;
import java.util.Date;

public class DataExemplo02 {
	public static void main(String[] args) {
		Date inicio = new Date(164857813356L);
		System.out.println(inicio);
		
		Instant instant = inicio.toInstant();
		System.out.println(instant);

		
	}

}
