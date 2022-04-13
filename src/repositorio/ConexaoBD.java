package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	
	private static Connection conexao;
	
	public static Connection getConexao() {
			
		conexao = null;
		
		//LOCAL
		String driverName = "com.mysql.jdbc.Driver";
		String serverName = "localhost";
		String mydatabase = "mrsystem";
		String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
		String username = "root";
		String password = "";
					
		try {
			System.out.println("EFETUANDO CONEXÃO COM O BANCO DE DADOS...");
			Class.forName(driverName);
			conexao = DriverManager.getConnection(url, username, password);
			System.out.println("CONEXÃO EFETUADA COM SUCESSO!");
		}
		catch (ClassNotFoundException e) {
			System.out.println("EXCEÇÃO! O DRIVER ESPECIFICADO NÃO FOI ENCONTRADO!");
			System.out.println(e);
			System.exit(0);
		}
		catch (SQLException e) {
			System.out.println("EXCEÇÃO! NÃO FOI POSSÍVEL CONECTAR AO BANCO DE DADOS!");
			System.out.println(e);
			System.exit(0);
		}
		return conexao;
	}
}
