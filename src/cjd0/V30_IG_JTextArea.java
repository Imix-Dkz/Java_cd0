package cjd0;
import javax.swing.*;
//import java.awt.event.*;

public class V30_IG_JTextArea extends JFrame{
	private JTextField textField1;
	private JTextArea textArea1;
	
	public V30_IG_JTextArea() {
		setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(10, 10, 200, 30);
		add(textField1);
		
		textArea1 = new JTextArea();
		textArea1.setBounds(10, 50, 400, 300);
		add(textArea1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V30_IG_JTextArea form1 = new V30_IG_JTextArea();
		form1.setBounds(0, 0, 550, 400);
		form1.setVisible(true);
		form1.setResizable(false);
		form1.setLocationRelativeTo(null);
	}

}
