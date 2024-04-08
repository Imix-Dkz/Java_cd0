package cjd0;
import javax.swing.*;
import java.awt.event.*;

public class V31_JScrollPane extends JFrame implements ActionListener{
	private JTextField textField1;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;
	private JButton btn1;
	
	public V31_JScrollPane() {
		setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(10, 10, 250, 20);
		add(textField1);
		
		textArea1 = new JTextArea();
		scrollPane1 = new JScrollPane(textArea1); //Como el objeto "textArea1" esta dentro de scrollPane...
		scrollPane1.setBounds(10, 35, 250, 200); //El tamaño se asigna al scroll pane
		add(scrollPane1);
		
		btn1 = new JButton("Cerrar");
		btn1.setBounds(85, 238, 100, 25);
		btn1.addActionListener(this);
		add(btn1);
		
		
		setTitle("JScrollPane");
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1){ //Se valida que el origen del evento sea el boton correcto
			System.exit(0);						
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V31_JScrollPane form1 = new V31_JScrollPane();
		form1.setBounds(0, 0, 285, 305);
		form1.setVisible(true);
		form1.setResizable(false);
		form1.setLocationRelativeTo(null);
	}

}
