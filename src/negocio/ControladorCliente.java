package negocio;

import java.util.List;

import negocio.excecao.ExcecaoMRSystem;
import repositorio.IRepositorioCliente;
import repositorio.RepositorioCliente;

public class ControladorCliente {
	
	private IRepositorioCliente repositorioCliente;
	
	private static ControladorCliente controladorCliente = null;

	public static ControladorCliente getInstancia() {
		if (controladorCliente != null) {
			return controladorCliente;
		}
		else{
			return new ControladorCliente();
		}
	}

	public ControladorCliente() {
		this.repositorioCliente = new RepositorioCliente();
	}

	public void incluirCliente(Cliente cliente) throws ExcecaoMRSystem{
		this.repositorioCliente.incluirCliente(cliente);
	}

	public void excluirCliente(int codigoCliente) throws ExcecaoMRSystem{
		this.repositorioCliente.excluirCliente(codigoCliente);
	}

	public Cliente consultarCliente(int codigoCliente) throws ExcecaoMRSystem{
		return this.repositorioCliente.consultarCliente(codigoCliente);
	}

	public void alterarCliente(Cliente cliente) throws ExcecaoMRSystem{
		this.repositorioCliente.alterarCliente(cliente);
	}
	
	public List listaCodigoClienteComboBox() throws ExcecaoMRSystem{
		return this.repositorioCliente.listaCodigoClienteComboBox();
	}
	
	public List listaEstadoClienteComboBox() throws ExcecaoMRSystem{
		return this.repositorioCliente.listaEstadoClienteComboBox();
	}
}