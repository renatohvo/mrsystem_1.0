package repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import negocio.Cliente;
import negocio.excecao.ExcecaoMRSystem;

public class RepositorioCliente implements IRepositorioCliente {

	Connection conexao;

	public RepositorioCliente() {
		conexao = ConexaoBD.getConexao();
  	}

	public void incluirCliente(Cliente cliente) throws ExcecaoMRSystem{
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "INSERT INTO cliente (codigo, nome, rg, cpf, cnpj, rua, numero, bairro, cidade, estado, telefone, email) VALUES (" +null+ ", '" +cliente.getNomeCliente()+ "', '" +cliente.getRgCliente()+ "', '" +cliente.getCpfCliente()+ "', '" +cliente.getCnpjCliente()+ "', '" +cliente.getRuaCliente()+ "', '" +cliente.getNumeroCliente()+ "', '" +cliente.getBairroCliente()+ "', '" +cliente.getCidadeCliente()+ "', '" +cliente.getEstadoCliente()+ "', '" +cliente.getTelefoneCliente()+ "', '" +cliente.getEmailCliente()+ "')";
			stmt.executeUpdate(querySQL);
			stmt.close();
			conexao.close();
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
		}
	}

	public void excluirCliente(int codigoCliente) throws ExcecaoMRSystem{
		ResultSet rs;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM cliente WHERE codigo = " +codigoCliente;
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()){
				querySQL = "DELETE FROM cliente WHERE codigo = " +codigoCliente;
				stmt.executeUpdate(querySQL);
			}
			stmt.close();
			conexao.close();
		}
    	catch (SQLException e) {
    		throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
    	}
	}

	public Cliente consultarCliente(int codigoCliente) throws ExcecaoMRSystem{
		ResultSet rs;
		Cliente cliente = null;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM cliente WHERE codigo = " +codigoCliente;
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()) {
				cliente = new Cliente(rs.getInt("codigo"), rs.getString("nome"), rs.getString("rg"), rs.getString("cpf"), rs.getString("cnpj"), rs.getString("rua"), rs.getString("numero"), rs.getString("bairro"), rs.getString("cidade"), rs.getString("estado"), rs.getString("telefone"), rs.getString("email"));
			}
			stmt.close();
			conexao.close();
			return cliente;
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
		}
	}

	public void alterarCliente(Cliente cliente) throws ExcecaoMRSystem{
		ResultSet rs;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM cliente WHERE codigo = " +cliente.getCodigoCliente();
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()){
				querySQL = "UPDATE cliente SET nome = '" +cliente.getNomeCliente()+ "', rg = '" +cliente.getRgCliente()+ "', cpf = '" +cliente.getCpfCliente()+ "', cnpj = '" +cliente.getCnpjCliente()+ "', rua = '" +cliente.getRuaCliente()+ "', numero = '" +cliente.getNumeroCliente()+ "', bairro = '" +cliente.getBairroCliente()+ "', cidade = '" +cliente.getCidadeCliente()+ "', estado = '" +cliente.getEstadoCliente()+ "', telefone = '" +cliente.getTelefoneCliente()+ "', email = '" +cliente.getEmailCliente()+ "' WHERE codigo = " +cliente.getCodigoCliente();
				stmt.executeUpdate(querySQL);
			}
			stmt.close();
			conexao.close();
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
		}
	}
	
	public List listaCodigoClienteComboBox() throws ExcecaoMRSystem {
		Statement stmt = null;
		ResultSet rs = null;		
		List listaCodigoCliente = new LinkedList();
		try {
			stmt = conexao.createStatement();
			String querySQL = "SELECT DISTINCT codigo FROM cliente ORDER BY codigo";
			rs = stmt.executeQuery(querySQL);
			while(rs.next() == true) {
				String codigoCliente = rs.getString("codigo");
				listaCodigoCliente.add(codigoCliente);
			}
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
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
					throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
				}
			}
		}
		return listaCodigoCliente;
	}
	
	public List listaEstadoClienteComboBox() throws ExcecaoMRSystem {
		Statement stmt = null;
		ResultSet rs = null;		
		List listaEstadoCliente = new LinkedList();
		try {
			stmt = conexao.createStatement();
			String querySQL = "SELECT DISTINCT estados_br FROM estado ORDER BY estados_br";
			rs = stmt.executeQuery(querySQL);
			while(rs.next() == true) {
				String estadoCliente = rs.getString("estados_br");
				listaEstadoCliente.add(estadoCliente);
			}
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
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
					throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
				}
			}
		}
		return listaEstadoCliente;
	}
}