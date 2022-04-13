package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import negocio.Cliente;
import negocio.Fachada;
import negocio.IFachada;
import negocio.Orcamento;
import negocio.excecao.ExcecaoInexistente;
import negocio.excecao.ExcecaoMRSystem;


public class GUICliente extends javax.swing.JDialog {
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	
	private IFachada fachada;
	
	private JLabel nomeClienteLabel;
	private JButton consultarClienteButton;
	private JButton alterarClienteButton;
	private JButton excluirClienteButton;
	private JButton incluirClienteButton;
	private JTextField bairroClienteText;
	private JLabel rgClienteLabel;
	private JLabel cadastroClientesLabel;
	private JComboBox codigoClienteComboBox;
	private JTextField cnpjClienteText;
	private JLabel cnpjClienteLabel;
	private JSeparator jSeparatorCadastroClientes2;
	private JSeparator jSeparatorCadastroClientes1;
	private JComboBox estadoClienteComboBox;
	private JTextField emailClienteText;
	private JLabel emailClienteLabel;
	private JButton cancelarClienteButton;
	private JButton limparClienteButton;
	private JTextField cpfClienteText;
	private JLabel cpfClienteLabel;
	private JTextField rgClienteText;
	private JLabel estadoClienteLabel;
	private JTextField cidadeClienteText;
	private JLabel cidadeClienteLabel;
	private JLabel bairroClienteLabel;
	private JTextField numeroClienteText;
	private JLabel numeroClienteLabel;
	private JTextField telefoneClienteText;
	private JTextField ruaClienteText;
	private JTextField nomeClienteText;
	private JLabel telefoneClienteLabel;
	private JLabel ruaClienteLabel;
	private JLabel codigoClienteLabel;

	/**
	* Auto-generated main method to display this JFrame
	*/
	
