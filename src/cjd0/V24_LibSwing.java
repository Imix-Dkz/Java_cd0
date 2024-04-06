package cjd0;
import javax.swing.*;

public class V24_LibSwing extends JFrame{
	private JLabel label1;
	
	public V24_LibSwing() {
		setLayout(null);
		label1 = new JLabel("Mensaje en Formulario DKZ");
		label1.setBounds(10, 20, 200, 300); //Cord X, Y, Ancho A, Alto B
		add(label1);		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V24_LibSwing form1 = new V24_LibSwing();
		form1.setBounds(0,0, 400, 300);
		form1.setVisible(true);
		form1.setLocationRelativeTo(null);
	}
}
