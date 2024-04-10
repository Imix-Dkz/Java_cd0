package cjd0;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class V39_JBtnJChk extends JFrame implements ChangeListener, ActionListener{
	private JLabel lbl1;
	private JCheckBox check1;
	private JButton btn1, btnClose;
	
	public V39_JBtnJChk(){
		setLayout(null);
		setTitle("Terminos y Condiciones");
		
		lbl1 = new JLabel("Aceptar Terminos y Condiciones");
		lbl1.setBounds(10, 10, 350, 30);
		add(lbl1);
		
		check1 = new JCheckBox("Acepto");
		check1.setBounds(10, 35, 100, 30);
		check1.addChangeListener(this);
		add(check1);
		
		btn1 = new JButton("Continuar");
		btn1.setBounds(110, 35, 100, 30);
		btn1.addActionListener(this);
		btn1.setEnabled(false);
		add(btn1);
		
		btnClose = new JButton("Cerrar");
		btnClose.setBounds(100, 75, 75, 35);
		add(btnClose);
		btnClose.addActionListener(this);
	}
	
	public void stateChanged(ChangeEvent e) {
		if(check1.isSelected()==true)
			{ btn1.setEnabled(true); }
		else{ btn1.setEnabled(false); }
	}
	
	public void actionPerformed(ActionEvent e) {
		if( e.getSource()==btn1){ System.exit(0); }
		if( e.getSource()==btnClose){ System.exit(0); }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V39_JBtnJChk form1 = new V39_JBtnJChk();
		form1.setBounds(0, 0, 300, 165);
		form1.setVisible(true);
		form1.setResizable(false);
		form1.setLocationRelativeTo(null);
	}

}
