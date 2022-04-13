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


public class GUIRelatorioEventoLocal extends javax.swing.JDialog {

	/**
	 * 
	 */
	
	private IFachada fachada;
	
	private static final long serialVersionUID = 1L;
	private JLabel relatorioEventoLocalLabel;
	private JSeparator jSeparatorRelatorioEventoLocal1;
	private JTextField localEventoText;
	private JButton relatorioEventoLocalCancelarButton;
	private JButton relatorioEventoLocalLimparButton;
	private JButton relatorioEventoLocalButton;
	private JSeparator jSeparatorRelatorioEventoLocal2;
	private JLabel localEventoLabel;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		GUIRelatorioEventoLocal inst = new GUIRelatorioEventoLocal();
		inst.setVisible(true);
	}
	
	public GUIRelatorioEventoLocal() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("RelatÛrio de Eventos - Local");
			this.setResizable(false);
			this.setModal(true);
			this.setLocation(new java.awt.Point(300, 100));
			{
				relatorioEventoLocalLabel = new JLabel();
				getContentPane().add(
					relatorioEventoLocalLabel,
					BorderLayout.CENTER);
				relatorioEventoLocalLabel
					.setText("RelatÛrio por Local do Evento");
				relatorioEventoLocalLabel.setBounds(35, 7, 301, 21);
				relatorioEventoLocalLabel.setFont(new java.awt.Font("Verdana",3,18));
			}
			{
				jSeparatorRelatorioEventoLocal1 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioEventoLocal1);
				jSeparatorRelatorioEventoLocal1.setBounds(0, 35, 364, 14);
			}
			{
				localEventoLabel = new JLabel();
				getContentPane().add(localEventoLabel);
				localEventoLabel.setText("Local:");
				localEventoLabel.setBounds(21, 49, 42, 28);
				localEventoLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				localEventoText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**************************************************");
					format_textField.setValidCharacters("0123456789 ¡·¬‚√„…È ÍÕÌŒÓ”Û‘Ù’ı⁄˙€˚AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzÁ«,.-");
					localEventoText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(localEventoText);
				localEventoText.setBounds(63, 49, 280, 28);
			}
			{
				jSeparatorRelatorioEventoLocal2 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioEventoLocal2);
				jSeparatorRelatorioEventoLocal2.setBounds(0, 91, 364, 14);
			}
			{
				relatorioEventoLocalButton = new JButton();
				getContentPane().add(relatorioEventoLocalButton);
				relatorioEventoLocalButton.setText("Gerar RelatÛrio");
				relatorioEventoLocalButton.setBounds(21, 105, 63, 28);
				relatorioEventoLocalButton.setSize(126, 28);
				relatorioEventoLocalButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioEventoLocalButtonActionPerformed(evt);
					}
					});
			}
			{
				relatorioEventoLocalLimparButton = new JButton();
				getContentPane().add(relatorioEventoLocalLimparButton);
				relatorioEventoLocalLimparButton.setText("Limpar");
				relatorioEventoLocalLimparButton.setBounds(154, 105, 91, 28);
				relatorioEventoLocalLimparButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioEventoLocalLimparButtonActionPerformed(evt);
					}
					});
			}
			{
				relatorioEventoLocalCancelarButton = new JButton();
				getContentPane().add(relatorioEventoLocalCancelarButton);
				relatorioEventoLocalCancelarButton.setText("Cancelar");
				relatorioEventoLocalCancelarButton.setBounds(252, 105, 63, 28);
				relatorioEventoLocalCancelarButton.setSize(91, 28);
				relatorioEventoLocalCancelarButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioEventoLocalCancelarButtonActionPerformed(evt);
					}
					});
			}
			this.setSize(372, 181);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void relatorioEventoLocalButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioEventoLocalButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioEventoLocalButton.actionPerformed
		
		String localEvento = null;
		
		if(validaRelatorioEventoLocal() == true){
			
			try {
				
				localEvento = localEventoText.getText().trim();
				
				JasperPrint relatorio = this.fachada.geraRelatorioEventoLocal(localEvento);
				
				JasperExportManager.exportReportToPdfFile(relatorio, "RelatorioEventoLocal.pdf");
				
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
			localEventoText.requestFocus();
		}
	}
	
	private void relatorioEventoLocalLimparButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioEventoLocalLimparButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioEventoLocalLimparButton.actionPerformed
		
		localEventoText.setText("");
		
		localEventoText.requestFocus();
	}
	
	private void relatorioEventoLocalCancelarButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioEventoLocalCancelarButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioEventoLocalCancelarButton.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog
			(this, "RELAT”RIO POR LOCAL DO EVENTO\n" +
				"DESEJA SAIR ?", "CONFIRMA«√O", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
	
	private boolean validaRelatorioEventoLocal(){	 		
		
		try{
			
			if (localEventoText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"LOCAL N√O INFORMADO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			return true;
		}
		catch(Exception e){}
		
		return true;
	}
}
