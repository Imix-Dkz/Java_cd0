package cjd0;
import javax.swing.*;
import java.awt.event.*;

public class V32_JTF_JTA extends JFrame implements ActionListener{
	private JTextField textField1;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;
	private JButton btnAdd, btnClose, btnLimpiar;
	private String texto="";
	
	public V32_JTF_JTA(){
		setLayout(null);
		setTitle("TextField to TextArea");
		
		textField1 = new JTextField();
		textField1.setBounds(10, 10, 160, 20);
		add(textField1);
		
		textArea1 = new JTextArea();
		scrollPane1 = new JScrollPane(textArea1); //Como el objeto "textArea1" esta dentro de scrollPane...
		scrollPane1.setBounds(10, 35, 250, 200); //El tamaño se asigna al scroll pane
		add(scrollPane1);
		
		btnAdd = new JButton("Agregar");
		btnAdd.setBounds(175, 10, 80, 20);
		add(btnAdd);
		btnAdd.addActionListener(this);
		
		//Se añade boton de limpieza de campos		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(40, 240, 85, 25);
		add(btnLimpiar);
		btnLimpiar.addActionListener(this);
		//Boton de cierre de ventana
		btnClose = new JButton("Cerrar");
		btnClose.setBounds(135, 240, 85, 25);
		add(btnClose);
		btnClose.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) {
			texto += textField1.getText()+"\n";
			textArea1.setText(texto);
			textField1.setText("");
		}
		if(e.getSource()==btnLimpiar) {
			texto = "";
			textArea1.setText(texto);
			textField1.setText("");
		}
		if(e.getSource()==btnClose){ //Se valida que el origen del evento sea el boton correcto
			System.exit(0);						
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V32_JTF_JTA form1 = new V32_JTF_JTA();
		form1.setBounds(0, 0, 285, 310);
		form1.setVisible(true);
		form1.setResizable(false);
		form1.setLocationRelativeTo(null);
	}
}
