package cjd0;
import javax.swing.*;
import java.awt.event.*;

public class V27_JButton extends JFrame implements ActionListener{
	//Al agregar "implements ActionListener" se le indica que tiene que estar al pendiente a las acciones de botones o similares
	
	JButton btn1;
	public V27_JButton() {
		setLayout(null);
		btn1 = new JButton("Cerrar");
		btn1.setBounds(100, 85, 100, 30);
		add(btn1);
		btn1.addActionListener(this); //Con esto se le añade la espera del evento al clickear el boton
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1){ //Se valida que el origen del evento sea el boton correcto
			System.exit(0);						
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V27_JButton form1 = new V27_JButton();
		form1.setBounds(0,0, 300, 250);
		form1.setVisible(true);
		form1.setResizable(false);
		form1.setLocationRelativeTo(null);
	}

}
