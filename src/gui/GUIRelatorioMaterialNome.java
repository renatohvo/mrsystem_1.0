package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

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


public class GUIRelatorioMaterialNome extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IFachada fachada;
	
	private JSeparator jSeparatorRelatorioMaterialNome2;
	private JSeparator jSeparatorRelatorioMaterialNome1;
	private JButton relatorioMaterialNomeLimparButton;
	private JButton relatorioMaterialNomeCancelarButton;

	private JLabel relatorioMaterialNomeLabel;
	private JButton relatorioMaterialNomeButton;
	private JTextField nomeMaterialText;
	private JLabel nomeMaterialLabel;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		GUIRelatorioMaterialNome inst = new GUIRelatorioMaterialNome();
		inst.setVisible(true);
	}
	
	public GUIRelatorioMaterialNome() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("RelatÛrio de Materiais - Nome");
			this.setResizable(false);
			this.setModal(true);
			this.setLocation(new java.awt.Point(300, 100));
			{
				relatorioMaterialNomeLabel = new JLabel();
				getContentPane().add(relatorioMaterialNomeLabel);
				relatorioMaterialNomeLabel.setText("RelatÛrio por Nome do Material");
				relatorioMaterialNomeLabel.setBounds(21, 7, 315, 21);
				relatorioMaterialNomeLabel.setFont(new java.awt.Font("Verdana",3,18));
			}
			{
				nomeMaterialLabel = new JLabel();
				getContentPane().add(nomeMaterialLabel);
				nomeMaterialLabel.setText("Nome:");
				nomeMaterialLabel.setBounds(21, 49, 42, 28);
				nomeMaterialLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				nomeMaterialText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**************************************************");
					format_textField.setValidCharacters(" ¡·¬‚√„…È ÍÕÌŒÓ”Û‘Ù’ı⁄˙€˚AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzÁ«");
					nomeMaterialText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(nomeMaterialText);
				nomeMaterialText.setBounds(70, 49, 273, 28);
			}
			{
				relatorioMaterialNomeButton = new JButton();
				getContentPane().add(relatorioMaterialNomeButton);
				relatorioMaterialNomeButton.setText("Gerar RelatÛrio");
				relatorioMaterialNomeButton.setMnemonic(KeyEvent.VK_G);
				relatorioMaterialNomeButton.setBounds(21, 105, 126, 28);
				relatorioMaterialNomeButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioMaterialNomeButtonActionPerformed(evt);
					}
					});
			}
			{
				relatorioMaterialNomeCancelarButton = new JButton();
				getContentPane().add(relatorioMaterialNomeCancelarButton);
				relatorioMaterialNomeCancelarButton.setText("Cancelar");
				relatorioMaterialNomeCancelarButton.setBounds(252, 105, 91, 28);
				relatorioMaterialNomeCancelarButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioMaterialNomeCancelarButtonActionPerformed(evt);
					}
					});
			}
			{
				relatorioMaterialNomeLimparButton = new JButton();
				getContentPane().add(relatorioMaterialNomeLimparButton);
				relatorioMaterialNomeLimparButton.setText("Limpar");
				relatorioMaterialNomeLimparButton.setMnemonic(KeyEvent.VK_L);
				relatorioMaterialNomeLimparButton.setBounds(154, 105, 91, 28);
				relatorioMaterialNomeLimparButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioMaterialNomeLimparButtonActionPerformed(evt);
					}
					});
			}
			{
				jSeparatorRelatorioMaterialNome1 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioMaterialNome1);
				jSeparatorRelatorioMaterialNome1.setBounds(0, 35, 364, 14);
			}
			{
				jSeparatorRelatorioMaterialNome2 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioMaterialNome2);
				jSeparatorRelatorioMaterialNome2.setBounds(0, 91, 364, 14);
			}
			pack();
			this.setSize(372, 181);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void relatorioMaterialNomeButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioMaterialNomeButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioMaterialNomeButton.actionPerformed
		
		String nomeMaterial = null;
		
		if(validaRelatorioMaterialNome() == true){
			
			try {
				
				nomeMaterial = nomeMaterialText.getText().trim();
				
				JasperPrint relatorio = this.fachada.geraRelatorioMaterialNome(nomeMaterial);
				
				JasperExportManager.exportReportToPdfFile(relatorio, "RelatorioMaterialNome.pdf");
				
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
			nomeMaterialText.requestFocus();
		}
	}
	
	private void relatorioMaterialNomeCancelarButtonActionPerformed(
		ActionEvent evt) {
		System.out
			.println("relatorioMaterialNomeCancelarButton.actionPerformed, event="
				+ evt);
		//TODO add your code for relatorioMaterialNomeCancelarButton.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog
			(this, "RELAT”RIO POR NOME DO MATERIAL\n" +
					"DESEJA SAIR ?", "CONFIRMA«√O", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
	
	private void relatorioMaterialNomeLimparButtonActionPerformed(
		ActionEvent evt) {
		System.out
			.println("relatorioMaterialNomeLimparButton.actionPerformed, event="
				+ evt);
		//TODO add your code for relatorioMaterialNomeLimparButton.actionPerformed
		
		nomeMaterialText.setText("");
		
		nomeMaterialText.requestFocus();
	}
	
	private boolean validaRelatorioMaterialNome(){
		
		try{
			
			if (nomeMaterialText.getText().trim().equals("")){
				JOptionPane.showMessageDialog
					(this, "NOME N√O INFORMADO.",
							"ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			return true;
		}
		catch(Exception e){}
		
		return true;
	}
}
