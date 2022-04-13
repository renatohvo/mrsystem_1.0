package repositorio;

import java.util.List;

import negocio.Buffet;
import negocio.excecao.ExcecaoInexistente;
import negocio.excecao.ExcecaoMRSystem;

public interface IRepositorioBuffet {
	
	public void incluirBuffet(Buffet buffet) throws ExcecaoMRSystem;

	public void excluirBuffet(int codigoBuffet) throws ExcecaoMRSystem;

	public Buffet consultarBuffet(int codigoBuffet, String tipoBuffet) throws ExcecaoInexistente, ExcecaoMRSystem;

	public void alterarBuffet(Buffet buffet) throws  ExcecaoMRSystem;
	
	public List listaCodigoBuffetComboBox() throws ExcecaoMRSystem;

}
