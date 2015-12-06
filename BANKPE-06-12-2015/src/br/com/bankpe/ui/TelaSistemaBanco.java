package br.com.bankpe.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

// import br.com.bankpe.ui.CadastrarConta;

public class TelaSistemaBanco extends JFrame implements ActionListener{ // TELA DO SISTEMA DO BANCO 

	private JMenu crud;
	private JMenu Opções;
	private JMenu relatorio;
	
	private JMenuItem cadastrar;
	private JMenuItem remover;
	private JMenuItem atualizar;
	private JMenuItem ler;
	private JMenuItem listar;
	private JMenuItem sair;
	private JMenuItem gerarRelatorio;
	
	
	
	public TelaSistemaBanco(String titulo){
		super("Sistema BankPÊ Admin");
		//setExtendedState(MAXIMIZED_BOTH); // ABRIR COM TELA CHEIA
		//setBounds(400, 200, 400, 250); // DEFINIR TAMANHO DA TELA (setBounds(getX(), getY(), WIDTH, HEIGHT))
		
		setSize(630, 400);
		setLocation(350, 180);
		criarMenu();
		setResizable(false); 
		setVisible(true);
	}
	
	public void criarMenu(){
		
		//MENU DENTRO DE OUTRO (CRUD DENTRO DO OPÇÕES)
		Opções = new JMenu("Opções");
		crud = new JMenu("CRUD");
		relatorio = new JMenu("Relatório");
		Opções.add(crud);
		
		// MENUSITENS DENTRO DO SUBMENU CRUD
		cadastrar = new JMenuItem("Cadastrar");
		remover = new JMenuItem("Remover");
		atualizar = new JMenuItem("Atualizar");
		ler = new JMenuItem("Ler");
		listar = new JMenuItem("Listar");
		sair = new JMenuItem("Sair");
		gerarRelatorio = new JMenuItem("Gerar Relatório");
		crud.add(cadastrar);		
		crud.add(remover);		
		crud.add(atualizar);		
		crud.add(ler);
		crud.add(listar);
		Opções.add(sair);
		relatorio.add(gerarRelatorio);
		
		//INSERÇÃO DA BARRA
		JMenuBar Mbarra = new JMenuBar();
		setJMenuBar(Mbarra);
		Mbarra.add(Opções);
		Mbarra.add(relatorio);
		
		// IINSERINDO AÇÕES AOS BOTÕES
		LogoutAction logoutAction = new LogoutAction();
		sair.addActionListener(logoutAction);
		
		CrudCadastrar crudCadastrar = new CrudCadastrar();
		cadastrar.addActionListener(crudCadastrar);
		
		CrudRemover crudRemover = new CrudRemover();
		remover.addActionListener(crudRemover);
		
		CrudAtualizar crudAtualizar = new CrudAtualizar();
		atualizar.addActionListener(crudAtualizar);
		
		CrudLer crudLer = new CrudLer();
		ler.addActionListener(crudLer);
		
		relatorioAction relatorioAction = new relatorioAction();
		gerarRelatorio.addActionListener(relatorioAction);
		

	}
	
	private class CrudCadastrar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new TelaCadastrarConta("");
		}
	}
	
	private class CrudRemover implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new TelaPesquisarConta();
		}
	}
	
	public class CrudAtualizar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new TelaPesquisarConta();
		}
	}
	
	public class CrudLer implements ActionListener{
		public void actionPerformed(ActionEvent e){
			new TelaPesquisarConta();
		}
	}
	private class LogoutAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	
		private class relatorioAction implements ActionListener{
			public void actionPerformed(ActionEvent e){
		FileWriter arq = null;
		try {
			arq = new FileWriter("C:\\Users\\ITALO MOREIRA\\Desktop\\TESTE.txt");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	    PrintWriter gravarArq = new PrintWriter(arq);
	    gravarArq.printf("+--Testando--+%n");
	    for (int i=1; i<=10; i++) {
	    	 gravarArq.printf("+-------------+%n");	
	    }
	   

	    try {
			arq.close();
	    	} catch (IOException e1) {
			e1.printStackTrace();
		}


	JOptionPane.showMessageDialog(null, "ESCREVA AQUI!", "Relatório de Conta", JOptionPane.PLAIN_MESSAGE);
	}
}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