	public GUICliente() {		
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			this.getContentPane().setLayout(null);
			this.setTitle("Cadastro de Clientes - Dados do Cliente");
			this.setResizable(false);
			this.setModal(true);
			this.setLocation(new java.awt.Point(200, 100));
			{
				codigoClienteLabel = new JLabel();
				this.getContentPane().add(codigoClienteLabel);
				codigoClienteLabel.setText("Código:");
				codigoClienteLabel.setBounds(21, 49, 49, 28);
				codigoClienteLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				nomeClienteLabel = new JLabel();
				this.getContentPane().add(nomeClienteLabel);
				nomeClienteLabel.setText("Nome:");
				nomeClienteLabel.setBounds(21, 84, 42, 28);
				nomeClienteLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				ruaClienteLabel = new JLabel();
				this.getContentPane().add(ruaClienteLabel);
				ruaClienteLabel.setText("Rua:");
				ruaClienteLabel.setBounds(21, 119, 35, 28);
				ruaClienteLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				telefoneClienteLabel = new JLabel();
				this.getContentPane().add(telefoneClienteLabel);
				telefoneClienteLabel.setText("Telefone:");
				telefoneClienteLabel.setBounds(21, 189, 63, 28);
				telefoneClienteLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				nomeClienteText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**************************************************");
					format_textField.setValidCharacters(" ÁáÂâÃãÉéÊêÍíÎîÓóÔôÕõÚúÛûAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzçÇ");
					nomeClienteText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				this.getContentPane().add(nomeClienteText);
				nomeClienteText.setBounds(84, 84, 301, 28);
			}
			{
				ruaClienteText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**************************************************");
					format_textField.setValidCharacters("0123456789 ÁáÂâÃãÉéÊêÍíÎîÓóÔôÕõÚúÛûAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzçÇ,.-");
					ruaClienteText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				this.getContentPane().add(ruaClienteText);
				ruaClienteText.setBounds(84, 119, 350, 28);
			}
			{
				telefoneClienteText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("********");
					format_textField.setValidCharacters("0123456789 ");
					telefoneClienteText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				this.getContentPane().add(telefoneClienteText);
				telefoneClienteText.setBounds(84, 189, 224, 28);
			}
			{
				incluirClienteButton = new JButton();
				this.getContentPane().add(incluirClienteButton);
				incluirClienteButton.setText("Incluir");
				incluirClienteButton.setMnemonic(KeyEvent.VK_I);
				incluirClienteButton.setBounds(21, 280, 91, 28);
				incluirClienteButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						incluirClienteButtonActionPerformed(evt);
					}
				});
			}
			{
				excluirClienteButton = new JButton();
				this.getContentPane().add(excluirClienteButton);
				excluirClienteButton.setText("Excluir");
				excluirClienteButton.setMnemonic(KeyEvent.VK_E);
				excluirClienteButton.setBounds(119, 280, 91, 28);
				excluirClienteButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						excluirClienteButtonActionPerformed(evt);
					}
				});
			}
			{
				alterarClienteButton = new JButton();
				this.getContentPane().add(alterarClienteButton);
				alterarClienteButton.setText("Alterar");
				alterarClienteButton.setMnemonic(KeyEvent.VK_A);
				alterarClienteButton.setBounds(315, 280, 91, 28);
				alterarClienteButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						alterarClienteButtonActionPerformed(evt);
					}
				});
			}
			{
				consultarClienteButton = new JButton();
				this.getContentPane().add(consultarClienteButton);
				consultarClienteButton.setText("Consultar");
				consultarClienteButton.setMnemonic(KeyEvent.VK_C);
				consultarClienteButton.setBounds(217, 280, 91, 28);
				consultarClienteButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						consultarClienteButtonActionPerformed(evt);
					}
				});
			}
			{
				numeroClienteLabel = new JLabel();
				getContentPane().add(numeroClienteLabel);
				numeroClienteLabel.setText("Número:");
				numeroClienteLabel.setBounds(455, 119, 56, 28);
				numeroClienteLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				bairroClienteLabel = new JLabel();
				getContentPane().add(bairroClienteLabel);
				bairroClienteLabel.setText("Bairro:");
				bairroClienteLabel.setBounds(21, 154, 42, 28);
				bairroClienteLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				bairroClienteText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("******************************");
					format_textField.setValidCharacters("0123456789 ÁáÂâÃãÉéÊêÍíÎîÓóÔôÕõÚúÛûAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzçÇ");
					bairroClienteText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(bairroClienteText);
				bairroClienteText.setBounds(84, 154, 224, 28);
			}
			{
				cidadeClienteLabel = new JLabel();
				getContentPane().add(cidadeClienteLabel);
				cidadeClienteLabel.setText("Cidade:");
				cidadeClienteLabel.setBounds(329, 154, 49, 28);
				cidadeClienteLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				cidadeClienteText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("******************************");
					format_textField.setValidCharacters(" ÁáÂâÃãÉéÊêÍíÎîÓóÔôÕõÚúÛûAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzçÇ");
					cidadeClienteText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(cidadeClienteText);
				cidadeClienteText.setBounds(378, 154, 224, 28);
			}
			{
				estadoClienteLabel = new JLabel();
				getContentPane().add(estadoClienteLabel);
				estadoClienteLabel.setText("Estado:");
				estadoClienteLabel.setBounds(329, 189, 49, 28);
				estadoClienteLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				rgClienteLabel = new JLabel();
				getContentPane().add(rgClienteLabel);
				rgClienteLabel.setText("RG:");
				rgClienteLabel.setBounds(196, 49, 28, 28);
				rgClienteLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				rgClienteText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("***************");
					format_textField.setValidCharacters("0123456789 ");
					rgClienteText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(rgClienteText);
				rgClienteText.setBounds(224, 49, 161, 28);
			}
			{
				cpfClienteLabel = new JLabel();
				getContentPane().add(cpfClienteLabel);
				cpfClienteLabel.setText("CPF:");
				cpfClienteLabel.setBounds(406, 49, 35, 28);
				cpfClienteLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				cpfClienteText = new JTextField();
				getContentPane().add(cpfClienteText);
				cpfClienteText.setBounds(448, 49, 154, 28);
			}
			{
				limparClienteButton = new JButton();
				getContentPane().add(limparClienteButton);
				limparClienteButton.setText("Limpar");
				limparClienteButton.setMnemonic(KeyEvent.VK_L);
				limparClienteButton.setBounds(413, 280, 91, 28);
				limparClienteButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						limparClienteButtonActionPerformed(evt);
					}
				});
			}
			{
				cancelarClienteButton = new JButton();
				getContentPane().add(cancelarClienteButton);
				cancelarClienteButton.setText("Cancelar");
				cancelarClienteButton.setBounds(511, 280, 91, 28);
				cancelarClienteButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						cancelarClienteButtonActionPerformed(evt);
					}
				});
			}
			{
				emailClienteLabel = new JLabel();
				getContentPane().add(emailClienteLabel);
				emailClienteLabel.setText("e-mail(s):");
				emailClienteLabel.setBounds(21, 224, 63, 28);
				emailClienteLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				emailClienteText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**************************************************");
					emailClienteText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(emailClienteText);
				emailClienteText.setBounds(84, 224, 518, 28);
			}
			{
				estadoClienteComboBox = new JComboBox();
				getContentPane().add(estadoClienteComboBox);
				estadoClienteComboBox.setBounds(378, 189, 224, 28);
				estadoClienteComboBox.setMaximumRowCount(6);
				estadoClienteComboBox.setEditable(false);
			}
			{
				jSeparatorCadastroClientes1 = new JSeparator();
				getContentPane().add(jSeparatorCadastroClientes1);
				jSeparatorCadastroClientes1.setBounds(0, 35, 623, 14);
			}
			{
				jSeparatorCadastroClientes2 = new JSeparator();
				getContentPane().add(jSeparatorCadastroClientes2);
				jSeparatorCadastroClientes2.setBounds(0, 266, 623, 14);
			}
			{
				cnpjClienteLabel = new JLabel();
				getContentPane().add(cnpjClienteLabel);
				cnpjClienteLabel.setText("CNPJ:");
				cnpjClienteLabel.setBounds(406, 84, 42, 28);
				cnpjClienteLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				cnpjClienteText = new JTextField();
				getContentPane().add(cnpjClienteText);
				cnpjClienteText.setBounds(448, 84, 154, 28);
			}
			{
				numeroClienteText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**********");
					format_textField.setValidCharacters("0123456789 ");
					numeroClienteText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(numeroClienteText);
				numeroClienteText.setBounds(511, 119, 91, 28);
				{
					codigoClienteComboBox = new JComboBox();
					getContentPane().add(codigoClienteComboBox);
					codigoClienteComboBox.setBounds(84, 49, 63, 28);
					codigoClienteComboBox.setSize(91, 28);
					codigoClienteComboBox.setMaximumRowCount(6);
					codigoClienteComboBox
						.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							codigoClienteComboBoxActionPerformed(evt);
						}
						});
				}
			}
			{
				cadastroClientesLabel = new JLabel();
				getContentPane().add(cadastroClientesLabel);
				cadastroClientesLabel.setText("Cadastro de Clientes");
				cadastroClientesLabel.setBounds(210, 7, 210, 21);
				cadastroClientesLabel.setFont(new java.awt.Font("Verdana",3,18));
			}
			pack();
			this.setSize(631, 356);
			
			limparCliente();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		GUICliente inst = new GUICliente();
		inst.setVisible(true);
	}
		
	private void incluirClienteButtonActionPerformed(ActionEvent evt) {
		System.out.println("incluirClienteButton.actionPerformed, event=" + evt);
		
		//TODO add your code for incluirClienteButton.actionPerformed
		
		int codigoCliente = 0;
		String nomeCliente = null;
		String rgCliente = null;
		String cpfCliente = null;
		String cnpjCliente = null;
		String ruaCliente = null;
		String numeroCliente = null;
		String bairroCliente = null;
		String cidadeCliente = null;
		String estadoCliente = null;
		String telefoneCliente = null;
		String emailCliente = null;
		
		Cliente cliente = null;
		
		if(validaIncluirCliente() == true){
			
			try{
				
				codigoCliente = 1;
				nomeCliente = nomeClienteText.getText().trim();
				rgCliente = rgClienteText.getText().trim();
				cpfCliente = cpfClienteText.getText().trim();
				cnpjCliente = cnpjClienteText.getText().trim();
				ruaCliente = ruaClienteText.getText().trim();
				numeroCliente = numeroClienteText.getText().trim();
				bairroCliente = bairroClienteText.getText().trim();
				cidadeCliente = cidadeClienteText.getText().trim();
				estadoCliente = (String) estadoClienteComboBox.getSelectedItem();
				telefoneCliente = telefoneClienteText.getText().trim();
				emailCliente = emailClienteText.getText().trim().toLowerCase();
				
				cliente = new Cliente(codigoCliente, nomeCliente, rgCliente, cpfCliente, cnpjCliente, ruaCliente, numeroCliente, bairroCliente, cidadeCliente, estadoCliente, telefoneCliente, emailCliente);				
						
				this.fachada.incluirCliente(cliente);

				JOptionPane.showMessageDialog(this, 
						"INCLUSÃO REALIZADA COM SUCESSO!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

				limparCliente();
				
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
	
	private void excluirClienteButtonActionPerformed(ActionEvent evt) {
		System.out.println("excluirClienteButton.actionPerformed, event=" + evt);
		
		//TODO add your code for excluirClienteButton.actionPerformed
		
		int codigoCliente = 0;
		
		int codigoOrcamento = 0;
		String nomeCliente = null;
		String nomeClienteOrcamento = null;
		
		Cliente cliente = null;
		Orcamento orcamento = null;
		
		if(validaExcluirCliente() == true){
			
			try{
				
				codigoCliente = Integer.parseInt((String) codigoClienteComboBox.getSelectedItem());
				
				cliente = this.fachada.consultarCliente(codigoCliente);
				
				nomeCliente = cliente.getNomeCliente().trim();
				
				orcamento = this.fachada.consultarOrcamento(codigoOrcamento, nomeCliente);
				
				nomeClienteOrcamento = orcamento.getNomeCliente().trim();
			}
			catch (ExcecaoInexistente e){}
			catch (ExcecaoMRSystem e){
				JOptionPane.showMessageDialog(this, e.getMessage(), 
						"ERRO",JOptionPane.ERROR_MESSAGE);
			}
			try{
				if((nomeCliente.equals(nomeClienteOrcamento))){
					
					JOptionPane.showMessageDialog(this,
							"ESTE CLIENTE CONTÉM UM OU MAIS ORÇAMENTOS CADASTRADOS!", "ATENÇÃO",JOptionPane.WARNING_MESSAGE);
					JOptionPane.showMessageDialog(this,
							"EXCLUSÃO NÃO REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
				}
				else{
					int confirma = JOptionPane.showConfirmDialog(this, 
							"ESTE CLIENTE E TODOS OS SEUS DADOS SERÃO APAGADOS !\nCONFIRMA ?", "CONFIRMAÇÃO",JOptionPane.OK_CANCEL_OPTION);
					
					if (confirma == JOptionPane.OK_OPTION) {
						
						this.fachada.excluirCliente(codigoCliente);
						
						JOptionPane.showMessageDialog(this,
								"EXCLUSÃO REALIZADA COM SUCESSO!", "MENSAGEM",JOptionPane.INFORMATION_MESSAGE);		
						
						limparCliente();
					}
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
	
	private void consultarClienteButtonActionPerformed(ActionEvent evt) {
		System.out.println("consultarClienteButton.actionPerformed, event=" + evt);
		
		//TODO add your code for consultarClienteButton.actionPerformed
		
		int codigoCliente = 999999999;
		
		Cliente cliente = null;
		
		if(validaConsultarCliente() == true){
			
			try{
				
				codigoCliente = Integer.parseInt((String) codigoClienteComboBox.getSelectedItem());
				
				cliente = this.fachada.consultarCliente(codigoCliente);					
				
				codigoClienteComboBox.setSelectedItem(String.valueOf(cliente.getCodigoCliente()));
			    nomeClienteText.setText(cliente.getNomeCliente());
			    rgClienteText.setText(cliente.getRgCliente());
			    cpfClienteText.setText(cliente.getCpfCliente());
			    cnpjClienteText.setText(cliente.getCnpjCliente());
			    ruaClienteText.setText(cliente.getRuaCliente());
			    numeroClienteText.setText(cliente.getNumeroCliente());
			    bairroClienteText.setText(cliente.getBairroCliente());
			    cidadeClienteText.setText(cliente.getCidadeCliente());
			    estadoClienteComboBox.setSelectedItem(cliente.getEstadoCliente());
			    telefoneClienteText.setText(cliente.getTelefoneCliente());
			    emailClienteText.setText(cliente.getEmailCliente());
			    
			    codigoClienteComboBox.setEditable(false);
			    
			    incluirClienteButton.setEnabled(false);
			    consultarClienteButton.setEnabled(false);
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
	
	private void alterarClienteButtonActionPerformed(ActionEvent evt) {
		System.out.println("alterarClienteButton.actionPerformed, event=" + evt);
		
		//TODO add your code for alterarClienteButton.actionPerformed
		
		int codigoCliente = 0;
		String nomeCliente = null;
		String rgCliente = null;
		String cpfCliente = null;
		String cnpjCliente = null;
		String ruaCliente = null;
		String numeroCliente = null;
		String bairroCliente = null;
		String cidadeCliente = null;
		String estadoCliente = null;
		String telefoneCliente = null;
		String emailCliente = null;
		
		Cliente cliente = null;
		
		if(validaAlterarCliente() == true){
				
			try{
				
				codigoCliente = Integer.parseInt((String) codigoClienteComboBox.getSelectedItem());
				nomeCliente = nomeClienteText.getText().trim();
				rgCliente = rgClienteText.getText().trim();
				cpfCliente = cpfClienteText.getText().trim();
				cnpjCliente = cnpjClienteText.getText().trim();
				ruaCliente = ruaClienteText.getText().trim();
				numeroCliente = numeroClienteText.getText().trim();
				bairroCliente = bairroClienteText.getText().trim();
				cidadeCliente = cidadeClienteText.getText().trim();
				estadoCliente = (String)estadoClienteComboBox.getSelectedItem();
				telefoneCliente = telefoneClienteText.getText().trim();
				emailCliente = emailClienteText.getText().trim().toLowerCase();

				cliente = new Cliente(codigoCliente, nomeCliente, rgCliente, cpfCliente, cnpjCliente, ruaCliente, numeroCliente, bairroCliente, cidadeCliente, estadoCliente, telefoneCliente, emailCliente);
				
		    	this.fachada.alterarCliente(cliente);

				JOptionPane.showMessageDialog(this, 
						"ALTERAÇÃO REALIZADA COM SUCESSO!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

				limparCliente();
				
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
	
	private void limparClienteButtonActionPerformed(ActionEvent evt) {
		System.out.println("limparClienteButton.actionPerformed, event=" + evt);
		//TODO add your code for limparClienteButton.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog(this, 
				"DESEJA LIMPAR TODOS OS CAMPOS ?", "CONFIRMAÇÃO", JOptionPane.OK_CANCEL_OPTION);

		if (confirma == JOptionPane.OK_OPTION) {
	
			limparCliente();
		}
	}
	
	private void cancelarClienteButtonActionPerformed(ActionEvent evt) {
		System.out.println("cancelarClienteButton.actionPerformed, event="
			+ evt);
		//TODO add your code for cancelarClienteButton.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog(this, 
				"DESEJA SAIR DO CADASTRO DE CLIENTES ?", "CONFIRMAÇÃO", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
	
	public void limparCliente(){
		
		try {

			List listaCodigoCliente = null;

			listaCodigoCliente = this.fachada.listaCodigoClienteComboBox();

			if (listaCodigoCliente.size() >= 0) {
				codigoClienteComboBox.removeAllItems();
			}
			for (int i = 0; i < listaCodigoCliente.size(); i++) {
				codigoClienteComboBox.addItem(listaCodigoCliente.get(i));
			}
			
			List listaEstadoCliente = null;

			listaEstadoCliente = this.fachada.listaEstadoClienteComboBox();

			if (listaEstadoCliente.size() >= 0) {
				
				estadoClienteComboBox.removeAllItems();
			}
			for (int i = 0; i < listaEstadoCliente.size(); i++) {
				
				estadoClienteComboBox.addItem(listaEstadoCliente.get(i));
			}

		}
		catch (ExcecaoMRSystem e){
			JOptionPane.showMessageDialog(this, e.getMessage(), 
					"ERRO",JOptionPane.ERROR_MESSAGE);
		}
		
		incluirClienteButton.setEnabled(true);
		excluirClienteButton.setEnabled(true);
		consultarClienteButton.setEnabled(true);
		alterarClienteButton.setEnabled(true);
		
		codigoClienteComboBox.setEditable(false);
		codigoClienteComboBox.setSelectedIndex(-1);
    	nomeClienteText.setText("");
    	rgClienteText.setText("");
    	cpfClienteText.setText("");
    	cnpjClienteText.setText("");
    	ruaClienteText.setText("");
    	numeroClienteText.setText("");
    	bairroClienteText.setText("");
    	cidadeClienteText.setText("");
    	estadoClienteComboBox.setSelectedIndex(-1);
    	telefoneClienteText.setText("");
    	emailClienteText.setText("");
	}
	
	private boolean validaIncluirCliente(){	 		
		
		try{
			
			if (nomeClienteText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"NOME NÃO INFORMADO.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (rgClienteText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"RG NÃO INFORMADO. ", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
		
			if((cpfClienteText.getText().trim().equalsIgnoreCase("")) 
					&& (cnpjClienteText.getText().trim().equalsIgnoreCase(""))){
				
				JOptionPane.showMessageDialog(this,
						"CPF OU CNPJ NÃO INFORMADO.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if((cpfClienteText.getText().trim() != null) 
					&& (cnpjClienteText.getText().trim().equalsIgnoreCase(""))){
				
				if(cpfClienteText.getText().equals("00000000000") 
						|| cpfClienteText.getText().equals("22222222222") 
						|| cpfClienteText.getText().equals("33333333333") 
						|| cpfClienteText.getText().equals("44444444444") 
						|| cpfClienteText.getText().equals("55555555555") 
						|| cpfClienteText.getText().equals("66666666666") 
						|| cpfClienteText.getText().equals("77777777777") 
						|| cpfClienteText.getText().equals("88888888888") 
						|| cpfClienteText.getText().equals("99999999999")){
					
					JOptionPane.showMessageDialog
						(this, 	"NÚMERO DE CPF INVÁLIDO!\n" +
								"ESTE CPF NÃO EXISTE.",
									"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
					return false;
				}
				else if(validacaoCPF(cpfClienteText.getText()) == false){					
					JOptionPane.showMessageDialog
						(this, 	"NÚMERO DE CPF INVÁLIDO!\n" +
								"ESTE CPF NÃO EXISTE.",
									"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
					return false;
				}
			}
			else if((cpfClienteText.getText().trim().equalsIgnoreCase("")) 
					&& (cnpjClienteText.getText().trim() != null)){
				
				if(validacaoCNPJ(cnpjClienteText.getText()) == false){
					JOptionPane.showMessageDialog
						(this, 	"NÚMERO DE CNPJ INVÁLIDO!\n" +
								"ESTE CNPJ NÃO EXISTE.",
									"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
					return false;
				}
			}
			else{
				JOptionPane.showMessageDialog
					(this, 	"INFORME APENAS UM CPF OU UM CNPJ.",
								"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
					
			if (ruaClienteText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"RUA NÃO INFORMADA.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (numeroClienteText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"NÚMERO NÃO INFORMADO.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (bairroClienteText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"BAIRRO NÃO INFORMADO.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (cidadeClienteText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"CIDADE NÃO INFORMADA.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if((estadoClienteComboBox.getSelectedItem() == null) 
					|| (estadoClienteComboBox.getSelectedItem().equals(""))){
				
				JOptionPane.showMessageDialog(this,
						"ESTADO NÃO INFORMADO.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (telefoneClienteText.getText().trim().length() != 8){
				JOptionPane.showMessageDialog(this,
						"NÚMERO DE TELEFONE INVÁLIDO.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (emailClienteText.getText().trim().equalsIgnoreCase("")){
				JOptionPane.showMessageDialog(this,
						"E-MAIL NÃO INFORMADO.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			int cont = 0;
			for(int i = 0; i < emailClienteText.getText().length(); i++){
				if(emailClienteText.getText().charAt(i) == '@'){
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
	
	private boolean validaExcluirCliente(){
		
		try{
			
			if ((codigoClienteComboBox.getSelectedItem() == null) 
					|| (codigoClienteComboBox.getSelectedItem().equals(""))){
				
				JOptionPane.showMessageDialog(this,
						"CÓDIGO NÃO INFORMADO.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			return true;
		}
		catch(Exception e){}
		
		return true;
	}
	
	private boolean validaConsultarCliente(){
		
		if (validaExcluirCliente() == false){
			return false;
		}
		else{		
			return true;
		}
	}
	
	private boolean validaAlterarCliente(){
		
		if (validaExcluirCliente() == false){
			return false;
		}
		else if (validaIncluirCliente() == false){
			return false;
		}
		else{		
			return true;
		}	
	}
	
	public static boolean validacaoCPF(String cpfClienteText){
		if(cpfClienteText.length() != 11){
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

			for (int nCount = 1; nCount < (cpfClienteText.length() - 1); nCount++){
				digitoCPF = Integer.valueOf (cpfClienteText.substring((nCount - 1), nCount)).intValue();
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
			   
			String nDigVerific = cpfClienteText.substring ((cpfClienteText.length() - 2), cpfClienteText.length());

			nDigResult = (String.valueOf(digito1) + String.valueOf(digito2));

			return nDigVerific.equals(nDigResult);
		}
	}
	
	public static boolean validacaoCNPJ(String cnpjClienteText){
		if (cnpjClienteText.length() != 14){
	         return false;
		}
		else{
			int soma = 0;
		    int dig = 0;
		    String cnpj_calc = cnpjClienteText.substring(0,12);

		    char[] chr_cnpj = cnpjClienteText.toCharArray();

		    for(int i = 0; i < 4; i++){
		    	if (((chr_cnpj[i] - 48) >= 0) && ((chr_cnpj[i] - 48) <= 9)){
		    		soma += ((chr_cnpj[i] - 48) * (6 - (i + 1)));
		    	}
		    }
		    
		    for(int i = 0; i < 8; i++){
		    	if (((chr_cnpj[i + 4] - 48) >= 0) && ((chr_cnpj[i + 4] - 48) <= 9)){
		    		 soma += ((chr_cnpj[i + 4] - 48) * (10 - (i + 1)));
		    	}
		    }
		    dig = 11 - (soma % 11);
		    cnpj_calc += ( dig == 10 || dig == 11 ) ? "0" : Integer.toString(dig);
		    
		    
		    soma = 0;		      
		    for (int i = 0; i < 5; i++){
		    	if (((chr_cnpj[i] - 48) >= 0) && ((chr_cnpj[i] - 48) <= 9)){
		    		soma += ((chr_cnpj[i] - 48) * (7 - (i + 1))) ;
		    	}
		    }
		    
		    for (int i = 0; i < 8; i++){
		    	if (((chr_cnpj[i + 5] - 48) >= 0) && ((chr_cnpj[i + 5] - 48) <= 9)){
		    		 soma += ((chr_cnpj[i + 5] - 48) * (10 - (i + 1))) ;
		    	}
		    }
		    dig = 11 - (soma % 11);
		    cnpj_calc += ( dig == 10 || dig == 11 ) ? "0" : Integer.toString(dig);
		    return cnpjClienteText.equals(cnpj_calc);
		}
    }
    
	private void codigoClienteComboBoxActionPerformed(ActionEvent evt) {
		System.out.println("codigoClienteComboBox.actionPerformed, event="
			+ evt);
		//TODO add your code for codigoClienteComboBox.actionPerformed
		
		consultarClienteButton.setEnabled(true);
		
		nomeClienteText.setText("");
    	rgClienteText.setText("");
    	cpfClienteText.setText("");
    	cnpjClienteText.setText("");
    	ruaClienteText.setText("");
    	numeroClienteText.setText("");
    	bairroClienteText.setText("");
    	cidadeClienteText.setText("");
    	estadoClienteComboBox.setSelectedIndex(-1);
    	telefoneClienteText.setText("");
    	emailClienteText.setText("");
	}
}
