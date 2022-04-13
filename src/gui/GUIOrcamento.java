package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import negocio.Buffet;
import negocio.EventoData;
import negocio.Fachada;
import negocio.IFachada;
import negocio.Orcamento;
import negocio.excecao.ExcecaoInexistente;
import negocio.excecao.ExcecaoMRSystem;


public class GUIOrcamento extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel cadastroOrcamentosLabel;
	private JSeparator jSeparatorCadastroOrcamentos1;
	private JLabel qtdGarconsOrcamentoLabel;
	private JTextField qtdPessoasOrcamentoText;
	private JLabel qtdPessoasOrcamentoLabel;
	private JComboBox minutoInicioComboBox;
	private JComboBox horaInicioComboBox;
	private JLabel minutoInicioLabel;
	private JTextField nomeBuffetText;
	private JTextField qtdSegurancasOrcamentoText;
	private JLabel qtdSegurancasOrcamentoLabel;
	private JComboBox anoEmissaoComboBox;
	private JLabel horaTerminoEventoLabel;
	private JLabel horaTerminoLabel;
	private JLabel horaInicioLabel;
	private JLabel horaInicioEventoLabel;
	private JComboBox minutoTerminoComboBox;
	private JComboBox horaTerminoComboBox;
	private JComboBox anoEventoComboBox;
	private JLabel anoEventoLabel;
	private JComboBox mesEmissaoComboBox;
	private JComboBox diaEmissaoComboBox;
	private JLabel anoEmissaoLabel;
	private JLabel mesEmissaoLabel;
	private JLabel diaEmissaoLabel;
	private JComboBox mesEventoComboBox;
	private JComboBox diaEventoComboBox;
	private JLabel minutoTerminoLabel;
	private JLabel mesEventoLabel;
	private JLabel diaEventoLabel;
	private JTextField valorOrcamentoText;
	private JLabel valorOrcamentoLabel;
	private JComboBox tipoBuffetComboBox;
	private JComboBox nomeClienteComboBox;
	private JButton cancelarOrcamentoButton;
	private JButton limparOrcamentoButton;
	private JButton alterarOrcamentoButton;
	private JButton consultarOrcamentoButton;
	private JButton excluirOrcamentoButton;
	private JButton incluirOrcamentoButton;
	private JTextField localEventoText;
	private JLabel localEventoLabel;
	private JLabel dataEventoLabel;
	private JLabel dataEmissaoOrcamentoLabel;
	private JTextField qtdGarconsOrcamentoText;
	private JLabel nomeClienteLabel;
	private JLabel tipoBuffetLabel;
	private JComboBox codigoOrcamentoComboBox;
	private JLabel codigoOrcamentoLabel;
	private JSeparator jSeparatorCadastroOrcamentos2;
	
	private IFachada fachada;
	
	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		GUIOrcamento inst = new GUIOrcamento();
		inst.setVisible(true);
	}
	
	public GUIOrcamento() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
				this.setTitle("Cadastro de OrÁamentos - Dados do OrÁamento");
				this.setResizable(false);
				this.setModal(true);
				this.setLocation(new java.awt.Point(200, 100));
				{
					cadastroOrcamentosLabel = new JLabel();
					getContentPane().add(cadastroOrcamentosLabel);
					cadastroOrcamentosLabel.setText("Cadastro de OrÁamentos");
					cadastroOrcamentosLabel.setBounds(189, 7, 252, 21);
					cadastroOrcamentosLabel.setFont(new java.awt.Font("Verdana",3,18));
				}
				{
					jSeparatorCadastroOrcamentos1 = new JSeparator();
					getContentPane().add(jSeparatorCadastroOrcamentos1);
					jSeparatorCadastroOrcamentos1.setBounds(0, 35, 623, 14);
				}
				{
					jSeparatorCadastroOrcamentos2 = new JSeparator();
					getContentPane().add(jSeparatorCadastroOrcamentos2);
					jSeparatorCadastroOrcamentos2.setBounds(0, 399, 623, 14);
				}
				{
					codigoOrcamentoLabel = new JLabel();
					getContentPane().add(codigoOrcamentoLabel);
					codigoOrcamentoLabel.setText("CÛdigo:");
					codigoOrcamentoLabel.setBounds(21, 84, 49, 28);
					codigoOrcamentoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					codigoOrcamentoComboBox = new JComboBox();
					getContentPane().add(codigoOrcamentoComboBox);
					codigoOrcamentoComboBox.setBounds(126, 84, 98, 28);
					codigoOrcamentoComboBox.setMaximumRowCount(6);
					codigoOrcamentoComboBox
						.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							codigoOrcamentoComboBoxActionPerformed(evt);
						}
						});
				}
				{
					tipoBuffetLabel = new JLabel();
					getContentPane().add(tipoBuffetLabel);
					tipoBuffetLabel.setText("Tipo de Buffet:");
					tipoBuffetLabel.setBounds(21, 119, 91, 28);
					tipoBuffetLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					nomeClienteLabel = new JLabel();
					getContentPane().add(nomeClienteLabel);
					nomeClienteLabel.setText("Nome do Cliente:");
					nomeClienteLabel.setBounds(21, 49, 105, 28);
					nomeClienteLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					qtdPessoasOrcamentoLabel = new JLabel();
					getContentPane().add(qtdPessoasOrcamentoLabel);
					qtdPessoasOrcamentoLabel.setText("Quantidade de Pessoas:");
					qtdPessoasOrcamentoLabel.setBounds(294, 84, 147, 28);
					qtdPessoasOrcamentoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					qtdPessoasOrcamentoText = new JTextField();
					try{
						javax.swing.text.MaskFormatter format_textField = new
						javax.swing.text.MaskFormatter("****");
						format_textField.setValidCharacters("0123456789 ");
						qtdPessoasOrcamentoText = new javax.swing.JFormattedTextField(format_textField);
					}catch (Exception e){}
					getContentPane().add(qtdPessoasOrcamentoText);
					qtdPessoasOrcamentoText.setBounds(441, 84, 161, 28);
					qtdPessoasOrcamentoText.addKeyListener(new KeyAdapter() {
						public void keyReleased(KeyEvent evt) {
							try {
								qtdPessoasOrcamentoTextKeyReleased(evt);
							}
							catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				{
					qtdGarconsOrcamentoLabel = new JLabel();
					getContentPane().add(qtdGarconsOrcamentoLabel);
					qtdGarconsOrcamentoLabel.setText("Quantidade de GarÁons:");
					qtdGarconsOrcamentoLabel.setBounds(455, 154, 147, 21);
					qtdGarconsOrcamentoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					qtdGarconsOrcamentoText = new JTextField();
					try{
						javax.swing.text.MaskFormatter format_textField = new
						javax.swing.text.MaskFormatter("****");
						format_textField.setValidCharacters("0123456789 ");
						qtdGarconsOrcamentoText = new javax.swing.JFormattedTextField(format_textField);
					}catch (Exception e){}
					getContentPane().add(qtdGarconsOrcamentoText);
					qtdGarconsOrcamentoText.setBounds(441, 175, 161, 28);
				}
				{
					dataEmissaoOrcamentoLabel = new JLabel();
					getContentPane().add(dataEmissaoOrcamentoLabel);
					dataEmissaoOrcamentoLabel.setText("Data de Emiss„o:");
					dataEmissaoOrcamentoLabel.setBounds(21, 175, 105, 28);
					dataEmissaoOrcamentoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					dataEventoLabel = new JLabel();
					getContentPane().add(dataEventoLabel);
					dataEventoLabel.setText("Data do Evento:");
					dataEventoLabel.setBounds(21, 231, 98, 28);
					dataEventoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					localEventoLabel = new JLabel();
					getContentPane().add(localEventoLabel);
					localEventoLabel.setText("Local do Evento:");
					localEventoLabel.setBounds(21, 322, 98, 28);
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
					localEventoText.setBounds(126, 322, 476, 28);
				}
				{
					qtdSegurancasOrcamentoLabel = new JLabel();
					getContentPane().add(qtdSegurancasOrcamentoLabel);
					qtdSegurancasOrcamentoLabel.setText("Quantidade de SeguranÁas:");
					qtdSegurancasOrcamentoLabel.setBounds(448, 210, 168, 21);
					qtdSegurancasOrcamentoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					qtdSegurancasOrcamentoText = new JTextField();
					try{
						javax.swing.text.MaskFormatter format_textField = new
						javax.swing.text.MaskFormatter("****");
						format_textField.setValidCharacters("0123456789 ");
						qtdSegurancasOrcamentoText = new javax.swing.JFormattedTextField(format_textField);
					}catch (Exception e){}
					getContentPane().add(qtdSegurancasOrcamentoText);
					qtdSegurancasOrcamentoText.setBounds(441, 231, 161, 28);
				}
				{
					incluirOrcamentoButton = new JButton();
					getContentPane().add(incluirOrcamentoButton);
					incluirOrcamentoButton.setText("Incluir");
					incluirOrcamentoButton.setMnemonic(KeyEvent.VK_I);
					incluirOrcamentoButton.setBounds(21, 413, 91, 28);
					incluirOrcamentoButton
						.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							incluirOrcamentoButtonActionPerformed(evt);
						}
						});
				}
				{
					excluirOrcamentoButton = new JButton();
					getContentPane().add(excluirOrcamentoButton);
					excluirOrcamentoButton.setText("Excluir");
					excluirOrcamentoButton.setMnemonic(KeyEvent.VK_E);
					excluirOrcamentoButton.setBounds(119, 413, 91, 28);
					excluirOrcamentoButton
						.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							excluirOrcamentoButtonActionPerformed(evt);
						}
						});
				}
				{
					consultarOrcamentoButton = new JButton();
					getContentPane().add(consultarOrcamentoButton);
					consultarOrcamentoButton.setText("Consultar");
					consultarOrcamentoButton.setMnemonic(KeyEvent.VK_C);
					consultarOrcamentoButton.setBounds(217, 413, 91, 28);
					consultarOrcamentoButton
						.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							consultarOrcamentoButtonActionPerformed(evt);
						}
						});
				}
				{
					alterarOrcamentoButton = new JButton();
					getContentPane().add(alterarOrcamentoButton);
					alterarOrcamentoButton.setText("Alterar");
					alterarOrcamentoButton.setMnemonic(KeyEvent.VK_A);
					alterarOrcamentoButton.setBounds(315, 413, 91, 28);
					alterarOrcamentoButton
						.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							alterarOrcamentoButtonActionPerformed(evt);
						}
						});
				}
				{
					limparOrcamentoButton = new JButton();
					getContentPane().add(limparOrcamentoButton);
					limparOrcamentoButton.setText("Limpar");
					limparOrcamentoButton.setMnemonic(KeyEvent.VK_L);
					limparOrcamentoButton.setBounds(413, 413, 91, 28);
					limparOrcamentoButton
						.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							limparOrcamentoButtonActionPerformed(evt);
						}
						});
				}
				{
					cancelarOrcamentoButton = new JButton();
					getContentPane().add(cancelarOrcamentoButton);
					cancelarOrcamentoButton.setText("Cancelar");
					cancelarOrcamentoButton.setBounds(511, 413, 91, 28);
					cancelarOrcamentoButton
						.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							cancelarOrcamentoButtonActionPerformed(evt);
						}
						});
				}
				{
					nomeClienteComboBox = new JComboBox();
					getContentPane().add(nomeClienteComboBox);
					nomeClienteComboBox.setBounds(126, 49, 476, 28);
					nomeClienteComboBox.setMaximumRowCount(6);
				}
				{
					tipoBuffetComboBox = new JComboBox();
					getContentPane().add(tipoBuffetComboBox);
					tipoBuffetComboBox.setBounds(126, 119, 98, 28);
					tipoBuffetComboBox.setMaximumRowCount(6);
					tipoBuffetComboBox.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							try {
								tipoBuffetComboBoxActionPerformed(evt);
							}
							catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				{
					valorOrcamentoLabel = new JLabel();
					getContentPane().add(valorOrcamentoLabel);
					valorOrcamentoLabel.setText("Valor Total:");
					valorOrcamentoLabel.setBounds(21, 357, 77, 28);
					valorOrcamentoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					valorOrcamentoText = new JTextField();
					getContentPane().add(valorOrcamentoText);
					valorOrcamentoText.setBounds(126, 357, 161, 28);
				}
				{
					horaTerminoEventoLabel = new JLabel();
					getContentPane().add(horaTerminoEventoLabel);
					horaTerminoEventoLabel.setText("Hor·rio de TÈrmino:");
					horaTerminoEventoLabel.setBounds(315, 287, 119, 28);
					horaTerminoEventoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					horaTerminoLabel = new JLabel();
					getContentPane().add(horaTerminoLabel);
					horaTerminoLabel.setText("Hora(s):");
					horaTerminoLabel.setBounds(448, 266, 56, 21);
					horaTerminoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					diaEventoLabel = new JLabel();
					getContentPane().add(diaEventoLabel);
					diaEventoLabel.setText("Dia:");
					diaEventoLabel.setBounds(154, 210, 28, 21);
					diaEventoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					mesEventoLabel = new JLabel();
					getContentPane().add(mesEventoLabel);
					mesEventoLabel.setText("MÍs:");
					mesEventoLabel.setBounds(259, 210, 35, 21);
					mesEventoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					anoEventoLabel = new JLabel();
					getContentPane().add(anoEventoLabel);
					anoEventoLabel.setText("Ano:");
					anoEventoLabel.setBounds(371, 210, 35, 21);
					anoEventoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					minutoTerminoLabel = new JLabel();
					getContentPane().add(minutoTerminoLabel);
					minutoTerminoLabel.setText("Minuto(s):");
					minutoTerminoLabel.setBounds(532, 266, 70, 21);
					minutoTerminoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					ComboBoxModel diaEventoComboBoxModel = new DefaultComboBoxModel(
						new String[] { "1", "2", "3", 
								"4", "5", "6", "7", 
								"8", "9", "10", "11", 
								"12", "13", "14", 
								"15", "16", "17", 
								"18", "19", "20", 
								"21", "22", "23", 
								"24", "25", "26", 
								"27", "28", "29", 
								"30", "31" });
					diaEventoComboBox = new JComboBox();
					getContentPane().add(diaEventoComboBox);
					diaEventoComboBox.setModel(diaEventoComboBoxModel);
					diaEventoComboBox.setBounds(126, 231, 77, 28);
					diaEventoComboBox.setMaximumRowCount(6);
				}
				{
					ComboBoxModel mesEventoComboBoxModel = new DefaultComboBoxModel(
						new String[] { "Janeiro", 
								"Fevereiro", "MarÁo", 
								"Abril", "Maio", 
								"Junho", "Julho", 
								"Agosto", "Setembro", 
								"Outubro", "Novembro", 
								"Dezembro" });
					mesEventoComboBox = new JComboBox();
					getContentPane().add(mesEventoComboBox);
					mesEventoComboBox.setModel(mesEventoComboBoxModel);
					mesEventoComboBox.setBounds(217, 231, 105, 28);
					mesEventoComboBox.setMaximumRowCount(6);
				}
				{
					ComboBoxModel anoEventoComboBoxModel = new DefaultComboBoxModel(
						new String[] { "2006", "2007", 
								"2008", "2009", "2010", 
								"2011", "2012", "2013", 
								"2014", "2015", "2016",
								"2017", "2018", "2019",
								"2020" });
					anoEventoComboBox = new JComboBox();
					getContentPane().add(anoEventoComboBox);
					anoEventoComboBox.setModel(anoEventoComboBoxModel);
					anoEventoComboBox.setBounds(336, 231, 91, 28);
					anoEventoComboBox.setMaximumRowCount(6);
				}
				{
					ComboBoxModel horaTerminoComboBoxModel = new DefaultComboBoxModel(
						new String[] { "0", "1", "2", "3", "4", 
								"5", "6", "7", "8", "9", "10", 
								"11", "12", "13", "14", "15", "16", 
								"17", "18", "19", "20", "21", "22", 
								"23" });
					horaTerminoComboBox = new JComboBox();
					getContentPane().add(horaTerminoComboBox);
					horaTerminoComboBox.setModel(horaTerminoComboBoxModel);
					horaTerminoComboBox.setBounds(434, 287, 77, 28);
					horaTerminoComboBox.setMaximumRowCount(6);
				}
				{
					ComboBoxModel minutoTerminoComboBoxModel = new DefaultComboBoxModel(
						new String[] { "0", "1", "2", "3","4", 
								"5", "6", "7", "8", "9", "10", 
								"11", "12", "13", "14", "15", "16", 
								"17", "18", "19", "20", "21", "22", 
								"23", "24", "25", "26", "27", "28", 
								"29", "30", "31", "32", "33", "34", 
								"35", "36", "37", "38", "39", "40", 
								"41", "42", "43", "44", "45", "46", 
								"47", "48", "49", "50", "51", "52", 
								"53", "54", "55", "56", "57", "58", 
								"59" });
					minutoTerminoComboBox = new JComboBox();
					getContentPane().add(minutoTerminoComboBox);
					minutoTerminoComboBox.setModel(minutoTerminoComboBoxModel);
					minutoTerminoComboBox.setBounds(525, 287, 77, 28);
					minutoTerminoComboBox.setMaximumRowCount(6);
				}
				{
					horaInicioEventoLabel = new JLabel();
					getContentPane().add(horaInicioEventoLabel);
					horaInicioEventoLabel.setText("Hor·rio de InÌcio:");
					horaInicioEventoLabel.setBounds(21, 287, 105, 28);
					horaInicioEventoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					horaInicioLabel = new JLabel();
					getContentPane().add(horaInicioLabel);
					horaInicioLabel.setText("Hora(s):");
					horaInicioLabel.setBounds(140, 266, 56, 21);
					horaInicioLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					minutoInicioLabel = new JLabel();
					getContentPane().add(minutoInicioLabel);
					minutoInicioLabel.setText("Minuto(s):");
					minutoInicioLabel.setBounds(224, 266, 70, 21);
					minutoInicioLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					ComboBoxModel horaInicioComboBoxModel = new DefaultComboBoxModel(
						new String[] { "0", "1", "2", "3", "4", 
								"5", "6", "7", "8", "9", "10", 
								"11", "12", "13", "14", "15", "16", 
								"17", "18", "19", "20", "21", "22", 
								"23" });
					horaInicioComboBox = new JComboBox();
					getContentPane().add(horaInicioComboBox);
					horaInicioComboBox.setModel(horaInicioComboBoxModel);
					horaInicioComboBox.setBounds(126, 287, 77, 28);
					horaInicioComboBox.setMaximumRowCount(6);
				}
				{
					ComboBoxModel minutoInicioComboBoxModel = new DefaultComboBoxModel(
						new String[] { "0", "1", "2", "3", "4", 
								"5", "6", "7", "8", "9", "10", 
								"11", "12", "13", "14", "15", "16", 
								"17", "18", "19", "20", "21", "22", 
								"23", "24", "25", "26", "27", "28", 
								"29", "30", "31", "32", "33", "34", 
								"35", "36", "37", "38", "39", "40", 
								"41", "42", "43", "44", "45", "46", 
								"47", "48", "49", "50", "51", "52", 
								"53", "54", "55", "56", "57", "58", 
								"59" });
					minutoInicioComboBox = new JComboBox();
					getContentPane().add(minutoInicioComboBox);
					minutoInicioComboBox.setModel(minutoInicioComboBoxModel);
					minutoInicioComboBox.setBounds(217, 287, 77, 28);
					minutoInicioComboBox.setMaximumRowCount(6);
				}
				{
					diaEmissaoLabel = new JLabel();
					getContentPane().add(diaEmissaoLabel);
					diaEmissaoLabel.setText("Dia:");
					diaEmissaoLabel.setBounds(154, 154, 28, 21);
					diaEmissaoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					mesEmissaoLabel = new JLabel();
					getContentPane().add(mesEmissaoLabel);
					mesEmissaoLabel.setText("MÍs:");
					mesEmissaoLabel.setBounds(259, 154, 35, 21);
					mesEmissaoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					anoEmissaoLabel = new JLabel();
					getContentPane().add(anoEmissaoLabel);
					anoEmissaoLabel.setText("Ano:");
					anoEmissaoLabel.setBounds(371, 154, 35, 21);
					anoEmissaoLabel.setFont(new java.awt.Font("Tahoma",1,11));
				}
				{
					ComboBoxModel diaEmissaoComboBoxModel = new DefaultComboBoxModel(
						new String[] { "1", "2", 
								"3", "4", "5", 
								"6", "7", "8", 
								"9", "10", "11", 
								"12", "13", "14", 
								"15", "16", "17", 
								"18", "19", "20", 
								"21", "22", "23", 
								"24", "25", "26", 
								"27", "28", "29", 
								"30", "31" });
					diaEmissaoComboBox = new JComboBox();
					getContentPane().add(diaEmissaoComboBox);
					diaEmissaoComboBox.setModel(diaEmissaoComboBoxModel);
					diaEmissaoComboBox.setBounds(126, 175, 77, 28);
					diaEmissaoComboBox.setMaximumRowCount(6);
				}
				{
					ComboBoxModel mesEmissaoComboBoxModel = new DefaultComboBoxModel(
						new String[] { "Janeiro", 
								"Fevereiro", "MarÁo", 
								"Abril", "Maio", 
								"Junho", "Julho", 
								"Agosto", "Setembro", 
								"Outubro", "Novembro", 
								"Dezembro" });
					mesEmissaoComboBox = new JComboBox();
					getContentPane().add(mesEmissaoComboBox);
					mesEmissaoComboBox.setModel(mesEmissaoComboBoxModel);
					mesEmissaoComboBox.setBounds(217, 175, 105, 28);
					mesEmissaoComboBox.setMaximumRowCount(6);
				}
				{
					ComboBoxModel anoEmissaoComboBoxModel = new DefaultComboBoxModel(
						new String[] { "2006", "2007", 
								"2008", "2009", "2010", 
								"2011", "2012", "2013", 
								"2014", "2015", "2016",
								"2017", "2018", "2019",
								"2020" });
					anoEmissaoComboBox = new JComboBox();
					getContentPane().add(anoEmissaoComboBox);
					anoEmissaoComboBox.setModel(anoEmissaoComboBoxModel);
					anoEmissaoComboBox.setBounds(336, 175, 91, 28);
					anoEmissaoComboBox.setMaximumRowCount(6);
				}
				{
					nomeBuffetText = new JTextField();
					getContentPane().add(nomeBuffetText);
					nomeBuffetText.setBounds(238, 119, 364, 28);
				}
			}
			this.setSize(631, 489);
			
			limparOrcamento();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void incluirOrcamentoButtonActionPerformed(ActionEvent evt) {
		System.out.println("incluirOrcamentoButton.actionPerformed, event="
			+ evt);
		//TODO add your code for incluirOrcamentoButton.actionPerformed
		
		int codigoOrcamento = 0;
		String nomeCliente = null;
		String tipoBuffet = null;
		String nomeBuffet = null;
	   	int qtdPessoasOrcamento = 0;
	   	int qtdGarconsOrcamento = 0;
	   	int qtdSegurancasOrcamento = 0;
	   	int diaEmissaoOrcamento = 0;
		int mesEmissaoOrcamento = 0;
		int anoEmissaoOrcamento = 0;
		int diaEvento = 0;
		int mesEvento = 0;
		int anoEvento = 0;
	   	int horaInicioEvento = 0;
	   	int minutoInicioEvento = 0;
	   	int horaTerminoEvento = 0;
	   	int minutoTerminoEvento = 0;
	   	String localEvento = null;
		double valorOrcamento = 0;
		String horarioEvento = null;
		String nomeMes = null;
		
		EventoData data = null;
		
		Orcamento orcamento = null;
		
		if(validaIncluirOrcamento() == true){
			
			try{
				
				data = new EventoData();
				
				codigoOrcamento = 1;
				nomeCliente = (String) nomeClienteComboBox.getSelectedItem();
				tipoBuffet = (String) tipoBuffetComboBox.getSelectedItem();
				nomeBuffet = nomeBuffetText.getText().trim();
				qtdPessoasOrcamento = Integer.parseInt(qtdPessoasOrcamentoText.getText().trim());
			   	qtdGarconsOrcamento = Integer.parseInt(qtdGarconsOrcamentoText.getText().trim());
			   	qtdSegurancasOrcamento = Integer.parseInt(qtdSegurancasOrcamentoText.getText().trim());
			   	
			   	diaEmissaoOrcamento = Integer.parseInt((String) diaEmissaoComboBox.getSelectedItem());
			   	mesEmissaoOrcamento = data.nomeMes2((String) mesEmissaoComboBox.getSelectedItem());
			   	anoEmissaoOrcamento = Integer.parseInt((String) anoEmissaoComboBox.getSelectedItem());
			   	
			   	diaEvento = Integer.parseInt((String) diaEventoComboBox.getSelectedItem());
			   	nomeMes = (String) mesEventoComboBox.getSelectedItem();
				mesEvento = data.nomeMes2(nomeMes);
				anoEvento = Integer.parseInt((String) anoEventoComboBox.getSelectedItem());
			   	
				horaInicioEvento = Integer.parseInt((String) horaInicioComboBox.getSelectedItem());
			   	minutoInicioEvento = Integer.parseInt((String) minutoInicioComboBox.getSelectedItem());
			   	horaTerminoEvento = Integer.parseInt((String) horaTerminoComboBox.getSelectedItem());
			   	minutoTerminoEvento = Integer.parseInt((String) minutoTerminoComboBox.getSelectedItem());
			   	localEvento = localEventoText.getText().trim();
				valorOrcamento = Double.parseDouble(valorOrcamentoText.getText().trim());
				if((horaInicioEvento < 10) && (minutoInicioEvento < 10)){
					horarioEvento = "0" +String.valueOf(horaInicioEvento)+ ":0" +String.valueOf(minutoInicioEvento);
				}
				else if((horaInicioEvento < 10) && (minutoInicioEvento > 10)){
					horarioEvento = "0" +String.valueOf(horaInicioEvento)+ ":" +String.valueOf(minutoInicioEvento);
				}
				else if((horaInicioEvento > 10) && (minutoInicioEvento < 10)){
					horarioEvento = String.valueOf(horaInicioEvento)+ ":0" +String.valueOf(minutoInicioEvento);
				}
				else{
					horarioEvento = String.valueOf(horaInicioEvento)+ ":" +String.valueOf(minutoInicioEvento);
				}
				
				
				
				orcamento = new Orcamento(codigoOrcamento, nomeCliente, tipoBuffet, nomeBuffet, qtdPessoasOrcamento, qtdGarconsOrcamento, qtdSegurancasOrcamento, diaEmissaoOrcamento, mesEmissaoOrcamento, anoEmissaoOrcamento, diaEvento, mesEvento, anoEvento, horaInicioEvento, minutoInicioEvento, horaTerminoEvento, minutoTerminoEvento, localEvento, valorOrcamento, horarioEvento, nomeMes);
				
				this.fachada.incluirOrcamento(orcamento);
				
				JOptionPane.showMessageDialog(this, 
						"INCLUS√O REALIZADA COM SUCESSO!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

				limparOrcamento();
			}
			catch (ExcecaoMRSystem e){
				JOptionPane.showMessageDialog(this, e.getMessage(), 
						"ERRO",JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(this,
					"INCLUS√O N√O REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void excluirOrcamentoButtonActionPerformed(ActionEvent evt) {
		System.out.println("excluirOrcamentoButton.actionPerformed, event="
			+ evt);
		//TODO add your code for excluirOrcamentoButton.actionPerformed
		
		int codigoOrcamento = 0;
		
		if(validaExcluirOrcamento() == true){
			
			try{		 
				
				codigoOrcamento = Integer.parseInt((String) codigoOrcamentoComboBox.getSelectedItem());
			
				int confirma = JOptionPane.showConfirmDialog(this, 
						"ESTE OR«AMENTO E TODOS OS SEUS DADOS SER√O APAGADOS !\nCONFIRMA ?", "CONFIRMA«√O", JOptionPane.OK_CANCEL_OPTION);
				
				if (confirma == JOptionPane.OK_OPTION) {
					
					this.fachada.excluirOrcamento(codigoOrcamento);
					
					JOptionPane.showMessageDialog(this,
							"EXCLUS√O REALIZADA COM SUCESSO!", "MENSAGEM",JOptionPane.INFORMATION_MESSAGE);		
					
					limparOrcamento();
				}
				
			}
			catch (ExcecaoMRSystem e){
				JOptionPane.showMessageDialog(this, e.getMessage(), 
						"ERRO",JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(this,
					"EXCLUS√O N√O REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void consultarOrcamentoButtonActionPerformed(ActionEvent evt) {
		System.out.println("consultarOrcamentoButton.actionPerformed, event="
			+ evt);
		//TODO add your code for consultarOrcamentoButton.actionPerformed
		
		int codigoOrcamento = 999999999;
		String nomeCliente = null;
		
		Orcamento orcamento = null;
		
		EventoData data = null;
		
		try{
			
			if(validaConsultarOrcamento() == true){
				
				if(nomeClienteComboBox.getSelectedIndex() == -1){
					codigoOrcamento = Integer.parseInt((String) codigoOrcamentoComboBox.getSelectedItem());
				}
				else{
					nomeCliente = (String) nomeClienteComboBox.getSelectedItem();
				}
				
				data = new EventoData();
				
				orcamento = this.fachada.consultarOrcamento(codigoOrcamento, nomeCliente);
				
				codigoOrcamentoComboBox.setSelectedItem(String.valueOf(orcamento.getCodigoOrcamento()));
				nomeClienteComboBox.setSelectedItem(orcamento.getNomeCliente());
				tipoBuffetComboBox.setSelectedItem(orcamento.getTipoBuffet());
				nomeBuffetText.setText(orcamento.getNomeBuffet());
				qtdPessoasOrcamentoText.setText(String.valueOf(orcamento.getQtdPessoasOrcamento()));
				qtdGarconsOrcamentoText.setText(String.valueOf(orcamento.getQtdGarconsOrcamento()));
				qtdSegurancasOrcamentoText.setText(String.valueOf(orcamento.getQtdSegurancasOrcamento()));
				
				diaEmissaoComboBox.setSelectedItem(String.valueOf(orcamento.getDiaEmissaoOrcamento()));
				mesEmissaoComboBox.setSelectedItem(data.nomeMes(orcamento.getMesEmissaoOrcamento()));
				anoEmissaoComboBox.setSelectedItem(String.valueOf(orcamento.getAnoEmissaoOrcamento()));
				
				diaEventoComboBox.setSelectedItem(String.valueOf(orcamento.getDiaEvento()));
				mesEventoComboBox.setSelectedItem(data.nomeMes(orcamento.getMesEvento()));
				anoEventoComboBox.setSelectedItem(String.valueOf(orcamento.getAnoEvento()));
				
				horaInicioComboBox.setSelectedItem(String.valueOf(orcamento.getHoraInicioEvento()));
				minutoInicioComboBox.setSelectedItem(String.valueOf(orcamento.getMinutoInicioEvento()));
				horaTerminoComboBox.setSelectedItem(String.valueOf(orcamento.getHoraTerminoEvento()));
				minutoTerminoComboBox.setSelectedItem(String.valueOf(orcamento.getMinutoTerminoEvento()));
				localEventoText.setText(orcamento.getLocalEvento());
				valorOrcamentoText.setText(String.valueOf(orcamento.getValorOrcamento()));
				
				codigoOrcamentoComboBox.setEditable(false);
				
				incluirOrcamentoButton.setEnabled(false);
				consultarOrcamentoButton.setEnabled(false);
			}
			else{
				JOptionPane.showMessageDialog(this,
						"CONSULTA N√O REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		}
		catch (ExcecaoInexistente e){
			JOptionPane.showMessageDialog(this, e.getMessage(), 
					"ATEN«√O",JOptionPane.WARNING_MESSAGE);
		}
		catch (ExcecaoMRSystem e){
			JOptionPane.showMessageDialog(this, e.getMessage(), 
					"ERRO",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void alterarOrcamentoButtonActionPerformed(ActionEvent evt) {
		System.out.println("alterarOrcamentoButton.actionPerformed, event="
			+ evt);
		//TODO add your code for alterarOrcamentoButton.actionPerformed
		
		int codigoOrcamento = 0;
		String nomeCliente = null;
		String tipoBuffet = null;
		String nomeBuffet = null;
	   	int qtdPessoasOrcamento = 0;
	   	int qtdGarconsOrcamento = 0;
	   	int qtdSegurancasOrcamento = 0;
	   	int diaEmissaoOrcamento = 0;
		int mesEmissaoOrcamento = 0;
		int anoEmissaoOrcamento = 0;
		int diaEvento = 0;
		int mesEvento = 0;
		int anoEvento = 0;
	   	int horaInicioEvento = 0;
	   	int minutoInicioEvento = 0;
	   	int horaTerminoEvento = 0;
	   	int minutoTerminoEvento = 0;
	   	String localEvento = null;
		double valorOrcamento = 0;
		String horarioEvento = null;
		String nomeMes = null;
		
		EventoData data = null;
		
		Orcamento orcamento = null;
		
		if(validaAlterarOrcamento() == true){
			
			try{
				
				data = new EventoData();
				
				codigoOrcamento = Integer.parseInt((String) codigoOrcamentoComboBox.getSelectedItem());
				nomeCliente = (String) nomeClienteComboBox.getSelectedItem();
				tipoBuffet = (String) tipoBuffetComboBox.getSelectedItem();
				nomeBuffet = nomeBuffetText.getText().trim();
				qtdPessoasOrcamento = Integer.parseInt(qtdPessoasOrcamentoText.getText().trim());
			   	qtdGarconsOrcamento = Integer.parseInt(qtdGarconsOrcamentoText.getText().trim());
			   	qtdSegurancasOrcamento = Integer.parseInt(qtdSegurancasOrcamentoText.getText().trim());
			   	
			   	diaEmissaoOrcamento = Integer.parseInt((String) diaEmissaoComboBox.getSelectedItem());
			   	mesEmissaoOrcamento = data.nomeMes2((String) mesEmissaoComboBox.getSelectedItem());
			   	anoEmissaoOrcamento = Integer.parseInt((String) anoEmissaoComboBox.getSelectedItem());
			   	
			   	diaEvento = Integer.parseInt((String) diaEventoComboBox.getSelectedItem());
			   	nomeMes = (String) mesEventoComboBox.getSelectedItem();
			   	mesEvento = data.nomeMes2(nomeMes);
				anoEvento = Integer.parseInt((String) anoEventoComboBox.getSelectedItem());
			   	
				horaInicioEvento = Integer.parseInt((String) horaInicioComboBox.getSelectedItem());
			   	minutoInicioEvento = Integer.parseInt((String) minutoInicioComboBox.getSelectedItem());
			   	horaTerminoEvento = Integer.parseInt((String) horaTerminoComboBox.getSelectedItem());
			   	minutoTerminoEvento = Integer.parseInt((String) minutoTerminoComboBox.getSelectedItem());
			   	localEvento = localEventoText.getText().trim();
				valorOrcamento = Double.parseDouble(valorOrcamentoText.getText().trim());
				if((horaInicioEvento < 10) && (minutoInicioEvento < 10)){
					horarioEvento = "0" +String.valueOf(horaInicioEvento)+ ":0" +String.valueOf(minutoInicioEvento);
				}
				else if((horaInicioEvento < 10) && (minutoInicioEvento > 10)){
					horarioEvento = "0" +String.valueOf(horaInicioEvento)+ ":" +String.valueOf(minutoInicioEvento);
				}
				else if((horaInicioEvento > 10) && (minutoInicioEvento < 10)){
					horarioEvento = String.valueOf(horaInicioEvento)+ ":0" +String.valueOf(minutoInicioEvento);
				}
				else{
					horarioEvento = String.valueOf(horaInicioEvento)+ ":" +String.valueOf(minutoInicioEvento);
				}
				
				
				orcamento = new Orcamento(codigoOrcamento, nomeCliente, tipoBuffet, nomeBuffet, qtdPessoasOrcamento, qtdGarconsOrcamento,qtdSegurancasOrcamento, diaEmissaoOrcamento, mesEmissaoOrcamento, anoEmissaoOrcamento, diaEvento, mesEvento, anoEvento, horaInicioEvento, minutoInicioEvento, horaTerminoEvento, minutoTerminoEvento, localEvento, valorOrcamento, horarioEvento, nomeMes);
				
				this.fachada.alterarOrcamento(orcamento);
				
				JOptionPane.showMessageDialog(this, 
						"ALTERA«√O REALIZADA COM SUCESSO!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

				limparOrcamento();
			}
			catch (ExcecaoMRSystem e){
				JOptionPane.showMessageDialog(this, e.getMessage(), 
						"ERRO",JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(this,
					"ALTERA«√O N√O REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void limparOrcamentoButtonActionPerformed(ActionEvent evt) {
		System.out.println("limparOrcamentoButton.actionPerformed, event="
			+ evt);
		//TODO add your code for limparOrcamentoButton.actionPerformed
	
		int confirma = JOptionPane.showConfirmDialog(this, 
				"DESEJA LIMPAR TODOS OS CAMPOS ?", "CONFIRMA«√O", JOptionPane.OK_CANCEL_OPTION);

		if (confirma == JOptionPane.OK_OPTION) {
	
			limparOrcamento();
		}
	}
	
	private void cancelarOrcamentoButtonActionPerformed(ActionEvent evt) {
		System.out.println("cancelarOrcamentoButton.actionPerformed, event="
			+ evt);
		//TODO add your code for cancelarOrcamentoButton.actionPerformed
	
		int confirma = JOptionPane.showConfirmDialog(this, 
				"DESEJA SAIR DO CADASTRO DE OR«AMENTOS ?", "CONFIRMA«√O", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
	
	public void limparOrcamento(){
		
		try {
			
			List listaCodigoOrcamento = null;
			
			listaCodigoOrcamento = this.fachada.listaCodigoOrcamentoComboBox();
			
			if (listaCodigoOrcamento.size() >= 0) {
				
				codigoOrcamentoComboBox.removeAllItems();
			}
			for (int i = 0; i < listaCodigoOrcamento.size(); i++) {
				
				codigoOrcamentoComboBox.addItem(listaCodigoOrcamento.get(i));
			}
			
			List listaNomeCliente = null;
			
			listaNomeCliente = this.fachada.listaNomeClienteComboBox();
			
			if (listaNomeCliente.size() >= 0) {
				
				nomeClienteComboBox.removeAllItems();
			}
			for (int i = 0; i < listaNomeCliente.size(); i++) {
				
				nomeClienteComboBox.addItem(listaNomeCliente.get(i));
			}
			
			List listaTipoBuffet = null;
			
			listaTipoBuffet = this.fachada.listaTipoBuffetComboBox();
			
			if (listaTipoBuffet.size() >= 0) {
				
				tipoBuffetComboBox.removeAllItems();
			}
			for (int i = 0; i < listaTipoBuffet.size(); i++) {
				
				tipoBuffetComboBox.addItem(listaTipoBuffet.get(i));
			}
		}
		catch (ExcecaoMRSystem e){
			JOptionPane.showMessageDialog(this, e.getMessage(), 
					"ERRO",JOptionPane.ERROR_MESSAGE);
		}
		
		EventoData data1 = new EventoData();
		
		Date data2 = new Date();
		GregorianCalendar calendario = new GregorianCalendar();
		calendario.setTime(data2);
		
		incluirOrcamentoButton.setEnabled(true);
		excluirOrcamentoButton.setEnabled(true);
		consultarOrcamentoButton.setEnabled(true);
		alterarOrcamentoButton.setEnabled(true);
		
		codigoOrcamentoComboBox.setEditable(false);
		codigoOrcamentoComboBox.setSelectedIndex(-1);
		nomeClienteComboBox.setEditable(false);
		nomeClienteComboBox.setSelectedIndex(-1);
    	tipoBuffetComboBox.setEditable(false);
    	tipoBuffetComboBox.setSelectedIndex(-1);

    	diaEmissaoComboBox.setEditable(false);
    	diaEmissaoComboBox.setSelectedItem(String.valueOf(calendario.get(Calendar.DAY_OF_MONTH)));
    	mesEmissaoComboBox.setEditable(false);
    	mesEmissaoComboBox.setSelectedItem(data1.nomeMes(calendario.get(Calendar.MONTH)));
    	anoEmissaoComboBox.setEditable(false);
		anoEmissaoComboBox.setSelectedItem(String.valueOf(calendario.get(Calendar.YEAR)));
    	
		diaEventoComboBox.setEditable(false);
    	diaEventoComboBox.setSelectedIndex(-1);
    	mesEventoComboBox.setEditable(false);
    	mesEventoComboBox.setSelectedIndex(-1);
    	anoEventoComboBox.setEditable(false);
    	anoEventoComboBox.setSelectedIndex(-1);
    	
    	horaInicioComboBox.setEditable(false);
    	horaInicioComboBox.setSelectedIndex(-1);
    	minutoInicioComboBox.setEditable(false);
    	minutoInicioComboBox.setSelectedIndex(-1);
    	horaTerminoComboBox.setEditable(false);
    	horaTerminoComboBox.setSelectedIndex(-1);
    	minutoTerminoComboBox.setEditable(false);
    	minutoTerminoComboBox.setSelectedIndex(-1);
    	
    	qtdPessoasOrcamentoText.setText("");
    	
    	nomeBuffetText.setEditable(false);
    	nomeBuffetText.setText("");
    	qtdGarconsOrcamentoText.setEditable(false);
    	qtdGarconsOrcamentoText.setText("");
    	qtdSegurancasOrcamentoText.setEditable(false);
    	qtdSegurancasOrcamentoText.setText("");
    	localEventoText.setText("");
    	valorOrcamentoText.setEditable(false);
    	valorOrcamentoText.setText("");
	}
	
	private boolean validaIncluirOrcamento(){
		
		try{
			
			if ((nomeClienteComboBox.getSelectedItem() == null) 
					|| (nomeClienteComboBox.getSelectedItem().equals(""))){
				
				JOptionPane.showMessageDialog(this, 
						"NOME DO CLIENTE N√O INFORMADO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}	
			if ((tipoBuffetComboBox.getSelectedItem() == null) 
					|| (tipoBuffetComboBox.getSelectedItem().equals(""))){
				
				JOptionPane.showMessageDialog(this, 
						"TIPO DO BUFFET N√O INFORMADO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}			
			if (qtdPessoasOrcamentoText.getText().trim().equals("")){
				JOptionPane.showMessageDialog(this, 
						"QUANTIDADE DE PESSOAS N√O INFORMADA.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}			
			if (qtdGarconsOrcamentoText.getText().trim().equals("")){
				JOptionPane.showMessageDialog(this, 
						"QUANTIDADE DE GAR«ONS N√O INFORMADA.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			if (qtdSegurancasOrcamentoText.getText().trim().equals("")){
				JOptionPane.showMessageDialog(this, 
						"QUANTIDADE DE SEGURAN«AS N√O INFORMADA.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if ((diaEmissaoComboBox.getSelectedItem() == null) 
					|| (diaEmissaoComboBox.getSelectedItem().equals(""))
					|| (mesEmissaoComboBox.getSelectedItem() == null) 
					|| (mesEmissaoComboBox.getSelectedItem().equals(""))
					|| (anoEmissaoComboBox.getSelectedItem() == null) 
					|| (anoEmissaoComboBox.getSelectedItem().equals(""))){
				
				JOptionPane.showMessageDialog(this, 
						"DATA DE EMISS√O N√O INFORMADA.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if ((diaEventoComboBox.getSelectedItem() == null) 
					|| (diaEventoComboBox.getSelectedItem().equals(""))
					|| (mesEventoComboBox.getSelectedItem() == null) 
					|| (mesEventoComboBox.getSelectedItem().equals(""))
					|| (anoEventoComboBox.getSelectedItem() == null) 
					|| (anoEventoComboBox.getSelectedItem().equals(""))){
				
				JOptionPane.showMessageDialog(this, 
						"DATA DO EVENTO N√O INFORMADA.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			EventoData data = new EventoData();
			
			int diaEmissaoOrcamento = Integer.parseInt((String) diaEmissaoComboBox.getSelectedItem());
			int mesEmissaoOrcamento = data.nomeMes2((String) mesEmissaoComboBox.getSelectedItem());
			int anoEmissaoOrcamento = Integer.parseInt((String) anoEmissaoComboBox.getSelectedItem());
			int diaEvento = Integer.parseInt((String) diaEventoComboBox.getSelectedItem());
			int mesEvento = data.nomeMes2((String) mesEventoComboBox.getSelectedItem());
			int anoEvento = Integer.parseInt((String) anoEventoComboBox.getSelectedItem());
			
			if(anoEmissaoOrcamento > anoEvento){
				
				JOptionPane.showMessageDialog(this, 
						"A DATA DE EMISS√O N√O PODE SER AP”S A DATA DO EVENTO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			if((anoEmissaoOrcamento == anoEvento) 
					&& (mesEmissaoOrcamento > mesEvento)){
				
				JOptionPane.showMessageDialog(this, 
						"A DATA DO EVENTO N√O PODE SER ANTES DA DATA DE EMISS√O DO OR«AMENTO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			if((anoEmissaoOrcamento == anoEvento) 
					&& (mesEmissaoOrcamento == mesEvento) 
					&& (diaEmissaoOrcamento > diaEvento)){
				
				JOptionPane.showMessageDialog(this, 
						"A DATA DE EMISS√O N√O PODE SER AP”S A DATA DO EVENTO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if ((horaInicioComboBox.getSelectedItem() == null) 
					|| (horaInicioComboBox.getSelectedItem().equals(""))
					|| (minutoInicioComboBox.getSelectedItem() == null) 
					|| (minutoInicioComboBox.getSelectedItem().equals(""))){
				
				JOptionPane.showMessageDialog(this, 
						"HOR¡RIO DE INÕCIO DO EVENTO N√O INFORMADO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if ((horaTerminoComboBox.getSelectedItem() == null) 
					|| (horaTerminoComboBox.getSelectedItem().equals(""))
					|| (minutoTerminoComboBox.getSelectedItem() == null) 
					|| (minutoTerminoComboBox.getSelectedItem().equals(""))){
				
				JOptionPane.showMessageDialog(this, 
						"HOR¡RIO DE T…RMINO DO EVENTO N√O INFORMADO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (localEventoText.getText().trim().equals("")){
				JOptionPane.showMessageDialog(this, 
						"LOCAL DE REALIZA«√O DO EVENTO N√O INFORMADO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			return true;
		}
		catch(Exception e){}		
		return true;
	}
	
	private boolean validaExcluirOrcamento(){		
		try{			
			if ((codigoOrcamentoComboBox.getSelectedItem() == null) 
					|| (codigoOrcamentoComboBox.getSelectedItem().equals(""))){				
				
				JOptionPane.showMessageDialog(this, "C”DIGO N√O INFORMADO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}			
			return true;
		}
		catch(Exception e){}		
		return true;
	}
	
	private boolean validaConsultarOrcamento(){
		
		try{			
			if ((codigoOrcamentoComboBox.getSelectedItem() == null) 
					&& (nomeClienteComboBox.getSelectedItem() == null)){				
				
				JOptionPane.showMessageDialog(this, 
						"C”DIGO OU NOME N√O INFORMADO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			else if(((!(codigoOrcamentoComboBox.getSelectedItem() == null)) 
					|| (!codigoOrcamentoComboBox.getSelectedItem().equals(""))) 
						&& ((!(nomeClienteComboBox.getSelectedItem() == null))
								|| (!nomeClienteComboBox.getSelectedItem().equals("")))){
				
				JOptionPane.showMessageDialog(this, 
						"INFORME UM C”DIGO OU UM NOME.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			return true;
		}
		catch(Exception e){}		
		return true;
	}
	
	private boolean validaAlterarOrcamento(){
		
		if (validaExcluirOrcamento() == false){
			return false;
		}
		else if (validaIncluirOrcamento() == false){
			return false;
		}
		else{		
			return true;
		}
	}
	
	private void tipoBuffetComboBoxActionPerformed(ActionEvent evt) throws ExcecaoInexistente, ExcecaoMRSystem {
		System.out.println("tipoBuffetComboBox.actionPerformed, event=" + evt);
		//TODO add your code for tipoBuffetComboBox.actionPerformed
		
		int codigoBuffet = 0;
		String tipoBuffet = null;
		String nomeBuffet = null;
		double valorBuffet = 0;
	   	
		int qtdPessoasOrcamento = 0;
		int qtdGarconsOrcamento = 0;
		int qtdSegurancasOrcamento = 0;
		double valorOrcamento = 0;
		
	   	Buffet buffet = null;
	   	
	   	if(((tipoBuffetComboBox.getSelectedItem() == null) 
	   			|| (tipoBuffetComboBox.getSelectedItem().equals(""))) 
	   			|| ((qtdPessoasOrcamentoText.getText().trim().equals("")) 
	   					|| (qtdPessoasOrcamentoText.getText().trim() == null))){
	   		
	   		System.out.println("MR SYSTEM");
	   	}
	   	else{
	   		tipoBuffet = (String) tipoBuffetComboBox.getSelectedItem();
		   	qtdPessoasOrcamento = Integer.parseInt(qtdPessoasOrcamentoText.getText().trim());
		   	
		   	if(qtdPessoasOrcamento <= 15){
		   		qtdGarconsOrcamento = 1;
				qtdSegurancasOrcamento = 1;
		   	}
		   	else{
		   		qtdGarconsOrcamento = (qtdPessoasOrcamento / 15);
				qtdSegurancasOrcamento = (qtdPessoasOrcamento / 15);
		   	}
		   	
		   	buffet = this.fachada.consultarBuffet(codigoBuffet, tipoBuffet);
		   	
		   	nomeBuffet = buffet.getNomeBuffet();
		   	valorBuffet = buffet.getValorBuffet();
		   	
		   	valorOrcamento += (valorBuffet * qtdPessoasOrcamento);
		   	
			nomeBuffetText.setText(nomeBuffet);
		   	qtdGarconsOrcamentoText.setText(String.valueOf(qtdGarconsOrcamento));
		   	qtdSegurancasOrcamentoText.setText(String.valueOf(qtdSegurancasOrcamento));
		   	valorOrcamentoText.setText(String.valueOf(valorOrcamento));
	   	}
	}
	
	private void codigoOrcamentoComboBoxActionPerformed(ActionEvent evt) {
		System.out.println("codigoOrcamentoComboBox.actionPerformed, event="
			+ evt);
		//TODO add your code for codigoOrcamentoComboBox.actionPerformed
	
		consultarOrcamentoButton.setEnabled(true);
		
		EventoData data1 = new EventoData();
		
		Date data2 = new Date();
		GregorianCalendar calendario = new GregorianCalendar();
		calendario.setTime(data2);
		
		nomeClienteComboBox.setSelectedIndex(-1);
    	tipoBuffetComboBox.setSelectedIndex(-1);

    	diaEmissaoComboBox.setSelectedItem(String.valueOf(calendario.get(Calendar.DAY_OF_MONTH)));
    	mesEmissaoComboBox.setSelectedItem(data1.nomeMes(calendario.get(Calendar.MONTH)));
		anoEmissaoComboBox.setSelectedItem(String.valueOf(calendario.get(Calendar.YEAR)));
    	
    	diaEventoComboBox.setSelectedIndex(-1);
    	mesEventoComboBox.setSelectedIndex(-1);
    	anoEventoComboBox.setSelectedIndex(-1);
    	
    	horaInicioComboBox.setSelectedIndex(-1);
    	minutoInicioComboBox.setSelectedIndex(-1);
    	horaTerminoComboBox.setSelectedIndex(-1);
    	minutoTerminoComboBox.setSelectedIndex(-1);
    	
    	nomeBuffetText.setText("");
    	qtdPessoasOrcamentoText.setText("");
    	qtdGarconsOrcamentoText.setText("");
    	qtdSegurancasOrcamentoText.setText("");
    	localEventoText.setText("");
    	valorOrcamentoText.setText("");
	}
	
	private void qtdPessoasOrcamentoTextKeyReleased(KeyEvent evt) throws ExcecaoInexistente, ExcecaoMRSystem {
		System.out.println("qtdPessoasOrcamentoText.keyReleased, event=" + evt);
		//TODO add your code for qtdPessoasOrcamentoText.keyReleased
		
		int codigoBuffet = 0;
		String tipoBuffet = null;
		double valorBuffet = 0;
	   	
		int qtdPessoasOrcamento = 0;
		int qtdGarconsOrcamento = 0;
		int qtdSegurancasOrcamento = 0;
		double valorOrcamento = 0;
		
	   	Buffet buffet = null;
	   	
	   	if(((tipoBuffetComboBox.getSelectedItem() == null) 
	   			|| (tipoBuffetComboBox.getSelectedItem().equals(""))) 
	   			|| ((qtdPessoasOrcamentoText.getText().trim().equals("")) 
	   					|| (qtdPessoasOrcamentoText.getText().trim() == null))){
	   		
	   		System.out.println("MR SYSTEM");
	   	}
	   	else{
	   		tipoBuffet = (String) tipoBuffetComboBox.getSelectedItem();
		   	qtdPessoasOrcamento = Integer.parseInt(qtdPessoasOrcamentoText.getText().trim());
		   	
		   	if(qtdPessoasOrcamento <= 15){
		   		qtdGarconsOrcamento = 1;
				qtdSegurancasOrcamento = 1;
		   	}
		   	else{
		   		qtdGarconsOrcamento = (qtdPessoasOrcamento / 15);
				qtdSegurancasOrcamento = (qtdPessoasOrcamento / 15);
		   	}
		   	
		   	buffet = this.fachada.consultarBuffet(codigoBuffet, tipoBuffet);
		   	
		   	valorBuffet = buffet.getValorBuffet();
		   	
		   	valorOrcamento += (valorBuffet * qtdPessoasOrcamento);
		   	
		   	
		   	qtdGarconsOrcamentoText.setText(String.valueOf(qtdGarconsOrcamento));
		   	qtdSegurancasOrcamentoText.setText(String.valueOf(qtdSegurancasOrcamento));
		   	valorOrcamentoText.setText(String.valueOf(valorOrcamento));
	   	}
	}
}
