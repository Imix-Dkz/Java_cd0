package cjd0;
import javax.swing.*;

public class V25_InterfazGrafica extends JFrame {
	
	public V25_InterfazGrafica(){
		setLayout(null);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V25_InterfazGrafica form1 = new V25_InterfazGrafica();
		form1.setBounds(0,0, 333, 250); //X,Y, Ancho, Alto
		form1.setVisible(true);
		form1.setLocationRelativeTo(null); //Esto manda la interfaz al centro
		form1.setResizable(false);
	}

}
