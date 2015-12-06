package br.com.bankpe.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class TelaPesquisarConta extends JFrame {

	private JLabel nomeContaLabel;
	
	private JTextField nomeContaField;
	
	private JButton psqButton;
	private JButton cancelButton;
	
	public TelaPesquisarConta(){
		super();
		
		setTitle("Pesquisar Conta");
		setSize(330, 100);
		setLocation(500, 280);
		setResizable(false); 
		criarFormulario();
		setVisible(true);
		
	}
	
	public void criarFormulario(){
		
		nomeContaLabel = new JLabel();
		nomeContaField = new JTextField();
		psqButton = new JButton();
		cancelButton = new JButton();
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(2, 2));
        
        nomeContaLabel.setText("Número da Conta:");
        getContentPane().add(nomeContaLabel);
        getContentPane().add(nomeContaField);
        
        psqButton.setText("Pesquisar");
        getContentPane().add(psqButton);
        cancelButton.setText("Cancelar");
        getContentPane().add(cancelButton);
        
        PesquisarAction psqAction = new PesquisarAction();
        psqButton.addActionListener(psqAction);
        
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
	
	private class PesquisarAction implements ActionListener{ 
		public void actionPerformed(ActionEvent e){
			if (e.getSource().equals(psqButton)){
//				UsuarioAdmin u = new UsuarioAdmin();
//				u.setLogin(nomeContaLabel.getText());
//				u.setSenha(nomeContaField.getText());
				JOptionPane.showMessageDialog(null, "Cliente encontrado com sucesso!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
				new TelaVerConta();
				setVisible(false);
			} 

		}
	}
}
