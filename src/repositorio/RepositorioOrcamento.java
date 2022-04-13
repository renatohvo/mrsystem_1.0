package repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import negocio.Orcamento;
import negocio.excecao.ExcecaoInexistente;
import negocio.excecao.ExcecaoMRSystem;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class RepositorioOrcamento implements IRepositorioOrcamento {
	
	Connection conexao;

	public RepositorioOrcamento() {
		conexao = ConexaoBD.getConexao();
  	}

	public void incluirOrcamento(Orcamento orcamento) throws ExcecaoMRSystem {
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "INSERT INTO orcamento_evento (codigo, nome_cliente, tipo_buffet, nome_buffet, qtd_pessoas, qtd_garcons, qtd_segurancas, dia_emissao, mes_emissao, ano_emissao, dia_evento, mes_evento, ano_evento, hora_inicio_evento, minuto_inicio_evento, hora_termino_evento, minuto_termino_evento, local_evento, valor, horario_evento, nome_mes) VALUES (" +null+ ", '" +orcamento.getNomeCliente()+ "', '" +orcamento.getTipoBuffet()+ "', '" +orcamento.getNomeBuffet()+ "', " +orcamento.getQtdPessoasOrcamento()+ ", " +orcamento.getQtdGarconsOrcamento()+ ", " +orcamento.getQtdSegurancasOrcamento()+ ", " +orcamento.getDiaEmissaoOrcamento()+ ", " +orcamento.getMesEmissaoOrcamento()+ ", " +orcamento.getAnoEmissaoOrcamento()+ ", " +orcamento.getDiaEvento()+ ", " +orcamento.getMesEvento()+ ", " +orcamento.getAnoEvento()+ ", " +orcamento.getHoraInicioEvento()+ ", " +orcamento.getMinutoInicioEvento()+ ", " +orcamento.getHoraTerminoEvento()+ ", " +orcamento.getMinutoTerminoEvento()+ ", '" +orcamento.getLocalEvento()+ "', " +orcamento.getValorOrcamento()+ ", '" +orcamento.getHorarioEvento()+ "', '" +orcamento.getNomeMes()+ "')";
			stmt.executeUpdate(querySQL);
			stmt.close();
			conexao.close();
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
		}
	}

	public void excluirOrcamento(int codigoOrcamento) throws ExcecaoMRSystem {
		ResultSet rs;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM orcamento_evento WHERE codigo = " +codigoOrcamento;
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()){
				querySQL = "DELETE FROM orcamento_evento WHERE codigo = " +codigoOrcamento;
				stmt.executeUpdate(querySQL);
			}
			stmt.close();
			conexao.close();
		}
    	catch (SQLException e) {
    		throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
    	}
	}

	public Orcamento consultarOrcamento(int codigoOrcamento, String nomeCliente) throws ExcecaoInexistente, ExcecaoMRSystem{
		ResultSet rs;
		String like ="%";
		Orcamento orcamento = null;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM orcamento_evento WHERE codigo = " +codigoOrcamento+ " OR nome_cliente LIKE '" +like+nomeCliente+like+ "'";;
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()) {
				orcamento = new Orcamento(rs.getInt("codigo"), rs.getString("nome_cliente"), rs.getString("tipo_buffet"), rs.getString("nome_buffet"), rs.getInt("qtd_pessoas"), rs.getInt("qtd_garcons"), rs.getInt("qtd_segurancas"), rs.getInt("dia_emissao"), rs.getInt("mes_emissao"), rs.getInt("ano_emissao"), rs.getInt("dia_evento"), rs.getInt("mes_evento"), rs.getInt("ano_evento"), rs.getInt("hora_inicio_evento"), rs.getInt("minuto_inicio_evento"), rs.getInt("hora_termino_evento"), rs.getInt("minuto_termino_evento"), rs.getString("local_evento"), rs.getDouble("valor"), rs.getString("horario_evento"), rs.getString("nome_mes"));
			}
			else {
				throw new ExcecaoInexistente("OBJETO INEXISTENTE!");
			}
			stmt.close();
			conexao.close();
			return orcamento;
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
		}
	}

	public void alterarOrcamento(Orcamento orcamento) throws ExcecaoMRSystem {
		ResultSet rs;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM orcamento_evento WHERE codigo = " +orcamento.getCodigoOrcamento();
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()){
				querySQL = "UPDATE orcamento_evento SET nome_cliente = '" +orcamento.getNomeCliente()+ "', tipo_buffet = '" +orcamento.getTipoBuffet()+ "', nome_buffet = '" +orcamento.getNomeBuffet()+ "', qtd_pessoas = " +orcamento.getQtdPessoasOrcamento()+ ", qtd_garcons = " +orcamento.getQtdGarconsOrcamento()+ ", qtd_segurancas = " +orcamento.getQtdSegurancasOrcamento()+ ", dia_emissao = " +orcamento.getDiaEmissaoOrcamento()+ ", mes_emissao = " +orcamento.getMesEmissaoOrcamento()+ ", ano_emissao = " +orcamento.getAnoEmissaoOrcamento()+ ", dia_evento = " +orcamento.getDiaEvento()+ ", mes_evento = " +orcamento.getMesEvento()+ ", ano_evento = " +orcamento.getAnoEvento()+ ", hora_inicio_evento = " +orcamento.getHoraInicioEvento()+ ", minuto_inicio_evento = " +orcamento.getMinutoInicioEvento()+ ", hora_termino_evento = " +orcamento.getHoraTerminoEvento()+ ", minuto_termino_evento = " +orcamento.getMinutoTerminoEvento()+ ", local_evento = '" +orcamento.getLocalEvento()+ "', valor = " +orcamento.getValorOrcamento()+ ", horario_evento = '" +orcamento.getHorarioEvento()+ "', nome_mes = '" +orcamento.getNomeMes()+ "' WHERE codigo = " +orcamento.getCodigoOrcamento();
				stmt.executeUpdate(querySQL);
			}
			stmt.close();
			conexao.close();
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
		}
	}
	
	public List listaCodigoOrcamentoComboBox() throws ExcecaoMRSystem {
		Statement stmt = null;
		ResultSet rs = null;		
		List listaCodigoOrcamento = new LinkedList();
		try {
			stmt = conexao.createStatement();
			String querySQL = "SELECT DISTINCT codigo FROM orcamento_evento ORDER BY codigo";
			rs = stmt.executeQuery(querySQL);
			while(rs.next() == true) {
				String codigoOrcamento = rs.getString("codigo");
				listaCodigoOrcamento.add(codigoOrcamento);
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
		return listaCodigoOrcamento;
	}
	
	public List listaNomeClienteComboBox() throws ExcecaoMRSystem {
		Statement stmt = null;
		ResultSet rs = null;		
		List listaNomeCliente = new LinkedList();
		try {
			stmt = conexao.createStatement();
			String querySQL = "SELECT DISTINCT nome FROM cliente ORDER BY nome";
			rs = stmt.executeQuery(querySQL);
			while(rs.next() == true) {
				String nomeCliente = rs.getString("nome");
				listaNomeCliente.add(nomeCliente);
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
		return listaNomeCliente;
	}
	
	public List listaTipoBuffetComboBox() throws ExcecaoMRSystem {
		Statement stmt = null;
		ResultSet rs = null;		
		List listaTipoBuffet = new LinkedList();
		try {
			stmt = conexao.createStatement();
			String querySQL = "SELECT DISTINCT tipo FROM buffet ORDER BY tipo";
			rs = stmt.executeQuery(querySQL);
			while(rs.next() == true) {
				String tipoBuffet = rs.getString("tipo");
				listaTipoBuffet.add(tipoBuffet);
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
		return listaTipoBuffet;
	}
	
	public JasperPrint geraRelatorioOrcamentoTodos() {
		JasperPrint relatorio = null;
		try {
			Connection conexao = ConexaoBD.getConexao();
			HashMap map = new HashMap();
			String arquivoJasper = "RelatorioOrcamentoTodos.jasper";
			relatorio = JasperFillManager.fillReport(arquivoJasper, map, conexao);
			System.out.println("RELATÓRIO GERADO!");
		}
		catch (JRException e) {
			e.printStackTrace();
		}
		return relatorio;
	}
	
	public JasperPrint geraRelatorioOrcamentoCodigo(int codigoOrcamento) {
		JasperPrint relatorio = null;
		String codOrc = String.valueOf(codigoOrcamento);
		try {
			Connection conexao = ConexaoBD.getConexao();
			HashMap map = new HashMap();
			map.put("codigo", codOrc);
			String arquivoJasper = "RelatorioOrcamentoCodigo.jasper";
			relatorio = JasperFillManager.fillReport(arquivoJasper, map, conexao);
			System.out.println("RELATÓRIO GERADO!");
		}
		catch (JRException e) {
			e.printStackTrace();
		}
		return relatorio;
	}
	
	public JasperPrint geraRelatorioOrcamentoCliente(String nomeCliente) {
		JasperPrint relatorio = null;
		try {
			Connection conexao = ConexaoBD.getConexao();
			HashMap map = new HashMap();
			map.put("nome_cliente", nomeCliente);
			String arquivoJasper = "RelatorioOrcamentoCliente.jasper";
			relatorio = JasperFillManager.fillReport(arquivoJasper, map, conexao);
			System.out.println("RELATÓRIO GERADO!");
		}
		catch (JRException e) {
			e.printStackTrace();
		}
		return relatorio;
	}
}
