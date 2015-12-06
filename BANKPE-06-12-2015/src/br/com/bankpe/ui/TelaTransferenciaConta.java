package br.com.bankpe.ui;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTransferenciaConta extends JFrame implements ActionListener{
	
	private JLabel nomeContaLabel;
	private JLabel valorDepositoLabel;
	private JLabel nomeContaLabel1;
	
	private JTextField nomeContaField;
	private JTextField valorDepositoField;
	private JTextField nomeContaField1;
	
	private JButton confirmarButton;
	private JButton cancelarButton;
	
	public TelaTransferenciaConta(String titulo){
		super();
		
		setTitle("Transferências Bancárias");
		setSize(630, 400);
		setLocation(500, 280);
		setResizable(false); 
		criarFormulario();
		setVisible(true);
	}
	
	
	public void criarFormulario(){
		
		nomeContaLabel = new JLabel();
		nomeContaField = new JTextField();
		nomeContaLabel1 = new JLabel();
		nomeContaField1 = new JTextField();
		valorDepositoLabel = new JLabel();
		valorDepositoField = new JTextField();
		confirmarButton = new JButton();
		cancelarButton = new JButton();
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(4, 2, 5, 5));
		 
		 
		 nomeContaLabel.setText("Número da Conta:");
	     getContentPane().add(nomeContaLabel);
	     getContentPane().add(nomeContaField);
	     
	     valorDepositoLabel.setText("Valor do Depósito:");
	     getContentPane().add(valorDepositoLabel);
	     getContentPane().add(valorDepositoField);
	     
	     nomeContaLabel1.setText("Número da Conta à receber:");
	     getContentPane().add(nomeContaLabel1);
	     getContentPane().add(nomeContaField1);
		 
	     confirmarButton.setText("Confirmar");
	     getContentPane().add(confirmarButton);
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


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
