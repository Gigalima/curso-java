package classes;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data(19, 5, 1992);
		Data d2 = new Data();
		
		
		String dataFormatada = d1.obterDataFormatada();
		
		String dataFormatada2 = d2.obterDataFormatada();
		
		System.out.println(dataFormatada);
		System.out.println(dataFormatada2);
	}

}
