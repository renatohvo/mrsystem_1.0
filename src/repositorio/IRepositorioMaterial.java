package repositorio;

import java.util.List;

import negocio.Material;
import negocio.excecao.ExcecaoMRSystem;
import net.sf.jasperreports.engine.JasperPrint;

public interface IRepositorioMaterial {
	
	public void incluirMaterial(Material material) throws ExcecaoMRSystem;

	public void excluirMaterial(int codigoMaterial) throws ExcecaoMRSystem;

	public Material consultarMaterial(int codigoMaterial) throws ExcecaoMRSystem;

	public void alterarMaterial(Material material) throws  ExcecaoMRSystem;
	
	public List listaCodigoMaterialComboBox() throws ExcecaoMRSystem;
	
	public JasperPrint geraRelatorioMaterialTodos();
	
	public JasperPrint geraRelatorioMaterialNome(String nomeMaterial);
	
	public JasperPrint geraRelatorioMaterialMarca(String marcaMaterial);
}
