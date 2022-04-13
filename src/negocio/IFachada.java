package negocio;

import java.util.List;

import negocio.excecao.ExcecaoInexistente;
import negocio.excecao.ExcecaoMRSystem;
import net.sf.jasperreports.engine.JasperPrint;

public interface IFachada {
	
	public void incluirCliente(Cliente cliente) throws ExcecaoMRSystem;

	public void excluirCliente(int codigoCliente) throws ExcecaoMRSystem;

	public Cliente consultarCliente(int codigoCliente) throws ExcecaoMRSystem;

	public void alterarCliente(Cliente cliente) throws  ExcecaoMRSystem;
	
	public List listaCodigoClienteComboBox() throws ExcecaoMRSystem;
	
	public List listaEstadoClienteComboBox() throws ExcecaoMRSystem;

	//---------------------------------------------------------------------------------------------------------
	
	public void incluirMaterial(Material material) throws ExcecaoMRSystem;

	public void excluirMaterial(int codigoMaterial) throws ExcecaoMRSystem;

	public Material consultarMaterial(int codigoMaterial) throws ExcecaoMRSystem;

	public void alterarMaterial(Material material) throws ExcecaoMRSystem;
	
	public List listaCodigoMaterialComboBox() throws ExcecaoMRSystem;
	
	public JasperPrint geraRelatorioMaterialTodos();
	
	public JasperPrint geraRelatorioMaterialNome(String nomeMaterial);
	
	public JasperPrint geraRelatorioMaterialMarca(String marcaMaterial);
	
	//---------------------------------------------------------------------------------------------------------
	
	public void incluirBuffet(Buffet buffet) throws ExcecaoMRSystem;

	public void excluirBuffet(int codigoBuffet) throws ExcecaoMRSystem;

	public Buffet consultarBuffet(int codigoBuffet, String tipoBuffet) throws ExcecaoInexistente, ExcecaoMRSystem;

	public void alterarBuffet(Buffet buffet) throws ExcecaoMRSystem;
	
	public List listaCodigoBuffetComboBox() throws ExcecaoMRSystem;

	//---------------------------------------------------------------------------------------------------------
	
	public void incluirFuncionario(Funcionario funcionario) throws ExcecaoMRSystem;

	public void excluirFuncionario(int codigoFuncionario) throws ExcecaoMRSystem;

	public Funcionario consultarFuncionario(int codigoFuncionario) throws ExcecaoMRSystem;

	public void alterarFuncionario(Funcionario funcionario) throws ExcecaoMRSystem;
	
	public List listaCodigoFuncionarioComboBox() throws ExcecaoMRSystem;
	
	public List listaEstadoFuncionarioComboBox() throws ExcecaoMRSystem;
	
	//---------------------------------------------------------------------------------------------------------
	
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
	
	//---------------------------------------------------------------------------------------------------------
	
	public String[][] consultarEvento(String opcaoConsulta, String buscaCampoTexto) throws ExcecaoMRSystem;
	
	public String[][] pesquisarEventos() throws ExcecaoMRSystem;
	
	public JasperPrint geraRelatorioEventoTodos();
	
	public JasperPrint geraRelatorioEventoCliente(String nomeCliente);
	
	public JasperPrint geraRelatorioEventoLocal(String localEvento);
	
	public JasperPrint geraRelatorioEventoData(String diaEvento, String mesEvento, String anoEvento);
	
}