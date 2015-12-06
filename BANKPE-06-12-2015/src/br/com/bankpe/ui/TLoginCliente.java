package br.com.bankpe.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class TLoginCliente extends JFrame implements ActionListener{ //TELA PRA FAZER LOGIN NA CONTA DO CLIENTE

	private JPanel panelBotoes;
	private JPanel panelTitulo;
	private JPanel panelGeral;
	
	private JMenu menuOpção;
	private JMenu menuAjuda;
	
	private JMenuItem menuItemSair;
	private JMenuItem menuItemSobre;	
	
	private JLabel titulo;
	private JLabel nomeConta;
	private JLabel nomeSenha;
	
	private JTextField fieldConta;
	private JTextField fieldSenha;
	
	private JButton botaoEntrar;
		
	private JPasswordField Psenha;
	
		
	
	public TLoginCliente(String titulo){
			super("Bem-vindo ao BankPÊ!");
			//setExtendedState(MAXIMIZED_BOTH);
			setSize(630, 400);
			setLocation(350, 180);
		
			criarMenu();			
			criarFormulario();
			
			// IMAGEM DA LOGO 
			Container c = getContentPane();
			c.setLayout(new FlowLayout());		
			JLabel LbImage = new JLabel();
			LbImage.setIcon(new ImageIcon("C:\\Users\\ITALO MOREIRA\\BANKPE\\logo\\logo.png"));
			c.add(LbImage);
			setResizable(false); 
			setVisible(true);
			
	}
		
		
		public void criarMenu(){			
				
			menuOpção = new JMenu("Opções");
			menuItemSair = new JMenuItem("Sair");
			menuOpção.add(menuItemSair);
								
			menuAjuda = new JMenu("Ajuda");
			menuItemSobre = new JMenuItem("Sobre...");				
			menuAjuda.add(menuItemSobre);				
			
			JMenuBar Mbarra = new JMenuBar();
			setJMenuBar(Mbarra);				
			Mbarra.add(menuOpção);
			Mbarra.add(menuAjuda);
							
			menuItemSairAction menuItemSairAction = new menuItemSairAction();
			menuItemSair.addActionListener(menuItemSairAction);
			SobreAction SobreAction = new SobreAction();
			menuItemSobre.addActionListener(SobreAction);
		}
		
		private void criarFormulario(){
			setLayout(new BorderLayout());
			
			panelTitulo = new JPanel();
			panelTitulo.setLayout(new FlowLayout());				
			titulo = new JLabel("    Informe abaixo seu dados para acessar ");
			titulo.setFont(new Font("Verdana", Font.PLAIN, 20));				
			panelTitulo.add(titulo);			

			// CRIAÇÃO DOS TEXT FIELDS
			panelGeral = new JPanel();
			panelGeral.setLayout(new FlowLayout());
						
			nomeConta = new JLabel("Conta: ");
			fieldConta = new JTextField(10);			
			nomeSenha = new JLabel("Senha: ");
			//fieldSenha = new JTextField(10);
			fieldSenha = new JPasswordField(10);
			
			panelGeral.add(nomeConta);
			panelGeral.add(fieldConta);
			panelGeral.add(nomeSenha);
			panelGeral.add(fieldSenha);
			
			// CRIAÇÃO DOS BOTOES
			panelBotoes = new JPanel();
			panelBotoes.setLayout(new FlowLayout());
			botaoEntrar = new JButton("Entrar");
			panelBotoes.add(botaoEntrar);
			EntrarAction entrarAction = new EntrarAction();
			botaoEntrar.addActionListener(entrarAction);
			
			
			
			// CRIAÇÃO NA TELA DOS PANELs
			add(panelTitulo, BorderLayout.NORTH);
			add(panelGeral, BorderLayout.CENTER);
			add(panelBotoes, BorderLayout.SOUTH);
			
		}
		
		
		private class menuItemSairAction implements ActionListener{
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}	
		}
		
		private class SobreAction implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Programa desenvolvido por: \n"
						+ "Isabella Lopes; \n"
						+ "José Ítalo; \n"
						+ "Laerth; \n"
						+ "Rodrigo Amaro. \n"
						+ "\n"
						+ "\n"
						+ "\n"
						+ "Para mais informações, entre em contato através do: \n"
						+ "(XX) X XXXX-XXXX", "Sobre...", JOptionPane.PLAIN_MESSAGE);
			}
		}
		
		private class EntrarAction implements ActionListener{
			public void actionPerformed(ActionEvent e){
//				if (fieldConta.getText().equals("teste") && (fieldSenha.getText().equals("123"))){				
//					JOptionPane.showMessageDialog(null,"Acesso Permitido!"); 
//						new TelaClienteBanco("");
//						this.dispose(); 
//				}
					
				if (e.getSource().equals(botaoEntrar)){
					Usuario u = new Usuario();
					u.setConta(fieldConta.getText());
					u.setSenha(fieldSenha.getText());
					JOptionPane.showMessageDialog(null, "Cliente encontrado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
				new TelaClienteBanco("");
				setVisible(false);
			}

			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}
