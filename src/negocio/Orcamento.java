package negocio;

public class Orcamento {
	
	private int codigoOrcamento;
	private String nomeCliente;
	private String tipoBuffet;
	private String nomeBuffet;
   	private int qtdPessoasOrcamento;
   	private int qtdGarconsOrcamento;
	private int qtdSegurancasOrcamento;
   	private int diaEmissaoOrcamento;
	private int mesEmissaoOrcamento;
	private int anoEmissaoOrcamento;
	private int diaEvento;
	private int mesEvento;
	private int anoEvento;
   	private int horaInicioEvento;
   	private int minutoInicioEvento;
   	private int horaTerminoEvento;
   	private int minutoTerminoEvento;
   	private String localEvento;
	private double valorOrcamento;
	private String horarioEvento;
	private String nomeMes;
   
   	public Orcamento(int codigoOrcamento, String nomeCliente, String tipoBuffet, String nomeBuffet, int qtdPessoasOrcamento, int qtdGarconsOrcamento, int qtdSegurancasOrcamento, int diaEmissaoOrcamento, int mesEmissaoOrcamento, int anoEmissaoOrcamento, int diaEvento, int mesEvento, int anoEvento, int horaInicioEvento, int minutoInicioEvento, int horaTerminoEvento, int minutoTerminoEvento, String localEvento, double valorOrcamento, String horarioEvento, String nomeMes) {
   		this.setCodigoOrcamento(codigoOrcamento);
   		this.setNomeCliente(nomeCliente);
   		this.setTipoBuffet(tipoBuffet);
   		this.setNomeBuffet(nomeBuffet);
   		this.setQtdPessoasOrcamento(qtdPessoasOrcamento);
   		this.setQtdGarconsOrcamento(qtdGarconsOrcamento);
   		this.setQtdSegurancasOrcamento(qtdSegurancasOrcamento);
   		this.setDiaEmissaoOrcamento(diaEmissaoOrcamento);
   		this.setMesEmissaoOrcamento(mesEmissaoOrcamento);
   		this.setAnoEmissaoOrcamento(anoEmissaoOrcamento);
   		this.setDiaEvento(diaEvento);
   		this.setMesEvento(mesEvento);
   		this.setAnoEvento(anoEvento);
   		this.setHoraInicioEvento(horaInicioEvento);
   		this.setMinutoInicioEvento(minutoInicioEvento);
   		this.setHoraTerminoEvento(horaTerminoEvento);
   		this.setMinutoTerminoEvento(minutoTerminoEvento);
   		this.setLocalEvento(localEvento);
   		this.setValorOrcamento(valorOrcamento);
   		this.setHorarioEvento(horarioEvento);
   		this.setNomeMes(nomeMes);
   	}
   
   	public void setCodigoOrcamento(int codigoOrcamento) {
   		this.codigoOrcamento = codigoOrcamento;
   	}
   
   	public void setNomeCliente(String nomeCliente) {
   		this.nomeCliente = nomeCliente;
   	}

   	public void setTipoBuffet(String tipoBuffet) {
   		this.tipoBuffet = tipoBuffet;
   	}
   	
   	public void setNomeBuffet(String nomeBuffet) {
   		this.nomeBuffet = nomeBuffet;
   	}
   
   	public void setQtdPessoasOrcamento(int qtdPessoasOrcamento) {
   		this.qtdPessoasOrcamento = qtdPessoasOrcamento;
    }
  
   	public void setQtdGarconsOrcamento(int qtdGarconsOrcamento) {
   		this.qtdGarconsOrcamento = qtdGarconsOrcamento;
    }
   	
	public void setQtdSegurancasOrcamento(int qtdSegurancasOrcamento) {
   		this.qtdSegurancasOrcamento = qtdSegurancasOrcamento;
    }
   
