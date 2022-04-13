package repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import negocio.Funcionario;
import negocio.excecao.ExcecaoMRSystem;

public class RepositorioFuncionario implements IRepositorioFuncionario {
	
	Connection conexao;

	public RepositorioFuncionario() {
		conexao = ConexaoBD.getConexao();
  	}

	public void incluirFuncionario(Funcionario funcionario) throws ExcecaoMRSystem{
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "INSERT INTO funcionario (codigo, nome, cargo, rg, cpf, rua, numero, bairro, cidade, estado, telefone, valor, email) VALUES (" +null+ ", '" +funcionario.getNomeFuncionario()+ "', '" +funcionario.getCargoFuncionario()+ "', '" +funcionario.getRgFuncionario()+ "', '" +funcionario.getCpfFuncionario()+ "', '" +funcionario.getRuaFuncionario()+ "', '" +funcionario.getNumeroFuncionario()+ "', '" +funcionario.getBairroFuncionario()+ "', '" +funcionario.getCidadeFuncionario()+ "', '" +funcionario.getEstadoFuncionario()+ "', '" +funcionario.getTelefoneFuncionario()+ "', " +funcionario.getValorFuncionario()+ ", '" +funcionario.getEmailFuncionario()+ "')";
			stmt.executeUpdate(querySQL);
			stmt.close();
			conexao.close();
		}
		catch (SQLException e) {
    		throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
    	}
	}

	public void excluirFuncionario(int codigoFuncionario) throws ExcecaoMRSystem{
		ResultSet rs;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM funcionario WHERE codigo = " +codigoFuncionario;
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()){
				querySQL = "DELETE FROM funcionario WHERE codigo = " +codigoFuncionario;
				stmt.executeUpdate(querySQL);
			}
			stmt.close();
			conexao.close();
		}
    	catch (SQLException e) {
    		throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
    	}
	}

	public Funcionario consultarFuncionario(int codigoFuncionario) throws ExcecaoMRSystem{
		ResultSet rs;
		Funcionario funcionario = null;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM funcionario WHERE codigo = " +codigoFuncionario;
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()) {
				funcionario = new Funcionario(rs.getInt("codigo"), rs.getString("nome"), rs.getString("cargo"), rs.getString("rg"), rs.getString("cpf"), rs.getString("rua"), rs.getString("numero"), rs.getString("bairro"), rs.getString("cidade"), rs.getString("estado"), rs.getString("telefone"), rs.getDouble("valor"), rs.getString("email"));
			}
			stmt.close();
			conexao.close();
			return funcionario;
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
		}
	}

	public void alterarFuncionario(Funcionario funcionario) throws ExcecaoMRSystem{
		ResultSet rs;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM funcionario WHERE codigo = " +funcionario.getCodigoFuncionario();
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()){
				querySQL = "UPDATE funcionario SET nome = '" +funcionario.getNomeFuncionario()+ "', cargo = '" +funcionario.getCargoFuncionario()+ "', rg = '" +funcionario.getRgFuncionario()+ "', cpf = '" +funcionario.getCpfFuncionario()+ "', rua = '" +funcionario.getRuaFuncionario()+ "', numero = '" +funcionario.getNumeroFuncionario()+ "', bairro = '" +funcionario.getBairroFuncionario()+ "', cidade = '" +funcionario.getCidadeFuncionario()+ "', estado = '" +funcionario.getEstadoFuncionario()+ "', telefone = '" +funcionario.getTelefoneFuncionario()+ "', valor = " +funcionario.getValorFuncionario()+ ", email = '" +funcionario.getEmailFuncionario()+ "' WHERE codigo = " +funcionario.getCodigoFuncionario();
				stmt.executeUpdate(querySQL);
			}
			stmt.close();
			conexao.close();
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
		}
	}
	
	public List listaCodigoFuncionarioComboBox() throws ExcecaoMRSystem {
		Statement stmt = null;
		ResultSet rs = null;		
		List listaCodigoFuncionario = new LinkedList();
		try {
			stmt = conexao.createStatement();
			String querySQL = "SELECT DISTINCT codigo FROM funcionario ORDER BY codigo";
			rs = stmt.executeQuery(querySQL);
			while(rs.next() == true) {
				String codigoFuncionario = rs.getString("codigo");
				listaCodigoFuncionario.add(codigoFuncionario);
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
		return listaCodigoFuncionario;
	}
	
	public List listaEstadoFuncionarioComboBox() throws ExcecaoMRSystem {
		Statement stmt = null;
		ResultSet rs = null;		
		List listaEstadoFuncionario = new LinkedList();
		try {
			stmt = conexao.createStatement();
			String querySQL = "SELECT DISTINCT estados_br FROM estado ORDER BY estados_br";
			rs = stmt.executeQuery(querySQL);
			while(rs.next() == true) {
				String estadoFuncionario = rs.getString("estados_br");
				listaEstadoFuncionario.add(estadoFuncionario);
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
		return listaEstadoFuncionario;
	}
}
