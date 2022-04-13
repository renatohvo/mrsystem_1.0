package negocio;

public class Material {
	
	private int codigoMaterial;
	private String nomeMaterial;
	private String marcaMaterial;
	private String quantidadeMaterial;
	private double valorMaterial;
	
	public Material(int codigoMaterial, String nomeMaterial, String marcaMaterial, String quantidadeMaterial, double valorMaterial){
		this.setCodigoMaterial(codigoMaterial);
		this.setNomeMaterial(nomeMaterial);
		this.setMarcaMaterial(marcaMaterial);
		this.setQuantidadeMaterial(quantidadeMaterial);
		this.setValorMaterial(valorMaterial);
	}
	
	public void setCodigoMaterial(int codigoMaterial){
		this.codigoMaterial = codigoMaterial;
	}
   
	public void setNomeMaterial(String nomeMaterial){
		this.nomeMaterial = nomeMaterial;
	}
   
	public void setMarcaMaterial(String marcaMaterial){
		this.marcaMaterial = marcaMaterial;
	}

	public void setQuantidadeMaterial(String quantidadeMaterial){
   		this.quantidadeMaterial = quantidadeMaterial;
	}
   
	public void setValorMaterial(double valorMaterial){
   		this.valorMaterial = valorMaterial;
	}
   
   
	public int getCodigoMaterial(){
		return this.codigoMaterial;
	}
   
	public String getNomeMaterial(){
		return this.nomeMaterial;
	}
   
	public String getMarcaMaterial(){
		return this.marcaMaterial;
	}

	public String getQuantidadeMaterial(){
		return this.quantidadeMaterial;
	}
   
	public double getValorMaterial(){
		return this.valorMaterial;
	}
}
