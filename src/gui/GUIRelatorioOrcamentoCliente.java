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


public class GUIRelatorioOrcamentoCliente extends javax.swing.JDialog {

	private IFachada fachada;
	
	private JSeparator jSeparatorRelatorioOrcamentoCliente1;
	private JLabel nomeCliente;
	private JButton relatorioOrcamentoClienteCancelar;
	private JButton relatorioOrcamentoClienteLimpar;
	private JButton relatorioOrcamentoClienteButton;
	private JSeparator jSeparatorRelatorioOrcamentoCliente2;
	private JTextField nomeClienteText;
	private JLabel relatorioOrcamentoClienteLabel;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		GUIRelatorioOrcamentoCliente inst = new GUIRelatorioOrcamentoCliente();
		inst.setVisible(true);
	}
	
	public GUIRelatorioOrcamentoCliente() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			getContentPane().setLayout(null);
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			this.setTitle("RelatÛrio de OrÁamentos - Nome do Cliente");
			this.setResizable(false);
			this.setModal(true);
			this.setLocation(new java.awt.Point(300, 100));
			{
				relatorioOrcamentoClienteLabel = new JLabel();
				getContentPane().add(
					relatorioOrcamentoClienteLabel,
					BorderLayout.CENTER);
				relatorioOrcamentoClienteLabel
					.setText("RelatÛrio por Nome do Cliente");
				relatorioOrcamentoClienteLabel.setBounds(42, 7, 308, 21);
				relatorioOrcamentoClienteLabel.setFont(new java.awt.Font("Verdana",3,18));
			}
			{
				jSeparatorRelatorioOrcamentoCliente1 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioOrcamentoCliente1);
				jSeparatorRelatorioOrcamentoCliente1.setBounds(0, 35, 385, 14);
			}
			{
				nomeCliente = new JLabel();
				getContentPane().add(nomeCliente);
				nomeCliente.setText("Nome do Cliente:");
				nomeCliente.setBounds(21, 49, 105, 28);
				nomeCliente.setFont(new java.awt.Font("Tahoma",1,11));
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
				nomeClienteText.setBounds(126, 49, 238, 28);
			}
			{
				jSeparatorRelatorioOrcamentoCliente2 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioOrcamentoCliente2);
				jSeparatorRelatorioOrcamentoCliente2.setBounds(0, 91, 385, 14);
			}
			{
				relatorioOrcamentoClienteButton = new JButton();
				getContentPane().add(relatorioOrcamentoClienteButton);
				relatorioOrcamentoClienteButton.setText("Gerar RelatÛrio");
				relatorioOrcamentoClienteButton.setBounds(21, 105, 63, 28);
				relatorioOrcamentoClienteButton.setSize(133, 28);
				relatorioOrcamentoClienteButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioOrcamentoNomeButtonActionPerformed(evt);
					}
					});
			}
			{
				relatorioOrcamentoClienteLimpar = new JButton();
				getContentPane().add(relatorioOrcamentoClienteLimpar);
				relatorioOrcamentoClienteLimpar.setText("Limpar");
				relatorioOrcamentoClienteLimpar.setBounds(168, 105, 63, 28);
				relatorioOrcamentoClienteLimpar.setSize(91, 28);
				relatorioOrcamentoClienteLimpar
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioOrcamentoNomeLimparActionPerformed(evt);
					}
					});
			}
			{
				relatorioOrcamentoClienteCancelar = new JButton();
				getContentPane().add(relatorioOrcamentoClienteCancelar);
				relatorioOrcamentoClienteCancelar.setText("Cancelar");
				relatorioOrcamentoClienteCancelar.setBounds(273, 105, 91, 28);
				relatorioOrcamentoClienteCancelar
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioOrcamentoNomeCancelarActionPerformed(evt);
					}
					});
			}
			setSize(393, 181);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void relatorioOrcamentoNomeButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioOrcamentoClienteButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioOrcamentoClienteButton.actionPerformed
		
		String nomeCliente = null;
		
		if(validaRelatorioOrcamentoCliente() == true){
			
			try {
				
				nomeCliente = nomeClienteText.getText().trim();
				
				JasperPrint relatorio = this.fachada.geraRelatorioOrcamentoCliente(nomeCliente);
				
				JasperExportManager.exportReportToPdfFile(relatorio, "RelatorioOrcamentoCliente.pdf");
				
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
	
	private void relatorioOrcamentoNomeLimparActionPerformed(ActionEvent evt) {
		System.out.println("relatorioOrcamentoClienteLimpar.actionPerformed, event="+ evt);
		//TODO add your code for relatorioOrcamentoClienteLimpar.actionPerformed
		
		nomeClienteText.setText("");
		
		nomeClienteText.requestFocus();
	}
	
	private void relatorioOrcamentoNomeCancelarActionPerformed(ActionEvent evt) {
		System.out.println("relatorioOrcamentoClienteCancelar.actionPerformed, event=" + evt);
		//TODO add your code for relatorioOrcamentoClienteCancelar.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog
			(this, "RELAT”RIO POR NOME DO CLIENTE\n" +
				"DESEJA SAIR ?", "CONFIRMA«√O", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
	
	private boolean validaRelatorioOrcamentoCliente(){	 		
		
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
