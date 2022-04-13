package repositorio;

import java.util.List;

import negocio.Cliente;
import negocio.excecao.ExcecaoMRSystem;

public interface IRepositorioCliente {
	
	public void incluirCliente(Cliente cliente) throws ExcecaoMRSystem;

	public void excluirCliente(int codigoCliente) throws ExcecaoMRSystem;

	public Cliente consultarCliente(int codigoCliente) throws ExcecaoMRSystem;

	public void alterarCliente(Cliente cliente) throws  ExcecaoMRSystem;
	
	public List listaCodigoClienteComboBox() throws ExcecaoMRSystem;
	
	public List listaEstadoClienteComboBox() throws ExcecaoMRSystem;

}