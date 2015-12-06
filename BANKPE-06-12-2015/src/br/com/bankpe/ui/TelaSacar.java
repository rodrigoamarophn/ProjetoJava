package br.com.bankpe.ui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaSacar extends JFrame {

	private JLabel nomeContaLabel;
	private JLabel valorSaqueLabel;
	
	private JTextField nomeContaField;
	private JTextField valorSaqueField;
	
	private JButton sacarButton;
	private JButton cancelarButton;
	
	public TelaSacar() {
		super();
		
		setTitle("Saque");
		setSize(630, 400);
		setLocation(500, 280);
		setResizable(false); 
		criarFormulario();
		setVisible(true);
	}
	
	
	public void criarFormulario() {
		
		nomeContaLabel = new JLabel();
		valorSaqueLabel = new JLabel();
		nomeContaField = new JTextField();
		valorSaqueField = new JTextField();
		sacarButton = new JButton();
		cancelarButton = new JButton();
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(3, 2));
		
		
		nomeContaLabel.setText("Número da Conta: ");
		getContentPane().add(nomeContaLabel);
		getContentPane().add(nomeContaField);
		
		valorSaqueLabel.setText("Valor de Saque: ");
		getContentPane().add(valorSaqueLabel);
		getContentPane().add(valorSaqueField);
		
		sacarButton.setText("Sacar");
		getContentPane().add(sacarButton);
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