   	public void setDiaEmissaoOrcamento(int diaEmissaoOrcamento) {
   		this.diaEmissaoOrcamento = diaEmissaoOrcamento;
    }
   	
   	public void setMesEmissaoOrcamento(int mesEmissaoOrcamento) {
   		this.mesEmissaoOrcamento = mesEmissaoOrcamento;
    }
   	
   	public void setAnoEmissaoOrcamento(int anoEmissaoOrcamento) {
   		this.anoEmissaoOrcamento = anoEmissaoOrcamento;
    }
   
   	public void setDiaEvento(int diaEvento) {
   		this.diaEvento = diaEvento;
    }
   	
   	public void setMesEvento(int mesEvento) {
   		this.mesEvento = mesEvento;
    }
   	
   	public void setAnoEvento(int anoEvento) {
   		this.anoEvento = anoEvento;
    }
   
   	public void setHoraInicioEvento(int horaInicioEvento) {
   		this.horaInicioEvento = horaInicioEvento;
    }
   	
   	public void setMinutoInicioEvento(int minutoInicioEvento) {
   		this.minutoInicioEvento = minutoInicioEvento;
    }
   
   	public void setHoraTerminoEvento(int horaTerminoEvento) {
   		this.horaTerminoEvento = horaTerminoEvento;
    }
   	
   	public void setMinutoTerminoEvento(int minutoTerminoEvento) {
   		this.minutoTerminoEvento = minutoTerminoEvento;
    }
   
   	public void setLocalEvento(String localEvento) {
   		this.localEvento = localEvento;
    }
   	
   	public void setValorOrcamento(double valorOrcamento) {
   		this.valorOrcamento = valorOrcamento;
    }
   	
   	public void setHorarioEvento(String horarioEvento) {
   		this.horarioEvento = horarioEvento;
    }
   	
   	public void setNomeMes(String nomeMes) {
   		this.nomeMes = nomeMes;
    }
   	
   	
   	public int getCodigoOrcamento() {
   		return this.codigoOrcamento;
   	}
   	
   	public String getNomeCliente() {
   		return this.nomeCliente;
   	}
   
   	public String getTipoBuffet() {
   		return this.tipoBuffet;
   	}
   	
   	public String getNomeBuffet() {
   		return this.nomeBuffet;
   	}
  
   	public int getQtdPessoasOrcamento() {
   		return this.qtdPessoasOrcamento;
   	}
   
   	public int getQtdGarconsOrcamento() {
   		return this.qtdGarconsOrcamento;
   	}
   	
   	public int getQtdSegurancasOrcamento() {
   		return this.qtdSegurancasOrcamento;
   	}
   
   	public int getDiaEmissaoOrcamento() {
   		return this.diaEmissaoOrcamento;
   	}
   	
   	public int getMesEmissaoOrcamento() {
   		return this.mesEmissaoOrcamento;
   	}
   	
   	public int getAnoEmissaoOrcamento() {
   		return this.anoEmissaoOrcamento;
   	}
   
   	public int getDiaEvento() {
   		return this.diaEvento;
   	}
   	
   	public int getMesEvento() {
   		return this.mesEvento;
   	}
   	
   	public int getAnoEvento() {
   		return this.anoEvento;
   	}
   
   	public int getHoraInicioEvento() {
   		return this.horaInicioEvento;
   	}
   	
   	public int getMinutoInicioEvento() {
   		return this.minutoInicioEvento;
   	}
   
   	public int getHoraTerminoEvento() {
   		return this.horaTerminoEvento;
   	}
   	
	public int getMinutoTerminoEvento() {
   		return this.minutoTerminoEvento;
   	}
   	
   	public String getLocalEvento() {
   		return this.localEvento;
   	}
   	
	public double getValorOrcamento() {
		return this.valorOrcamento;
   	}
	
	public String getHorarioEvento() {
   		return this.horarioEvento;
   	}
	
	public String getNomeMes() {
   		return this.nomeMes;
   	}
}