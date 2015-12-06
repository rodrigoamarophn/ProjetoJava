package br.com.bankpe.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TelaInicialLogins extends JFrame{ // TELA INICIAL DO PROGRAMA PARA ACESSAR CLIENTE OU GERENTE


	private JMenuBar Mbarra;
	
	private JMenu menuOpções;
	
	private JMenuItem menuItemSair;
	
	public TelaInicialLogins(String titulo){
		super("BankPÊ");
		setSize(630, 400);
		setLocation(350, 180);
		criarFormulario();
		
		// IMAGEM DA LOGO 
		Container c = getContentPane();
		c.setLayout(new FlowLayout());		
		JLabel LbImage = new JLabel();
		LbImage.setIcon(new ImageIcon("logo.png"));
		c.add(LbImage);
		
		setResizable(true); 
		setVisible(true);
		
		
	}
	
	public void criarFormulario(){
		setLayout(new BorderLayout());
		
		// TÍTULO DA TELA
		JPanel panelTitulo = new JPanel();
		panelTitulo.setLayout(new FlowLayout());		
		JLabel titulo = new JLabel("Bem-vindo ao BankPÊ!");
		titulo.setFont(new Font("Verdana", Font.PLAIN, 25));		
		panelTitulo.add(titulo);
		
		// MSG ABAIXO DO TITULO
		JPanel escolha = new JPanel();
		escolha.setLayout(new FlowLayout());
		JLabel nomeLabel = new JLabel("       Escolha abaixo qual conta deseja acessar ");
		nomeLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		panelTitulo.add(nomeLabel);
		
		// BOTOES
		JPanel panelBotoes = new JPanel();
		panelBotoes.setLayout(new FlowLayout());
		JButton botaoCliente = new JButton("Acessar Conta Cliente");
		JButton botaoGerente = new JButton("Acessar Conta Gerente");
		panelBotoes.add(botaoCliente);
		panelBotoes.add(botaoGerente);
		
		// ADICIONANDO ITENS ACIMA EM SUAS POSIÇÕES NA TELA
		add(panelTitulo, BorderLayout.NORTH);
		add(nomeLabel, BorderLayout.CENTER);
		add(panelBotoes, BorderLayout.SOUTH);		
		
		// INSERINDO ACTIONS PARA OS BOTOES
		SistemaAction sistemaAction = new SistemaAction();
		botaoGerente.addActionListener(sistemaAction);
		ClienteAction clienteAction = new ClienteAction();
		botaoCliente.addActionListener(clienteAction);
		
		// CRIAÇÃO DA BARRA DE MENU E SEUS SUBITENS
		menuOpções = new JMenu("Opções");
		menuItemSair = new JMenuItem("Sair");
		menuOpções.add(menuItemSair);
		menuItemSairAction sairAction = new menuItemSairAction();
		menuItemSair.addActionListener(sairAction);		
		
		Mbarra = new JMenuBar();
		setJMenuBar(Mbarra);
		Mbarra.add(menuOpções);
	}
		
	private class SistemaAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new TLoginAdmin("");
			setVisible(false);
		}
	}
	
	private class ClienteAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new TLoginCliente("");
			setVisible(false);
			
		}
	}
	
	private class menuItemSairAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
			
		}
	}
	
}
