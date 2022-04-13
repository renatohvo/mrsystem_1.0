package negocio;

public class Cliente{
	
	private int codigoCliente;
	private String nomeCliente;
	private String rgCliente;
	private String cpfCliente;
	private String cnpjCliente;
	private String ruaCliente;
	private String numeroCliente;
	private String bairroCliente;
	private String cidadeCliente;
	private String estadoCliente;
	private String telefoneCliente;
	private String emailCliente;
	
	public Cliente(int codigoCliente, String nomeCliente, String rgCliente, String cpfCliente, String cnpjCliente, String ruaCliente, String numeroCliente, String bairroCliente, String cidadeCliente, String estadoCliente, String telefoneCliente, String emailCliente){
		this.setCodigoCliente(codigoCliente);
		this.setNomeCliente(nomeCliente);
		this.setRgCliente(rgCliente);
		this.setCpfCliente(cpfCliente);
		this.setCnpjCliente(cnpjCliente);
		this.setRuaCliente(ruaCliente);
		this.setNumeroCliente(numeroCliente);
		this.setBairroCliente(bairroCliente);
		this.setCidadeCliente(cidadeCliente);
		this.setEstadoCliente(estadoCliente);
		this.setTelefoneCliente(telefoneCliente);
		this.setEmailCliente(emailCliente);
	}
	
	public void setCodigoCliente(int codigoCliente){
		this.codigoCliente = codigoCliente;
	}
   
	public void setNomeCliente(String nomeCliente){
		this.nomeCliente = nomeCliente;
	}
   
	public void setRgCliente(String rgCliente){
		this.rgCliente = rgCliente;
	}

	public void setCpfCliente(String cpfCliente){
   		this.cpfCliente = cpfCliente;
	}
	
	public void setCnpjCliente(String cnpjCliente){
   		this.cnpjCliente = cnpjCliente;
	}
   
	public void setRuaCliente(String ruaCliente){
	   	this.ruaCliente = ruaCliente;
	}
   
	public void setNumeroCliente(String numeroCliente){
	   	this.numeroCliente = numeroCliente;
	}
   
	public void setBairroCliente(String bairroCliente){
		this.bairroCliente = bairroCliente;
	}

	public void setCidadeCliente(String cidadeCliente){
		this.cidadeCliente = cidadeCliente;
	}
   
	public void setEstadoCliente(String estadoCliente){
		this.estadoCliente = estadoCliente;
	}
   
	public void setTelefoneCliente(String telefoneCliente){
		this.telefoneCliente = telefoneCliente;
	}
	public void setEmailCliente(String emailCliente){
		this.emailCliente = emailCliente;
	}
	
   
	public int getCodigoCliente(){
		return this.codigoCliente;
	}
   
	public String getNomeCliente(){
		return this.nomeCliente;
	}
   
	public String getRgCliente(){
		return this.rgCliente;
	}

	public String getCpfCliente(){
		return this.cpfCliente;
	}
	
	public String getCnpjCliente(){
		return this.cnpjCliente;
	}
   
	public String getRuaCliente(){
		return this.ruaCliente;
	}
   
	public String getNumeroCliente(){
		return this.numeroCliente;
	}
   
	public String getBairroCliente(){
		return this.bairroCliente;
	}
   
	public String getCidadeCliente(){
		return this.cidadeCliente;
	}
   
	public String getEstadoCliente(){
		return this.estadoCliente;
	}
   
	public String getTelefoneCliente(){
		return this.telefoneCliente;
	}
	public String getEmailCliente(){
		return this.emailCliente;
	}
}
