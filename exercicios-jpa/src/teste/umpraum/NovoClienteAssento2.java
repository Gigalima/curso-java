package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("5D");
		Cliente cliente = new Cliente("Denis", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		dao.incluirAtomico(cliente);
		
	}

}
