package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class GUIMenuPrincipal extends javax.swing.JFrame {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	
	private static String CLIENTE = "gui.GUICliente";
	private static String MATERIAL = "gui.GUIMaterial";
	private static String RELATORIO_MATERIAL_TODOS = "gui.GUIRelatorioMaterialTodos";
	private static String RELATORIO_MATERIAL_NOME = "gui.GUIRelatorioMaterialNome";
	private static String RELATORIO_MATERIAL_MARCA = "gui.GUIRelatorioMaterialMarca";
	private static String BUFFET = "gui.GUIBuffet";
	private static String FUNCIONARIO = "gui.GUIFuncionario";
	private static String ORCAMENTO = "gui.GUIOrcamento";
	private static String RELATORIO_ORCAMENTO_TODOS = "gui.GUIRelatorioOrcamentoTodos";
	private static String RELATORIO_ORCAMENTO_CODIGO = "gui.GUIRelatorioOrcamentoCodigo";
	private static String RELATORIO_ORCAMENTO_CLIENTE = "gui.GUIRelatorioOrcamentoCliente";
	private static String EVENTO = "gui.GUIEvento";
	private static String RELATORIO_EVENTO_TODOS = "gui.GUIRelatorioEventoTodos";
	private static String RELATORIO_EVENTO_CLIENTE = "gui.GUIRelatorioEventoCliente";
	private static String RELATORIO_EVENTO_LOCAL = "gui.GUIRelatorioEventoLocal";
	private static String RELATORIO_EVENTO_DATA = "gui.GUIRelatorioEventoData";

	private JMenuBar jMenuBarMRSystem;
	private JMenu jMenuCadastros;
	private JMenu jMenuControle;
	private JMenu jMenuSair;
	private JMenu jMenuRelatorios;
	private JMenu jMenuRelatorioMateriais;
	private JMenu jMenuRelatorioOrcamentos;
	private JMenu jMenuRelatorioEventos;
	private JMenuItem jMenuItemCadastroClientes;
	private JMenuItem jMenuItemCadastroMateriais;
	private JMenuItem jMenuItemCadastroBuffets;
	private JMenuItem jMenuItemCadastroFuncionarios;
	private JMenuItem jMenuItemCadastroOrcamentos;
	private JMenuItem jMenuItemControleEventos;
	private JMenuItem jMenuItemRelatorioMaterialTodos;
	private JMenuItem jMenuItemRelatorioMaterialNome;
	private JMenuItem jMenuItemRelatorioMaterialMarca;
	private JMenuItem jMenuItemRelatorioOrcamentoTodos;
	private JMenuItem jMenuItemRelatorioOrcamentoCodigo;
	private JMenuItem jMenuItemRelatorioOrcamentoCliente;
	private JMenuItem jMenuItemRelatorioEventoTodos;
	private JMenuItem jMenuItemRelatorioEventoCliente;
	private JMenuItem jMenuItemRelatorioEventoLocal;
	private JMenuItem jMenuItemRelatorioEventoData;
	private JMenuItem jMenuItemFechar;
	
	private JLabel logoTipo;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		GUIMenuPrincipal inst = new GUIMenuPrincipal();
		inst.setVisible(true);
	}
	
	public GUIMenuPrincipal() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("MRSYSTEM.jpg")).getImage());
				logoTipo = new JLabel();
				this.getContentPane().add(logoTipo);
				logoTipo.setText("");
				logoTipo.setBounds(0, 0, 88, 20);			
				this.setName("MRSYSTEM");			
				logoTipo.setHorizontalAlignment(SwingConstants.CENTER);
				logoTipo.setHorizontalTextPosition(SwingConstants.CENTER);				
				logoTipo.setIcon(new ImageIcon(getClass().getClassLoader().getResource("MRSYSTEM.jpg")));
				
				this.setTitle("MR System - Sistema para Gerenciamento de Buffets");

				this.setLocation(new java.awt.Point(0,0));
				this.setSize(new java.awt.Dimension(1100,1100));
			}
			{
				jMenuBarMRSystem = new JMenuBar();
				setJMenuBar(jMenuBarMRSystem);
				jMenuBarMRSystem.setPreferredSize(new java.awt.Dimension(792, 35));
				{
					jMenuCadastros = new JMenu();
					jMenuBarMRSystem.add(jMenuCadastros);
					jMenuCadastros.setText("Cadastros");
					jMenuCadastros.setMnemonic(KeyEvent.VK_C);
					jMenuCadastros.setFont(new java.awt.Font("Tahoma",1,12));
					jMenuCadastros.setPreferredSize(new java.awt.Dimension(80, 31));
					{
						jMenuItemCadastroClientes = new JMenuItem();
						jMenuCadastros.add(jMenuItemCadastroClientes);
						jMenuItemCadastroClientes.setText("Cadastro de Clientes");
						jMenuItemCadastroClientes.setMnemonic(KeyEvent.VK_C);
						jMenuItemCadastroClientes.setBounds(0, 35, 91, 21);
						jMenuItemCadastroClientes.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jMenuItemCadastroClientesActionPerformed(evt);
							}
						});
					}
					{
						jMenuItemCadastroMateriais = new JMenuItem();
						jMenuCadastros.add(jMenuItemCadastroMateriais);
						jMenuItemCadastroMateriais.setText("Cadastro de Materiais");
						jMenuItemCadastroMateriais.setMnemonic(KeyEvent.VK_M);
						jMenuItemCadastroMateriais.setBounds(0, 77, 105, 28);
						jMenuItemCadastroMateriais.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jMenuItemCadastroMateriaisActionPerformed(evt);
							}
						});
					}
					{
						jMenuItemCadastroBuffets = new JMenuItem();
						jMenuCadastros.add(jMenuItemCadastroBuffets);
						jMenuItemCadastroBuffets.setText("Cadastro de Buffets");
						jMenuItemCadastroBuffets.setMnemonic(KeyEvent.VK_B);
						jMenuItemCadastroBuffets.setBounds(0, 77, 105, 28);
						jMenuItemCadastroBuffets.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jMenuItemCadastroBuffetsActionPerformed(evt);
							}
						});
					}
					{
						jMenuItemCadastroFuncionarios = new JMenuItem();
						jMenuCadastros.add(jMenuItemCadastroFuncionarios);
						jMenuItemCadastroFuncionarios.setText("Cadastro de Funcionários");
						jMenuItemCadastroFuncionarios.setMnemonic(KeyEvent.VK_F);
						jMenuItemCadastroFuncionarios.setBounds(0, 77, 105, 28);
						jMenuItemCadastroFuncionarios.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jMenuItemCadastroFuncionariosActionPerformed(evt);
							}
						});
					}
					{
						jMenuItemCadastroOrcamentos = new JMenuItem();
						jMenuCadastros.add(jMenuItemCadastroOrcamentos);
						jMenuItemCadastroOrcamentos.setText("Cadastro de Orçamentos");
						jMenuItemCadastroOrcamentos.setMnemonic(KeyEvent.VK_O);
						jMenuItemCadastroOrcamentos.setBounds(0, 77, 105, 28);
						jMenuItemCadastroOrcamentos.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jMenuItemCadastroOrcamentosActionPerformed(evt);
							}
						});
					}
				}
				{
					jMenuControle = new JMenu();
					jMenuBarMRSystem.add(jMenuControle);
					jMenuControle.setText("Controle");
					jMenuControle.setMnemonic(KeyEvent.VK_O);
					jMenuControle.setFont(new java.awt.Font("Tahoma",1,12));
					jMenuControle.setPreferredSize(new java.awt.Dimension(80, 31));
					{
						jMenuItemControleEventos = new JMenuItem();
						jMenuControle.add(jMenuItemControleEventos);
						jMenuItemControleEventos.setText("Controle de Eventos");
						jMenuItemControleEventos.setMnemonic(KeyEvent.VK_C);
						jMenuItemControleEventos.setBounds(0, 77, 105, 28);
						jMenuItemControleEventos.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jMenuItemControleEventosActionPerformed(evt);
							}
						});
					}
				}
				{
					jMenuRelatorios = new JMenu();
					jMenuBarMRSystem.add(jMenuRelatorios);
					jMenuRelatorios.setText("Relatórios");
					jMenuRelatorios.setMnemonic(KeyEvent.VK_R);
					jMenuRelatorios.setPreferredSize(new java.awt.Dimension(80, 31));
					jMenuRelatorios.setFont(new java.awt.Font("Tahoma",1,12));
					{
						jMenuRelatorioMateriais = new JMenu();
						jMenuRelatorios.add(jMenuRelatorioMateriais);
						jMenuRelatorioMateriais.setText("Relatório de Materiais");
						jMenuRelatorioMateriais.setMnemonic(KeyEvent.VK_M);
						jMenuRelatorioMateriais.setFont(new java.awt.Font("Tahoma",1,12));
						{
							jMenuItemRelatorioMaterialTodos = new JMenuItem();
							jMenuRelatorioMateriais.add(jMenuItemRelatorioMaterialTodos);
							jMenuItemRelatorioMaterialTodos.setText("Relatório por Todos os Materiais");
							jMenuItemRelatorioMaterialTodos.setMnemonic(KeyEvent.VK_T);
							jMenuItemRelatorioMaterialTodos.setBounds(0, 77, 105, 28);
							jMenuItemRelatorioMaterialTodos.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jMenuItemRelatorioMaterialTodosActionPerformed(evt);
								}
							});
						}
						{
							jMenuItemRelatorioMaterialNome = new JMenuItem();
							jMenuRelatorioMateriais.add(jMenuItemRelatorioMaterialNome);
							jMenuItemRelatorioMaterialNome.setText("Relatório por Nome do Material");
							jMenuItemRelatorioMaterialNome.setMnemonic(KeyEvent.VK_N);
							jMenuItemRelatorioMaterialNome.setBounds(0, 77, 105, 28);
							jMenuItemRelatorioMaterialNome.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jMenuItemRelatorioMaterialNomeActionPerformed(evt);
								}
							});
						}
						{
							jMenuItemRelatorioMaterialMarca = new JMenuItem();
							jMenuRelatorioMateriais.add(jMenuItemRelatorioMaterialMarca);
							jMenuItemRelatorioMaterialMarca.setText("Relatório por Marca do Material");
							jMenuItemRelatorioMaterialMarca.setMnemonic(KeyEvent.VK_M);
							jMenuItemRelatorioMaterialMarca.setBounds(0, 77, 105, 28);
							jMenuItemRelatorioMaterialMarca.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jMenuItemRelatorioMaterialMarcaActionPerformed(evt);
								}
							});
						}
					}
					{
						jMenuRelatorioOrcamentos = new JMenu();
						jMenuRelatorios.add(jMenuRelatorioOrcamentos);
						jMenuRelatorioOrcamentos.setText("Relatório de Orçamentos");
						jMenuRelatorioOrcamentos.setMnemonic(KeyEvent.VK_O);
						jMenuRelatorioOrcamentos.setFont(new java.awt.Font("Tahoma",1,12));
						{
							jMenuItemRelatorioOrcamentoTodos = new JMenuItem();
							jMenuRelatorioOrcamentos.add(jMenuItemRelatorioOrcamentoTodos);
							jMenuItemRelatorioOrcamentoTodos.setText("Relatório por Todos os Orçamentos");
							jMenuItemRelatorioOrcamentoTodos.setMnemonic(KeyEvent.VK_T);
							jMenuItemRelatorioOrcamentoTodos.setBounds(0, 77, 105, 28);
							jMenuItemRelatorioOrcamentoTodos.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jMenuItemRelatorioOrcamentoTodosActionPerformed(evt);
								}
							});
						}
						{
							jMenuItemRelatorioOrcamentoCodigo = new JMenuItem();
							jMenuRelatorioOrcamentos.add(jMenuItemRelatorioOrcamentoCodigo);
							jMenuItemRelatorioOrcamentoCodigo.setText("Relatório por Código do Orçamento");
							jMenuItemRelatorioOrcamentoCodigo.setMnemonic(KeyEvent.VK_C);
							jMenuItemRelatorioOrcamentoCodigo.setBounds(0, 77, 105, 28);
							jMenuItemRelatorioOrcamentoCodigo.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jMenuItemRelatorioOrcamentoCodigoActionPerformed(evt);
								}
							});
						}
						{
							jMenuItemRelatorioOrcamentoCliente = new JMenuItem();
							jMenuRelatorioOrcamentos.add(jMenuItemRelatorioOrcamentoCliente);
							jMenuItemRelatorioOrcamentoCliente.setText("Relatório por Nome do Cliente");
							jMenuItemRelatorioOrcamentoCliente.setMnemonic(KeyEvent.VK_N);
							jMenuItemRelatorioOrcamentoCliente.setBounds(0, 77, 105, 28);
							jMenuItemRelatorioOrcamentoCliente.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jMenuItemRelatorioOrcamentoClienteActionPerformed(evt);
								}
							});
						}
					}
					{
						jMenuRelatorioEventos = new JMenu();
						jMenuRelatorios.add(jMenuRelatorioEventos);
						jMenuRelatorioEventos.setText("Relatório de Eventos");
						jMenuRelatorioEventos.setMnemonic(KeyEvent.VK_E);
						jMenuRelatorioEventos.setFont(new java.awt.Font("Tahoma",1,12));
						{
							jMenuItemRelatorioEventoTodos = new JMenuItem();
							jMenuRelatorioEventos.add(jMenuItemRelatorioEventoTodos);
							jMenuItemRelatorioEventoTodos.setText("Relatório por Todos os Eventos");
							jMenuItemRelatorioEventoTodos.setMnemonic(KeyEvent.VK_T);
							jMenuItemRelatorioEventoTodos.setBounds(0, 77, 105, 28);
							jMenuItemRelatorioEventoTodos.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jMenuItemRelatorioEventoTodosActionPerformed(evt);
								}
							});
						}
						{
							jMenuItemRelatorioEventoCliente = new JMenuItem();
							jMenuRelatorioEventos.add(jMenuItemRelatorioEventoCliente);
							jMenuItemRelatorioEventoCliente.setText("Relatório por Nome do Cliente");
							jMenuItemRelatorioEventoCliente.setMnemonic(KeyEvent.VK_C);
							jMenuItemRelatorioEventoCliente.setBounds(0, 77, 105, 28);
							jMenuItemRelatorioEventoCliente.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jMenuItemRelatorioEventoClienteActionPerformed(evt);
								}
							});
						}
						{
							jMenuItemRelatorioEventoLocal = new JMenuItem();
							jMenuRelatorioEventos.add(jMenuItemRelatorioEventoLocal);
							jMenuItemRelatorioEventoLocal.setText("Relatório por Local do Evento");
							jMenuItemRelatorioEventoLocal.setMnemonic(KeyEvent.VK_L);
							jMenuItemRelatorioEventoLocal.setBounds(0, 77, 105, 28);
							jMenuItemRelatorioEventoLocal.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jMenuItemRelatorioEventoLocalActionPerformed(evt);
								}
							});
						}
						{
							jMenuItemRelatorioEventoData = new JMenuItem();
							jMenuRelatorioEventos.add(jMenuItemRelatorioEventoData);
							jMenuItemRelatorioEventoData.setText("Relatório por Data do Evento");
							jMenuItemRelatorioEventoData.setMnemonic(KeyEvent.VK_D);
							jMenuItemRelatorioEventoData.setBounds(0, 77, 105, 28);
							jMenuItemRelatorioEventoData.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									jMenuItemRelatorioEventoDataActionPerformed(evt);
								}
							});
						}
					}
				}				
				{
					jMenuSair = new JMenu();
					jMenuBarMRSystem.add(jMenuSair);
					jMenuSair.setText("Sair");
					jMenuSair.setMnemonic(KeyEvent.VK_S);
					jMenuSair.setFont(new java.awt.Font("Tahoma",1,12));
					jMenuSair.setPreferredSize(new java.awt.Dimension(45, 31));
					{
						jMenuItemFechar = new JMenuItem();
						jMenuSair.add(jMenuItemFechar);
						jMenuItemFechar.setText("Fechar Sistema");
						jMenuItemFechar.setMnemonic(KeyEvent.VK_F);
						jMenuItemFechar.setBounds(0, 77, 105, 28);
						jMenuItemFechar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jMenuItemFecharActionPerformed(evt);
							}
						});
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jMenuItemCadastroClientesActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemCadastroClientes.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemCadastroClientes.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(CLIENTE);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemCadastroMateriaisActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemCadastroMateriais.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemCadastroMateriais.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(MATERIAL);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemCadastroBuffetsActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemCadastroBuffets.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemCadastroBuffets.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(BUFFET);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemRelatorioMaterialTodosActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemRelatorioMaterialTodos.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemRelatorioMaterialTodos.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(RELATORIO_MATERIAL_TODOS);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemRelatorioMaterialNomeActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemRelatorioMaterialNome.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemRelatorioMaterialNome.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(RELATORIO_MATERIAL_NOME);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemRelatorioMaterialMarcaActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemRelatorioMaterialMarca.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemRelatorioMaterialMarca.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(RELATORIO_MATERIAL_MARCA);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemFecharActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemFechar.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemFechar.actionPerformed
		
		int confirma = JOptionPane.showConfirmDialog(this, "DESEJA REALMENTE SAIR DO SISTEMA ?", "Sair - Fechar Sistema",JOptionPane.OK_CANCEL_OPTION);
		
		if (confirma == JOptionPane.OK_OPTION) {
			System.exit(0);
		}	
	}
	
	private void jMenuItemCadastroFuncionariosActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemCadastroFuncionarios.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemCadastroFuncionarios.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(FUNCIONARIO);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemCadastroOrcamentosActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemCadastroOrcamentos.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemCadastroOrcamentos.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(ORCAMENTO);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemControleEventosActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemControleEventos.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemControleEventos.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(EVENTO);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemRelatorioOrcamentoTodosActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemRelatorioOrcamentoTodos.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemRelatorioOrcamentoTodos.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(RELATORIO_ORCAMENTO_TODOS);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemRelatorioOrcamentoCodigoActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemRelatorioOrcamentoCodigo.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemRelatorioOrcamentoCodigo.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(RELATORIO_ORCAMENTO_CODIGO);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemRelatorioOrcamentoClienteActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemRelatorioOrcamentoCliente.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemRelatorioOrcamentoCliente.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(RELATORIO_ORCAMENTO_CLIENTE);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemRelatorioEventoTodosActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemRelatorioEventoTodos.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemRelatorioEventoTodos.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(RELATORIO_EVENTO_TODOS);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemRelatorioEventoClienteActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemRelatorioEventoCliente.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemRelatorioEventoCliente.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(RELATORIO_EVENTO_CLIENTE);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemRelatorioEventoLocalActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemRelatorioEventoLocal.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemRelatorioEventoLocal.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(RELATORIO_EVENTO_LOCAL);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	private void jMenuItemRelatorioEventoDataActionPerformed(ActionEvent evt) {
		System.out.println("jMenuItemRelatorioEventoData.actionPerformed, event=" + evt);
		//TODO add your code for jMenuItemRelatorioEventoData.actionPerformed
		
		Class classe = null;
        try {
            classe = Class.forName(RELATORIO_EVENTO_DATA);
            JDialog dialog = (JDialog) classe.newInstance();
            dialog.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
}
