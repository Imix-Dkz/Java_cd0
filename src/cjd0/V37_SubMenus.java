package cjd0;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class V37_SubMenus extends JFrame implements ActionListener{
	private JMenuBar menuBar;
	private JMenu m1Opciones, m1Menu2, m1Menu3;
	private JMenuItem m1MenuItem1, m1MenuItem2, m2MenuItem3, m2MenuItem4, m1Close;
	private JButton btnClose;
	
	public V37_SubMenus() {
		setLayout(null);
		setTitle("Conotrol con SubMenus");
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		m1Opciones = new JMenu("Opciones");
		menuBar.add(m1Opciones);
			m1Menu2 = new JMenu("Tamaño de Ventana");
			m1Opciones.add(m1Menu2);
				m1MenuItem1 = new JMenuItem("300 x 200");
				m1Menu2.add(m1MenuItem1);
				m1MenuItem1.addActionListener(this);
				m1MenuItem2 = new JMenuItem("640 x 480");
				m1Menu2.add(m1MenuItem2);
				m1MenuItem2.addActionListener(this);
			m1Menu3 = new JMenu("Color de Fondo");
			m1Opciones.add(m1Menu3);
				m2MenuItem3 = new JMenuItem("Rojo");
				m1Menu3.add(m2MenuItem3);
				m2MenuItem3.addActionListener(this);
				m2MenuItem4 = new JMenuItem("Verde");
				m1Menu3.add(m2MenuItem4);
				m2MenuItem4.addActionListener(this);
			m1Close = new JMenuItem("Salir");
			m1Opciones.add(m1Close);
			m1Close.addActionListener(this);
				
		btnClose = new JButton("Cerrar");
		btnClose.setBounds(100, 100, 75, 25);
		add(btnClose);
		btnClose.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		//Opciones de Tamaño
		if(e.getSource()== m1MenuItem1 ){ setSize(300, 200); }
		if(e.getSource()== m1MenuItem2 ){ setSize(640, 480); }
		//Opciones de Color
		//Container fondo = this.getContentPane();
		if(e.getSource()== m2MenuItem3 ){ getContentPane().setBackground(new Color(255, 0, 0)); }
		if(e.getSource()== m2MenuItem4 ){ getContentPane().setBackground(new Color(0, 255, 0)); }
		
		//Cierre
		if(e.getSource()== btnClose) { System.exit(0); }
		if(e.getSource()== m1Close) { System.exit(0); }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V37_SubMenus form1 = new V37_SubMenus();
		form1.setBounds(0, 0, 300, 200);
		form1.setVisible(true);
		form1.setResizable(false);
		form1.setLocationRelativeTo(null);
	}

}
