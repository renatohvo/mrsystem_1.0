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


public class GUIRelatorioMaterialMarca extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IFachada fachada;
	private JSeparator jSeparatorRelatorioMaterialMarca2;
	private JSeparator jSeparatorRelatorioMaterialMarca1;
	private JButton relatorioMaterialCancelarButton;
	private JButton relatorioMaterialMarcaLimparButton;

	private JLabel relatorioMaterialMarcaLabel;
	private JButton relatorioMaterialMarcaButton;
	private JTextField marcaMaterialText;
	private JLabel marcaMaterialLabel;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		GUIRelatorioMaterialMarca inst = new GUIRelatorioMaterialMarca();
		inst.setVisible(true);
	}
	
	public GUIRelatorioMaterialMarca() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("RelatÛrio de Materiais - Marca");
			this.setResizable(false);
			this.setModal(true);
			this.setLocation(new java.awt.Point(300, 100));
			{
				relatorioMaterialMarcaLabel = new JLabel();
				getContentPane().add(relatorioMaterialMarcaLabel);
				relatorioMaterialMarcaLabel.setText("RelatÛrio por Marca do Material");
				relatorioMaterialMarcaLabel.setBounds(21, 7, 322, 21);
				relatorioMaterialMarcaLabel.setFont(new java.awt.Font("Verdana",3,18));
			}
			{
				marcaMaterialLabel = new JLabel();
				getContentPane().add(marcaMaterialLabel);
				marcaMaterialLabel.setText("Marca:");
				marcaMaterialLabel.setBounds(21, 49, 42, 28);
				marcaMaterialLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				marcaMaterialText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("******************************");
					format_textField.setValidCharacters(" ¡·¬‚√„…È ÍÕÌŒÓ”Û‘Ù’ı⁄˙€˚AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzÁ«");
					marcaMaterialText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(marcaMaterialText);
				marcaMaterialText.setBounds(70, 49, 273, 28);
			}
			{
				relatorioMaterialMarcaButton = new JButton();
				getContentPane().add(relatorioMaterialMarcaButton);
				relatorioMaterialMarcaButton.setText("Gerar RelatÛrio");
				relatorioMaterialMarcaButton.setMnemonic(KeyEvent.VK_G);
				relatorioMaterialMarcaButton.setBounds(21, 105, 126, 28);
				relatorioMaterialMarcaButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioMaterialMarcaButtonActionPerformed(evt);
					}
					});
			}
			{
				relatorioMaterialMarcaLimparButton = new JButton();
				getContentPane().add(relatorioMaterialMarcaLimparButton);
				relatorioMaterialMarcaLimparButton.setText("Limpar");
				relatorioMaterialMarcaLimparButton.setMnemonic(KeyEvent.VK_L);
				relatorioMaterialMarcaLimparButton.setBounds(154, 105, 91, 28);
				relatorioMaterialMarcaLimparButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioMaterialMarcaLimparButtonActionPerformed(evt);
					}
					});
			}
			{
				relatorioMaterialCancelarButton = new JButton();
				getContentPane().add(relatorioMaterialCancelarButton);
				relatorioMaterialCancelarButton.setText("Cancelar");
				relatorioMaterialCancelarButton.setBounds(252, 105, 91, 28);
				relatorioMaterialCancelarButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioMaterialCancelarButtonActionPerformed(evt);
					}
					});
			}
			{
				jSeparatorRelatorioMaterialMarca1 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioMaterialMarca1);
				jSeparatorRelatorioMaterialMarca1.setBounds(0, 35, 364, 14);
			}
			{
				jSeparatorRelatorioMaterialMarca2 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioMaterialMarca2);
				jSeparatorRelatorioMaterialMarca2.setBounds(0, 91, 364, 14);
			}
			pack();
			this.setSize(372, 181);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void relatorioMaterialMarcaButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioMaterialMarcaButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioMaterialMarcaButton.actionPerformed
		
		String marcaMaterial = null;
		
		if(validaRelatorioMaterialMarca() == true){
			
			try {
				
				marcaMaterial = marcaMaterialText.getText().trim();
				
				JasperPrint relatorio = this.fachada.geraRelatorioMaterialMarca(marcaMaterial);
				
				JasperExportManager.exportReportToPdfFile(relatorio, "RelatorioMaterialMarca.pdf");
				
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
			marcaMaterialText.requestFocus();
		}
	}
	
	private void relatorioMaterialMarcaLimparButtonActionPerformed(
		ActionEvent evt) {
		System.out
			.println("relatorioMaterialMarcaLimparButton.actionPerformed, event="
				+ evt);
		//TODO add your code for relatorioMaterialMarcaLimparButton.actionPerformed
		
		marcaMaterialText.setText("");
		
		marcaMaterialText.requestFocus();
	}
	
	private void relatorioMaterialCancelarButtonActionPerformed(ActionEvent evt) {
		System.out
			.println("relatorioMaterialCancelarButton.actionPerformed, event="
				+ evt);
		//TODO add your code for relatorioMaterialCancelarButton.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog
			(this, "RELAT”RIO POR MARCA DO MATERIAL\n" +
					"DESEJA SAIR ?", "CONFIRMA«√O", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
	
	private boolean validaRelatorioMaterialMarca(){
		
	try{
		
		if (marcaMaterialText.getText().trim().equals("")){
			JOptionPane.showMessageDialog
				(this, "MARCA N√O INFORMADA.",
						"ATEN«√O", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}
	catch(Exception e){}
	
	return true;
	}
}
