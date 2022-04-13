package negocio;

import java.util.List;

import negocio.excecao.ExcecaoInexistente;
import negocio.excecao.ExcecaoMRSystem;
import repositorio.IRepositorioBuffet;
import repositorio.RepositorioBuffet;

public class ControladorBuffet {
	
	private IRepositorioBuffet repositorioBuffet;
	
	private static ControladorBuffet controladorBuffet = null;

	public static ControladorBuffet getInstancia() {
		if (controladorBuffet != null) {
			return controladorBuffet;
		}
		else{
			return new ControladorBuffet();
		}
	}

	public ControladorBuffet() {
		this.repositorioBuffet = new RepositorioBuffet();
	}

	public void incluirBuffet(Buffet buffet) throws ExcecaoMRSystem{
		this.repositorioBuffet.incluirBuffet(buffet);
	}

	public void excluirBuffet(int codigoBuffet) throws ExcecaoMRSystem{
		this.repositorioBuffet.excluirBuffet(codigoBuffet);
	}

	public Buffet consultarBuffet(int codigoBuffet, String tipoBuffet) throws ExcecaoInexistente, ExcecaoMRSystem{
		return this.repositorioBuffet.consultarBuffet(codigoBuffet, tipoBuffet);
	}

	public void alterarBuffet(Buffet buffet) throws ExcecaoMRSystem{
		this.repositorioBuffet.alterarBuffet(buffet);
	}
	
	public List listaCodigoBuffetComboBox() throws ExcecaoMRSystem{
		return this.repositorioBuffet.listaCodigoBuffetComboBox();
	}
}
