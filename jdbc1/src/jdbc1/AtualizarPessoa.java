package jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o código: ");
		int cod = entrada.nextInt();

		

		Connection conexao = FabricaConexao.getConexao();
		String select = "SELECT * FROM pessoas where codigo = ?";
		
	
		PreparedStatement stmtId = conexao.prepareStatement(select);
		stmtId.setInt(1, cod);
		stmtId.execute();
		ResultSet resultado = stmtId.executeQuery();


		if (resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			
			System.out.println("O nome atual é " + p.getNome());
		}
		stmtId.close();
		
		System.out.println("Informe o novo nome: ");
		String name = entrada.next();
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		PreparedStatement stmtNome = conexao.prepareStatement(update);
		stmtNome.setString(1, name);
		stmtNome.setInt(2, cod);
		stmtNome.execute();
		
		System.out.println("Atualizado com sucesso!");
		
		entrada.close();
		stmtNome.close();
		conexao.close();

	}

}
