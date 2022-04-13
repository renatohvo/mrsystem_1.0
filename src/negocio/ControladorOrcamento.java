package negocio;

import java.util.List;

import negocio.excecao.ExcecaoInexistente;
import negocio.excecao.ExcecaoMRSystem;
import net.sf.jasperreports.engine.JasperPrint;
import repositorio.IRepositorioOrcamento;
import repositorio.RepositorioOrcamento;

public class ControladorOrcamento {
	
	private IRepositorioOrcamento repositorioOrcamento;
	
	private static ControladorOrcamento controladorOrcamento = null;

	public static ControladorOrcamento getInstancia() {
		if (controladorOrcamento != null) {
			return controladorOrcamento;
		}
		else{
			return new ControladorOrcamento();
		}
	}

	public ControladorOrcamento() {
		this.repositorioOrcamento = new RepositorioOrcamento();
	}

	public void incluirOrcamento(Orcamento orcamento) throws ExcecaoMRSystem{
		this.repositorioOrcamento.incluirOrcamento(orcamento);
	}

	public void excluirOrcamento(int codigoOrcamento) throws ExcecaoMRSystem{
		this.repositorioOrcamento.excluirOrcamento(codigoOrcamento);
	}

	public Orcamento consultarOrcamento(int codigoOrcamento, String nomeCliente) throws ExcecaoInexistente, ExcecaoMRSystem{
		return this.repositorioOrcamento.consultarOrcamento(codigoOrcamento, nomeCliente);
	}

	public void alterarOrcamento(Orcamento orcamento) throws ExcecaoMRSystem{
		this.repositorioOrcamento.alterarOrcamento(orcamento);
	}
	
	public List listaCodigoOrcamentoComboBox() throws ExcecaoMRSystem{
		return this.repositorioOrcamento.listaCodigoOrcamentoComboBox();
	}
	
	public List listaNomeClienteComboBox() throws ExcecaoMRSystem{
		return this.repositorioOrcamento.listaNomeClienteComboBox();
	}
	
	public List listaTipoBuffetComboBox() throws ExcecaoMRSystem{
		return this.repositorioOrcamento.listaTipoBuffetComboBox();
	}
	
	public JasperPrint geraRelatorioOrcamentoTodos(){
		return this.repositorioOrcamento.geraRelatorioOrcamentoTodos();
	}
	
	public JasperPrint geraRelatorioOrcamentoCodigo(int codigoOrcamento){
		return this.repositorioOrcamento.geraRelatorioOrcamentoCodigo(codigoOrcamento);
	}
	
	public JasperPrint geraRelatorioOrcamentoCliente(String nomeCliente){
		return this.repositorioOrcamento.geraRelatorioOrcamentoCliente(nomeCliente);
	}
}
