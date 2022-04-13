package gui;

import java.awt.BorderLayout;
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


public class GUIRelatorioEventoTodos extends javax.swing.JDialog {

	/**
	 * 
	 */
	
	private IFachada fachada;
	
	private static final long serialVersionUID = 1L;
	private JLabel relatorioMaterialTodosLabel;
	private JSeparator jSeparatorRelatorioEventosTodos1;
	private JButton relatorioEventosTodosButton;
	private JButton relatorioEventosTodosCancelarButton;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		GUIRelatorioEventoTodos inst = new GUIRelatorioEventoTodos();
		inst.setVisible(true);
	}
	
	public GUIRelatorioEventoTodos() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Relatório de Eventos - Todos");
			this.setModal(true);
			this.setResizable(false);
			this.setLocation(new java.awt.Point(300, 100));
			{
				relatorioMaterialTodosLabel = new JLabel();
				getContentPane().add(
					relatorioMaterialTodosLabel,
					BorderLayout.CENTER);
				relatorioMaterialTodosLabel
					.setText("Relatório por Todos os Eventos");
				relatorioMaterialTodosLabel.setBounds(28, 21, 315, 21);
				relatorioMaterialTodosLabel.setFont(new java.awt.Font("Verdana",3,18));
			}
			{
				jSeparatorRelatorioEventosTodos1 = new JSeparator();
				getContentPane().add(jSeparatorRelatorioEventosTodos1);
				jSeparatorRelatorioEventosTodos1.setBounds(0, 63, 364, 14);
			}
			{
				relatorioEventosTodosButton = new JButton();
				getContentPane().add(relatorioEventosTodosButton);
				relatorioEventosTodosButton.setText("Gerar Relatório");
				relatorioEventosTodosButton.setBounds(28, 91, 126, 28);
				relatorioEventosTodosButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioEventosTodosButtonActionPerformed(evt);
					}
					});
			}
			{
				relatorioEventosTodosCancelarButton = new JButton();
				getContentPane().add(relatorioEventosTodosCancelarButton);
				relatorioEventosTodosCancelarButton.setText("Cancelar");
				relatorioEventosTodosCancelarButton.setBounds(245, 91, 91, 28);
				relatorioEventosTodosCancelarButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						relatorioEventosTodosCancelarButtonActionPerformed(evt);
					}
					});
			}
			this.setSize(372, 181);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void relatorioEventosTodosButtonActionPerformed(ActionEvent evt) {
		System.out.println("relatorioEventosTodosButton.actionPerformed, event=" + evt);
		//TODO add your code for relatorioEventosTodosButton.actionPerformed
		
		try {
			
			JasperPrint relatorio = this.fachada.geraRelatorioEventoTodos();
			
			JasperExportManager.exportReportToPdfFile(relatorio, "RelatorioEventoTodos.pdf");
			
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
	
	private void relatorioEventosTodosCancelarButtonActionPerformed(
		ActionEvent evt) {
		System.out.println("relatorioEventosTodosCancelarButton.actionPerformed, event="+ evt);
		//TODO add your code for relatorioEventosTodosCancelarButton.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog
			(this, "RELATÓRIO POR TODOS OS EVENTOS\n" +
				"DESEJA SAIR ?", "CONFIRMAÇÃO", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
}
