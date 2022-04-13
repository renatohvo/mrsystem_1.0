package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

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


public class GUIRelatorioMaterialTodos extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IFachada fachada;
	private JSeparator jSeparatorRelatorioMaterialTodos1;
	private JButton relatorioMaterialTodosCancelarButton;

	private JButton relatorioMaterialTodosButton;
	private JLabel relatorioMaterialTodosLabel;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		GUIRelatorioMaterialTodos inst = new GUIRelatorioMaterialTodos();
		inst.setVisible(true);
	}
	
	public GUIRelatorioMaterialTodos() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Relatório de Materiais - Todos");
			this.setModal(true);
			this.setResizable(false);
			this.setLocation(new java.awt.Point(300, 100));
			{
				relatorioMaterialTodosLabel = new JLabel();
				this.getContentPane().add(relatorioMaterialTodosLabel);
				relatorioMaterialTodosLabel.setText("Relatório por Todos os Materiais");
				relatorioMaterialTodosLabel.setBounds(21, 21, 329, 21);
				relatorioMaterialTodosLabel.setFont(new java.awt.Font("Verdana",3,18));
			}
			{
				relatorioMaterialTodosButton = new JButton();
				this.getContentPane().add(relatorioMaterialTodosButton);
				relatorioMaterialTodosButton.setText("Gerar Relatório");
				relatorioMaterialTodosButton.setMnemonic(KeyEvent.VK_G);
				relatorioMaterialTodosButton.setBounds(28, 91, 126, 28);
				relatorioMaterialTodosButton.setFont(new java.awt.Font("Tahoma",1,12));
				relatorioMaterialTodosButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioMaterialTodosButtonActionPerformed(evt);
					}
				});
			}
			{
				relatorioMaterialTodosCancelarButton = new JButton();
				getContentPane().add(relatorioMaterialTodosCancelarButton);
				relatorioMaterialTodosCancelarButton.setText("Cancelar");
				relatorioMaterialTodosCancelarButton.setBounds(245, 91, 91, 28);
				relatorioMaterialTodosCancelarButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioMaterialTodosCancelarButtonActionPerformed(evt);
					}
					});
			}
			{
				jSeparatorRelatorioMaterialTodos1 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioMaterialTodos1);
				jSeparatorRelatorioMaterialTodos1.setBounds(0, 63, 364, 14);
			}
			pack();
			this.setSize(372, 181);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void relatorioMaterialTodosButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioMaterialTodosButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioMaterialTodosButton.actionPerformed
		
		try {
			
			JasperPrint relatorio = this.fachada.geraRelatorioMaterialTodos();
			
			JasperExportManager.exportReportToPdfFile(relatorio, "RelatorioMaterialTodos.pdf");
			
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
	
	private void relatorioMaterialTodosCancelarButtonActionPerformed(
		ActionEvent evt) {
		System.out
			.println("relatorioMaterialTodosCancelarButton.actionPerformed, event="
				+ evt);
		//TODO add your code for relatorioMaterialTodosCancelarButton.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog
			(this, "RELATÓRIO POR TODOS OS MATERIAIS\n" +
					"DESEJA SAIR ?", "CONFIRMAÇÃO", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
}
