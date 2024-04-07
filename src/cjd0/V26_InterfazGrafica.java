package cjd0;
import javax.swing.*;

public class V26_InterfazGrafica extends JFrame{
	
	//Inicialización de elementos del formulario
	private JLabel label1; //Todos los lable tiene que ser privadas, para evitar confusión
	private JLabel label2;
	
	public V26_InterfazGrafica() { //Constructor
		setLayout(null); //Asi se le indica que se usarán coordenadas para ubicar los elementos
		label1 = new JLabel("Interfaz Grafica");
		label1.setBounds(10, 20, 300, 30);
		add(label1);
		label2 = new JLabel("Versión 1.0");
		label2.setBounds(10, 100, 100, 30);
		add(label2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Se crea VENTANA del formulario
		V26_InterfazGrafica form1 = new V26_InterfazGrafica();
		form1.setBounds(0,0, 300, 200);
		form1.setResizable(false); //No se puede mover
		form1.setVisible(true);
		form1.setLocationRelativeTo(null); //Con esto queda centrado en la pantalla
	}

}
