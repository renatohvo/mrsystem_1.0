package negocio;

public class Funcionario {
	private int codigoFuncionario;
	private String nomeFuncionario;
	private String cargoFuncionario;
	private String rgFuncionario;
	private String cpfFuncionario;
	private String ruaFuncionario;
	private String numeroFuncionario;
	private String bairroFuncionario;
	private String cidadeFuncionario;
	private String estadoFuncionario;
	private String telefoneFuncionario;
	private double valorFuncionario;
	private String emailFuncionario;
   
	public Funcionario(int codigoFuncionario, String nomeFuncionario, String cargoFuncionario, String rgFuncionario, String cpfFuncionario, String ruaFuncionario, String numeroFuncionario, String bairroFuncionario, String cidadeFuncionario, String estadoFuncionario, String telefoneFuncionario, double valorFuncionario, String emailFuncionario) {
		this.setCodigoFuncionario(codigoFuncionario);
		this.setNomeFuncionario(nomeFuncionario);
		this.setCargoFuncionario(cargoFuncionario);
		this.setRgFuncionario(rgFuncionario);
		this.setCpfFuncionario(cpfFuncionario);
		this.setRuaFuncionario(ruaFuncionario);
		this.setNumeroFuncionario(numeroFuncionario);
		this.setBairroFuncionario(bairroFuncionario);
		this.setCidadeFuncionario(cidadeFuncionario);
		this.setEstadoFuncionario(estadoFuncionario);
		this.setTelefoneFuncionario(telefoneFuncionario);
		this.setValorFuncionario(valorFuncionario);
		this.setEmailFuncionario(emailFuncionario);
	}
   
	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}
   
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
   	}
   
	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}
   
	public void setRgFuncionario(String rgFuncionario) {
		this.rgFuncionario = rgFuncionario;
	}
   
	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	public void setRuaFuncionario(String ruaFuncionario) {
		this.ruaFuncionario = ruaFuncionario;
	}
   
	public void setNumeroFuncionario(String numeroFuncionario) {
	   this.numeroFuncionario = numeroFuncionario;
	}
   
	public void setBairroFuncionario(String bairroFuncionario) {
		this.bairroFuncionario = bairroFuncionario;
	}
   
	public void setCidadeFuncionario(String cidadeFuncionario) {
		this.cidadeFuncionario = cidadeFuncionario;
	}
   
	public void setEstadoFuncionario(String estadoFuncionario) {
		this.estadoFuncionario = estadoFuncionario;
	}
   
	public void setTelefoneFuncionario(String telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}
	
	public void setValorFuncionario(double valorFuncionario) {
		this.valorFuncionario = valorFuncionario;
	}
   
	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}
   
   
   
	public int getCodigoFuncionario() {
		return this.codigoFuncionario;
	}
   
	public String getNomeFuncionario() {
		return this.nomeFuncionario;
	}

	public String getCargoFuncionario() {
		return this.cargoFuncionario;
	}
   
	public String getRgFuncionario() {
		return this.rgFuncionario;
	}
   
	public String getCpfFuncionario() {
		return this.cpfFuncionario;
	}
   
	public String getRuaFuncionario() {
		return this.ruaFuncionario;
	}
   
	public String getNumeroFuncionario() {
		return this.numeroFuncionario;
	}
   
	public String getBairroFuncionario() {
		return this.bairroFuncionario;
	}
   
	public String getCidadeFuncionario() {
		return this.cidadeFuncionario;
	}

	public String getEstadoFuncionario() {
		return this.estadoFuncionario;
	}
   
	public String getTelefoneFuncionario() {
		return this.telefoneFuncionario;
   	}
	
	public double getValorFuncionario() {
		return valorFuncionario;
	}
	
	public String getEmailFuncionario() {
		return this.emailFuncionario;
   	}
}
