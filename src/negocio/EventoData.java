package negocio;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EventoData{
	
	public String horario (int opcao){
		
		String horario = "";
		Date data = null;
		GregorianCalendar calendario = null;
		
		data = new Date();
		calendario = new GregorianCalendar();
		calendario.setTime(data);
		
		int horas = calendario.get(Calendar.HOUR_OF_DAY);
		int minutos = calendario.get(Calendar.MINUTE);
		int segundos = calendario.get(Calendar.SECOND);
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);
		int mes = calendario.get(Calendar.MONTH);
		int ano = calendario.get(Calendar.YEAR);
		String nomeMes = nomeMes(mes);
		
		String semana = nomeDia(diaSemana);
		
		switch(opcao){
		
		case 0:
			horario = " "+semana+", "+dia+" de "+nomeMes+" de "+ano;
			break;
		case 1:
			horario = " "+horas+":"+minutos+":"+segundos+" ";
			break;
		case 2:
			horario = ""+calendario.get(Calendar.DAY_OF_MONTH);
			break;
		case 3:
			mes = calendario.get(Calendar.MONTH);  
			horario = nomeMes(mes);
			break;
		case 4:
			horario = ""+calendario.get(Calendar.YEAR);  
			break;
		case 5:
			horario = ""+calendario.get(Calendar.MONTH);  
			break;
		}
		return horario;
	}
	
	//--------------------------------------------------------------
	
	public String nomeMes(int mes){
		
		String nomeMes = "";
		
		if(mes == 0){
			nomeMes = "Janeiro";
		}
		if(mes == 1){
			nomeMes = "Fevereiro";
		}
		if(mes == 2){
			nomeMes = "Março";
		}
		if(mes == 3){
			nomeMes = "Abril";
		}
		if(mes == 4){
			nomeMes = "Maio";
		}
		if(mes == 5){
			nomeMes = "Junho";
		}
		if(mes == 6){
			nomeMes = "Julho";
		}
		if(mes == 7){
			nomeMes = "Agosto";
		}
		if(mes == 8){
			nomeMes = "Setembro";
		}
		if(mes == 9){
			nomeMes = "Outubro";
		}
		if(mes == 10){
			nomeMes = "Novembro";
		}
		if(mes == 11){
			nomeMes = "Dezembro";
		}
		return nomeMes;
	}
	
	//--------------------------------------------------------------
	
	public int nomeMes2(String mes){
		
		int nomeMes = 0;
		
		if(mes.equals("Janeiro")){
			nomeMes = 0;
		}
		if(mes.equals("Fevereiro")){
			nomeMes = 1;
		}
		if(mes.equals("Março")){
			nomeMes = 2;
		}
		if(mes.equals("Abril")){
			nomeMes = 3;
		}
		if(mes.equals("Maio")){
			nomeMes = 4;
		}
		if(mes.equals("Junho")){
			nomeMes = 5;
		}
		if(mes.equals("Julho")){
			nomeMes = 6;
		}
		if(mes.equals("Agosto")){
			nomeMes = 7;
		}
		if(mes.equals("Setembro")){
			nomeMes = 8;
		}
		if(mes.equals("Outubro")){
			nomeMes = 9;
		}
		if(mes.equals("Novembro")){
			nomeMes = 10;
		}
		if(mes.equals("Dezembro")){
			nomeMes = 11;
		}
		return nomeMes;
	}
	
	//--------------------------------------------------------------
	
	public String nomeDia(int diaSemana){
		
		String semana = "";
		
		if(diaSemana == 1){
			semana = "Domingo";
		}
		if(diaSemana == 2){
			semana = "Segunda-feira";
		}
		if(diaSemana == 3){
			semana = "Terça-feira";
		}
		if(diaSemana == 4){
			semana = "Quarta-feira";
		}
		if(diaSemana == 5){
			semana = "Quinta-feira";
		}
		if(diaSemana == 6){
			semana = "Sexta-feira";
		}
		if(diaSemana == 7){
			semana = "Sábado";
		}
		return semana;
	}
}