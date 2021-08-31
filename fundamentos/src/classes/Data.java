package classes;

public class Data {
	int dia;
	int mes;
	int ano;
	
	 Data() {
		 dia = 1;
		 mes = 1;
		 ano = 1970;
		 
	 }
	 Data(int dia, int mes, int ano ) {
		 dia = this.dia;
		 mes = this.mes;
		 ano = this.ano;
	 }
	
	String obterDataFormatada () {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

}
