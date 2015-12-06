package br.com.bankpe.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

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

import br.com.bankpe.facade.BancoFacade;
import br.com.bankpe.facade.UsuarioAdminFacade;
import br.com.bankpe.negocios.Conta;
import br.com.bankpe.negocios.ContaService;
import br.com.bankpe.negocios.UsuarioAdmin;
import br.com.bankpe.negocios.UsuarioAdminService;

public class TLoginAdmin extends JFrame {

	private JPanel panelBotoes;
	private JPanel panelTitulo;
	private JPanel panelGeral;
	
	private JMenu menuOpção;
	private JMenu menuAjuda;
	
	private JMenuItem menuItemSair;
	private JMenuItem menuItemSobre;	
	
	private JLabel titulo;
	private JLabel nomeLogin;
	private JLabel nomeSenha;
	
	private JTextField fieldLogin;
	//private JIntField fieldLogin;  //Rodrigo: Mudei de JTextField para JIntField, mas acho que a sintaxe não está certa
	private JTextField fieldSenha;
	
	private JButton botaoEntrar;
	
	private JPasswordField Psenha;
	
	
	public TLoginAdmin(String titulo){
		super("Bem-vindo ao Sistema BankPÊ");
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
	
		nomeLogin = new JLabel("Login: ");
		fieldLogin = new JTextField(10);
		//fieldLogin = new JIntField(10);	 //Rodrigo: MUDEI PARA Int ****		
		nomeSenha = new JLabel("Senha: ");
		//fieldSenha = new JTextField(10);
		fieldSenha = new JPasswordField(10);
		
		panelGeral.add(nomeLogin);
		panelGeral.add(fieldLogin);
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

	private class SobreAction implements ActionListener{ // AÇÃO PARA MENSAGEM DO MENU SOBRE
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Para mais informações, ligue: \n (XX) X XXXX-XXXX", "Sobre...", JOptionPane.PLAIN_MESSAGE);
		}
	}

	private class EntrarAction implements ActionListener{ // AÇÃO PARA ACESSAR NO SISTEMA BANKPÊ PARA ADMIN (USUARIOADMIN DIFERE DE USUARIO CLIENTE!!!)
		public void actionPerformed(ActionEvent e){
			if (e.getSource().equals(botaoEntrar)){
				UsuarioAdmin u = new UsuarioAdmin();
				//u.setMatricula(fieldLogin.getText());
//				u.setMatricula(fieldLogin.getInt()); // Rodrigo: Mudei para int
				u.setSenha(fieldSenha.getText());
				JOptionPane.showMessageDialog(null, "Admin encontrado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
				new TelaSistemaBanco("Bem-vindo ao Sistema BankPÊ");
				setVisible(false);
			}

		}
	}
	
	// José Ítalo: comentei para dar continuidade em algumas modificações
//	//Listar Informações do Login
//			BancoFacade bancoFacade = new BancoFacade(new ContaService());
//			
//			List<Conta> contas = null;
//			try {
//				contas = bancoFacade.listarContas();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//			for (Conta conta : contas) {
//				System.out.println(conta);
//			}
	
	
	public static void main(String[] args) throws SQLException {
		//Consultar usuário Admin
		UsuarioAdminFacade usuarioFacade = new UsuarioAdminFacade(new UsuarioAdminService());		

				UsuarioAdmin u = new UsuarioAdmin();
				u.setMatricula(90002);
				UsuarioAdmin admin = usuarioFacade.buscarUsuario(u);
				System.out.println(admin.getNome());
				System.out.println(admin.getCargo());
				System.out.println(admin.getDataAdmissao());
				System.out.println(admin.getSenha());
			}
	
	
		}

