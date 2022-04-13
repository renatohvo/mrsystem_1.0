package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import negocio.Fachada;
import negocio.IFachada;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class GUIRelatorioEventoCliente extends javax.swing.JDialog {

	/**
	 * 
	 */
	
	private IFachada fachada;
	
	private static final long serialVersionUID = 1L;
	private JLabel relatorioEventoClienteLabel;
	private JTextField nomeClienteText;
	private JButton relatorioEventoClienteLimparButton;
	private JButton relatorioEventoClienteCancelarButton;
	private JButton relatorioEventoClienteButton;
	private JSeparator jSeparatorRelatorioEventoCliente2;
	private JLabel nomeClienteLabel;
	private JSeparator jSeparatorRelatorioEventoCliente1;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		GUIRelatorioEventoCliente inst = new GUIRelatorioEventoCliente();
		inst.setVisible(true);
	}
	
	public GUIRelatorioEventoCliente() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("RelatÛrio de Eventos - Nome do Cliente");
			this.setResizable(false);
			this.setModal(true);
			this.setLocation(new java.awt.Point(300, 100));
			{
				relatorioEventoClienteLabel = new JLabel();
				getContentPane().add(
					relatorioEventoClienteLabel,
					BorderLayout.CENTER);
				relatorioEventoClienteLabel
					.setText("RelatÛrio por Nome do Cliente");
				relatorioEventoClienteLabel.setBounds(28, 7, 308, 21);
				relatorioEventoClienteLabel.setFont(new java.awt.Font("Verdana",3,18));
			}
			{
				jSeparatorRelatorioEventoCliente1 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioEventoCliente1);
				jSeparatorRelatorioEventoCliente1.setBounds(0, 35, 364, 14);
			}
			{
				nomeClienteLabel = new JLabel();
				getContentPane().add(nomeClienteLabel);
				nomeClienteLabel.setText("Nome:");
				nomeClienteLabel.setBounds(21, 49, 42, 28);
				nomeClienteLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				nomeClienteText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**************************************************");
					format_textField.setValidCharacters(" ¡·¬‚√„…È ÍÕÌŒÓ”Û‘Ù’ı⁄˙€˚AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzÁ«");
					nomeClienteText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(nomeClienteText);
				nomeClienteText.setBounds(70, 49, 273, 28);
			}
			{
				jSeparatorRelatorioEventoCliente2 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioEventoCliente2);
				jSeparatorRelatorioEventoCliente2.setBounds(0, 91, 364, 14);
			}
			{
				relatorioEventoClienteButton = new JButton();
				getContentPane().add(relatorioEventoClienteButton);
				relatorioEventoClienteButton.setText("Gerar RelatÛrio");
				relatorioEventoClienteButton.setBounds(21, 105, 63, 28);
				relatorioEventoClienteButton.setSize(126, 28);
				relatorioEventoClienteButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioEventoClienteButtonActionPerformed(evt);
					}
					});
			}
			{
				relatorioEventoClienteLimparButton = new JButton();
				getContentPane().add(relatorioEventoClienteLimparButton);
				relatorioEventoClienteLimparButton.setText("Limpar");
				relatorioEventoClienteLimparButton.setBounds(154, 105, 63, 28);
				relatorioEventoClienteLimparButton.setSize(91, 28);
				relatorioEventoClienteLimparButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioEventoClienteLimparButtonActionPerformed(evt);
					}
					});
			}
			{
				relatorioEventoClienteCancelarButton = new JButton();
				getContentPane().add(relatorioEventoClienteCancelarButton);
				relatorioEventoClienteCancelarButton.setText("Cancelar");
				relatorioEventoClienteCancelarButton.setBounds(252, 105, 91, 28);
				relatorioEventoClienteCancelarButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioEventoClienteCancelarButtonActionPerformed(evt);
					}
					});
			}
			this.setSize(372, 181);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void relatorioEventoClienteButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioEventoClienteButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioEventoClienteButton.actionPerformed
		
		String nomeCliente = null;
		
		if(validaRelatorioEventoCliente() == true){
			
			try {
				
				nomeCliente = nomeClienteText.getText().trim();
				
				JasperPrint relatorio = this.fachada.geraRelatorioEventoCliente(nomeCliente);
				
				JasperExportManager.exportReportToPdfFile(relatorio, "RelatorioEventoCliente.pdf");
				
				JasperViewer.viewReport(relatorio, false);
				
				JOptionPane.showMessageDialog(this, 
						"RELAT”RIO GERADO!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
			}
			catch (JRException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(this, 
						"ERRO AO GERAR RELAT”RIO!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(this,
					"GERA«√O DO RELAT”RIO N√O REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
			nomeClienteText.requestFocus();
		}
	}
	
	private void relatorioEventoClienteLimparButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioEventoClienteLimparButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioEventoClienteLimparButton.actionPerformed
		
		nomeClienteText.setText("");
		
		nomeClienteText.requestFocus();
	}
	
	private void relatorioEventoClienteCancelarButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioEventoClienteCancelarButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioEventoClienteCancelarButton.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog
			(this, "RELAT”RIO POR NOME DO CLIENTE\n" +
				"DESEJA SAIR ?", "CONFIRMA«√O", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
	
	private boolean validaRelatorioEventoCliente(){	 		
		
		try{
			
			if (nomeClienteText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"NOME N√O INFORMADO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			return true;
		}
		catch(Exception e){}
		
		return true;
	}
}
