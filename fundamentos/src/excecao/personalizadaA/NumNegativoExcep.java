package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumNegativoExcep extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public NumNegativoExcep(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está negativo", nomeDoAtributo);
	}

}
