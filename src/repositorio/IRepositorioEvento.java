package repositorio;

import negocio.excecao.ExcecaoMRSystem;
import net.sf.jasperreports.engine.JasperPrint;

public interface IRepositorioEvento {
	
	public String[][] consultarEvento(String opcaoConsulta, String buscaCampoTexto) throws ExcecaoMRSystem;
	
	public String[][] pesquisarEventos() throws ExcecaoMRSystem;

	public JasperPrint geraRelatorioEventoTodos();
	
	public JasperPrint geraRelatorioEventoCliente(String nomeCliente);
	
	public JasperPrint geraRelatorioEventoLocal(String localEvento);
	
	public JasperPrint geraRelatorioEventoData(String diaEvento, String mesEvento, String anoEvento);
}
