package colecoes;

import java.util.HashMap;
import java.util.Map;


public class ExMap {
	public static void main(String[] args) {
		
		Map<String, String> estados = new HashMap<>(); //Sigla chave, Estado valor
		estados.put("SP", "São Paulo");
		estados.put("RJ", "Rio de Janeiro");
		estados.put("MG", "Minas Gerais");
		estados.put("ES", "Espírito Santo");
		estados.put("PR", "Paraná");
		estados.put("SC", "Santa Catarina");
		estados.put("RS", "Rio Grande do Sul");
		estados.put("MS", "Mato Grosso do Sul");
		estados.put("MT", "Mato Grosso");
		estados.put("GO", "Goiás");
		estados.put("BA", "Bahia");
		estados.put("SE", "Sergipe");
		estados.put("MA", "Maranhão");
		estados.put("PI", "Piauí");
		estados.put("CE", "Ceará");
		estados.put("RN", "Rio Grande do Norte");
		estados.put("PB", "Paraíba");
		estados.put("PE", "Pernambuco");
		estados.put("AL", "Alagoas");
		estados.put("AM", "Amazonas");
		estados.put("RR", "Roraima");
		estados.put("RO", "Rondônia");
		estados.put("PA", "Pará");
		estados.put("AC", "Acre");
		estados.put("TO", "Tocantins");
		estados.put("AP", "Amapá");
		
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
