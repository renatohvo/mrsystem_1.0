package negocio.excecao;

public class ExcecaoInexistente extends Exception{
	private static final long serialVersionUID = 1L;

	public ExcecaoInexistente(String msg) {
		super(msg);
	}
}