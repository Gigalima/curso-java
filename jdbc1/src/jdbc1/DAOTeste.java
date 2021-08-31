package jdbc1;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Roberto Kiosaki"));
		System.out.println(dao.incluir(sql, "Julia Roberts"));
		System.out.println(dao.incluir(sql, "Aparecido Borges"));
		
	}

}
