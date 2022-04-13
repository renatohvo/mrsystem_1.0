package negocio;

import java.util.List;

import negocio.excecao.ExcecaoMRSystem;
import repositorio.IRepositorioFuncionario;
import repositorio.RepositorioFuncionario;


public class ControladorFuncionario {
	
	private IRepositorioFuncionario repositorioFuncionario;
	
	private static ControladorFuncionario controladorFuncionario = null;

	public static ControladorFuncionario getInstancia() {
		if (controladorFuncionario != null) {
			return controladorFuncionario;
		}
		else{
			return new ControladorFuncionario();
		}
	}

	public ControladorFuncionario() {
		this.repositorioFuncionario = new RepositorioFuncionario();
	}

	public void incluirFuncionario(Funcionario funcionario) throws ExcecaoMRSystem{
		this.repositorioFuncionario.incluirFuncionario(funcionario);
	}

	public void excluirFuncionario(int codigoFuncionario) throws ExcecaoMRSystem{
		this.repositorioFuncionario.excluirFuncionario(codigoFuncionario);
	}

	public Funcionario consultarFuncionario(int codigoFuncionario) throws ExcecaoMRSystem{
		return this.repositorioFuncionario.consultarFuncionario(codigoFuncionario);
	}

	public void alterarFuncionario(Funcionario funcionario) throws ExcecaoMRSystem{
		this.repositorioFuncionario.alterarFuncionario(funcionario);
	}
	
	public List listaCodigoFuncionarioComboBox() throws ExcecaoMRSystem{
		return this.repositorioFuncionario.listaCodigoFuncionarioComboBox();
	}
	
	public List listaEstadoFuncionarioComboBox() throws ExcecaoMRSystem{
		return this.repositorioFuncionario.listaEstadoFuncionarioComboBox();
	}
}
