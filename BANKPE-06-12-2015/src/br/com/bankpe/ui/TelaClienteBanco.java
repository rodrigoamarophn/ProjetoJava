package br.com.bankpe.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

//import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
//import javax.swing.KeyStroke;


	public class TelaClienteBanco extends JFrame{ // TELA DE ACESSO DO CLIENTE
	
		//private JDesktopPane pane;
	
		private JMenu CC;
		private JMenu Transfer�ncias;
		//private JMenu transa��es;
		//private JMenu meusLimites;
		//private JMenu relat�rio;
		private JMenu op��o;
		
	
		private JMenuItem saldoCC;
		private JMenuItem extratoCC;
		private JMenuItem depositar;
		private JMenuItem sacar;
		private JMenuItem transf;
		//private JMenuItem trans_efetivadas;
		//private JMenuItem limiteSaque;
		//private JMenuItem limitePagamento;
		//private JMenuItem gerarRelat�rio;
		private JMenuItem sair;
	
	
		public TelaClienteBanco(String titulo){
			super("Bem-vindo ao BankP�");
			setSize(630, 400);
			setLocation(350, 180);
			
			criarMenu();
			setResizable(false); 
			setVisible(true);
		}

		
		public void criarMenu(){
		
			// CRIA��O DOS MENUS	
			CC = new JMenu("Conta Corrente");
			Transfer�ncias = new JMenu("Transfer�ncias");
			//transa��es = new JMenu("Transa��es"); 
			//relat�rio = new JMenu("Relat�rio");
			//meusLimites = new JMenu("Limites");
			op��o = new JMenu("Op��o");
			
			saldoCC = new JMenuItem("Saldo Conta Corrente");
			extratoCC = new JMenuItem("Extrato de Conta Corrente");
			depositar = new JMenuItem ("Depositar");
			sacar = new JMenuItem("Sacar");
			CC.add(saldoCC);
			CC.add(extratoCC);
			CC.add(depositar);
			CC.add(sacar);
						
			//gerarRelat�rio = new JMenuItem("Gerar Relat�rio");		
			//relat�rio.add(gerarRelat�rio);
			
			//SEM ACTION NO MOMENTO
			transf = new JMenuItem("Transfer�ncia entre contas");
			Transfer�ncias.add(transf);
			
			//SEM ACTION NO MOMENTO
			//trans_efetivadas = new JMenuItem("Transa��es Efetivadas");			
			//transa��es.add(trans_efetivadas);
			
			//SEM ACTION NO MOMENTO
			//limiteSaque = new JMenuItem("Limite de Saque");
			//limitePagamento = new JMenuItem("Limite de Pagamento");
			//meusLimites.add(limiteSaque);
			//meusLimites.add(limitePagamento);
			
			sair = new JMenuItem("Logout");
			op��o.add(sair);
			
			//ACTIONS!!!!!
			saldoCCAction saldoCCAction = new saldoCCAction();
			saldoCC.addActionListener(saldoCCAction);
			
			//relat�rioAction relat�rioAction = new relat�rioAction();
			//gerarRelat�rio.addActionListener(relat�rioAction);
			
			transfer�nciasEntreContas transfer�ncias = new transfer�nciasEntreContas();
			transf.addActionListener(transfer�ncias);
			
			DepositarAction depositarAction = new DepositarAction();
			depositar.addActionListener(depositarAction);
			
			SacarAction sacarAction = new SacarAction();
			sacar.addActionListener(sacarAction);
			
			sairAction sairaction = new sairAction();
			sair.addActionListener(sairaction);
			
			//CRIA��O DAS BARRAS 
			JMenuBar Mbarra = new JMenuBar();
			setJMenuBar(Mbarra);	
			Mbarra.add(CC);
			Mbarra.add(Transfer�ncias);
			//Mbarra.add(transa��es);		
			//Mbarra.add(meusLimites);
			//Mbarra.add(relat�rio);
			Mbarra.add(op��o);
			
			CC.setMnemonic(KeyEvent.VK_C);
			saldoCC.setMnemonic(KeyEvent.VK_S);
			extratoCC.setMnemonic(KeyEvent.VK_E);
			
			Transfer�ncias.setMnemonic(KeyEvent.VK_T);
			
			//transa��es.setMnemonic(KeyEvent.VK_N);
			
			//meusLimites.setMnemonic(KeyEvent.VK_L);
			
			//relat�rio.setMnemonic(KeyEvent.VK_R);
			//gerarRelat�rio.setMnemonic(KeyEvent.VK_G);
			
			
			/*CC.addSeparator();		
			subCC = new JMenu("SUB MENU SEPARADO");
			//subCC.setMnemonic(KeyEvent.VK_S);
			menuCCItem = new JMenuItem("ITEM DO SUBMENU");
			//menuCCItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
			subCC.add(menuCCItem);
			menuCCItem = new JMenuItem("OUTRO ITEM");
			subCC.add(menuCCItem);
			CC.add(subCC);		
			//CC.setMnemonic(KeyEvent.VK_C);
			//CC.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");	
			 */
			
		}	
		
		
		private class saldoCCAction implements ActionListener{
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "Seu saldo � de:   R$", "Saldo de Conta Corrente", JOptionPane.PLAIN_MESSAGE);
			}	
		}	
		
	
//		private class relat�rioAction implements ActionListener{
//			public void actionPerformed(ActionEvent e){
//				FileWriter arq = null;
//				try {
//					arq = new FileWriter("C:\\Users\\ITALO MOREIRA\\Desktop\\TESTE.txt");
//				} catch (IOException e1) {
//					e1.printStackTrace();
//				}
//			    PrintWriter gravarArq = new PrintWriter(arq);
//			    gravarArq.printf("+--Testando--+%n");
//			    for (int i=1; i<=10; i++) {
//			    	 gravarArq.printf("+-------------+%n");	
//			    }
//			   
//
//			    try {
//					arq.close();
//				} catch (IOException e1) {
//					e1.printStackTrace();
//				}
//
//
//			JOptionPane.showMessageDialog(null, "ESCREVA AQUI!", "Relat�rio de Conta", JOptionPane.PLAIN_MESSAGE);
//			}
//		}
		
		private class transfer�nciasEntreContas implements ActionListener{
			public void actionPerformed(ActionEvent e){
				new TelaTransferenciaConta("");
			}
		}
		
		private class DepositarAction implements ActionListener{
			public void actionPerformed(ActionEvent e){
				new TelaDepositar();
			}
		}
		
		private class SacarAction implements ActionListener{
			public void actionPerformed(ActionEvent e){
				new TelaSacar();
			}
		}
		
		private class sairAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}
}
