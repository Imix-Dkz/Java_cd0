package cjd0_PF;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
	private JLabel lbl1, lbl2;
	private JCheckBox check1;
	private JButton btn1, btn2;
	private JScrollPane scrollPane1;
	private JTextArea txtArea1;
	
	public Licencia(){
		setLayout(null);
		setTitle("Licencia de uso");
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		
		lbl1 = new JLabel("TÉRMINOS Y CONDICIONES");
		lbl1.setBounds(215, 5, 200, 30);
		lbl1.setFont(new Font("Andale Mono", 1, 14));
		lbl1.setForeground(new Color(0,0,0));
		add(lbl1);
		
		txtArea1 = new JTextArea();
		txtArea1.setEditable(false);
		txtArea1.setFont(new Font("Andale Mono", 0, 9));
		String tYC = "\n\n\tTERMINOS Y CONDICIONES"
				+"\n"
				+"\n\t A. PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA EMPRESA QUE LO USE"
				+"\n\t B. PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE INTERFACES"
				+"\n\t C. LA EMPRESA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE"
				+"\n"
				+"\n\t Los acuerdos legales expuestos a continuación rigen el uso que usted haga de este software"
				+"\n\t (Empresa y autor), no se hacen responsables del uso que usted "
				+"\n\t haga con este software y sus servicios. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN \"ACEPTAR\""
				+"\n\t SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN \"NO ACEPTO\" Y NO UTILICE ESTE SOFTWARE."
				+"\n"
				+"\n\t PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE:"
				+"\n\t\t https://github.com/Imix-Dkz";
			
		txtArea1.setText(tYC);
		scrollPane1 = new JScrollPane(txtArea1);
		scrollPane1.setBounds(10, 40, 575, 200);
		add(scrollPane1);
		
		check1 = new JCheckBox("Yo Acepto");
		check1.setBounds(10, 250, 300, 30);
		check1.addChangeListener(this);
		add(check1);
		
		btn1 = new JButton("Continuar");
		btn1.setBounds(10, 290, 100, 30);
		btn1.addActionListener(this);
		btn1.setEnabled(false);
		add(btn1);
		
		btn2 = new JButton("No Acepto");
		btn2.setBounds(120, 290, 100, 30);
		btn2.addActionListener(this);
		btn2.setEnabled(true);
		add(btn2);
		
		ImageIcon logoCoca = new ImageIcon( getClass().getResource("images/coca-cola.png") );
		lbl2 = new JLabel(logoCoca);
		lbl2.setBounds(310, 135, 300, 300);
		add(lbl2);
	}
	
	public void stateChange(ChangeEvent e){
		if(check1.isSelected()==true) {}
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1) {}
		if(e.getSource()==btn2) { System.exit(0); }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Licencia winLicencia = new Licencia();
		winLicencia.setBounds(0, 0, 610, 380);
		winLicencia.setVisible(true);
		winLicencia.setResizable(false);
		winLicencia.setLocationRelativeTo(null);
	}

}
