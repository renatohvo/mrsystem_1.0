package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import negocio.Fachada;
import negocio.Funcionario;
import negocio.IFachada;
import negocio.excecao.ExcecaoMRSystem;


public class GUIFuncionario extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JSeparator jSeparatorCadastroFuncionarios1;
	private JTextField cargoFuncionarioText;
	private JLabel cargoFuncionarioLabel;
	private JTextField cpfFuncionarioText;
	private JButton cancelarFuncionarioButton;
	private JLabel valorHoraFuncionarioLabel;
	private JTextField valorFuncionarioText;
	private JLabel valorFuncionarioLabel;
	private JComboBox codigoFuncionarioComboBox;
	private JButton limparFuncionarioButton;
	private JButton alterarFuncionarioButton;
	private JButton consultarFuncionarioButton;
	private JButton excluirFuncionarioButton;
	private JButton incluirFuncionarioButton;
	private JSeparator jSeparatorCadastroFuncionarios2;
	private JTextField emailFuncionarioText;
	private JLabel emailFuncionarioLabel;
	private JTextField cidadeFuncionarioText;
	private JComboBox estadoFuncionarioComboBox;
	private JLabel estadoFuncionarioLabel;
	private JTextField telefoneFuncionarioText;
	private JLabel telefoneFuncionarioLabel;
	private JLabel cidadeFuncionarioLabel;
	private JTextField bairroFuncionarioText;
	private JLabel bairroFuncionarioLabel;
	private JTextField numeroFuncionarioText;
	private JLabel numeroFuncionarioLabel;
	private JTextField ruaFuncionarioText;
	private JLabel ruaFuncionarioLabel;
	private JLabel cpfFuncionarioLabel;
	private JTextField rgFuncionarioText;
	private JLabel rgFuncionarioLabel;
	private JTextField nomeFuncionarioText;
	private JLabel nomeFuncionarioLabel;
	private JLabel codigoFuncionarioLabel;
	private JLabel cadastroFuncionariosLabel;
	
	private IFachada fachada;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		GUIFuncionario inst = new GUIFuncionario();
		inst.setVisible(true);
	}
	
	public GUIFuncionario() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Cadastro de Funcionários - Dados do Funcionário");
			this.setModal(true);
			this.setResizable(false);
			this.setLocation(new java.awt.Point(200, 100));
			{
				cadastroFuncionariosLabel = new JLabel();
				getContentPane().add(cadastroFuncionariosLabel);
				cadastroFuncionariosLabel.setText("Cadastro de Funcionários");
				cadastroFuncionariosLabel.setBounds(182, 7, 259, 21);
				cadastroFuncionariosLabel.setFont(new java.awt.Font("Verdana",3,18));
			}
			{
				jSeparatorCadastroFuncionarios1 = new JSeparator();
				getContentPane().add(jSeparatorCadastroFuncionarios1);
				jSeparatorCadastroFuncionarios1.setBounds(0, 35, 623, 14);
			}
			{
				codigoFuncionarioLabel = new JLabel();
				getContentPane().add(codigoFuncionarioLabel);
				codigoFuncionarioLabel.setText("Código:");
				codigoFuncionarioLabel.setBounds(21, 49, 56, 28);
				codigoFuncionarioLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				nomeFuncionarioLabel = new JLabel();
				getContentPane().add(nomeFuncionarioLabel);
				nomeFuncionarioLabel.setText("Nome:");
				nomeFuncionarioLabel.setBounds(21, 84, 42, 28);
				nomeFuncionarioLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				nomeFuncionarioText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**************************************************");
					format_textField.setValidCharacters(" ÁáÂâÃãÉéÊêÍíÎîÓóÔôÕõÚúÛûAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzçÇ");
					nomeFuncionarioText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(nomeFuncionarioText);
				nomeFuncionarioText.setBounds(84, 84, 518, 28);
			}
			{
				rgFuncionarioLabel = new JLabel();
				getContentPane().add(rgFuncionarioLabel);
				rgFuncionarioLabel.setText("RG:");
				rgFuncionarioLabel.setBounds(196, 49, 28, 28);
				rgFuncionarioLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				rgFuncionarioText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("***************");
					format_textField.setValidCharacters("0123456789 ");
					rgFuncionarioText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(rgFuncionarioText);
				rgFuncionarioText.setBounds(224, 49, 161, 28);
			}
			{
				cpfFuncionarioLabel = new JLabel();
				getContentPane().add(cpfFuncionarioLabel);
				cpfFuncionarioLabel.setText("CPF:");
				cpfFuncionarioLabel.setBounds(406, 49, 35, 28);
				cpfFuncionarioLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				cpfFuncionarioText = new JTextField();
				getContentPane().add(cpfFuncionarioText);
				cpfFuncionarioText.setBounds(441, 49, 161, 28);
			}
			{
				cargoFuncionarioLabel = new JLabel();
				getContentPane().add(cargoFuncionarioLabel);
				cargoFuncionarioLabel.setText("Cargo:");
				cargoFuncionarioLabel.setBounds(21, 119, 42, 28);
				cargoFuncionarioLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				cargoFuncionarioText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**************************************************");
					format_textField.setValidCharacters(" ÁáÂâÃãÉéÊêÍíÎîÓóÔôÕõÚúÛûAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzçÇ,.-");
					cargoFuncionarioText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(cargoFuncionarioText);
				cargoFuncionarioText.setBounds(84, 119, 518, 28);
			}
			{
				ruaFuncionarioLabel = new JLabel();
				getContentPane().add(ruaFuncionarioLabel);
				ruaFuncionarioLabel.setText("Rua:");
				ruaFuncionarioLabel.setBounds(21, 154, 35, 28);
				ruaFuncionarioLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				ruaFuncionarioText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**************************************************");
					format_textField.setValidCharacters("0123456789 ÁáÂâÃãÉéÊêÍíÎîÓóÔôÕõÚúÛûAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzçÇ,.-");
					ruaFuncionarioText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(ruaFuncionarioText);
				ruaFuncionarioText.setBounds(84, 154, 518, 28);
			}
			{
				numeroFuncionarioLabel = new JLabel();
				getContentPane().add(numeroFuncionarioLabel);
				numeroFuncionarioLabel.setText("Número:");
				numeroFuncionarioLabel.setBounds(21, 189, 56, 28);
				numeroFuncionarioLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				numeroFuncionarioText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**********");
					format_textField.setValidCharacters("0123456789 ");
					numeroFuncionarioText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(numeroFuncionarioText);
				numeroFuncionarioText.setBounds(84, 189, 203, 28);
			}
			{
				bairroFuncionarioLabel = new JLabel();
				getContentPane().add(bairroFuncionarioLabel);
				bairroFuncionarioLabel.setText("Bairro:");
				bairroFuncionarioLabel.setBounds(308, 189, 42, 28);
				bairroFuncionarioLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				bairroFuncionarioText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("******************************");
					format_textField.setValidCharacters("0123456789 ÁáÂâÃãÉéÊêÍíÎîÓóÔôÕõÚúÛûAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzçÇ");
					bairroFuncionarioText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(bairroFuncionarioText);
				bairroFuncionarioText.setBounds(378, 189, 224, 28);
			}
			{
				cidadeFuncionarioLabel = new JLabel();
				getContentPane().add(cidadeFuncionarioLabel);
				cidadeFuncionarioLabel.setText("Cidade:");
				cidadeFuncionarioLabel.setBounds(21, 224, 49, 28);
				cidadeFuncionarioLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				cidadeFuncionarioText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("******************************");
					format_textField.setValidCharacters(" ÁáÂâÃãÉéÊêÍíÎîÓóÔôÕõÚúÛûAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzçÇ");
					cidadeFuncionarioText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(cidadeFuncionarioText);
				cidadeFuncionarioText.setBounds(84, 224, 203, 28);
			}
			{
				telefoneFuncionarioLabel = new JLabel();
				getContentPane().add(telefoneFuncionarioLabel);
				telefoneFuncionarioLabel.setText("Telefone:");
				telefoneFuncionarioLabel.setBounds(21, 259, 63, 28);
				telefoneFuncionarioLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				telefoneFuncionarioText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("********");
					format_textField.setValidCharacters("0123456789 ");
					telefoneFuncionarioText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(telefoneFuncionarioText);
				telefoneFuncionarioText.setBounds(84, 259, 203, 28);
			}
			{
				estadoFuncionarioLabel = new JLabel();
				getContentPane().add(estadoFuncionarioLabel);
				estadoFuncionarioLabel.setText("Estado:");
				estadoFuncionarioLabel.setBounds(308, 224, 49, 28);
				estadoFuncionarioLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				estadoFuncionarioComboBox = new JComboBox();
				getContentPane().add(estadoFuncionarioComboBox);
				estadoFuncionarioComboBox.setBounds(378, 224, 224, 28);
				estadoFuncionarioComboBox.setMaximumRowCount(6);
				estadoFuncionarioComboBox.setEditable(false);
			}
			{
				emailFuncionarioLabel = new JLabel();
				getContentPane().add(emailFuncionarioLabel);
				emailFuncionarioLabel.setText("e-mail(s):");
				emailFuncionarioLabel.setBounds(21, 315, 63, 28);
				emailFuncionarioLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				emailFuncionarioText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**************************************************");
					emailFuncionarioText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(emailFuncionarioText);
				emailFuncionarioText.setBounds(84, 315, 518, 28);
			}
			{
				jSeparatorCadastroFuncionarios2 = new JSeparator();
				getContentPane().add(jSeparatorCadastroFuncionarios2);
				jSeparatorCadastroFuncionarios2.setBounds(0, 357, 623, 14);
			}
			{
				incluirFuncionarioButton = new JButton();
				getContentPane().add(incluirFuncionarioButton);
				incluirFuncionarioButton.setText("Incluir");
				incluirFuncionarioButton.setMnemonic(KeyEvent.VK_I);
				incluirFuncionarioButton.setBounds(21, 371, 91, 28);
				incluirFuncionarioButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						incluirFuncionarioButtonActionPerformed(evt);
					}
					});
			}
			{
				excluirFuncionarioButton = new JButton();
				getContentPane().add(excluirFuncionarioButton);
				excluirFuncionarioButton.setText("Excluir");
				excluirFuncionarioButton.setMnemonic(KeyEvent.VK_E);
				excluirFuncionarioButton.setBounds(119, 371, 91, 28);
				excluirFuncionarioButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						excluirFuncionarioButtonActionPerformed(evt);
					}
					});
			}
			{
				consultarFuncionarioButton = new JButton();
				getContentPane().add(consultarFuncionarioButton);
				consultarFuncionarioButton.setText("Consultar");
				consultarFuncionarioButton.setMnemonic(KeyEvent.VK_C);
				consultarFuncionarioButton.setBounds(217, 371, 91, 28);
				consultarFuncionarioButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						consultarFuncionarioButtonActionPerformed(evt);
					}
					});
			}
			{
				alterarFuncionarioButton = new JButton();
				getContentPane().add(alterarFuncionarioButton);
				alterarFuncionarioButton.setText("Alterar");
				alterarFuncionarioButton.setMnemonic(KeyEvent.VK_A);
				alterarFuncionarioButton.setBounds(315, 371, 91, 28);
				alterarFuncionarioButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						alterarFuncionarioButtonActionPerformed(evt);
					}
					});
			}
			{
				limparFuncionarioButton = new JButton();
				getContentPane().add(limparFuncionarioButton);
				limparFuncionarioButton.setText("Limpar");
				limparFuncionarioButton.setMnemonic(KeyEvent.VK_L);
				limparFuncionarioButton.setBounds(413, 371, 91, 28);
				limparFuncionarioButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						limparFuncionarioButtonActionPerformed(evt);
					}
				});
			}
			{
				cancelarFuncionarioButton = new JButton();
				getContentPane().add(cancelarFuncionarioButton);
				cancelarFuncionarioButton.setText("Cancelar");
				cancelarFuncionarioButton.setBounds(511, 371, 91, 28);
				cancelarFuncionarioButton
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						cancelarFuncionarioButtonActionPerformed(evt);
					}
					});
			}
			{
				codigoFuncionarioComboBox = new JComboBox();
				getContentPane().add(codigoFuncionarioComboBox);
				codigoFuncionarioComboBox.setBounds(84, 49, 63, 28);
				codigoFuncionarioComboBox.setSize(91, 28);
				codigoFuncionarioComboBox.setMaximumRowCount(6);
				codigoFuncionarioComboBox
					.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						codigoFuncionarioComboBoxActionPerformed(evt);
					}
					});
			}
			{
				valorFuncionarioLabel = new JLabel();
				getContentPane().add(valorFuncionarioLabel);
				valorFuncionarioLabel.setText("Valor (R$):");
				valorFuncionarioLabel.setBounds(308, 259, 70, 28);
				valorFuncionarioLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				valorFuncionarioText = new JTextField();
				getContentPane().add(valorFuncionarioText);
				valorFuncionarioText.setBounds(378, 259, 224, 28);
			}
			{
				valorHoraFuncionarioLabel = new JLabel();
				getContentPane().add(valorHoraFuncionarioLabel);
				valorHoraFuncionarioLabel.setText("valor por hora exercida");
				valorHoraFuncionarioLabel.setBounds(427, 287, 119, 14);
				valorHoraFuncionarioLabel.setFont(new java.awt.Font("Tahoma",1,10));
			}
			pack();
			this.setSize(631, 440);
			
			limparFuncionario();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void incluirFuncionarioButtonActionPerformed(ActionEvent evt) {
		System.out.println("incluirFuncionarioButton.actionPerformed, event="
			+ evt);
		//TODO add your code for incluirFuncionarioButton.actionPerformed
		
		int codigoFuncionario = 0;
		String nomeFuncionario = null;
		String cargoFuncionario = null;
		String rgFuncionario = null;
		String cpfFuncionario = null;
		String ruaFuncionario = null;
		String numeroFuncionario = null;
		String bairroFuncionario = null;
		String cidadeFuncionario = null;
		String estadoFuncionario = null;
		String telefoneFuncionario = null;
		double valorFuncionario = 0;
		String emailFuncionario = null;
		
		Funcionario funcionario = null;
		
		if(validaIncluirFuncionario() == true){
			
			try{
				
				codigoFuncionario = 1;
				nomeFuncionario = nomeFuncionarioText.getText().trim();
				cargoFuncionario = cargoFuncionarioText.getText().trim();
				rgFuncionario = rgFuncionarioText.getText().trim();
				cpfFuncionario = cpfFuncionarioText.getText().trim();
				ruaFuncionario = ruaFuncionarioText.getText().trim();
				numeroFuncionario = numeroFuncionarioText.getText().trim();
				bairroFuncionario = bairroFuncionarioText.getText().trim();
				cidadeFuncionario = cidadeFuncionarioText.getText().trim();
				estadoFuncionario = (String)estadoFuncionarioComboBox.getSelectedItem();
				telefoneFuncionario = telefoneFuncionarioText.getText().trim();
				valorFuncionario = Double.parseDouble(valorFuncionarioText.getText().trim());
				emailFuncionario = emailFuncionarioText.getText().trim();
				
				funcionario = new Funcionario(codigoFuncionario, nomeFuncionario, cargoFuncionario, rgFuncionario, cpfFuncionario, ruaFuncionario, numeroFuncionario, bairroFuncionario, cidadeFuncionario, estadoFuncionario, telefoneFuncionario, valorFuncionario, emailFuncionario);				
						
				this.fachada.incluirFuncionario(funcionario);

				JOptionPane.showMessageDialog(this, 
						"INCLUSÃO REALIZADA COM SUCESSO!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

				limparFuncionario();
				
			}
			catch (ExcecaoMRSystem e){
				JOptionPane.showMessageDialog(this, e.getMessage(), 
						"ERRO",JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(this,
					"INCLUSÃO NÃO REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void excluirFuncionarioButtonActionPerformed(ActionEvent evt) {
		System.out.println("excluirFuncionarioButton.actionPerformed, event="
			+ evt);
		//TODO add your code for excluirFuncionarioButton.actionPerformed
		
		int codigoFuncionario = 0;
		
		if(validaExcluirFuncionario() == true){
			
			try{		 
				
				codigoFuncionario = Integer.parseInt((String) codigoFuncionarioComboBox.getSelectedItem());
			
				int confirma = JOptionPane.showConfirmDialog(this, 
						"ESTE FUNCIONÁRIO E TODOS OS SEUS DADOS SERÃO APAGADOS !\nCONFIRMA ?", "CONFIRMAÇÃO", JOptionPane.OK_CANCEL_OPTION);
				
				if (confirma == JOptionPane.OK_OPTION) {
					
					this.fachada.excluirFuncionario(codigoFuncionario);
					
					JOptionPane.showMessageDialog(this,
							"EXCLUSÃO REALIZADA COM SUCESSO!", "MENSAGEM",JOptionPane.INFORMATION_MESSAGE);		
					
					limparFuncionario();
				}
				
			}
			catch (ExcecaoMRSystem e){
				JOptionPane.showMessageDialog(this, e.getMessage(), 
						"ERRO",JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(this,
					"EXCLUSÃO NÃO REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void consultarFuncionarioButtonActionPerformed(ActionEvent evt) {
		System.out.println("consultarFuncionarioButton.actionPerformed, event="
			+ evt);
		//TODO add your code for consultarFuncionarioButton.actionPerformed
		
		int codigoFuncionario = 999999999;
		
		Funcionario funcionario = null;
		
		if(validaConsultarFuncionario() == true){
			
			try{
				
				codigoFuncionario = Integer.parseInt((String) codigoFuncionarioComboBox.getSelectedItem());
				
				funcionario = this.fachada.consultarFuncionario(codigoFuncionario);					
				
				codigoFuncionarioComboBox.setSelectedItem(String.valueOf(funcionario.getCodigoFuncionario()));
			    nomeFuncionarioText.setText(funcionario.getNomeFuncionario());
			    cargoFuncionarioText.setText(funcionario.getCargoFuncionario());
			    rgFuncionarioText.setText(funcionario.getRgFuncionario());
			    cpfFuncionarioText.setText(funcionario.getCpfFuncionario());
			    ruaFuncionarioText.setText(funcionario.getRuaFuncionario());
			    numeroFuncionarioText.setText(funcionario.getNumeroFuncionario());
			    bairroFuncionarioText.setText(funcionario.getBairroFuncionario());
			    cidadeFuncionarioText.setText(funcionario.getCidadeFuncionario());
			    estadoFuncionarioComboBox.setSelectedItem(funcionario.getEstadoFuncionario());
			    telefoneFuncionarioText.setText(funcionario.getTelefoneFuncionario());
			    valorFuncionarioText.setText(String.valueOf(funcionario.getValorFuncionario()));
			    emailFuncionarioText.setText(funcionario.getEmailFuncionario());
			    
			    codigoFuncionarioComboBox.setEditable(false);
			    
			    incluirFuncionarioButton.setEnabled(false);
			    consultarFuncionarioButton.setEnabled(false);
			}
			catch (ExcecaoMRSystem e){
				JOptionPane.showMessageDialog(this, e.getMessage(), 
						"ERRO",JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(this,
					"CONSULTA NÃO REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void alterarFuncionarioButtonActionPerformed(ActionEvent evt) {
		System.out.println("alterarFuncionarioButton.actionPerformed, event="
			+ evt);
		//TODO add your code for alterarFuncionarioButton.actionPerformed
		
		int codigoFuncionario = 0;
		String nomeFuncionario = null;
		String cargoFuncionario = null;
		String rgFuncionario = null;
		String cpfFuncionario = null;
		String ruaFuncionario = null;
		String numeroFuncionario = null;
		String bairroFuncionario = null;
		String cidadeFuncionario = null;
		String estadoFuncionario = null;
		String telefoneFuncionario = null;
		double valorFuncionario = 0;
		String emailFuncionario = null;
		
		Funcionario funcionario = null;
		
		if(validaAlterarFuncionario() == true){
				
			try{
				
				codigoFuncionario = Integer.parseInt((String) codigoFuncionarioComboBox.getSelectedItem());
				nomeFuncionario = nomeFuncionarioText.getText().trim();
				cargoFuncionario = cargoFuncionarioText.getText().trim();
				rgFuncionario = rgFuncionarioText.getText().trim();
				cpfFuncionario = cpfFuncionarioText.getText().trim();
				ruaFuncionario = ruaFuncionarioText.getText().trim();
				numeroFuncionario = numeroFuncionarioText.getText().trim();
				bairroFuncionario = bairroFuncionarioText.getText().trim();
				cidadeFuncionario = cidadeFuncionarioText.getText().trim();
				estadoFuncionario = (String)estadoFuncionarioComboBox.getSelectedItem();
				telefoneFuncionario = telefoneFuncionarioText.getText().trim();
				valorFuncionario = Double.parseDouble(valorFuncionarioText.getText().trim());
				emailFuncionario = emailFuncionarioText.getText().trim();

				funcionario = new Funcionario(codigoFuncionario, nomeFuncionario, cargoFuncionario, rgFuncionario, cpfFuncionario, ruaFuncionario, numeroFuncionario, bairroFuncionario, cidadeFuncionario, estadoFuncionario, telefoneFuncionario, valorFuncionario, emailFuncionario);
				
		    	this.fachada.alterarFuncionario(funcionario);

				JOptionPane.showMessageDialog(this, 
						"ALTERAÇÃO REALIZADA COM SUCESSO!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

				limparFuncionario();
				
			}
			catch (ExcecaoMRSystem e){
				JOptionPane.showMessageDialog(this, e.getMessage(), 
						"ERRO",JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(this,
					"ALTERAÇÃO NÃO REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void limparFuncionarioButtonActionPerformed(ActionEvent evt) {
		System.out.println("limparFuncionarioButton.actionPerformed, event="
			+ evt);
		//TODO add your code for limparFuncionarioButton.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog
			(this, "DESEJA LIMPAR TODOS OS CAMPOS ?", "CONFIRMAÇÃO", JOptionPane.OK_CANCEL_OPTION);
	
		if (confirma == JOptionPane.OK_OPTION) {
		
			limparFuncionario();
		}
		
	}
	
	private void cancelarFuncionarioButtonActionPerformed(ActionEvent evt) {
		System.out.println("cancelarFuncionarioButton.actionPerformed, event="
			+ evt);
		//TODO add your code for cancelarFuncionarioButton.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog(this, 
				"DESEJA SAIR DO CADASTRO DE FUNCIONÁRIOS ?", "CONFIRMAÇÃO", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
	
	public void limparFuncionario(){
		
		try {

			List listaCodigoFuncionario = null;

			listaCodigoFuncionario = this.fachada.listaCodigoFuncionarioComboBox();

			if (listaCodigoFuncionario.size() >= 0) {
				codigoFuncionarioComboBox.removeAllItems();
			}
			for (int i = 0; i < listaCodigoFuncionario.size(); i++) {
				codigoFuncionarioComboBox.addItem(listaCodigoFuncionario.get(i));
			}
			
			List listaEstadoFuncionario = null;

			listaEstadoFuncionario = this.fachada.listaEstadoFuncionarioComboBox();

			if (listaEstadoFuncionario.size() >= 0) {
				estadoFuncionarioComboBox.removeAllItems();
			}
			for (int i = 0; i < listaEstadoFuncionario.size(); i++) {
				estadoFuncionarioComboBox.addItem(listaEstadoFuncionario.get(i));
			}

		}
		catch (ExcecaoMRSystem e){
			JOptionPane.showMessageDialog(this, e.getMessage(), 
					"ERRO",JOptionPane.ERROR_MESSAGE);
		}
		
		incluirFuncionarioButton.setEnabled(true);
		excluirFuncionarioButton.setEnabled(true);
		consultarFuncionarioButton.setEnabled(true);
		alterarFuncionarioButton.setEnabled(true);
		
		codigoFuncionarioComboBox.setEditable(false);
		codigoFuncionarioComboBox.setSelectedIndex(-1);
    	nomeFuncionarioText.setText("");
    	cargoFuncionarioText.setText("");
    	rgFuncionarioText.setText("");
    	cpfFuncionarioText.setText("");
    	ruaFuncionarioText.setText("");
    	numeroFuncionarioText.setText("");
    	bairroFuncionarioText.setText("");
    	cidadeFuncionarioText.setText("");
    	estadoFuncionarioComboBox.setSelectedIndex(-1);
    	telefoneFuncionarioText.setText("");
    	valorFuncionarioText.setText("");
    	emailFuncionarioText.setText("");
	}
	
	private boolean validaIncluirFuncionario(){	 		
		
		try{
			
			if (nomeFuncionarioText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"NOME NÃO INFORMADO. ", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (cargoFuncionarioText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"CARGO NÃO INFORMADO. ", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
	
			if (rgFuncionarioText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"RG NÃO INFORMADO. ", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
		
			if(cpfFuncionarioText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"CPF NÃO INFORMADO. ", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if(cpfFuncionarioText.getText().equals("00000000000") 
					|| cpfFuncionarioText.getText().equals("22222222222") 
					|| cpfFuncionarioText.getText().equals("33333333333") 
					|| cpfFuncionarioText.getText().equals("44444444444") 
					|| cpfFuncionarioText.getText().equals("55555555555") 
					|| cpfFuncionarioText.getText().equals("66666666666") 
					|| cpfFuncionarioText.getText().equals("77777777777") 
					|| cpfFuncionarioText.getText().equals("88888888888") 
					|| cpfFuncionarioText.getText().equals("99999999999")){
				JOptionPane.showMessageDialog
					(this, 	"NÚMERO DE CPF INVÁLIDO!\n" +
							"ESTE CPF NÃO EXISTE.",
								"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if(validacaoCPF(cpfFuncionarioText.getText()) == false){
				JOptionPane.showMessageDialog
					(this, 	"NÚMERO DE CPF INVÁLIDO!\n" +
							"ESTE CPF NÃO EXISTE.",
								"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
					
			if (ruaFuncionarioText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"RUA NÃO INFORMADA. ", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (numeroFuncionarioText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"NÚMERO NÃO INFORMADO. ", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (bairroFuncionarioText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"BAIRRO NÃO INFORMADO. ", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (cidadeFuncionarioText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"CIDADE NÃO INFORMADA. ", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if((estadoFuncionarioComboBox.getSelectedItem() == null) 
					|| (estadoFuncionarioComboBox.getSelectedItem().equals(""))){
				
				JOptionPane.showMessageDialog(this,
						"ESTADO NÃO INFORMADO. ", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (telefoneFuncionarioText.getText().trim().length() != 8){
				JOptionPane.showMessageDialog(this,
						"NÚMERO DE TELEFONE INVÁLIDO. ", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (valorFuncionarioText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"VALOR NÃO INFORMADO. ", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (emailFuncionarioText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"E-MAIL NÃO INFORMADO. ", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			int cont = 0;
			for(int i = 0; i < emailFuncionarioText.getText().length(); i++){
				if(emailFuncionarioText.getText().charAt(i) == '@'){
					cont++;
				}
			}
			if(cont == 0){
				JOptionPane.showMessageDialog(this,
						"E-MAIL INVÁLIDO.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			return true;
		}
		catch(Exception e){}
		
		return true;
	}
	
	private boolean validaExcluirFuncionario(){
		
		try{
			
			if ((codigoFuncionarioComboBox.getSelectedItem() == null) 
					|| (codigoFuncionarioComboBox.getSelectedItem().equals(""))){
				
				JOptionPane.showMessageDialog(this,
						"CÓDIGO NÃO INFORMADO.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			return true;
		}
		catch(Exception e){}
		
		return true;
	}
	
	private boolean validaConsultarFuncionario(){
		
		if (validaExcluirFuncionario() == false){
			return false;
		}
		else{		
			return true;
		}
	}
	
	private boolean validaAlterarFuncionario(){
		
		if (validaExcluirFuncionario() == false){
			return false;
		}
		else if (validaIncluirFuncionario() == false){
			return false;
		}
		else{		
			return true;
		}	
	}
	
	public static boolean validacaoCPF(String cpfFuncionarioText){
		if(cpfFuncionarioText.length() != 11){
			return false;
		}
		else{
			int d1 = 0;
			int d2 = 0;
			int digito1 = 0;
			int digito2 = 0;
			int resto = 0;
			int digitoCPF = 0;
			String nDigResult = null;

			for (int nCount = 1; nCount < (cpfFuncionarioText.length() - 1); nCount++){
				digitoCPF = Integer.valueOf (cpfFuncionarioText.substring((nCount - 1), nCount)).intValue();
				d1 += (( 11 - nCount ) * digitoCPF);
				d2 += (( 12 - nCount ) * digitoCPF);
			}
			   
			resto = (d1 % 11);

			if (resto < 2){
				digito1 = 0;
			}
			else{
				digito1 = (11 - resto);
			}
			   
			d2 += (2 * digito1);

			resto = (d2 % 11);

			if (resto < 2){
				digito2 = 0;
			}
			else{
				digito2 = (11 - resto);
			}
			   
			String nDigVerific = cpfFuncionarioText.substring ((cpfFuncionarioText.length() - 2), cpfFuncionarioText.length());

			nDigResult = (String.valueOf(digito1) + String.valueOf(digito2));

			return nDigVerific.equals(nDigResult);
		}
	}
	
	private void codigoFuncionarioComboBoxActionPerformed(ActionEvent evt) {
		System.out.println("codigoFuncionarioComboBox.actionPerformed, event="
			+ evt);
		//TODO add your code for codigoFuncionarioComboBox.actionPerformed
		
		consultarFuncionarioButton.setEnabled(true);
		
		nomeFuncionarioText.setText("");
    	cargoFuncionarioText.setText("");
    	rgFuncionarioText.setText("");
    	cpfFuncionarioText.setText("");
    	ruaFuncionarioText.setText("");
    	numeroFuncionarioText.setText("");
    	bairroFuncionarioText.setText("");
    	cidadeFuncionarioText.setText("");
    	estadoFuncionarioComboBox.setSelectedIndex(-1);
    	telefoneFuncionarioText.setText("");
    	valorFuncionarioText.setText("");
    	emailFuncionarioText.setText("");
	}
}
