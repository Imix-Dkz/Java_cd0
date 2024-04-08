package cjd0;
import javax.swing.*;
import java.awt.event.*;

public class V29_JTextField extends JFrame implements ActionListener {
	//Primero se declarán los elementos que contendrá el formulario
	private JTextField textField1;
	private JLabel label1;
	private JButton btn1;
	
	public V29_JTextField()
	{ //Luego se indican las caracterisiticas que tendrán lo elementos en el formulario 
		setLayout(null);
		label1 = new JLabel("Usuario:");
		label1.setBounds(10,10,100, 30);
		add(label1);
		
		textField1 = new JTextField();
		textField1.setBounds(120,  17, 100, 30);
		add(textField1);
		
		btn1 = new JButton("Aceptar");
		btn1.setBounds(10, 80, 100, 30);
		add(btn1);
		btn1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if( e.getSource()==btn1 ){
			String texto = textField1.getText();
			setTitle(texto);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V29_JTextField form1 = new V29_JTextField();
		form1.setBounds(0, 0, 300, 150);
		form1.setVisible(true);
		form1.setResizable(false);
	}

}
