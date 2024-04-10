package cjd0;
import javax.swing.*;
import java.awt.event.*;

public class V34_JComboBox extends JFrame implements ItemListener{
	private JComboBox combo1;
	
	public V34_JComboBox(){
		setLayout(null);
		combo1 = new JComboBox();
		combo1.setBounds(75, 10, 80, 20);
		add(combo1);
		
		combo1.addItem("Rojo");
		combo1.addItem("Verde");
		combo1.addItem("Azul");
		combo1.addItem("Amarillo");
		combo1.addItem("Negro");
		combo1.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e){
		if(e.getSource()==combo1){
			String selColor = combo1.getSelectedItem().toString(); 
			setTitle(selColor);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V34_JComboBox form1 = new V34_JComboBox();
		form1.setBounds(0, 0, 250, 85);
		form1.setVisible(true);
		form1.setResizable(false);
		form1.setLocationRelativeTo(null);

	}

}
