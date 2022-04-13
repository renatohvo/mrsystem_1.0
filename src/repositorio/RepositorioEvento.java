package repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import negocio.excecao.ExcecaoMRSystem;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class RepositorioEvento implements IRepositorioEvento {
	
	Connection conexao;
	
	public  RepositorioEvento() {
		
		super();
		
		conexao = ConexaoBD.getConexao();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String[][] consultarEvento(String opcaoConsulta, String buscaCampoTexto) throws ExcecaoMRSystem{
		int j = 1;
		int cont = 0;
		String[][] resultado = null;
		Statement stmt = null;
		ResultSet rs = null;		     
		try {
			stmt = conexao.createStatement();
			String comandoSQL = "SELECT dia_evento, nome_mes, ano_evento, horario_evento, nome_cliente, local_evento FROM orcamento_evento WHERE "+opcaoConsulta+" LIKE "+buscaCampoTexto;
			rs = stmt.executeQuery(comandoSQL);		     
			int numCols = rs.getMetaData().getColumnCount();				
			rs.last();
			cont = rs.getRow();		
			rs.beforeFirst();
			resultado = new String[cont][numCols];
			while(rs.next()){
				for(int i = 1; i <= numCols; i++){
					resultado[j-1][i-1] = rs.getString(i);
				}
				j++;
			}
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("DIGITE NÚMEROS SE A CONSULTA FOR PARA DIA OU ANO.");
		}
		finally {
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
		return resultado;
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String[][] pesquisarEventos() throws ExcecaoMRSystem{
		int j = 1;
		int cont = 0;
		String[][] resultado=null;
		Statement stmt = null;
		ResultSet rs = null;		     
		try {
			stmt = conexao.createStatement();
			String comandoSQL = "SELECT dia_evento, nome_mes, ano_evento, horario_evento, nome_cliente, local_evento, codigo FROM orcamento_evento ORDER BY ano_evento, mes_evento, dia_evento, horario_evento, nome_cliente";
			rs = stmt.executeQuery(comandoSQL);		     
			int numCols = rs.getMetaData().getColumnCount();				
			rs.last();
			cont = rs.getRow();		
			rs.beforeFirst();
			resultado = new String[cont][numCols];
			while(rs.next()){
				for(int i = 1; i <= numCols; i++){
					resultado[j-1][i-1] = rs.getString(i);
				}
				j++;
			}
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
		}
		finally {
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
		return resultado;
	}
	
	public JasperPrint geraRelatorioEventoTodos() {
		JasperPrint relatorio = null;
		try {
			Connection conexao = ConexaoBD.getConexao();
			HashMap map = new HashMap();
			String arquivoJasper = "RelatorioEventoTodos.jasper";
			relatorio = JasperFillManager.fillReport(arquivoJasper, map, conexao);
			System.out.println("RELATÓRIO GERADO!");
		}
		catch (JRException e) {
			e.printStackTrace();
		}
		return relatorio;
	}
	
	public JasperPrint geraRelatorioEventoCliente(String nomeCliente) {
		JasperPrint relatorio = null;
		try {
			Connection conexao = ConexaoBD.getConexao();
			HashMap map = new HashMap();
			map.put("nome_cliente", nomeCliente);
			String arquivoJasper = "RelatorioEventoCliente.jasper";
			relatorio = JasperFillManager.fillReport(arquivoJasper, map, conexao);
			System.out.println("RELATÓRIO GERADO!");
		}
		catch (JRException e) {
			e.printStackTrace();
		}
		return relatorio;
	}
	
	public JasperPrint geraRelatorioEventoLocal(String localEvento) {
		JasperPrint relatorio = null;
		try {
			Connection conexao = ConexaoBD.getConexao();
			HashMap map = new HashMap();
			map.put("local_evento", localEvento);
			String arquivoJasper = "RelatorioEventoLocal.jasper";
			relatorio = JasperFillManager.fillReport(arquivoJasper, map, conexao);
			System.out.println("RELATÓRIO GERADO!");
		}
		catch (JRException e) {
			e.printStackTrace();
		}
		return relatorio;
	}
	
	public JasperPrint geraRelatorioEventoData(String diaEvento, String mesEvento, String anoEvento) {
		JasperPrint relatorio = null;
		try {
			Connection conexao = ConexaoBD.getConexao();
			HashMap map = new HashMap();
			map.put("dia_evento", diaEvento);
			map.put("mes_evento", mesEvento);
			map.put("ano_evento", anoEvento);
			String arquivoJasper = "RelatorioEventoData.jasper";
			relatorio = JasperFillManager.fillReport(arquivoJasper, map, conexao);
			System.out.println("RELATÓRIO GERADO!");
		}
		catch (JRException e) {
			e.printStackTrace();
		}
		return relatorio;
	}
}
