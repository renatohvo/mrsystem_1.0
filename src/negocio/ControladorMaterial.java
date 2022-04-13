package negocio;

import java.util.List;

import negocio.excecao.ExcecaoMRSystem;
import net.sf.jasperreports.engine.JasperPrint;
import repositorio.IRepositorioMaterial;
import repositorio.RepositorioMaterial;

public class ControladorMaterial {
	
	private IRepositorioMaterial repositorioMaterial;
	
	private static ControladorMaterial controladorMaterial = null;

	public static ControladorMaterial getInstancia() {
		if (controladorMaterial != null) {
			return controladorMaterial;
		}
		else{
			return new ControladorMaterial();
		}
	}

	public ControladorMaterial() {
		this.repositorioMaterial = new RepositorioMaterial();
	}

	public void incluirMaterial(Material material) throws ExcecaoMRSystem{
		this.repositorioMaterial.incluirMaterial(material);
	}

	public void excluirMaterial(int codigoMaterial) throws ExcecaoMRSystem{
		this.repositorioMaterial.excluirMaterial(codigoMaterial);
	}

	public Material consultarMaterial(int codigoMaterial) throws ExcecaoMRSystem{
		return this.repositorioMaterial.consultarMaterial(codigoMaterial);
	}

	public void alterarMaterial(Material material) throws ExcecaoMRSystem{
		this.repositorioMaterial.alterarMaterial(material);
	}
	
	public JasperPrint geraRelatorioMaterialTodos(){
		return this.repositorioMaterial.geraRelatorioMaterialTodos();
	}
	
	public JasperPrint geraRelatorioMaterialNome(String nomeMaterial){
		return this.repositorioMaterial.geraRelatorioMaterialNome(nomeMaterial);
	}
	
	public JasperPrint geraRelatorioMaterialMarca(String marcaMaterial){
		return this.repositorioMaterial.geraRelatorioMaterialMarca(marcaMaterial);
	}
	
	public List listaCodigoMaterialComboBox() throws ExcecaoMRSystem{
		return this.repositorioMaterial.listaCodigoMaterialComboBox();
	}
}
