package cjd0;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//public class V38_CheckBox extends JFrame implements ChangeListener
public class V38_CheckBox extends JFrame implements ChangeListener, ActionListener
{ //Cuando se hace uso de JCheckBox, se usa ChangeListener
	private JCheckBox check1, check2, check3;
	private JButton btnClose;
	
	public V38_CheckBox() {
		setLayout(null);
		setTitle("Checker Title...");
		
		check1 = new JCheckBox("Inglés");
		check1.setBounds(5, 10, 75, 30);
		check1.addChangeListener(this);
		add(check1);
		check2 = new JCheckBox("Español");
		check2.setBounds(85, 10, 75, 30);
		check2.addChangeListener(this);
		add(check2);
		check3 = new JCheckBox("Frances");
		check3.setBounds(165, 10, 75, 30);
		check3.addChangeListener(this);
		add(check3);
		
		btnClose = new JButton("Cerrar");
		btnClose.setBounds(75, 45, 75, 35);
		add(btnClose);
		btnClose.addActionListener(this);
	}
	
	public void stateChanged(ChangeEvent e) {
		String cad = "";
		if(check1.isSelected()==true){ cad += "Ingles "; }
		if(check2.isSelected()==true){ cad += "Español "; }
		if(check3.isSelected()==true){ cad += "Frances"; }
		setTitle(cad);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btnClose){ System.exit(0); }		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V38_CheckBox form1 = new V38_CheckBox();
		form1.setBounds(0, 0, 350, 150);
		form1.setVisible(true);
		form1.setResizable(false);
		form1.setLocationRelativeTo(null);
	}

}
