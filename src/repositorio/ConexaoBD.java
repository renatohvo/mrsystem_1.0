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
			System.out.println("EFETUANDO CONEX�O COM O BANCO DE DADOS...");
			Class.forName(driverName);
			conexao = DriverManager.getConnection(url, username, password);
			System.out.println("CONEX�O EFETUADA COM SUCESSO!");
		}
		catch (ClassNotFoundException e) {
			System.out.println("EXCE��O! O DRIVER ESPECIFICADO N�O FOI ENCONTRADO!");
			System.out.println(e);
			System.exit(0);
		}
		catch (SQLException e) {
			System.out.println("EXCE��O! N�O FOI POSS�VEL CONECTAR AO BANCO DE DADOS!");
			System.out.println(e);
			System.exit(0);
		}
		return conexao;
	}
}
