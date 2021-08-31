package colecoes;

import java.util.HashMap;
import java.util.Map;


public class ExMap {
	public static void main(String[] args) {
		
		Map<String, String> estados = new HashMap<>(); //Sigla chave, Estado valor
		estados.put("SP", "S�o Paulo");
		estados.put("RJ", "Rio de Janeiro");
		estados.put("MG", "Minas Gerais");
		estados.put("ES", "Esp�rito Santo");
		estados.put("PR", "Paran�");
		estados.put("SC", "Santa Catarina");
		estados.put("RS", "Rio Grande do Sul");
		estados.put("MS", "Mato Grosso do Sul");
		estados.put("MT", "Mato Grosso");
		estados.put("GO", "Goi�s");
		estados.put("BA", "Bahia");
		estados.put("SE", "Sergipe");
		estados.put("MA", "Maranh�o");
		estados.put("PI", "Piau�");
		estados.put("CE", "Cear�");
		estados.put("RN", "Rio Grande do Norte");
		estados.put("PB", "Para�ba");
		estados.put("PE", "Pernambuco");
		estados.put("AL", "Alagoas");
		estados.put("AM", "Amazonas");
		estados.put("RR", "Roraima");
		estados.put("RO", "Rond�nia");
		estados.put("PA", "Par�");
		estados.put("AC", "Acre");
		estados.put("TO", "Tocantins");
		estados.put("AP", "Amap�");
		
		System.out.println(estados);
		estados.remove("MG");
		System.out.println(estados.containsKey("MG"));
		estados.put("DF", "Distrito Federal");
		int verificatam = estados.size();
		System.out.println(verificatam);
		System.out.println(estados.get("Rio de Janeiro"));
		System.out.println(estados.get(3));
		
		
		
	}

}
