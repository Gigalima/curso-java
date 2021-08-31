package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {

		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto produto = new Produto("Monitor", 710.30);
		dao.incluirAtomico(produto).fecharDAO();
		
		System.out.println("ID do produto: " + produto.getId());

	} 

}
