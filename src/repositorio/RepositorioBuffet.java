package repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import negocio.Buffet;
import negocio.excecao.ExcecaoInexistente;
import negocio.excecao.ExcecaoMRSystem;

public class RepositorioBuffet implements IRepositorioBuffet{
	
	Connection conexao;

	public RepositorioBuffet() {
		conexao = ConexaoBD.getConexao();
  	}

	public void incluirBuffet(Buffet buffet) throws ExcecaoMRSystem {
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "INSERT INTO buffet (codigo, nome, tipo, valor, descricao) VALUES (" +null+ ", '" +buffet.getNomeBuffet()+ "', '" +buffet.getTipoBuffet()+ "', " +buffet.getValorBuffet()+ ", '" +buffet.getDescricaoBuffet()+ "')";
			stmt.executeUpdate(querySQL);
			stmt.close();
			conexao.close();
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
		}
	}

	public void excluirBuffet(int codigoBuffet) throws ExcecaoMRSystem {
		ResultSet rs;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM buffet WHERE codigo = " +codigoBuffet;
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()){
				querySQL = "DELETE FROM buffet WHERE codigo = " +codigoBuffet;
				stmt.executeUpdate(querySQL);
			}
			stmt.close();
			conexao.close();
		}
    	catch (SQLException e) {
    		throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
    	}
	}

	public Buffet consultarBuffet(int codigoBuffet, String tipoBuffet) throws ExcecaoInexistente, ExcecaoMRSystem{
		ResultSet rs;
		String like ="%";
		Buffet buffet = null;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM buffet WHERE codigo = " +codigoBuffet+ " OR tipo LIKE '" +like+tipoBuffet+like+ "'";
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()) {
				buffet = new Buffet(rs.getInt("codigo"), rs.getString("nome"), rs.getString("tipo"), rs.getDouble("valor"), rs.getString("descricao"));
			}
			else {
				throw new ExcecaoInexistente("OBJETO INEXISTENTE!");
			}
			stmt.close();
			conexao.close();
			return buffet;
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
		}
	}

	public void alterarBuffet(Buffet buffet) throws ExcecaoMRSystem {
		ResultSet rs;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM buffet WHERE codigo = " +buffet.getCodigoBuffet();
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()){
				querySQL = "UPDATE buffet SET nome = '" +buffet.getNomeBuffet()+ "', tipo = '" +buffet.getTipoBuffet()+ "', valor = " +buffet.getValorBuffet()+ ", descricao = '" +buffet.getDescricaoBuffet()+ "' WHERE codigo = " +buffet.getCodigoBuffet();
				stmt.executeUpdate(querySQL);
			}
			stmt.close();
			conexao.close();
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
		}
	}
	
	public List listaCodigoBuffetComboBox() throws ExcecaoMRSystem {
		Statement stmt = null;
		ResultSet rs = null;		
		List listaCodigoBuffet = new LinkedList();
		try {
			stmt = conexao.createStatement();
			String querySQL = "SELECT DISTINCT codigo FROM buffet ORDER BY codigo";
			rs = stmt.executeQuery(querySQL);
			while(rs.next() == true) {
				String codigoBuffet = rs.getString("codigo");
				listaCodigoBuffet.add(codigoBuffet);
			}
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO AO CONSULTAR O CÓDIGO: " + e.getMessage());
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				}
				catch (SQLException e) {
					throw new ExcecaoMRSystem("ERRO AO FINALIZAR STATEMENT: " + e.getMessage());
				}
			}
			if (rs != null) {
				try {
					rs.close();
				}
				catch (SQLException e) {
					throw new ExcecaoMRSystem("ERRO AO CONSULTAR O CÓDIGO: " + e.getMessage());
				}
			}
		}
		return listaCodigoBuffet;
	}
}
