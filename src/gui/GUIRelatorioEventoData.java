package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.WindowConstants;

import negocio.Fachada;
import negocio.IFachada;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class GUIRelatorioEventoData extends javax.swing.JDialog {
	/**
	 * 
	 */
	
	private IFachada fachada;
	
	private static final long serialVersionUID = 1L;
	private JSeparator jSeparatorRelatorioEventoDia1;
	private JLabel anoLabel;
	private JComboBox anoComboBox;
	private JLabel mesLabel;
	private JComboBox mesComboBox;
	private JLabel diaLabel;
	private JComboBox diaComboBox;
	private JButton relatorioEventoDataCancelarButton;
	private JButton relatorioEventoDataLimparButton;
	private JButton relatorioEventoDataButton;
	private JSeparator jSeparatorRelatorioEventoDia2;
	private JLabel relatorioEventoDataLabel;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		GUIRelatorioEventoData inst = new GUIRelatorioEventoData();
		inst.setVisible(true);
	}
	
	public GUIRelatorioEventoData() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Relatório de Eventos - Data");
			this.setResizable(false);
			this.setModal(true);
			this.setLocation(new java.awt.Point(300, 100));
			{
				jSeparatorRelatorioEventoDia1 = new JSeparator();
				getContentPane().add(
					jSeparatorRelatorioEventoDia1,
					BorderLayout.CENTER);
				jSeparatorRelatorioEventoDia1.setBounds(0, 35, 364, 14);
			}
			{
				relatorioEventoDataLabel = new JLabel();
				getContentPane().add(relatorioEventoDataLabel);
				relatorioEventoDataLabel.setText("Relatório por Data do Evento");
				relatorioEventoDataLabel.setBounds(35, 7, 294, 21);
				relatorioEventoDataLabel.setFont(new java.awt.Font("Verdana",3,18));
			}
			{
				jSeparatorRelatorioEventoDia2 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioEventoDia2);
				jSeparatorRelatorioEventoDia2.setBounds(0, 112, 364, 14);
			}
			{
				relatorioEventoDataButton = new JButton();
				getContentPane().add(relatorioEventoDataButton);
				relatorioEventoDataButton.setText("Gerar Relatório");
				relatorioEventoDataButton.setBounds(21, 126, 126, 28);
				relatorioEventoDataButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioEventoDiaButtonActionPerformed(evt);
					}
					});
			}
			{
				relatorioEventoDataLimparButton = new JButton();
				getContentPane().add(relatorioEventoDataLimparButton);
				relatorioEventoDataLimparButton.setText("Limpar");
				relatorioEventoDataLimparButton.setBounds(154, 126, 91, 28);
				relatorioEventoDataLimparButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioEventoDiaLimparButtonActionPerformed(evt);
					}
					});
			}
			{
				relatorioEventoDataCancelarButton = new JButton();
				getContentPane().add(relatorioEventoDataCancelarButton);
				relatorioEventoDataCancelarButton.setText("Cancelar");
				relatorioEventoDataCancelarButton.setBounds(252, 126, 91, 28);
				relatorioEventoDataCancelarButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioEventoDiaCancelarButtonActionPerformed(evt);
					}
					});
			}
			{
				ComboBoxModel diaModel = new DefaultComboBoxModel(new String[] {
						"1", "2", "3", 
						"4", "5", "6", "7", 
						"8", "9", "10", "11", 
						"12", "13", "14", 
						"15", "16", "17", 
						"18", "19", "20", 
						"21", "22", "23", 
						"24", "25", "26", 
						"27", "28", "29", 
						"30", "31" });
				diaComboBox = new JComboBox();
				getContentPane().add(diaComboBox);
				diaComboBox.setModel(diaModel);
				diaComboBox.setBounds(28, 70, 77, 28);
				diaComboBox.setMaximumRowCount(6);
			}
			{
				diaLabel = new JLabel();
				getContentPane().add(diaLabel);
				diaLabel.setText("Dia:");
				diaLabel.setBounds(56, 49, 28, 21);
				diaLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				ComboBoxModel mesComboBoxModel = new DefaultComboBoxModel(
					new String[] { "Janeiro", 
							"Fevereiro", "Março", 
							"Abril", "Maio", 
							"Junho", "Julho", 
							"Agosto", "Setembro", 
							"Outubro", "Novembro", 
							"Dezembro" });
				mesComboBox = new JComboBox();
				getContentPane().add(mesComboBox);
				mesComboBox.setModel(mesComboBoxModel);
				mesComboBox.setBounds(119, 70, 112, 28);
				mesComboBox.setMaximumRowCount(6);
			}
			{
				mesLabel = new JLabel();
				getContentPane().add(mesLabel);
				mesLabel.setText("Mês:");
				mesLabel.setBounds(161, 49, 35, 21);
				mesLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				ComboBoxModel anoComboBoxModel = new DefaultComboBoxModel(
					new String[] { "2006", "2007", 
							"2008", "2009", "2010", 
							"2011", "2012", "2013", 
							"2014", "2015", "2016",
							"2017", "2018", "2019",
							"2020" });
				anoComboBox = new JComboBox();
				getContentPane().add(anoComboBox);
				anoComboBox.setModel(anoComboBoxModel);
				anoComboBox.setBounds(245, 70, 91, 28);
				anoComboBox.setMaximumRowCount(6);
			}
			{
				anoLabel = new JLabel();
				getContentPane().add(anoLabel);
				anoLabel.setText("Ano:");
				anoLabel.setBounds(280, 49, 35, 21);
				anoLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			this.setSize(372, 202);
			
			limpar();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void relatorioEventoDiaButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioEventoDataButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioEventoDataButton.actionPerformed
		
		String diaEvento = null;
		String mesEvento = null;
		String anoEvento = null;
		
		if(validaRelatorioEventoData() == true){
			
			try {
				
				diaEvento = (String) diaComboBox.getSelectedItem();
				mesEvento = (String) mesComboBox.getSelectedItem();
				anoEvento = (String) anoComboBox.getSelectedItem();
				
				JasperPrint relatorio = this.fachada.geraRelatorioEventoData(diaEvento, mesEvento, anoEvento);
				
				JasperExportManager.exportReportToPdfFile(relatorio, "RelatorioEventoData.pdf");
				
				JasperViewer.viewReport(relatorio, false);
				
				JOptionPane.showMessageDialog(this, 
						"RELATÓRIO GERADO!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
			}
			catch (JRException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(this, 
						"ERRO AO GERAR RELATÓRIO!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(this,
					"GERAÇÃO DO RELATÓRIO NÃO REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void relatorioEventoDiaLimparButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioEventoDataLimparButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioEventoDataLimparButton.actionPerformed
		
		limpar();
	}
	
	private void relatorioEventoDiaCancelarButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioEventoDataCancelarButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioEventoDataCancelarButton.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog
			(this, "RELATÓRIO POR DATA DO EVENTO\n" +
				"DESEJA SAIR ?", "CONFIRMAÇÃO", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
	
	public void limpar(){
		diaComboBox.setEditable(false);
		diaComboBox.setSelectedIndex(-1);
		mesComboBox.setEditable(false);
		mesComboBox.setSelectedIndex(-1);
    	anoComboBox.setEditable(false);
    	anoComboBox.setSelectedIndex(-1);
	}
	
	private boolean validaRelatorioEventoData(){	 		
		
		try{
			
			if ((diaComboBox.getSelectedItem() == null) 
					|| (diaComboBox.getSelectedItem().equals(""))
					|| (mesComboBox.getSelectedItem() == null) 
					|| (mesComboBox.getSelectedItem().equals(""))
					|| (anoComboBox.getSelectedItem() == null) 
					|| (anoComboBox.getSelectedItem().equals(""))){
				
				JOptionPane.showMessageDialog(this, 
						"DATA DO EVENTO NÃO INFORMADA.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			return true;
		}
		catch(Exception e){}
		
		return true;
	}
}
