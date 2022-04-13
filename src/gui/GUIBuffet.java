package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import negocio.Buffet;
import negocio.Fachada;
import negocio.IFachada;
import negocio.excecao.ExcecaoInexistente;
import negocio.excecao.ExcecaoMRSystem;


public class GUIBuffet extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel cadastroBuffetsLabel;
	private JLabel valorBuffetLabel;
	private JLabel descricaoBuffetLabel;
	private JButton alterarBuffetButton;
	private JLabel valorBuffetPessoaLabel;
	private JTextArea descricaoBuffetTextArea;
	private JScrollPane descricaoBuffetScrollPane;
	private JComboBox codigoBuffetComboBox;
	private JButton limparBuffetButton;
	private JTextField nomeBuffetText;
	private JLabel nomeBuffetLabel;
	private JButton cancelarBuffetButton;
	private JButton consultarBuffetButton;
	private JButton excluirBuffetButton;
	private JButton incluirBuffetButton;
	private JSeparator jSeparatorCadastroBuffets2;
	private JTextField valorBuffetText;
	private JTextField tipoBuffetText;
	private JLabel tipoBuffetLabel;
	private JLabel codigoBuffetLabel;
	private JSeparator jSeparatorCadastroBuffets1;
	
	private IFachada fachada;

	public static void main(String[] args) {
		GUIBuffet inst = new GUIBuffet();
		inst.setVisible(true);
	}
	
	public GUIBuffet() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			getContentPane().setLayout(null);
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			this.setTitle("Cadastro de Buffets - Dados do Buffet");
			this.setResizable(false);
			this.setLocation(new java.awt.Point(200, 100));
			this.setModal(true);
			{
				cadastroBuffetsLabel = new JLabel();
				getContentPane().add(cadastroBuffetsLabel);
				cadastroBuffetsLabel.setText("Cadastro de Buffets");
				cadastroBuffetsLabel.setBounds(210, 7, 203, 21);
				cadastroBuffetsLabel.setFont(new java.awt.Font("Verdana",3,18));
			}
			{
				jSeparatorCadastroBuffets1 = new JSeparator();
				getContentPane().add(jSeparatorCadastroBuffets1);
				jSeparatorCadastroBuffets1.setBounds(0, 35, 623, 14);
			}
			{
				codigoBuffetLabel = new JLabel();
				getContentPane().add(codigoBuffetLabel);
				codigoBuffetLabel.setText("CÛdigo:");
				codigoBuffetLabel.setBounds(21, 49, 49, 28);
				codigoBuffetLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				tipoBuffetLabel = new JLabel();
				getContentPane().add(tipoBuffetLabel);
				tipoBuffetLabel.setBounds(217, 49, 35, 28);
				tipoBuffetLabel.setText("Tipo:");
				tipoBuffetLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				tipoBuffetText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**");
					format_textField.setValidCharacters("0123456789 ");
					tipoBuffetText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(tipoBuffetText);
				tipoBuffetText.setBounds(259, 49, 98, 28);
			}
			{
				valorBuffetLabel = new JLabel();
				getContentPane().add(valorBuffetLabel);
				valorBuffetLabel.setText("Valor (R$):");
				valorBuffetLabel.setBounds(385, 49, 70, 28);
				valorBuffetLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				descricaoBuffetLabel = new JLabel();
				getContentPane().add(descricaoBuffetLabel);
				descricaoBuffetLabel.setText("DescriÁ„o:");
				descricaoBuffetLabel.setBounds(21, 140, 70, 28);
				descricaoBuffetLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				valorBuffetText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("*******");
					format_textField.setValidCharacters("0123456789. ");
					valorBuffetText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(valorBuffetText);
				valorBuffetText.setBounds(455, 49, 147, 28);
			}
			{
				nomeBuffetLabel = new JLabel();
				getContentPane().add(nomeBuffetLabel);
				nomeBuffetLabel.setText("Nome:");
				nomeBuffetLabel.setBounds(21, 105, 49, 28);
				nomeBuffetLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				nomeBuffetText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**************************************************");
					format_textField.setValidCharacters("1234567890 ¡·¬‚√„…È ÍÕÌŒÓ”Û‘Ù’ı⁄˙€˚AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzÁ«.,-™∫");
					nomeBuffetText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(nomeBuffetText);
				nomeBuffetText.setBounds(91, 105, 511, 28);
			}
			{
				jSeparatorCadastroBuffets2 = new JSeparator();
				getContentPane().add(jSeparatorCadastroBuffets2);
				jSeparatorCadastroBuffets2.setBounds(0, 259, 623, 14);
			}
			{
				incluirBuffetButton = new JButton();
				getContentPane().add(incluirBuffetButton);
				incluirBuffetButton.setText("Incluir");
				incluirBuffetButton.setMnemonic(KeyEvent.VK_I);
				incluirBuffetButton.setBounds(21, 273, 91, 28);
				incluirBuffetButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						incluirBuffetButtonActionPerformed(evt);
					}
				});
			}
			{
				excluirBuffetButton = new JButton();
				getContentPane().add(excluirBuffetButton);
				excluirBuffetButton.setText("Excluir");
				excluirBuffetButton.setMnemonic(KeyEvent.VK_E);
				excluirBuffetButton.setBounds(119, 273, 91, 28);
				excluirBuffetButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						excluirBuffetButtonActionPerformed(evt);
					}
				});
			}
			{
				consultarBuffetButton = new JButton();
				getContentPane().add(consultarBuffetButton);
				consultarBuffetButton.setText("Consultar");
				consultarBuffetButton.setMnemonic(KeyEvent.VK_C);
				consultarBuffetButton.setBounds(217, 273, 91, 28);
				consultarBuffetButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						consultarBuffetButtonActionPerformed(evt);
					}
				});
			}
			{
				alterarBuffetButton = new JButton();
				getContentPane().add(alterarBuffetButton);
				alterarBuffetButton.setText("Alterar");
				alterarBuffetButton.setMnemonic(KeyEvent.VK_A);
				alterarBuffetButton.setBounds(315, 273, 91, 28);
				alterarBuffetButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						alterarBuffetButtonActionPerformed(evt);
					}
				});
			}
			{
				limparBuffetButton = new JButton();
				getContentPane().add(limparBuffetButton);
				limparBuffetButton.setText("Limpar");
				limparBuffetButton.setMnemonic(KeyEvent.VK_L);
				limparBuffetButton.setBounds(413, 273, 91, 28);
				limparBuffetButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						limparBuffetButtonActionPerformed(evt);
					}
				});
			}
			{
				cancelarBuffetButton = new JButton();
				getContentPane().add(cancelarBuffetButton);
				cancelarBuffetButton.setText("Cancelar");
				cancelarBuffetButton.setMnemonic(KeyEvent.VK_ESCAPE);
				cancelarBuffetButton.setBounds(511, 273, 91, 28);
				cancelarBuffetButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						cancelarBuffetButtonActionPerformed(evt);
					}
				});
			}
			{
				codigoBuffetComboBox = new JComboBox();
				getContentPane().add(codigoBuffetComboBox);
				codigoBuffetComboBox.setBounds(91, 49, 63, 28);
				codigoBuffetComboBox.setSize(98, 28);
				codigoBuffetComboBox.setMaximumRowCount(6);
				codigoBuffetComboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						codigoBuffetComboBoxActionPerformed(evt);
					}
				});
			}
			{
				descricaoBuffetScrollPane = new JScrollPane();
				getContentPane().add(descricaoBuffetScrollPane);
				descricaoBuffetScrollPane.setBounds(91, 140, 511, 105);
			}
			{
				valorBuffetPessoaLabel = new JLabel();
				getContentPane().add(valorBuffetPessoaLabel);
				valorBuffetPessoaLabel.setText("valor por pessoa");
				valorBuffetPessoaLabel.setBounds(490, 77, 84, 14);
				valorBuffetPessoaLabel.setFont(new java.awt.Font("Tahoma",1,10));
			}
			{
				descricaoBuffetTextArea = new JTextArea();
				descricaoBuffetScrollPane.setViewportView(descricaoBuffetTextArea);
				descricaoBuffetTextArea.setLineWrap(true);
				descricaoBuffetTextArea.setWrapStyleWord(true);
				descricaoBuffetTextArea.setDocument(doc);
				descricaoBuffetTextArea.setBounds(98, 91, 490, 105);
				descricaoBuffetTextArea.setPreferredSize(new java.awt.Dimension(493, 105));
			}
			pack();
			this.setSize(631, 349);
			
			limparBuffet();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Limite do JTextArea da DescriÁ„o.
	PlainDocument doc = new PlainDocument(){
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		int limite = 255; 
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{ 
            if(offs < limite){ 
                super.insertString(offs, str, a); 
            } 
        } 
    };
	
	
	
	private void incluirBuffetButtonActionPerformed(ActionEvent evt) {
		System.out.println("incluirBuffetButton.actionPerformed, event=" + evt);
		//TODO add your code for incluirBuffetButton.actionPerformed
		
		int codigoBuffet = 0;
		String nomeBuffet = null;
		String tipoBuffet = null;
		double valorBuffet = 0;
		String descricaoBuffet = null;
		
		Buffet buffet = null;
			
		if(validaIncluirBuffet() == true){
			
			try{
				
				codigoBuffet = 1;
				nomeBuffet = nomeBuffetText.getText().trim();
				tipoBuffet = tipoBuffetText.getText().trim();
				valorBuffet = Double.parseDouble(valorBuffetText.getText().trim());
				descricaoBuffet = descricaoBuffetTextArea.getText().trim();
				
				buffet = new Buffet(codigoBuffet, nomeBuffet, tipoBuffet, valorBuffet, descricaoBuffet);
				
				this.fachada.incluirBuffet(buffet);
				
				JOptionPane.showMessageDialog(this, 
						"INCLUS√O REALIZADA COM SUCESSO!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
				
				limparBuffet();
			}
			catch (ExcecaoMRSystem e){
				JOptionPane.showMessageDialog(this, e.getMessage(), 
						"ERRO", JOptionPane.ERROR_MESSAGE);
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(this, 
						"VALOR INV¡LIDO!", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(this,
					"INCLUS√O N√O REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void excluirBuffetButtonActionPerformed(ActionEvent evt) {
		System.out.println("excluirBuffetButton.actionPerformed, event=" + evt);
		//TODO add your code for excluirBuffetButton.actionPerformed
		
		int codigoBuffet = 0;
		
		if(validaExcluirBuffet() == true){
			
			try{
				
				codigoBuffet = Integer.parseInt((String) codigoBuffetComboBox.getSelectedItem());
				
				int confirma = JOptionPane.showConfirmDialog(this, 
						"ESTE BUFFET E TODOS OS SEUS DADOS SER√O APAGADOS !\nCONFIRMA ?", "CONFIRMA«√O",JOptionPane.OK_CANCEL_OPTION);
				
				if (confirma == JOptionPane.OK_OPTION) {
					
					this.fachada.excluirBuffet(codigoBuffet);					
					
					JOptionPane.showMessageDialog(this,
							"EXCLUS√O REALIZADA COM SUCESSO!", "MENSAGEM",JOptionPane.INFORMATION_MESSAGE);					
					
					limparBuffet();
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
	
	private void consultarBuffetButtonActionPerformed(ActionEvent evt) {
		System.out.println("consultarBuffetButton.actionPerformed, event="
			+ evt);
		//TODO add your code for consultarBuffetButton.actionPerformed
		
		int codigoBuffet = 999999999;
		String tipoBuffet = null;
		
		Buffet buffet = null;
		
		try{
			
			if(validaConsultarBuffet() == true){
				
				if(tipoBuffetText.getText().trim().equals("")){
					codigoBuffet = Integer.parseInt((String) codigoBuffetComboBox.getSelectedItem());
				}
				else{
					tipoBuffet = tipoBuffetText.getText().trim();
				}
				
				buffet = this.fachada.consultarBuffet(codigoBuffet, tipoBuffet);
				
				codigoBuffetComboBox.setSelectedItem(String.valueOf(buffet.getCodigoBuffet()));
				nomeBuffetText.setText(buffet.getNomeBuffet());
				tipoBuffetText.setText(buffet.getTipoBuffet());
				valorBuffetText.setText(String.valueOf(buffet.getValorBuffet()));
				descricaoBuffetTextArea.setText(buffet.getDescricaoBuffet());
				
				codigoBuffetComboBox.setEditable(false);				
				
				incluirBuffetButton.setEnabled(false);
				consultarBuffetButton.setEnabled(false);
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
	
	private void alterarBuffetButtonActionPerformed(ActionEvent evt) {
		System.out.println("alterarBuffetButton.actionPerformed, event=" + evt);
		//TODO add your code for alterarBuffetButton.actionPerformed
		
		int codigoBuffet = 0;
		String nomeBuffet = null;
		String tipoBuffet = null;
		double valorBuffet = 0;
		String descricaoBuffet = null;
		
		Buffet buffet = null;
		
		if(validaAlterarBuffet() == true){
			
			try{
				
				codigoBuffet = Integer.parseInt((String) codigoBuffetComboBox.getSelectedItem());
				nomeBuffet = nomeBuffetText.getText().trim();
				tipoBuffet = tipoBuffetText.getText().trim();
				valorBuffet = Double.parseDouble(valorBuffetText.getText().trim());
				descricaoBuffet = descricaoBuffetTextArea.getText().trim();
				
				buffet = new Buffet(codigoBuffet, nomeBuffet, tipoBuffet, valorBuffet, descricaoBuffet);
				
				this.fachada.alterarBuffet(buffet);				
				
				JOptionPane.showMessageDialog(this, 
						"ALTERA«√O REALIZADA COM SUCESSO!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);				
				
				limparBuffet();
			}
			catch (ExcecaoMRSystem e){
				JOptionPane.showMessageDialog(this, e.getMessage(), 
						"ERRO",JOptionPane.ERROR_MESSAGE);
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(this, 
						"VALOR INV¡LIDO!", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(this,
					"ALTERA«√O N√O REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void limparBuffetButtonActionPerformed(ActionEvent evt) {
		System.out.println("limparBuffetButton.actionPerformed, event=" + evt);
		//TODO add your code for limparBuffetButton.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog(this, 
				"DESEJA LIMPAR TODOS OS CAMPOS ?", "CONFIRMA«√O", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			limparBuffet();
		}
	}
	
	private void cancelarBuffetButtonActionPerformed(ActionEvent evt) {
		System.out
			.println("cancelarBuffetButton.actionPerformed, event=" + evt);
		//TODO add your code for cancelarBuffetButton.actionPerformed

		int confirma = JOptionPane.showConfirmDialog(this, 
				"DESEJA SAIR DO CADASTRO DE BUFFETS ?", "CONFIRMA«√O", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
	
	public void limparBuffet(){		
		try {
			List listaCodigoBuffet = null;
			
			listaCodigoBuffet = this.fachada.listaCodigoBuffetComboBox();
			
			if (listaCodigoBuffet.size() >= 0) {
				codigoBuffetComboBox.removeAllItems();
			}
			for (int i = 0; i < listaCodigoBuffet.size(); i++) {
				codigoBuffetComboBox.addItem(listaCodigoBuffet.get(i));
			}
		}
		catch (ExcecaoMRSystem e){
			JOptionPane.showMessageDialog(this, e.getMessage(), 
					"ERRO",JOptionPane.ERROR_MESSAGE);
		}		
		incluirBuffetButton.setEnabled(true);
		excluirBuffetButton.setEnabled(true);
		consultarBuffetButton.setEnabled(true);
		alterarBuffetButton.setEnabled(true);
		
		codigoBuffetComboBox.setEditable(false);
		codigoBuffetComboBox.setSelectedIndex(-1);
    	nomeBuffetText.setText("");
		tipoBuffetText.setText("");
    	valorBuffetText.setText("");
    	descricaoBuffetTextArea.setText("");
	}
	
	private boolean validaIncluirBuffet(){
		
		try{
			
			if (nomeBuffetText.getText().trim().equals("")){
				JOptionPane.showMessageDialog(this, 
						"NOME DO BUFFET N√O INFORMADO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}	
			
			if (tipoBuffetText.getText().trim().equals("")){
				JOptionPane.showMessageDialog(this, 
						"TIPO DE BUFFET N√O INFORMADO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}			
			if (valorBuffetText.getText().trim().equals("")){
				JOptionPane.showMessageDialog(this, 
						"VALOR N√O INFORMADO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}			
			if (descricaoBuffetTextArea.getText().trim().equals("")){
				JOptionPane.showMessageDialog(this, 
						"DESCRI«√O N√O INFORMADA.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}			
			return true;
		}
		catch(Exception e){}		
		return true;
	}
	
	private boolean validaExcluirBuffet(){		
		try{			
			if ((codigoBuffetComboBox.getSelectedItem() == null) 
					|| (codigoBuffetComboBox.getSelectedItem().equals(""))){				
				
				JOptionPane.showMessageDialog(this, 
						"C”DIGO N√O INFORMADO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			return true;
		}
		catch(Exception e){}		
		return true;
	}
	
	private boolean validaAlterarBuffet(){
		
		if (validaExcluirBuffet() == false){
			return false;
		}
		else if (validaIncluirBuffet() == false){
			return false;
		}
		else{		
			return true;
		}
	}
	
	private boolean validaConsultarBuffet(){
		
		try{			
			if (((codigoBuffetComboBox.getSelectedItem() == null) 
					|| (codigoBuffetComboBox.getSelectedItem().equals(""))) 
						&& (tipoBuffetText.getText().trim().equals(""))){				
				
				JOptionPane.showMessageDialog(this, 
						"C”DIGO OU TIPO N√O INFORMADO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			else if(((!(codigoBuffetComboBox.getSelectedItem() == null)) 
					|| (!codigoBuffetComboBox.getSelectedItem().equals(""))) 
						&& (!tipoBuffetText.getText().trim().equals(""))){
				
				JOptionPane.showMessageDialog(this, 
						"INFORME UM C”DIGO OU UM TIPO.", "ATEN«√O", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			return true;
		}
		catch(Exception e){}		
		return true;
	}
	
	private void codigoBuffetComboBoxActionPerformed(ActionEvent evt) {
		System.out
			.println("codigoBuffetComboBox.actionPerformed, event=" + evt);
		//TODO add your code for codigoBuffetComboBox.actionPerformed
		
		consultarBuffetButton.setEnabled(true);
		
    	nomeBuffetText.setText("");
		tipoBuffetText.setText("");
    	valorBuffetText.setText("");
    	descricaoBuffetTextArea.setText("");
	}
}
