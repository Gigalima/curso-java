package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaExc extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public StringVaziaExc(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' est� vazio", nomeDoAtributo);
	}

}
