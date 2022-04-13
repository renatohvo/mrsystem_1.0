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

import negocio.Fachada;
import negocio.IFachada;
import negocio.Material;
import negocio.excecao.ExcecaoMRSystem;


public class GUIMaterial extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IFachada fachada;
	
	private JLabel cadastroMateriaisLabel;
	private JButton incluirMaterialButton;
	private JTextField valorMaterialText;
	private JLabel valorMaterialLabel;
	private JTextField quantidadeMaterialText;
	private JLabel quantidadeMaterialLabel;
	private JTextField marcaMaterialText;
	private JLabel marcaMaterialLabel;
	private JTextField nomeMaterialText;
	private JLabel nomeMaterialLabel;
	private JSeparator jSeparatorCadastroMateriais2;
	private JSeparator jSeparatorCadastroMateriais1;
	private JComboBox codigoMaterialComboBox;
	private JButton cancelarMaterialButton;
	private JButton limparMaterialButton;
	private JButton alterarMaterialButton;
	private JButton consultarMaterialButton;
	private JButton excluirMaterialButton;
	private JLabel codigoMaterialLabel;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		GUIMaterial inst = new GUIMaterial();
		inst.setVisible(true);
	}
	
	public GUIMaterial() {
		super();
		
		this.fachada = new Fachada();
		
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Cadastro de Materiais - Dados do Material");
			this.setResizable(false);
			this.setModal(true);
			this.setLocation(new java.awt.Point(200, 100));
			{
				cadastroMateriaisLabel = new JLabel();
				getContentPane().add(cadastroMateriaisLabel);
				cadastroMateriaisLabel.setText("Cadastro de Materiais");
				cadastroMateriaisLabel.setBounds(203, 7, 224, 21);
				cadastroMateriaisLabel.setFont(new java.awt.Font("Verdana",3,18));
			}
			{
				codigoMaterialLabel = new JLabel();
				getContentPane().add(codigoMaterialLabel);
				codigoMaterialLabel.setText("Código:");
				codigoMaterialLabel.setBounds(21, 49, 49, 28);
				codigoMaterialLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				nomeMaterialLabel = new JLabel();
				getContentPane().add(nomeMaterialLabel);
				nomeMaterialLabel.setText("Nome:");
				nomeMaterialLabel.setBounds(21, 84, 42, 28);
				nomeMaterialLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				nomeMaterialText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("**************************************************");
					format_textField.setValidCharacters(" ÁáÂâÃãÉéÊêÍíÎîÓóÔôÕõÚúÛûAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzçÇ-");
					nomeMaterialText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(nomeMaterialText);
				nomeMaterialText.setBounds(98, 84, 504, 28);
			}
			{
				marcaMaterialLabel = new JLabel();
				getContentPane().add(marcaMaterialLabel);
				marcaMaterialLabel.setText("Marca:");
				marcaMaterialLabel.setBounds(21, 119, 42, 28);
				marcaMaterialLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				marcaMaterialText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("******************************");
					format_textField.setValidCharacters(" ÁáÂâÃãÉéÊêÍíÎîÓóÔôÕõÚúÛûAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZzçÇ-");
					marcaMaterialText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(marcaMaterialText);
				marcaMaterialText.setBounds(98, 119, 504, 28);
			}
			{
				quantidadeMaterialLabel = new JLabel();
				getContentPane().add(quantidadeMaterialLabel);
				quantidadeMaterialLabel.setText("Quantidade:");
				quantidadeMaterialLabel.setBounds(21, 154, 77, 28);
				quantidadeMaterialLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				quantidadeMaterialText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("****");
					format_textField.setValidCharacters("0123456789 ");
					quantidadeMaterialText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(quantidadeMaterialText);
				quantidadeMaterialText.setBounds(98, 154, 203, 28);
			}
			{
				valorMaterialLabel = new JLabel();
				getContentPane().add(valorMaterialLabel);
				valorMaterialLabel.setText("Valor (R$):");
				valorMaterialLabel.setBounds(329, 154, 70, 28);
				valorMaterialLabel.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				valorMaterialText = new JTextField();
				try{
					javax.swing.text.MaskFormatter format_textField = new
					javax.swing.text.MaskFormatter("*******");
					format_textField.setValidCharacters("0123456789. ");
					valorMaterialText = new javax.swing.JFormattedTextField(format_textField);
				}catch (Exception e){}
				getContentPane().add(valorMaterialText);
				valorMaterialText.setBounds(399, 154, 203, 28);
			}
			{
				incluirMaterialButton = new JButton();
				getContentPane().add(incluirMaterialButton);
				incluirMaterialButton.setText("Incluir");
				incluirMaterialButton.setMnemonic(KeyEvent.VK_I);
				incluirMaterialButton.setBounds(21, 210, 91, 28);
				incluirMaterialButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						incluirMaterialButtonActionPerformed(evt);
					}
				});
			}
			{
				excluirMaterialButton = new JButton();
				getContentPane().add(excluirMaterialButton);
				excluirMaterialButton.setText("Excluir");
				excluirMaterialButton.setMnemonic(KeyEvent.VK_E);
				excluirMaterialButton.setBounds(119, 210, 91, 28);
				excluirMaterialButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						excluirMaterialButtonActionPerformed(evt);
					}
				});
			}
			{
				consultarMaterialButton = new JButton();
				getContentPane().add(consultarMaterialButton);
				consultarMaterialButton.setText("Consultar");
				consultarMaterialButton.setMnemonic(KeyEvent.VK_C);
				consultarMaterialButton.setBounds(217, 210, 91, 28);
				consultarMaterialButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						consultarMaterialButtonActionPerformed(evt);
					}
				});
			}
			{
				alterarMaterialButton = new JButton();
				getContentPane().add(alterarMaterialButton);
				alterarMaterialButton.setText("Alterar");
				alterarMaterialButton.setMnemonic(KeyEvent.VK_A);
				alterarMaterialButton.setBounds(315, 210, 91, 28);
				alterarMaterialButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						alterarMaterialButtonActionPerformed(evt);
					}
				});
			}
			{
				limparMaterialButton = new JButton();
				getContentPane().add(limparMaterialButton);
				limparMaterialButton.setText("Limpar");
				limparMaterialButton.setMnemonic(KeyEvent.VK_L);
				limparMaterialButton.setBounds(413, 210, 91, 28);
				limparMaterialButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						limparMaterialButtonActionPerformed(evt);
					}
				});
			}
			{
				cancelarMaterialButton = new JButton();
				getContentPane().add(cancelarMaterialButton);
				cancelarMaterialButton.setText("Cancelar");
				cancelarMaterialButton.setBounds(511, 210, 91, 28);
				cancelarMaterialButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						cancelarMaterialButtonActionPerformed(evt);
					}
				});
			}
			{
				jSeparatorCadastroMateriais1 = new JSeparator();
				getContentPane().add(jSeparatorCadastroMateriais1);
				jSeparatorCadastroMateriais1.setBounds(0, 35, 623, 14);
			}
			{
				jSeparatorCadastroMateriais2 = new JSeparator();
				getContentPane().add(jSeparatorCadastroMateriais2);
				jSeparatorCadastroMateriais2.setBounds(0, 196, 623, 14);
			}
			{
				codigoMaterialComboBox = new JComboBox();
				getContentPane().add(codigoMaterialComboBox);
				codigoMaterialComboBox.setBounds(98, 49, 63, 28);
				codigoMaterialComboBox.setSize(98, 28);
				codigoMaterialComboBox.setMaximumRowCount(6);
				codigoMaterialComboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						codigoMaterialComboBoxActionPerformed(evt);
					}
				});
			}
			pack();
			this.setSize(631, 286);
			
			limparMaterial();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void incluirMaterialButtonActionPerformed(ActionEvent evt) {
		System.out.println("incluirMaterialButton.actionPerformed, event="
			+ evt);
		//TODO add your code for incluirMaterialButton.actionPerformed
		
		int codigoMaterial = 0;
		String nomeMaterial = null;
		String marcaMaterial = null;
		String quantidadeMaterial = null;
		double valorMaterial = 0;
		
		Material material = null;
			
		if(validaIncluirMaterial() == true){
				
			try{
				
				codigoMaterial = 1;
				nomeMaterial = nomeMaterialText.getText().trim();
				marcaMaterial = marcaMaterialText.getText().trim();
				quantidadeMaterial = quantidadeMaterialText.getText().trim();
				valorMaterial = Double.parseDouble(valorMaterialText.getText().trim());
				
				material = new Material(codigoMaterial, nomeMaterial, marcaMaterial, quantidadeMaterial, valorMaterial);
		    
				this.fachada.incluirMaterial(material);

				JOptionPane.showMessageDialog(this, 
						"INCLUSÃO REALIZADA COM SUCESSO!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

				limparMaterial();
			}
			catch (ExcecaoMRSystem e){
				JOptionPane.showMessageDialog(this, e.getMessage(), 
						"ERRO",JOptionPane.ERROR_MESSAGE);
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(this, 
						"VALOR INVÁLIDO!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(this,
					"INCLUSÃO NÃO REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void excluirMaterialButtonActionPerformed(ActionEvent evt) {
		System.out.println("excluirMaterialButton.actionPerformed, event="
			+ evt);
		//TODO add your code for excluirMaterialButton.actionPerformed
		
		int codigoMaterial = 0;
		
		if(validaExcluirMaterial() == true){
			
			try{
				
				codigoMaterial = Integer.parseInt((String) codigoMaterialComboBox.getSelectedItem());

				int confirma = JOptionPane.showConfirmDialog(this, 
						"ESTE MATERIAL E TODOS OS SEUS DADOS SERÃO APAGADOS !\nCONFIRMA ?", "CONFIRMAÇÃO",JOptionPane.OK_CANCEL_OPTION);
				
				if (confirma == JOptionPane.OK_OPTION) {
					
					this.fachada.excluirMaterial(codigoMaterial);
					
					JOptionPane.showMessageDialog(this,
							"EXCLUSÃO REALIZADA COM SUCESSO!", "MENSAGEM",JOptionPane.INFORMATION_MESSAGE);		
					
					limparMaterial();
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
	
	private void consultarMaterialButtonActionPerformed(ActionEvent evt) {
		System.out.println("consultarMaterialButton.actionPerformed, event="
			+ evt);
		//TODO add your code for consultarMaterialButton.actionPerformed
		
		int codigoMaterial = 999999999;
		
		Material material = null;
		
		if(validaConsultarMaterial() == true){
			
			try{
				
				codigoMaterial = Integer.parseInt((String) codigoMaterialComboBox.getSelectedItem());
				
				material = this.fachada.consultarMaterial(codigoMaterial);
					
				codigoMaterialComboBox.setSelectedItem(String.valueOf(material.getCodigoMaterial()));
			    nomeMaterialText.setText(material.getNomeMaterial());
			    marcaMaterialText.setText(material.getMarcaMaterial());
			    quantidadeMaterialText.setText(material.getQuantidadeMaterial());
			    valorMaterialText.setText(String.valueOf(material.getValorMaterial()));
			    	
			    codigoMaterialComboBox.setEditable(false);
			    	
			    incluirMaterialButton.setEnabled(false);
			    consultarMaterialButton.setEnabled(false);
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
	
	private void alterarMaterialButtonActionPerformed(ActionEvent evt) {
		System.out.println("alterarMaterialButton.actionPerformed, event="
			+ evt);
		//TODO add your code for alterarMaterialButton.actionPerformed
		
		int codigoMaterial = 0;
		String nomeMaterial = null;
		String marcaMaterial = null;
		String quantidadeMaterial = null;
		double valorMaterial = 0;
		
		Material material = null;
			
		if(validaAlterarMaterial() == true){
			
			try {
			
				codigoMaterial = Integer.parseInt((String) codigoMaterialComboBox.getSelectedItem());
				nomeMaterial = nomeMaterialText.getText().trim();
				marcaMaterial = marcaMaterialText.getText().trim();
				quantidadeMaterial = quantidadeMaterialText.getText().trim();
				valorMaterial = Double.parseDouble(valorMaterialText.getText().trim());

				material = new Material(codigoMaterial, nomeMaterial, marcaMaterial, quantidadeMaterial, valorMaterial);
				
		    	this.fachada.alterarMaterial(material);

				JOptionPane.showMessageDialog(this, 
						"ALTERAÇÃO REALIZADA COM SUCESSO!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);

				limparMaterial();
				
			}
			catch (ExcecaoMRSystem e){
				JOptionPane.showMessageDialog(this, e.getMessage(), 
						"ERRO",JOptionPane.ERROR_MESSAGE);
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(this, 
						"VALOR INVÁLIDO!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(this,
					"ALTERAÇÃO NÃO REALIZADA!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void limparMaterialButtonActionPerformed(ActionEvent evt) {
		System.out
			.println("limparMaterialButton.actionPerformed, event=" + evt);
		//TODO add your code for limparMaterialButton.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog
			(this, "DESEJA LIMPAR TODOS OS CAMPOS ?", "CONFIRMAÇÃO", JOptionPane.OK_CANCEL_OPTION);

		if (confirma == JOptionPane.OK_OPTION) {

			limparMaterial();
		}
	}
	
	private void cancelarMaterialButtonActionPerformed(ActionEvent evt) {
		System.out.println("cancelarMaterialButton.actionPerformed, event="
			+ evt);
		//TODO add your code for cancelarMaterialButton.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog(this, 
				"DESEJA SAIR DO CADASTRO DE MATERIAIS ?", "CONFIRMAÇÃO", JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			
			this.dispose();
		}
	}
	
	public void limparMaterial(){
		
		try {

			List listaCodigoMaterial = null;

			listaCodigoMaterial = this.fachada.listaCodigoMaterialComboBox();

			if (listaCodigoMaterial.size() >= 0) {
				codigoMaterialComboBox.removeAllItems();
			}
			for (int i = 0; i < listaCodigoMaterial.size(); i++) {
				codigoMaterialComboBox.addItem(listaCodigoMaterial.get(i));
			}

		}
		catch (ExcecaoMRSystem e){
			JOptionPane.showMessageDialog(this, e.getMessage(), 
					"ERRO",JOptionPane.ERROR_MESSAGE);
		}
		
		incluirMaterialButton.setEnabled(true);
		excluirMaterialButton.setEnabled(true);
		consultarMaterialButton.setEnabled(true);
		alterarMaterialButton.setEnabled(true);
		
		codigoMaterialComboBox.setEditable(false);
		codigoMaterialComboBox.setSelectedIndex(-1);
    	nomeMaterialText.setText("");
    	marcaMaterialText.setText("");
    	quantidadeMaterialText.setText("");
    	valorMaterialText.setText("");
	}
	
	private boolean validaIncluirMaterial(){
		
		try{
			
			if (nomeMaterialText.getText().trim().equals("")){
				JOptionPane.showMessageDialog
					(this, "NOME NÃO INFORMADO.",
							"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (marcaMaterialText.getText().trim().equals("")){
				JOptionPane.showMessageDialog
					(this, "MARCA NÃO INFORMADA.",
							"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (quantidadeMaterialText.getText().trim().equals("")){
				JOptionPane.showMessageDialog
					(this, "QUANTIDADE NÃO INFORMADA.",
							"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			if (valorMaterialText.getText().trim().equals("")){
				JOptionPane.showMessageDialog
					(this, "VALOR NÃO INFORMADO.",
							"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			return true;
		}
		catch(Exception e){}
		
		return true;
	}
	
	private boolean validaExcluirMaterial(){
		
		try{
			
			if ((codigoMaterialComboBox.getSelectedItem() == null) 
					|| (codigoMaterialComboBox.getSelectedItem().equals(""))){
				
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
	
	private boolean validaConsultarMaterial(){
		
		if (validaExcluirMaterial() == false){
			return false;
		}		
		else{		
			return true;
		}
	}
	
	private boolean validaAlterarMaterial(){
		
		if (validaExcluirMaterial() == false){
			return false;
		}
		else if (validaIncluirMaterial() == false){
			return false;
		}
		else{		
			return true;
		}	
	}
	
	private void codigoMaterialComboBoxActionPerformed(ActionEvent evt) {
		System.out.println("codigoMaterialComboBox.actionPerformed, event="
			+ evt);
		//TODO add your code for codigoMaterialComboBox.actionPerformed
		
		consultarMaterialButton.setEnabled(true);
		
		nomeMaterialText.setText("");
    	marcaMaterialText.setText("");
    	quantidadeMaterialText.setText("");
    	valorMaterialText.setText("");
	}
}
