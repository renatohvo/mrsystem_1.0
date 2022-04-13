package repositorio;

import java.util.List;

import negocio.Orcamento;
import negocio.excecao.ExcecaoInexistente;
import negocio.excecao.ExcecaoMRSystem;
import net.sf.jasperreports.engine.JasperPrint;

public interface IRepositorioOrcamento {
	
	public void incluirOrcamento(Orcamento orcamento) throws ExcecaoMRSystem;

	public void excluirOrcamento(int codigoOrcamento) throws ExcecaoMRSystem;

	public Orcamento consultarOrcamento(int codigoOrcamento, String nomeCliente) throws ExcecaoInexistente, ExcecaoMRSystem;

	public void alterarOrcamento(Orcamento orcamento) throws ExcecaoMRSystem;
	
	public List listaCodigoOrcamentoComboBox() throws ExcecaoMRSystem;
	
	public List listaNomeClienteComboBox() throws ExcecaoMRSystem;

	public List listaTipoBuffetComboBox() throws ExcecaoMRSystem;
	
	public JasperPrint geraRelatorioOrcamentoTodos();
	
	public JasperPrint geraRelatorioOrcamentoCodigo(int codigoOrcamento);
	
	public JasperPrint geraRelatorioOrcamentoCliente(String nomeCliente);

}
