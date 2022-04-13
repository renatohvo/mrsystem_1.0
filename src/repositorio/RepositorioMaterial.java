package repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import negocio.Material;
import negocio.excecao.ExcecaoMRSystem;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class RepositorioMaterial implements IRepositorioMaterial {
	
	Connection conexao;

	public RepositorioMaterial() {
		conexao = ConexaoBD.getConexao();
  	}

	public void incluirMaterial(Material material) throws ExcecaoMRSystem {
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "INSERT INTO material (codigo, nome, marca, quantidade, valor) VALUES (" +null+ ", '" +material.getNomeMaterial()+ "', '" +material.getMarcaMaterial()+ "', '" +material.getQuantidadeMaterial()+ "', " +material.getValorMaterial()+ ")";
			stmt.executeUpdate(querySQL);
			stmt.close();
			conexao.close();
		}
		catch (SQLException e) {
    		throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
    	}
	}

	public void excluirMaterial(int codigoMaterial) throws ExcecaoMRSystem {
		ResultSet rs;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM material WHERE codigo = " +codigoMaterial;
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()){
				querySQL = "DELETE FROM material WHERE codigo = " +codigoMaterial;
				stmt.executeUpdate(querySQL);
			}
			stmt.close();
			conexao.close();
		}
    	catch (SQLException e) {
    		throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
    	}
	}

	public Material consultarMaterial(int codigoMaterial) throws ExcecaoMRSystem{
		ResultSet rs;
		Material material = null;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM material WHERE codigo = " +codigoMaterial;
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()) {
				material = new Material(rs.getInt("codigo"), rs.getString("nome"), rs.getString("marca"), rs.getString("quantidade"), rs.getDouble("valor"));
			}
			stmt.close();
			conexao.close();
			return material;
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
		}
	}

	public void alterarMaterial(Material material) throws ExcecaoMRSystem {
		ResultSet rs;
		try {
			Statement stmt = conexao.createStatement();
			String querySQL = "SELECT * FROM material WHERE codigo = " +material.getCodigoMaterial();
			rs = stmt.executeQuery(querySQL);
			if(rs != null && rs.next()){
				querySQL = "UPDATE material SET nome = '" +material.getNomeMaterial()+ "', marca = '" +material.getMarcaMaterial()+ "', quantidade = '" +material.getQuantidadeMaterial()+ "', valor = " +material.getValorMaterial()+ " WHERE codigo = " +material.getCodigoMaterial();
				stmt.executeUpdate(querySQL);
			}
			stmt.close();
			conexao.close();
		}
		catch (SQLException e) {
			throw new ExcecaoMRSystem("ERRO DE SISTEMA! ERRO NO SQL OU BANCO DE DADOS.");
		}
	}
	
	public JasperPrint geraRelatorioMaterialTodos() {
		JasperPrint relatorio = null;
		try {
			Connection conexao = ConexaoBD.getConexao();
			HashMap map = new HashMap();
			String arquivoJasper = "RelatorioMaterialTodos.jasper";
			relatorio = JasperFillManager.fillReport(arquivoJasper, map, conexao);
			System.out.println("RELATÓRIO GERADO!");
		}
		catch (JRException e) {
			e.printStackTrace();
		}
		return relatorio;
	}
	
	public JasperPrint geraRelatorioMaterialNome(String nomeMaterial) {
		JasperPrint relatorio = null;
		try {
			Connection conexao = ConexaoBD.getConexao();
			HashMap map = new HashMap();
			map.put("nome", nomeMaterial);
			String arquivoJasper = "RelatorioMaterialNome.jasper";
			relatorio = JasperFillManager.fillReport(arquivoJasper, map, conexao);
			System.out.println("RELATÓRIO GERADO!");
		}
		catch (JRException e) {
			e.printStackTrace();
		}
		return relatorio;
	}
	
	public JasperPrint geraRelatorioMaterialMarca(String marcaMaterial) {
		JasperPrint relatorio = null;
		try {
			Connection conexao = ConexaoBD.getConexao();
			HashMap map = new HashMap();
			map.put("marca", marcaMaterial);
			String arquivoJasper = "RelatorioMaterialMarca.jasper";
			relatorio = JasperFillManager.fillReport(arquivoJasper, map, conexao);
			System.out.println("RELATÓRIO GERADO!");
		}
		catch (JRException e) {
			e.printStackTrace();
		}
		return relatorio;
	}
	
	public List listaCodigoMaterialComboBox() throws ExcecaoMRSystem {
		Statement stmt = null;
		ResultSet rs = null;		
		List listaCodigoMaterial = new LinkedList();
		try {
			stmt = conexao.createStatement();
			String querySQL = "SELECT DISTINCT codigo FROM material ORDER BY codigo";
			rs = stmt.executeQuery(querySQL);
			while(rs.next() == true) {
				String codigoMaterial = rs.getString("codigo");
				listaCodigoMaterial.add(codigoMaterial);
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
		return listaCodigoMaterial;
	}
}
