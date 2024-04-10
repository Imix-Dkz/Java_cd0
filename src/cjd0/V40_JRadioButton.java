package cjd0;
import javax.swing.*;
import javax.swing.event.*;

public class V40_JRadioButton extends JFrame implements ChangeListener{
	private JRadioButton radio1, radio2, radio3;
	private ButtonGroup bG;
	
	public V40_JRadioButton(){
		setLayout(null);
		setTitle("JRadioButton");
		
		bG = new ButtonGroup();
			radio1 = new JRadioButton("640 x 480");
			radio1.setBounds(10, 20, 100, 30);
			radio1.addChangeListener(this);
			add(radio1);
		bG.add(radio1);
			radio2 = new JRadioButton("720 x 640");
			radio2.setBounds(10, 50, 100, 30);
			radio2.addChangeListener(this);
			add(radio2);
		bG.add(radio2);
			radio3 = new JRadioButton("900 x 720");
			radio3.setBounds(10, 80, 100, 30);
			radio3.addChangeListener(this);
			add(radio3);
		bG.add(radio3);
	}
	
	public void stateChanged(ChangeEvent e) {
		if( radio1.isSelected()) { setSize(640,480); }
		if( radio2.isSelected()) { setSize(720,640); }
		if( radio3.isSelected()) { setSize(900,720); }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V40_JRadioButton form1 = new V40_JRadioButton();
		form1.setBounds(0, 0, 350, 230);
		form1.setVisible(true);
		form1.setResizable(false);
		form1.setLocationRelativeTo(null);
	}

}
