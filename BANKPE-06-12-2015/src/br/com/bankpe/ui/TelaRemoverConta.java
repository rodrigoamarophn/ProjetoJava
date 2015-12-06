package br.com.bankpe.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaRemoverConta extends JFrame {

	private JLabel nomeContaLabel;
	
	private JTextField nomeContaField;
	
	private JButton rmvButton;
	private JButton cancelButton;
	
	public TelaRemoverConta() {
		super();
		
		setTitle("Remover Conta");
		setSize(330, 100);
		setLocation(500, 280);
		setResizable(false); 
		criarFormulario();
		setVisible(true);
		
	}
	
	public void criarFormulario(){
		
		nomeContaLabel = new JLabel();
		nomeContaField = new JTextField();
		rmvButton = new JButton();
		cancelButton = new JButton();
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(2, 2));
        
        nomeContaLabel.setText("Numero da Conta:");
        getContentPane().add(nomeContaLabel);
        getContentPane().add(nomeContaField);
        
        rmvButton.setText("Remover");
        getContentPane().add(rmvButton);
        cancelButton.setText("Cancelar");
        getContentPane().add(cancelButton);
        
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
}
