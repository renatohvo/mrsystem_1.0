package repositorio;

import java.util.List;

import negocio.Funcionario;
import negocio.excecao.ExcecaoMRSystem;

public interface IRepositorioFuncionario {
	
	public void incluirFuncionario(Funcionario funcionario) throws ExcecaoMRSystem;

	public void excluirFuncionario(int codigoFuncionario) throws ExcecaoMRSystem;

	public Funcionario consultarFuncionario(int codigoFuncionario) throws ExcecaoMRSystem;

	public void alterarFuncionario(Funcionario funcionario) throws  ExcecaoMRSystem;
	
	public List listaCodigoFuncionarioComboBox() throws ExcecaoMRSystem;
	
	public List listaEstadoFuncionarioComboBox() throws ExcecaoMRSystem;

}
