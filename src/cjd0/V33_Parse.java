package cjd0;
import javax.swing.*;
import java.awt.event.*;

public class V33_Parse extends JFrame implements ActionListener{
	private JTextField txtF1, txtF2;
	private JLabel lbl1, lbl2, lbl3;
	private JButton btn1;
	
	public V33_Parse() {
		setLayout(null);
		setTitle("Parseo de valores: SUMA");
		
		lbl1 = new JLabel("1er Valor:");
		lbl1.setBounds(50, 5, 100, 30);
		add(lbl1);
		
		lbl2 = new JLabel("2do Valor:");
		lbl2.setBounds(50, 35, 100, 30);
		add(lbl2);
		
		lbl3 = new JLabel("Resultado:");
		lbl3.setBounds(140, 80, 100, 30);
		add(lbl3);
		
		txtF1 = new JTextField();
		txtF1.setBounds(120, 10, 150, 20);
		add(txtF1);
		
		txtF2 = new JTextField();
		txtF2.setBounds(120, 40, 150, 20);
		add(txtF2);
		
		btn1 = new JButton("Sumar");
		btn1.setBounds(20, 80, 100, 30);
		add(btn1);
		btn1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1){
			int valor1=0, valor2=0, result=0;
			
			valor1 = Integer.parseInt(txtF1.getText());
			valor2 = Integer.parseInt(txtF2.getText());
			
			result = valor1 + valor2;
			lbl3.setText(" Resultado: "+result);
		}
		/*if(e.getSource()==btnLimpiar) {
			texto = "";
			textArea1.setText(texto);
			textField1.setText("");
		}
		if(e.getSource()==btnClose){ //Se valida que el origen del evento sea el boton correcto
			System.exit(0);						
		}*/
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V33_Parse form1 = new V33_Parse();
		form1.setBounds(0, 0, 330, 155);
		form1.setVisible(true);
		form1.setResizable(false);
		form1.setLocationRelativeTo(null);
	}

}
