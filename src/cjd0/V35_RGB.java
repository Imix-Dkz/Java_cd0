package cjd0;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class V35_RGB extends JFrame implements ActionListener{
	private JLabel lbl1, lbl2, lbl3;
	private JComboBox combo1, combo2, combo3;
	private JButton btn1, btnClose;
	
	public V35_RGB() {
		setLayout(null);
		setTitle("Selector de color");
		
		//Selector Rojo
		lbl1 = new JLabel("Rojo:");
		lbl1.setBounds(10, 10, 65, 10);
		add(lbl1);
		combo1 = new JComboBox();
		combo1.setBounds(60, 10, 50, 18); 
		for(int i=0; i<=255; i++){
			combo1.addItem(String.valueOf(i));			
		} add(combo1);
		
		
		//Selector Verde
		lbl2 = new JLabel("Verde:");
		lbl2.setBounds(10, 35, 65, 10);
		add(lbl2);
		combo2 = new JComboBox();
		combo2.setBounds(60, 33, 50, 18);
		for(int i=0; i<=255; i++){
			combo2.addItem(String.valueOf(i));			
		} add(combo2);
		
		//Selector Azul
		lbl3 = new JLabel("Azul:");
		lbl3.setBounds(10, 60, 65, 10);
		add(lbl3);
		combo3 = new JComboBox();
		combo3.setBounds(60, 56, 50, 18);
		for(int i=0; i<=255; i++){
			combo3.addItem(String.valueOf(i));			
		} add(combo3);
		
		//Boton de selector de color
		btn1 = new JButton("Colorear");
		btn1.setBounds(130, 12, 100, 30);
		add(btn1);
		btn1.addActionListener(this);
		
		btnClose = new JButton("Cerrar");
		btnClose.setBounds(130, 46, 100, 30);
		add(btnClose);
		btnClose.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			String cad1 = combo1.getSelectedItem().toString();
			String cad2 = combo2.getSelectedItem().toString();
			String cad3 = combo3.getSelectedItem().toString();
			
			int rojo = Integer.parseInt(cad1);
			int verde = Integer.parseInt(cad2);
			int azul= Integer.parseInt(cad3);
			
			Color color1 = new Color(rojo, verde, azul);
			btn1.setBackground(color1);
		}
		if(e.getSource()==btnClose){ System.exit(0); }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V35_RGB formRGB = new V35_RGB();
		formRGB.setBounds(0, 0, 300, 150);
		formRGB.setVisible(true);
		formRGB.setResizable(false);
		formRGB.setLocationRelativeTo(null);
	}

}
