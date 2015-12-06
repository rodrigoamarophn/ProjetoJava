package br.com.bankpe.ui;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.bankpe.facade.BancoFacade;
import br.com.bankpe.negocios.Conta;
import br.com.bankpe.negocios.ContaService;

public class TelaVerConta extends JFrame {

	private JLabel nomeNomeLabel;
	private JLabel nomeContaLabel;
	private JLabel senhaLabel;
	private JLabel saldoLabel;
	private JLabel cpfLabel;
	private JLabel telefoneLabel;
	private JLabel enderecoLabel;
	private JLabel limiteLabel;
	private JLabel raLabel;
	private JLabel tarifaLabel;
	
	private JTextField nomeNomeField;
	private JTextField nomeContaField;
	private JPasswordField senhaField;
	private JTextField saldoField;
	private JTextField cpfField;
	private JTextField telefoneField;
	private JTextField enderecoField;
	private JTextField limiteField;
	private JTextField raField;
	private JTextField tarifaField;
	
	private JButton atualizarButton;
	private JButton removerButton;
	private JButton cancelButton;
	
	public TelaVerConta(){
		super();
		
		setTitle("Listagem de Contas");
		setSize(530, 400);
		setLocation(500, 280);
		setResizable(false); 
		criarFormulario();
		setVisible(true);
	}

	private void criarFormulario() {
		
		nomeNomeLabel = new JLabel();
		nomeContaLabel = new JLabel();
		senhaLabel = new JLabel();
		saldoLabel = new JLabel();
		cpfLabel = new JLabel();
		telefoneLabel = new JLabel();
		enderecoLabel = new JLabel();
		limiteLabel = new JLabel();
		raLabel = new JLabel();
		tarifaLabel = new JLabel();
		
		nomeNomeField = new JTextField();
		nomeContaField = new JTextField();
		senhaField = new JPasswordField();
		saldoField = new JTextField();
		cpfField = new JTextField();
		telefoneField = new JTextField();
		enderecoField = new JTextField();
		limiteField = new JTextField();
		raField = new JTextField();
		tarifaField = new JTextField();
		
		atualizarButton = new JButton();
		removerButton = new JButton();
		cancelButton = new JButton();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(11, 2));
        
        nomeNomeLabel.setText("Nome:");
        getContentPane().add(nomeNomeLabel);
        getContentPane().add(nomeNomeField);
        
        nomeContaLabel.setText("Número da Conta:");
        getContentPane().add(nomeContaLabel);
        getContentPane().add(nomeContaField);
        
        senhaLabel.setText("Senha:");
        getContentPane().add(senhaLabel);
        getContentPane().add(senhaField);
        
        saldoLabel.setText("Saldo:");
        getContentPane().add(saldoLabel);
        getContentPane().add(saldoField);
        
        cpfLabel.setText("CPF:");
        getContentPane().add(cpfLabel);
        getContentPane().add(cpfField);
        
        telefoneLabel.setText("Telefone:");
        getContentPane().add(telefoneLabel);
        getContentPane().add(telefoneField);
        
        enderecoLabel.setText("Endereço:");
        getContentPane().add(enderecoLabel);
        getContentPane().add(enderecoField);
        
        limiteLabel.setText("Limite:");
        getContentPane().add(limiteLabel);
        getContentPane().add(limiteField);
        
        raLabel.setText("RA:");
        getContentPane().add(raLabel);
        getContentPane().add(raField);
        
        tarifaLabel.setText("Tarifa:");
        getContentPane().add(tarifaLabel);
        getContentPane().add(tarifaField);
        
        atualizarButton.setText("Atualizar");
        getContentPane().add(atualizarButton);
        removerButton.setText("Excluir");
        getContentPane().add(removerButton);
        //cancelButton.setText("Cancelar");
        //getContentPane().add(cancelButton);
        
        
        
        
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
	}
	
	private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
		this.dispose();
	}
	

	public static void main(String[] args) {
	//Listar Informações da Conta
			BancoFacade bancoFacade = new BancoFacade(new ContaService());
			
			List<Conta> contas = null;
			try {
				contas = bancoFacade.listarContas();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			for (Conta conta : contas) {
				System.out.println(conta);
			}
		}
}
