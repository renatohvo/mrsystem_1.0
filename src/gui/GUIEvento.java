package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import negocio.EventoData;
import negocio.Fachada;
import negocio.IFachada;
import negocio.excecao.ExcecaoMRSystem;


public class GUIEvento extends javax.swing.JDialog {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField TextCampoConsulta;
	private JComboBox ComboBoxCampoConsulta;
	private JLabel LabelCampoConsulta;
	private JPanel PanelConsultarEvento;
	private JButton ButtonConsultarEvento;
	private JButton ButtonCancelarEvento;
	private JTabbedPane TabbedPaneEventos;
	private JScrollPane ScrollPaneEventos;
	private JLabel LabelControleEventos;
	private JTextArea TextAreaConsultar;
	private JScrollPane ScrollPaneConsultar;
	private JLabel jLabelPainelConsulta;
	private JLabel LabelDataAtual;
	private JButton ButtonLimparEvento;
	private String[][] dadosGravados1;
	private String[][] totalDadosGravados;
	private String [] colunasTabelaEventos;
	private JTable tabelaEvento;
	private String opcaoConsulta;
	private String buscaCampoTexto;
	private DefaultTableModel modeloTabela;
	
	private IFachada fachada;
	
	/**
	 * Auto-generated main method to display this JFrame
	 * @throws Exception 
	 */
	public static void main(String[] args) {
		showGUI();
	}
	
	public static void showGUI() {
		GUIEvento inst = new GUIEvento();
		inst.setVisible(true);
	}
	
	public GUIEvento() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI1();

		EventoData data = new EventoData();		
		LabelDataAtual.setText(data.horario(0));
		
