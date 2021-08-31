package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatandoData {
	public static void main(String[] args) {
		Date alo = new Date();
		
		String data = DateFormat.getInstance().format(alo);
		
		System.out.println(data);
		
		data = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(alo);
		System.out.println(data);
		
		SimpleDateFormat formatada = new SimpleDateFormat("dd/MM/yyyy HH:MM");
		
		String dataFormatada = formatada.format(alo);
		System.out.println(dataFormatada);
	}

}
