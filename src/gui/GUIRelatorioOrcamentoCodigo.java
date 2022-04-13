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


public class GUIRelatorioOrcamentoCodigo extends javax.swing.JDialog {

	private IFachada fachada;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel relatorioOrcamentoCodigoLabel;
	private JSeparator jSeparatorRelatorioOrcamentoCodigo2;
	private JButton relatorioOrcamentoCodigoCancelar;
	private JButton relatorioOrcamentoCodigoLimpar;
	private JButton relatorioOrcamentoCodigoButton;
	private JTextField codigoOrcamentoText;
	private JLabel codigoOrcamentoLabel;
	private JSeparator jSeparatorRelatorioOrcamentoCodigo1;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		GUIRelatorioOrcamentoCodigo inst = new GUIRelatorioOrcamentoCodigo();
		inst.setVisible(true);
	}
	
	public GUIRelatorioOrcamentoCodigo() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			getContentPane().setLayout(null);
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			this.setTitle("Relatório de Orçamentos - Código");
			this.setResizable(false);
			this.setModal(true);
			this.setLocation(new java.awt.Point(300, 100));
			{
				relatorioOrcamentoCodigoLabel = new JLabel();
				getContentPane().add(
					relatorioOrcamentoCodigoLabel,
					BorderLayout.CENTER);
				relatorioOrcamentoCodigoLabel.setText("Relatório por Código do Orçamento");
				relatorioOrcamentoCodigoLabel.setBounds(14, 7, 357, 21);
				relatorioOrcamentoCodigoLabel.setFont(new java.awt.Font("Verdana",3,18));
			}
			{
				jSeparatorRelatorioOrcamentoCodigo1 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioOrcamentoCodigo1);
				jSeparatorRelatorioOrcamentoCodigo1.setBounds(0, 35, 385, 14);
			}
			{
				codigoOrcamentoLabel = new JLabel();
				getContentPane().add(codigoOrcamentoLabel);
				codigoOrcamentoLabel.setText("Código:");
				codigoOrcamentoLabel.setBounds(21, 49, 49, 28);
				codigoOrcamentoLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				codigoOrcamentoText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("***********");
					format_textField.setValidCharacters("0123456789 ");
					codigoOrcamentoText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(codigoOrcamentoText);
				codigoOrcamentoText.setBounds(77, 49, 287, 28);
			}
			{
				jSeparatorRelatorioOrcamentoCodigo2 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioOrcamentoCodigo2);
				jSeparatorRelatorioOrcamentoCodigo2.setBounds(0, 91, 385, 14);
			}
			{
				relatorioOrcamentoCodigoButton = new JButton();
				getContentPane().add(relatorioOrcamentoCodigoButton);
				relatorioOrcamentoCodigoButton.setText("Gerar Relatório");
				relatorioOrcamentoCodigoButton.setBounds(21, 105, 133, 28);
				relatorioOrcamentoCodigoButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioOrcamentoCodigoButtonActionPerformed(evt);
					}
					});
			}
			{
				relatorioOrcamentoCodigoLimpar = new JButton();
				getContentPane().add(relatorioOrcamentoCodigoLimpar);
				relatorioOrcamentoCodigoLimpar.setText("Limpar");
				relatorioOrcamentoCodigoLimpar.setBounds(168, 105, 91, 28);
				relatorioOrcamentoCodigoLimpar
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioOrcamentoCodigoLimparActionPerformed(evt);
					}
					});
			}
			{
				relatorioOrcamentoCodigoCancelar = new JButton();
				getContentPane().add(relatorioOrcamentoCodigoCancelar);
				relatorioOrcamentoCodigoCancelar.setText("Cancelar");
				relatorioOrcamentoCodigoCancelar.setBounds(273, 105, 91, 28);
				relatorioOrcamentoCodigoCancelar
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioOrcamentoCodigoCancelarActionPerformed(evt);
					}
					});
			}
			this.setSize(393, 181);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void relatorioOrcamentoCodigoButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioOrcamentoCodigoButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioOrcamentoCodigoButton.actionPerformed
		
		int codigoOrcamento = 0;
		
		if(validaRelatorioOrcamentoCodigo() == true){
			
			try {
				
				codigoOrcamento = Integer.parseInt(codigoOrcamentoText.getText().trim());
				
				JasperPrint relatorio = this.fachada.geraRelatorioOrcamentoCodigo(codigoOrcamento);
				
				JasperExportManager.exportReportToPdfFile(relatorio, "RelatorioOrcamentoCodigo.pdf");
				
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
			codigoOrcamentoText.requestFocus();
		}
	}
	
	private void relatorioOrcamentoCodigoLimparActionPerformed(ActionEvent evt) {
		System.out
			.println("relatorioOrcamentoCodigoLimpar.actionPerformed, event="
				+ evt);
		//TODO add your code for relatorioOrcamentoCodigoLimpar.actionPerformed
	
		codigoOrcamentoText.setText("");
		
		codigoOrcamentoText.requestFocus();
	}
	
	private void relatorioOrcamentoCodigoCancelarActionPerformed(ActionEvent evt) {
		System.out
			.println("relatorioOrcamentoCodigoCancelar.actionPerformed, event="
				+ evt);
		//TODO add your code for relatorioOrcamentoCodigoCancelar.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog
		(this, "RELATÓRIO POR CÓDIGO DO ORÇAMENTO\n" +
				"DESEJA SAIR ?", "CONFIRMAÇÃO", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
	
	private boolean validaRelatorioOrcamentoCodigo(){
		
		try{
			
			if (codigoOrcamentoText.getText().trim().equals("")){
				JOptionPane.showMessageDialog
					(this, "CÓDIGO NÃO INFORMADO.",
							"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			return true;
		}
		catch(Exception e){}
		
		return true;
	}
}
