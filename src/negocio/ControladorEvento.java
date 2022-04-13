package negocio;

import negocio.excecao.ExcecaoMRSystem;
import net.sf.jasperreports.engine.JasperPrint;
import repositorio.IRepositorioEvento;
import repositorio.RepositorioEvento;

public class ControladorEvento {
	
	private IRepositorioEvento repositorioEvento;
	
	private static ControladorEvento controladorEvento = null;

	public static ControladorEvento getInstancia() {
		if (controladorEvento != null) {
			return controladorEvento;
		}
		else{
			return new ControladorEvento();
		}
	}

	public ControladorEvento() {
		this.repositorioEvento = new RepositorioEvento();
	}
	
	
	public String[][] consultarEvento(String opcaoConsulta, String buscaCampoTexto) throws ExcecaoMRSystem{
		return this.repositorioEvento.consultarEvento(opcaoConsulta, buscaCampoTexto);
	}
	
	public String[][] pesquisarEventos( ) throws ExcecaoMRSystem{
		return this.repositorioEvento.pesquisarEventos();
	}
	
	public JasperPrint geraRelatorioEventoTodos(){
		return this.repositorioEvento.geraRelatorioEventoTodos();
	}
	
	public JasperPrint geraRelatorioEventoCliente(String nomeCliente){
		return this.repositorioEvento.geraRelatorioEventoCliente(nomeCliente);
	}
	
	public JasperPrint geraRelatorioEventoLocal(String localEvento){
		return this.repositorioEvento.geraRelatorioEventoLocal(localEvento);
	}
	
	public JasperPrint geraRelatorioEventoData(String diaEvento, String mesEvento, String anoEvento){
		return this.repositorioEvento.geraRelatorioEventoData(diaEvento, mesEvento, anoEvento);
	}
}