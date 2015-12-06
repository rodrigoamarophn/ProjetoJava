package br.com.bankpe.ui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaDepositar extends JFrame {

	private JLabel nomeContaLabel;
	private JLabel valorDepositoLabel;
	
	private JTextField nomeContaField;
	private JTextField valorDepositoField;
	
	private JButton depositarButton;
	private JButton cancelarButton;
	
	public TelaDepositar() {
		super();
		
		setTitle("Depósito");
		setSize(630, 400);
		setLocation(500, 280);
		setResizable(false); 
		criarFormulario();
		setVisible(true);
	}
	
	
	public void criarFormulario() {
		
		nomeContaLabel = new JLabel();
		valorDepositoLabel = new JLabel();
		nomeContaField = new JTextField();
		valorDepositoField = new JTextField();
		depositarButton = new JButton();
		cancelarButton = new JButton();
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(3, 2));
		
		
		nomeContaLabel.setText("Número da Conta: ");
		getContentPane().add(nomeContaLabel);
		getContentPane().add(nomeContaField);
		
		valorDepositoLabel.setText("Valor de Depósito: ");
		getContentPane().add(valorDepositoLabel);
		getContentPane().add(valorDepositoField);
		
		depositarButton.setText("Depositar");
		getContentPane().add(depositarButton);
		cancelarButton.setText("Cancelar");
		getContentPane().add(cancelarButton);
		
		 cancelarButton.addActionListener(new java.awt.event.ActionListener() {
	    	 public void actionPerformed(java.awt.event.ActionEvent e) {
	    		 cancelarButtonActionPerformed(e);
	    	 }
	     }); 
	    
	     pack();
		
	}
	
	
	private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
		this.dispose();
	}
}
