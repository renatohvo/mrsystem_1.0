package negocio;

public class Buffet{
	
	private int codigoBuffet;
	private String nomeBuffet;
	private String tipoBuffet;
	private double valorBuffet;
	private String descricaoBuffet;
   
	public Buffet(int codigoBuffet, String nomeBuffet, String tipoBuffet, double valorBuffet, String descricaoBuffet){
		this.setCodigoBuffet(codigoBuffet);
		this.setNomeBuffet(nomeBuffet);
		this.setTipoBuffet(tipoBuffet);
		this.setValorBuffet(valorBuffet);
		this.setDescricaoBuffet(descricaoBuffet);
	}
   
	public void setCodigoBuffet(int codigoBuffet){
		this.codigoBuffet = codigoBuffet;
	}
	
	public void setNomeBuffet(String nomeBuffet) {
		this.nomeBuffet = nomeBuffet;
	}
   
	public void setTipoBuffet(String tipoBuffet) {
		this.tipoBuffet = tipoBuffet;
	}
   
	public void setValorBuffet(double valorBuffet) {
		this.valorBuffet = valorBuffet;
	}
	
	public void setDescricaoBuffet(String descricaoBuffet) {
		this.descricaoBuffet = descricaoBuffet;
	}
   

   
	public int getCodigoBuffet() {
		return this.codigoBuffet;
	}
	
	public String getNomeBuffet() {
		return this.nomeBuffet;
	}
   
	public String getTipoBuffet() {
		return this.tipoBuffet;
	}
   
	public double getValorBuffet() {
		return this.valorBuffet;
	}
   
	public String getDescricaoBuffet() {
		return this.descricaoBuffet;
	}
}