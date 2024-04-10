package cjd0;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class V36_JMenuBar extends JFrame implements ActionListener{
	private JMenuBar menuBar;
	private JMenu menu1;
	private JMenuItem menuItem1, menuItem2, menuItem3;
	private JButton btnClose;
	
	public V36_JMenuBar() {
		setLayout(null);
		setTitle("Menu selector de color");
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menu1 = new JMenu("Opciones");
		menuBar.add(menu1);
		
		menuItem1 = new JMenuItem("Rojo");
			menuItem1.addActionListener(this);
			menu1.add(menuItem1);
		menuItem2 = new JMenuItem("Verde");
			menuItem2.addActionListener(this);
			menu1.add(menuItem2);
		menuItem3 = new JMenuItem("Azul");
			menuItem3.addActionListener(this);
			menu1.add(menuItem3);
			
		btnClose = new JButton("Cerrar");
		btnClose.setBounds(30, 30, 50, 25);
		add(btnClose);
	}
	
	public void actionPerformed(ActionEvent e){
		Container fondo = this.getContentPane();
		//Color color1 = new Color(rojo, verde, azul);
		if(e.getSource()==menuItem1) { fondo.setBackground( new Color(255, 0, 0) ); }
		if(e.getSource()==menuItem2) { fondo.setBackground( new Color(0, 255, 0) ); }
		if(e.getSource()==menuItem3) { fondo.setBackground( new Color(0, 0, 255) ); }
		//Botton de Cierre
		if(e.getSource()==btnClose){ System.exit(0); }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V36_JMenuBar form1 = new V36_JMenuBar();
		form1.setBounds(0, 0, 300, 200);
		form1.setVisible(true);
		//form1.setResizable(false);
		form1.setLocationRelativeTo(null);
	}

}
