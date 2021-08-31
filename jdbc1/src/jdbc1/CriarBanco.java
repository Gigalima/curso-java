package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost/?verifyServerCertificate=false&useSSL=true";
		final String user = "";
		final String pass = "";
		
		Connection conexao = DriverManager.getConnection(url, user, pass);
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco Criado com Sucesso!");
		
		conexao.close();
	}

}
