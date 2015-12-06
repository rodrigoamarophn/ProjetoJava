package br.com.bankpe.ui;

//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastrarConta extends JFrame implements ActionListener{ // ou extends JDialog

	private JLabel firstNameLabel;
	private JLabel contaLabel;
	private JLabel senhaLabel;
	private JLabel cpfLabel;
	private JLabel endereçoLabel;
	private JLabel telefoneLabel;
	private JLabel raLabel;
	
	private JTextField firstNameField;
	private JTextField contaField;
	private JTextField senhaField;
	private JTextField cpfField;
	private JTextField endereçoField;
	private JTextField telefoneField;
	private JTextField raField;
	
	private JButton adcButton;
	private JButton cancelButton;
	
	public TelaCadastrarConta(String titulo){
		super();
		
		setSize(630, 400);
		setLocation(500, 280);
		setResizable(false); 
		criarFormulario();
		setVisible(true);
	}
	
	public void criarFormulario(){
		
		firstNameLabel = new JLabel();
        firstNameField = new JTextField();
        contaLabel = new JLabel();
        contaField = new JTextField();
        senhaLabel = new JLabel();
        senhaField = new JTextField();
        cpfLabel = new JLabel();
        cpfField = new JTextField();
        endereçoLabel = new JLabel();
        endereçoField = new JTextField();
        telefoneLabel = new JLabel();
        telefoneField = new JTextField();
        raLabel = new JLabel();
        raField  = new JTextField();
        adcButton = new JButton();
        cancelButton = new JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Conta");
        getContentPane().setLayout(new java.awt.GridLayout(8, 2, 5, 5));
        
        firstNameLabel.setText("Nome:");
        getContentPane().add(firstNameLabel);
        getContentPane().add(firstNameField);

        contaLabel.setText("Conta:");
        getContentPane().add(contaLabel);
        getContentPane().add(contaField);

        senhaLabel.setText("Senha:");
        getContentPane().add(senhaLabel);
        getContentPane().add(senhaField);
        
        cpfLabel.setText("Cadastro de Pessoa Física:");
        getContentPane().add(cpfLabel);
        getContentPane().add(cpfField);

        endereçoLabel.setText("Endereço:");
        getContentPane().add(endereçoLabel);
        getContentPane().add(endereçoField);

        telefoneLabel.setText("Telefone:");
        getContentPane().add(telefoneLabel);
        getContentPane().add(telefoneField);
        
        raLabel.setText("RA:");
        getContentPane().add(raLabel);
        getContentPane().add(raField);
        
        adcButton.setText("Adicionar");
        adcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcButtonActionPerformed(evt);
            }
        });
        getContentPane().add(adcButton);

        
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton);

        pack();
    }         
	
		private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
			this.dispose();
		}             
     
		private void adcButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        StringBuilder warnings = new StringBuilder();
	        String firstName = "", conta = "", cpf = "", endereçoString = "";
	        //double amount = 0;
	        
	        if (firstNameField.getText().isEmpty()) {
	            warnings.append("Campo requerido.\n");
	        } else {
	            firstName = firstNameField.getText();
	        }
	       
	        if (contaField.getText().isEmpty()) {
	            warnings.append("Campo requerido.\n");
	        } else {
	        	conta = contaField.getText();
	        }
	        
	        if (!cpfField.getText().isEmpty()) {
	            warnings.append("CPF Inválido.\n");
	        } else {
	            cpf = cpfField.getText();
	        }
	        
	        if (endereçoField.getText().isEmpty()) {
	        	warnings.append("Campo requerido.\n");
	        } else {
	        	endereçoString = endereçoField.getText();
	        }
	        
	        
//	        if (depositField.getText().isEmpty()) {
//	            warnings.append("Valor Inválido.");
//	        } else {
//	            try {
//	                amount = Banco.round(Double.parseDouble(depositField.getText()), 2);
//	            } catch (NumberFormatException ex) {
//	                warnings.append("Valor Inválido.");
//	            }
//	        }
//	        if (warnings.length() > 0) {
//	            JOptionPane.showMessageDialog(this, warnings.toString(), "Campo Inválido", JOptionPane.WARNING_MESSAGE);
//	        } else {
//	            Conta conta = null;
//	            if (typeField.getSelectedItem().toString() == "Corrente") {
//	                if (amount >= 100) {
//	                    conta = new CCorrente(amount);
//	                } else {
//	                    warnings.append("Valor deve ser maior que 100R$");
//	                }
//	            } else if (typeField.getSelectedItem().toString() == "Savings") {
//	                if (amount >= 50) {
//	                    conta = new CPoupanca(amount);
//	                } else {
//	                    warnings.append("Valor deve ser maior que 50R$.");
//	                }
//	            }
//	            if (conta != null) {
//	                cliente = new Cliente(firstName, lastName, cpf, conta);
//	                banco.addCliente(cliente);
//	                this.dispose();
//	            } else {
//	                JOptionPane.showMessageDialog(this, warnings.toString(), "Campo Inválido", JOptionPane.WARNING_MESSAGE);
//	            }
//	        }
	    }         
		
		
   
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