		limparEvento();
	}
	
	private void initGUI1() {
		try {
			this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			this.setTitle("Controle de Eventos - Data dos Eventos");
			this.setResizable(false);
			this.setModal(true);
			this.getContentPane().setLayout(null);
			this.setLocation(100, 100);
			{
				ButtonCancelarEvento = new JButton();
				ButtonCancelarEvento.setFont(new java.awt.Font("Tahoma",1,11));
				ButtonCancelarEvento.setText("Cancelar");
				getContentPane().add(ButtonCancelarEvento);
				ButtonCancelarEvento.setBounds(448, 518, 91, 28);
				ButtonCancelarEvento.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						ButtonCancelarEventoActionPerformed(evt);
					}
				});
			}
			{
				TabbedPaneEventos = new JTabbedPane();
				TabbedPaneEventos.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(1, 1, 1, 1)));
				TabbedPaneEventos.setFont(new java.awt.Font ("Dialog", 0, 12));
				this.getContentPane().add(TabbedPaneEventos);
				TabbedPaneEventos.setBounds(14, 329, 756, 175);
				{
					ScrollPaneEventos = new JScrollPane();
					TabbedPaneEventos.addTab("Eventos", null, ScrollPaneEventos, null);
					ScrollPaneEventos.setBounds(14, 385, 756, 21);
					ScrollPaneEventos.setFont(new java.awt.Font("Dialog", 1, 11));
					ScrollPaneEventos.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
					ScrollPaneEventos.setAutoscrolls(true);
					ScrollPaneEventos.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
					ScrollPaneEventos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					{
						tabelaEvento = new JTable();
						modeloTabela = new DefaultTableModel(totalDadosGravados, colunasTabelaEventos);
						tabelaEvento.setModel(modeloTabela);
						tabelaEvento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
						ScrollPaneEventos.setViewportView(tabelaEvento);
					}
				}
				{
					{
						LabelControleEventos = new JLabel();
						getContentPane().add(LabelControleEventos);
						LabelControleEventos.setText("Controle de Eventos");
						LabelControleEventos.setBounds(287, 7, 203, 28);
						LabelControleEventos.setFont(new java.awt.Font("Verdana",3,18));
					}
					{
						ButtonConsultarEvento = new JButton();
						getContentPane().add(ButtonConsultarEvento);
						ButtonConsultarEvento.setFont(new java.awt.Font("Tahoma",1,11));
						ButtonConsultarEvento.setText("Consultar");
						ButtonConsultarEvento.setMnemonic(KeyEvent.VK_C);
						ButtonConsultarEvento.setBounds(252, 518, 91, 28);
						ButtonConsultarEvento.addActionListener(new java.awt.event.ActionListener() {
							public void actionPerformed(java.awt.event.ActionEvent evt) {
								ButtonConsultarEventoActionPerformed(evt);
							}
						});
					}
					{
						PanelConsultarEvento = new JPanel();
						getContentPane().add(PanelConsultarEvento);
						PanelConsultarEvento.setBounds(14, 42, 756, 273);
						PanelConsultarEvento.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
						PanelConsultarEvento.setLayout(null);
						{
							LabelCampoConsulta = new JLabel();
							PanelConsultarEvento.add(LabelCampoConsulta);
							LabelCampoConsulta.setText("Campo Consulta:");
							LabelCampoConsulta.setFont(new java.awt.Font("Tahoma",1,11));
							LabelCampoConsulta.setBounds(175, 49, 105, 14);
						}
						{
							ComboBoxModel ComboBoxTipoConsultaModel = new DefaultComboBoxModel(
								new String[] { "Dia", "Mês", "Ano", 
										"Horário", "Nome do Cliente", "Local" });
							ComboBoxCampoConsulta = new JComboBox();
							PanelConsultarEvento.add(ComboBoxCampoConsulta);
							ComboBoxCampoConsulta.setModel(ComboBoxTipoConsultaModel);
							ComboBoxCampoConsulta.setBounds(14, 42, 147, 28);
							ComboBoxCampoConsulta.setMaximumRowCount(6);
						}
						{
							TextCampoConsulta = new JTextField();
							TextCampoConsulta.setBounds(14, 77, 336, 28);
							try{
								javax.swing.text.MaskFormatter format_textField = new
								javax.swing.text.MaskFormatter("**************************************************");
								TextCampoConsulta = new javax.swing.JFormattedTextField(format_textField);
							}catch (Exception e){}
							PanelConsultarEvento.add(TextCampoConsulta);
							TextCampoConsulta.setBounds(280, 42, 462, 28);
							TextCampoConsulta.addKeyListener(new KeyAdapter() {
								public void keyReleased(KeyEvent evt) {
									TextTipoConsultaKeyReleased(evt);
								}
							});
						}
						{
							jLabelPainelConsulta = new JLabel();
							PanelConsultarEvento.add(jLabelPainelConsulta);
							jLabelPainelConsulta.setText("Painel de Consulta");
							jLabelPainelConsulta.setBounds(14, 7, 140, 28);
							jLabelPainelConsulta.setFont(new java.awt.Font("Tahoma",1,12));
							jLabelPainelConsulta.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
							jLabelPainelConsulta.setHorizontalAlignment(SwingConstants.CENTER);
							jLabelPainelConsulta.setHorizontalTextPosition(SwingConstants.CENTER);
						}
						{
							LabelDataAtual = new JLabel();
							PanelConsultarEvento.add(LabelDataAtual);
							LabelDataAtual.setBounds(525, 7, 217, 28);
							LabelDataAtual.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
							LabelDataAtual.setHorizontalAlignment(SwingConstants.CENTER);
							LabelDataAtual.setHorizontalTextPosition(SwingConstants.CENTER);
						}
						{
							ScrollPaneConsultar = new JScrollPane();
							PanelConsultarEvento.add(ScrollPaneConsultar);
							ScrollPaneConsultar.setBounds(14, 77, 728, 182);
							ScrollPaneConsultar.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
							ScrollPaneConsultar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
							{
								TextAreaConsultar = new JTextArea();
								ScrollPaneConsultar.setViewportView(TextAreaConsultar);
								TextAreaConsultar.setWrapStyleWord(true);
							}
						}
					}
					{
						ButtonLimparEvento = new JButton();
						getContentPane().add(ButtonLimparEvento);
						ButtonLimparEvento.setText("Limpar");
						ButtonLimparEvento.setMnemonic(KeyEvent.VK_L);
						ButtonLimparEvento.setBounds(350, 518, 91, 28);
						ButtonLimparEvento.setFont(new java.awt.Font("Tahoma",1,11));
						ButtonLimparEvento.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								ButtonLimparEventoActionPerformed(evt);
							}
						});
					}
				}
			}
			pack();
			this.setSize(792, 594);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//---------------------------------------------------------------------------------------------------------------------------
	
	private void ButtonConsultarEventoActionPerformed(java.awt.event.ActionEvent evt) {
		System.out.println("ButtonConsultarEvento.actionPerformed, event=" + evt);
		//TODO add your code for ButtonConsultarEvento.actionPerformed
		
		try{
			
			TextAreaConsultar.setText("");
			
			int opcaoBusca = ComboBoxCampoConsulta.getSelectedIndex();
			
			
			switch(opcaoBusca){
			
			case 0:	
				opcaoConsulta = "dia_evento";
				if(TextCampoConsulta.getText().trim().equals("")){
					JOptionPane.showMessageDialog(this, 
							"DIA NÃO INFORMADO.", "MENSAGEM", JOptionPane.WARNING_MESSAGE);	
					break;
				}
				
				buscaCampoTexto = TextCampoConsulta.getText().trim();
				
				dadosGravados1 = fachada.consultarEvento(opcaoConsulta, buscaCampoTexto);
				
				for (int i = 0; i < dadosGravados1.length; i++){					
					TextAreaConsultar.append(" Dia:_________________________________________"+dadosGravados1[i][0]);
					TextAreaConsultar.append("\n Mês:________________________________________"+dadosGravados1[i][1]);
					TextAreaConsultar.append("\n Ano:________________________________________"+dadosGravados1[i][2]);
					TextAreaConsultar.append("\n Horário:_____________________________________"+dadosGravados1[i][3]);
					TextAreaConsultar.append("\n Nome do Cliente:_____________________________"+dadosGravados1[i][4]);
					TextAreaConsultar.append("\n Local:______________________________________"+dadosGravados1[i][5]+"\n\n");
				}
				if(dadosGravados1.length == 0){
					JOptionPane.showMessageDialog(this, 
							"OBJETO INEXISTENTE!" , "ERRO", JOptionPane.ERROR_MESSAGE);
					TextAreaConsultar.setText("");
				}
				break;
				
			case 1:
				opcaoConsulta = "nome_mes";				
				if(TextCampoConsulta.getText().trim().equals("")){
					JOptionPane.showMessageDialog(this, 
							"MÊS NÃO INFORMADO.", "MENSAGEM", JOptionPane.WARNING_MESSAGE);	
					break;
				}
				
				buscaCampoTexto = "'%"+TextCampoConsulta.getText().trim()+"%'";
				
				dadosGravados1 = fachada.consultarEvento(opcaoConsulta, buscaCampoTexto);
				
				for (int i = 0; i < dadosGravados1.length; i++){  
					TextAreaConsultar.append(" Dia:_________________________________________"+dadosGravados1[i][0]);
					TextAreaConsultar.append("\n Mês:________________________________________"+dadosGravados1[i][1]);
					TextAreaConsultar.append("\n Ano:________________________________________"+dadosGravados1[i][2]);
					TextAreaConsultar.append("\n Horário:_____________________________________"+dadosGravados1[i][3]);
					TextAreaConsultar.append("\n Nome do Cliente:_____________________________"+dadosGravados1[i][4]);
					TextAreaConsultar.append("\n Local:______________________________________"+dadosGravados1[i][5]+"\n\n");
				}
				if(dadosGravados1.length == 0){
					JOptionPane.showMessageDialog(this, 
							"OBJETO INEXISTENTE!" , "ERRO", JOptionPane.ERROR_MESSAGE);
					TextAreaConsultar.setText("");
				}
				break;
				
			case 2:
				opcaoConsulta = "ano_evento";
				if(TextCampoConsulta.getText().trim().equals("")){
					JOptionPane.showMessageDialog(this, 
							"ANO NÃO INFORMADO.", "MENSAGEM", JOptionPane.WARNING_MESSAGE);	
					break;
				}
				
				buscaCampoTexto = TextCampoConsulta.getText().trim();
				
				dadosGravados1 = fachada.consultarEvento(opcaoConsulta, buscaCampoTexto);
				
				for (int i = 0; i < dadosGravados1.length; i++){  
					TextAreaConsultar.append(" Dia:_________________________________________"+dadosGravados1[i][0]);
					TextAreaConsultar.append("\n Mês:________________________________________"+dadosGravados1[i][1]);
					TextAreaConsultar.append("\n Ano:________________________________________"+dadosGravados1[i][2]);
					TextAreaConsultar.append("\n Horário:_____________________________________"+dadosGravados1[i][3]);
					TextAreaConsultar.append("\n Nome do Cliente:_____________________________"+dadosGravados1[i][4]);
					TextAreaConsultar.append("\n Local:______________________________________"+dadosGravados1[i][5]+"\n\n");
				}
				if(dadosGravados1.length == 0){
					JOptionPane.showMessageDialog(this, 
							"OBJETO INEXISTENTE!" , "ERRO", JOptionPane.ERROR_MESSAGE);
					TextAreaConsultar.setText("");
				}
				break;
				
			case 3:
				opcaoConsulta = "horario_evento";
				if(TextCampoConsulta.getText().trim().equals("")){
					JOptionPane.showMessageDialog(this, 
							"HORÁRIO NÃO INFORMADO.", "MENSAGEM", JOptionPane.WARNING_MESSAGE);	
					break;
				}
				
				buscaCampoTexto = "'%"+TextCampoConsulta.getText().trim()+"%'";
				
				dadosGravados1 = fachada.consultarEvento(opcaoConsulta, buscaCampoTexto);
				
				for (int i = 0; i < dadosGravados1.length; i++){  
					TextAreaConsultar.append(" Dia:_________________________________________"+dadosGravados1[i][0]);
					TextAreaConsultar.append("\n Mês:________________________________________"+dadosGravados1[i][1]);
					TextAreaConsultar.append("\n Ano:________________________________________"+dadosGravados1[i][2]);
					TextAreaConsultar.append("\n Horário:_____________________________________"+dadosGravados1[i][3]);
					TextAreaConsultar.append("\n Nome do Cliente:_____________________________"+dadosGravados1[i][4]);
					TextAreaConsultar.append("\n Local:______________________________________"+dadosGravados1[i][5]+"\n\n");
				}
				if(dadosGravados1.length == 0){
					JOptionPane.showMessageDialog(this, 
							"OBJETO INEXISTENTE!" , "ERRO", JOptionPane.ERROR_MESSAGE);
					TextAreaConsultar.setText("");
				}
				break;
				
			case 4:
				opcaoConsulta = "nome_cliente";
				if(TextCampoConsulta.getText().trim().equals("")){
					JOptionPane.showMessageDialog(this, 
							"NOME DO CLIENTE NÃO INFORMADO.", "MENSAGEM", JOptionPane.WARNING_MESSAGE);	
					break;
				}
				
				buscaCampoTexto = "'%"+TextCampoConsulta.getText().trim()+"%'";
				
				dadosGravados1 = fachada.consultarEvento(opcaoConsulta, buscaCampoTexto);
				
				for (int i = 0; i < dadosGravados1.length; i++){  
					TextAreaConsultar.append(" Dia:_________________________________________"+dadosGravados1[i][0]);
					TextAreaConsultar.append("\n Mês:________________________________________"+dadosGravados1[i][1]);
					TextAreaConsultar.append("\n Ano:________________________________________"+dadosGravados1[i][2]);
					TextAreaConsultar.append("\n Horário:_____________________________________"+dadosGravados1[i][3]);
					TextAreaConsultar.append("\n Nome do Cliente:_____________________________"+dadosGravados1[i][4]);
					TextAreaConsultar.append("\n Local:______________________________________"+dadosGravados1[i][5]+"\n\n");
				}
				if(dadosGravados1.length == 0){
					JOptionPane.showMessageDialog(this, 
							"OBJETO INEXISTENTE!" , "ERRO", JOptionPane.ERROR_MESSAGE);
					TextAreaConsultar.setText("");
				}
				break;
				
			case 5:
				opcaoConsulta = "local_evento";
				if(TextCampoConsulta.getText().trim().equals("")){
					JOptionPane.showMessageDialog(this, 
							"LOCAL NÃO INFORMADO.", "MENSAGEM", JOptionPane.WARNING_MESSAGE);	
					break;
				}
				
				buscaCampoTexto = "'%"+TextCampoConsulta.getText().trim()+"%'";
				
				dadosGravados1 = fachada.consultarEvento(opcaoConsulta, buscaCampoTexto);
				
				for (int i = 0; i < dadosGravados1.length; i++){  
					TextAreaConsultar.append(" Dia:_________________________________________"+dadosGravados1[i][0]);
					TextAreaConsultar.append("\n Mês:________________________________________"+dadosGravados1[i][1]);
					TextAreaConsultar.append("\n Ano:________________________________________"+dadosGravados1[i][2]);
					TextAreaConsultar.append("\n Horário:_____________________________________"+dadosGravados1[i][3]);
					TextAreaConsultar.append("\n Nome do Cliente:_____________________________"+dadosGravados1[i][4]);
					TextAreaConsultar.append("\n Local:______________________________________"+dadosGravados1[i][5]+"\n\n");
				}
				if(dadosGravados1.length == 0){
					JOptionPane.showMessageDialog(this, 
							"OBJETO INEXISTENTE!" , "ERRO", JOptionPane.ERROR_MESSAGE);
					TextAreaConsultar.setText("");
				}
				break;
				
			}
		}
		catch (ExcecaoMRSystem e){
			JOptionPane.showMessageDialog(this, e.getMessage(), 
					"ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------------------
		
	private void ButtonCancelarEventoActionPerformed(java.awt.event.ActionEvent evt){
		System.out.println("ButtonCancelarEvento.actionPerformed, event=" + evt);
		//TODO add your code for ButtonCancelarEvento.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog(this, 
				"DESEJA SAIR DO CONTROLE DE EVENTOS ?", "CONFIRMAÇÃO", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void atualizaTabela() {
		
		try{
			
			colunasTabelaEventos = new String[]{"Dia", "Mês", "Ano", "Horário","Nome do Cliente","Local","Código"};
			
			dadosGravados1 = fachada.pesquisarEventos();
			
			modeloTabela = new DefaultTableModel(dadosGravados1, colunasTabelaEventos){ 
				private static final long serialVersionUID = 1L;
				
				public boolean isCellEditable(int row,int col){
					return false;
				}
			};
			
			tabelaEvento = new JTable();
			tabelaEvento.setModel(modeloTabela);
			tabelaEvento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			tabelaEvento.getColumnModel().getColumn(0).setMinWidth(0);
			tabelaEvento.getColumnModel().getColumn(1).setMinWidth(0);
			tabelaEvento.getColumnModel().getColumn(2).setMinWidth(0);
			tabelaEvento.getColumnModel().getColumn(3).setMinWidth(0);
			tabelaEvento.getColumnModel().getColumn(4).setMinWidth(175);
			tabelaEvento.getColumnModel().getColumn(5).setMinWidth(175);
			tabelaEvento.getColumnModel().getColumn(6).setMinWidth(0);
			
			ScrollPaneEventos.setAutoscrolls(true);
			ScrollPaneEventos.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			ScrollPaneEventos.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			ScrollPaneEventos.setViewportView(tabelaEvento);
		}
		catch (ExcecaoMRSystem e){
			JOptionPane.showMessageDialog(this, e.getMessage(), 
					"ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	//------------------------------------------------------------------------------------------------------------------------------------------------------
	
	private void ButtonLimparEventoActionPerformed(ActionEvent evt) {
		System.out.println("ButtonLimparEvento.actionPerformed, event=" + evt);
		//TODO add your code for ButtonLimparEvento.actionPerformed
		
		limparEvento();
	}
	
	//------------------------------------------------------------------------------------------------------------------------------------------------------
	
	private void TextTipoConsultaKeyReleased(KeyEvent evt) {
		System.out.println("TextCampoConsulta.keyReleased, event=" + evt);
		//TODO add your code for TextCampoConsulta.keyReleased
	
		TextAreaConsultar.setText(null);
		atualizaTabela();
	}
	
	//------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void limparEvento() {
		
		TextCampoConsulta.setText(null);
		TextAreaConsultar.setText(null);
		atualizaTabela();
	}
}
