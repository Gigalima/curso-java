package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumForadoIntervaloExcep extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public NumForadoIntervaloExcep(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);
	}

}
