package negocio;

import java.util.List;

import negocio.excecao.ExcecaoInexistente;
import negocio.excecao.ExcecaoMRSystem;
import net.sf.jasperreports.engine.JasperPrint;

public class Fachada implements IFachada {

	public Fachada() {}
	
	public void incluirCliente(Cliente cliente) throws ExcecaoMRSystem{
		ControladorCliente.getInstancia().incluirCliente(cliente);
	}

	public void excluirCliente(int codigoCliente) throws ExcecaoMRSystem{
		ControladorCliente.getInstancia().excluirCliente(codigoCliente);
	}

	public Cliente consultarCliente(int codigoCliente) throws ExcecaoMRSystem{
		return ControladorCliente.getInstancia().consultarCliente(codigoCliente);
	}

	public void alterarCliente(Cliente cliente) throws ExcecaoMRSystem{
		ControladorCliente.getInstancia().alterarCliente(cliente);
	}
	
	public List listaCodigoClienteComboBox() throws ExcecaoMRSystem{
		return ControladorCliente.getInstancia().listaCodigoClienteComboBox();
	}
	
	public List listaEstadoClienteComboBox() throws ExcecaoMRSystem{
		return ControladorCliente.getInstancia().listaEstadoClienteComboBox();
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public void incluirMaterial(Material material) throws ExcecaoMRSystem{
		ControladorMaterial.getInstancia().incluirMaterial(material);
	}

	public void excluirMaterial(int codigoMaterial) throws ExcecaoMRSystem{
		ControladorMaterial.getInstancia().excluirMaterial(codigoMaterial);
	}

	public Material consultarMaterial(int codigoMaterial) throws ExcecaoMRSystem{
		return ControladorMaterial.getInstancia().consultarMaterial(codigoMaterial);
	}

	public void alterarMaterial(Material material) throws ExcecaoMRSystem{
		ControladorMaterial.getInstancia().alterarMaterial(material);
	}
	
	public List listaCodigoMaterialComboBox() throws ExcecaoMRSystem{
		return ControladorMaterial.getInstancia().listaCodigoMaterialComboBox();
	}
	
	public JasperPrint geraRelatorioMaterialTodos(){
		return ControladorMaterial.getInstancia().geraRelatorioMaterialTodos();
	}
	
	public JasperPrint geraRelatorioMaterialNome(String nomeMaterial){
		return ControladorMaterial.getInstancia().geraRelatorioMaterialNome(nomeMaterial);
	}
	
	public JasperPrint geraRelatorioMaterialMarca(String marcaMaterial){
		return ControladorMaterial.getInstancia().geraRelatorioMaterialMarca(marcaMaterial);
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public void incluirBuffet(Buffet buffet) throws ExcecaoMRSystem{
		ControladorBuffet.getInstancia().incluirBuffet(buffet);
	}

	public void excluirBuffet(int codigoBuffet) throws ExcecaoMRSystem{
		ControladorBuffet.getInstancia().excluirBuffet(codigoBuffet);
	}

	public Buffet consultarBuffet(int codigoBuffet, String tipoBuffet) throws ExcecaoInexistente, ExcecaoMRSystem{
		return ControladorBuffet.getInstancia().consultarBuffet(codigoBuffet, tipoBuffet);
	}

	public void alterarBuffet(Buffet buffet) throws  ExcecaoMRSystem{
		ControladorBuffet.getInstancia().alterarBuffet(buffet);
	}
	
	public List listaCodigoBuffetComboBox() throws ExcecaoMRSystem{
		return ControladorBuffet.getInstancia().listaCodigoBuffetComboBox();
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public void incluirFuncionario(Funcionario funcionario) throws ExcecaoMRSystem{
		ControladorFuncionario.getInstancia().incluirFuncionario(funcionario);
	}

	public void excluirFuncionario(int codigoFuncionario) throws ExcecaoMRSystem{
		ControladorFuncionario.getInstancia().excluirFuncionario(codigoFuncionario);
	}

	public Funcionario consultarFuncionario(int codigoFuncionario) throws ExcecaoMRSystem{
		return ControladorFuncionario.getInstancia().consultarFuncionario(codigoFuncionario);
	}

	public void alterarFuncionario(Funcionario funcionario) throws ExcecaoMRSystem{
		ControladorFuncionario.getInstancia().alterarFuncionario(funcionario);
	}
	
	public List listaCodigoFuncionarioComboBox() throws ExcecaoMRSystem{
		return ControladorFuncionario.getInstancia().listaCodigoFuncionarioComboBox();
	}
	
	public List listaEstadoFuncionarioComboBox() throws ExcecaoMRSystem{
		return ControladorFuncionario.getInstancia().listaEstadoFuncionarioComboBox();
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public void incluirOrcamento(Orcamento orcamento) throws ExcecaoMRSystem{
		ControladorOrcamento.getInstancia().incluirOrcamento(orcamento);
	}

	public void excluirOrcamento(int codigoOrcamento) throws ExcecaoMRSystem{
		ControladorOrcamento.getInstancia().excluirOrcamento(codigoOrcamento);
	}

	public Orcamento consultarOrcamento(int codigoOrcamento, String nomeCliente) throws ExcecaoInexistente, ExcecaoMRSystem{
		return ControladorOrcamento.getInstancia().consultarOrcamento(codigoOrcamento, nomeCliente);
	}

	public void alterarOrcamento(Orcamento orcamento) throws ExcecaoMRSystem{
		ControladorOrcamento.getInstancia().alterarOrcamento(orcamento);
	}
	
	public List listaCodigoOrcamentoComboBox() throws ExcecaoMRSystem{
		return ControladorOrcamento.getInstancia().listaCodigoOrcamentoComboBox();
	}
	
	public List listaNomeClienteComboBox() throws ExcecaoMRSystem{
		return ControladorOrcamento.getInstancia().listaNomeClienteComboBox();
	}
	
	public List listaTipoBuffetComboBox() throws ExcecaoMRSystem{
		return ControladorOrcamento.getInstancia().listaTipoBuffetComboBox();
	}
	
	public JasperPrint geraRelatorioOrcamentoTodos(){
		return ControladorOrcamento.getInstancia().geraRelatorioOrcamentoTodos();
	}
	
	public JasperPrint geraRelatorioOrcamentoCodigo(int codigoOrcamento){
		return ControladorOrcamento.getInstancia().geraRelatorioOrcamentoCodigo(codigoOrcamento);
	}
	
	public JasperPrint geraRelatorioOrcamentoCliente(String nomeCliente){
		return ControladorOrcamento.getInstancia().geraRelatorioOrcamentoCliente(nomeCliente);
	}
	
	//----------------------------------------------------------------------------------------------------------------
	
	public String[][] consultarEvento(String opcaoConsulta, String buscaCampoTexto) throws ExcecaoMRSystem {		
		return  ControladorEvento.getInstancia().consultarEvento(opcaoConsulta, buscaCampoTexto);		
	}
	
	public String[][] pesquisarEventos( ) throws ExcecaoMRSystem{		
		return  ControladorEvento.getInstancia().pesquisarEventos();		
	}
	
	public JasperPrint geraRelatorioEventoTodos(){
		return ControladorEvento.getInstancia().geraRelatorioEventoTodos();
	}
	
	public JasperPrint geraRelatorioEventoCliente(String nomeCliente){
		return ControladorEvento.getInstancia().geraRelatorioEventoCliente(nomeCliente);
	}
	
	public JasperPrint geraRelatorioEventoLocal(String localEvento){
		return ControladorEvento.getInstancia().geraRelatorioEventoLocal(localEvento);
	}
	
	public JasperPrint geraRelatorioEventoData(String diaEvento, String mesEvento, String anoEvento){
		return ControladorEvento.getInstancia().geraRelatorioEventoData(diaEvento, mesEvento, anoEvento);
	}
}