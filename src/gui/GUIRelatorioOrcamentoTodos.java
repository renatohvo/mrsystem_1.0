package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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


public class GUIRelatorioOrcamentoTodos extends javax.swing.JDialog {

	private IFachada fachada;
	
	private JButton relatorioOrcamentoTodosCancelar;
	private JButton relatorioOrcamentoTodosButton;
	private JSeparator jSeparatorRelatorioOrcamentoTodos1;
	private JLabel relatorioOrcamentoTodosLabel;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	* Auto-generated main method to display this JDialog
	*/	
	public static void main(String[] args) {
		GUIRelatorioOrcamentoTodos inst = new GUIRelatorioOrcamentoTodos();
		inst.setVisible(true);
	}
	
	public GUIRelatorioOrcamentoTodos() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			getContentPane().setLayout(null);
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			this.setTitle("Relatório de Orçamentos - Todos");
			this.setModal(true);
			this.setResizable(false);
			this.setLocation(new java.awt.Point(300, 100));
			{
				relatorioOrcamentoTodosLabel = new JLabel();
				getContentPane().add(relatorioOrcamentoTodosLabel);
				relatorioOrcamentoTodosLabel.setText("Relatório por Todos os Orçamentos");
				relatorioOrcamentoTodosLabel.setBounds(14, 21, 357, 21);
				relatorioOrcamentoTodosLabel.setFont(new java.awt.Font("Verdana",3,18));
			}
			{
				jSeparatorRelatorioOrcamentoTodos1 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioOrcamentoTodos1);
				jSeparatorRelatorioOrcamentoTodos1.setBounds(0, 63, 385, 14);
			}
			{
				relatorioOrcamentoTodosButton = new JButton();
				getContentPane().add(relatorioOrcamentoTodosButton);
				relatorioOrcamentoTodosButton.setText("Gerar Relatório");
				relatorioOrcamentoTodosButton.setBounds(28, 91, 126, 28);
				relatorioOrcamentoTodosButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioOrcamentoTodosButtonActionPerformed(evt);
					}
					});
			}
			{
				relatorioOrcamentoTodosCancelar = new JButton();
				getContentPane().add(relatorioOrcamentoTodosCancelar);
				relatorioOrcamentoTodosCancelar.setText("Cancelar");
				relatorioOrcamentoTodosCancelar.setBounds(266, 91, 91, 28);
				relatorioOrcamentoTodosCancelar
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioMaterialTodosCancelarActionPerformed(evt);
					}
					});
			}
			this.setSize(393, 181);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void relatorioOrcamentoTodosButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioOrcamentoTodosButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioOrcamentoTodosButton.actionPerformed
		
		try {
			
			JasperPrint relatorio = this.fachada.geraRelatorioOrcamentoTodos();
			
			JasperExportManager.exportReportToPdfFile(relatorio, "RelatorioOrcamentoTodos.pdf");
			
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
	
	private void relatorioMaterialTodosCancelarActionPerformed(ActionEvent evt) {
		System.out.println("relatorioOrcamentoTodosCancelar.actionPerformed, event=" + evt);
		//TODO add your code for relatorioOrcamentoTodosCancelar.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog
		(this, "RELATÓRIO POR TODOS OS ORÇAMENTOS\n" +
				"DESEJA SAIR ?", "CONFIRMAÇÃO", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
}
