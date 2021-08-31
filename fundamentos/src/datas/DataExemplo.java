package datas;

import java.util.Date;

public class DataExemplo {
	public static void main(String[] args) {
		Date data1 = new Date();
		
		System.out.println(data1);
		
		var data2 = System.currentTimeMillis();
		
		Date novaData = new Date(data2);
		
		System.out.println(novaData);
		
		Date passado = new Date(706288800000L);
		Date futuro = new Date(1504871173056L);
		
		boolean isAfter = passado.after(futuro);
		boolean isBefore = passado.before(futuro);
		
		
		System.out.println("Data no passado => " + passado);
		System.out.println("Data no futuro => " + futuro);
		System.out.println(isAfter);
		System.out.println(isBefore);
		
		
	}
}
