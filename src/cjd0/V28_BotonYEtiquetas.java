package cjd0;
import javax.swing.*;
import java.awt.event.*;

public class V28_BotonYEtiquetas extends JFrame implements ActionListener{
	private JButton btn1, btn2, btn3, btnSalir;
	private JLabel label1;
	
	public V28_BotonYEtiquetas(){
		setLayout(null);
		btn1 = new JButton("1");
		btn1.setBounds(10, 85, 50, 30);
		add(btn1);
		btn1.addActionListener(this);
		
		btn2 = new JButton("2");
		btn2.setBounds(110, 85, 50, 30);
		add(btn2);
		btn2.addActionListener(this);
		
		btn3 = new JButton("3");
		btn3.setBounds(210, 85, 50, 30);
		add(btn3);
		btn3.addActionListener(this);
		
		label1 = new JLabel("En espera...");
		label1.setBounds(100, 30, 300, 30);
		add(label1);
		
		//Botón de salida
		btnSalir = new JButton("Cerrar");
		btnSalir.setBounds(95, 125, 75, 30);
		add(btnSalir);
		btnSalir.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		label1.setBounds(50, 30, 300, 30);
		if(e.getSource()==btn1){ label1.setText("Se realizo Click en Botón UNO"); }
		if(e.getSource()==btn2){ label1.setText("Se realizo Click en Botón DOS"); }
		if(e.getSource()==btn3){ label1.setText("Se realizo Click en Botón TRES"); }
		
		if(e.getSource()==btnSalir){ System.exit(0); }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V28_BotonYEtiquetas form1 = new V28_BotonYEtiquetas();
		form1.setBounds(0,0, 285, 220);
		form1.setResizable(false);
		form1.setVisible(true);
		form1.setLocationRelativeTo(null);
	}

}
