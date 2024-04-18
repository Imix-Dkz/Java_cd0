package cjd0_PF;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener{
	private JTextField txtField1;
	private JLabel lbl1, lbl2, lbl3, lbl4;
	private JButton btn1;
	//Se añade variable de texto de uso general... 
	public static String texto = "";
	
	public Bienvenida() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bienvenido!!!");
		Color clrCoca = new Color(255, 0, 0);
		Color clrBlanco = new Color(255, 255, 255);
		//Font andaleMono = new Font();
		
		getContentPane().setBackground(clrCoca);
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		
		//ImageIcon logoCoca = new ImageIcon("images/logo-coca.png");
		ImageIcon logoCoca = new ImageIcon( getClass().getResource("images/logo-coca.png") );
		lbl1 = new JLabel(logoCoca);
		lbl1.setBounds(25, 15, 300, 150);
		add(lbl1);
		
		lbl2 = new JLabel("Sistema de Control Vacacional");
		lbl2.setBounds(35, 135, 300, 30);
		lbl2.setFont(new Font("Andale Mono", 3, 18));
		lbl2.setForeground(clrBlanco);
		add(lbl2);
		
		lbl3 = new JLabel("Ingrese su nombre");
		lbl3.setBounds(45, 212, 200, 30);
		lbl3.setFont(new Font("Andale Mono", 1, 12));
		lbl3.setForeground(clrBlanco);
		add(lbl3);
		
		lbl4 = new JLabel("©2024 The Coca-Cola Company");
		lbl4.setBounds(85, 375, 300, 30);
		lbl4.setFont(new Font("Andale Mono", 1, 12));
		lbl4.setForeground(clrBlanco);
		add(lbl4);
		
		txtField1 = new JTextField();
		txtField1.setBounds(45, 240, 255, 25);
		txtField1.setBackground(new Color(224, 224, 224));
		txtField1.setFont(new Font("Andale Mono", 1, 12));
		txtField1.setForeground(clrCoca);
		add(txtField1);
		
		btn1 = new JButton("Ingresar...");
		btn1.setBounds(105, 280, 120, 30);
		btn1.setBackground(clrBlanco);
		btn1.setFont(new Font("Andale Mono", 1, 14));
		btn1.setForeground(clrCoca);
		btn1.addActionListener(this);
		add(btn1);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource( )== btn1) {
			//trim(), le quita los espacios de inicio y fin de la cadena
			texto = txtField1.getText().trim();
			if( texto.equals("") ) {
				JOptionPane.showMessageDialog(null, "Debes Ingresar tu nombre");
			}else{ //Se Crea la interfaz de TyC 
				Licencia winLicencia = new Licencia();
				winLicencia.setBounds(0, 0, 610, 380);
				winLicencia.setVisible(true);
				winLicencia.setResizable(false);
				winLicencia.setLocationRelativeTo(null);
				
				//Se desactiva la ventana de bienvenida 
				this.setVisible(false);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bienvenida winBienvenida = new Bienvenida();
		winBienvenida.setBounds(0, 0, 350, 450);
		winBienvenida.setVisible(true);
		winBienvenida.setResizable(false);
		winBienvenida.setLocationRelativeTo(null);
	}

}
