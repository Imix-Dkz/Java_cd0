package cjd0_PF;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Principal extends JFrame implements ActionListener{
	private JMenuBar mb;
	private JMenu mOpciones, mCalcular, mAcercaDe, mColorFondo;
	private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
	private JLabel lLogo, lBienvenido, lTitle, lNombre, lAPaterno, lAMaterno, lDepartamento, lAntiguedad,lResultado, lFooter;
	private JTextField tfNombreTrabajador, tfAPaternoTrabajador, tfAMaternoTrabajador;
	private JComboBox cbDepartamento, cbAntiguedad;
	private JScrollPane sp1;
	private JTextArea ta1;
	private Color cRojo = new Color(255, 0, 0), cBlanco = new Color(255, 255, 255),
			cNegro = new Color(0, 0, 0), cMorado = new Color(51, 0, 51), c224x3 = new Color(224, 224, 224);
	private Font fAMono14 = new Font("Andale Mono", 1, 14);
	private Font fAMono12 = new Font("Andale Mono", 1, 12);
	String nombreUsr = "";
	
	public Principal() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pantalla Principal");
		getContentPane().setBackground(cRojo);
		setIconImage( new ImageIcon( getClass().getResource("images/icon.png") ).getImage() );
		
		//Se obtiene el valor de la variable "texto" de la ventana "winBienvenida"
		Bienvenida winBienvenida = new Bienvenida();
		nombreUsr = winBienvenida.texto;
		
		//Sección del Menú
		mb = new JMenuBar();
		mb.setBackground(cRojo);
		setJMenuBar(mb);
			mOpciones = new JMenu("Opciones");
			mOpciones.setBackground(cRojo);
			mOpciones.setFont(fAMono14);
			mOpciones.setForeground(cBlanco);
				mColorFondo = new JMenu("Color de Fondo");
				mColorFondo.setFont(fAMono14);
				mColorFondo.setForeground(cRojo);
					miRojo = new JMenuItem("Rojo");
					miRojo.setFont(fAMono14);
					miRojo.setForeground(cRojo);
					miRojo.addActionListener(this);
				mColorFondo.add(miRojo);
					miNegro = new JMenuItem("Negro");
					miNegro.setFont(fAMono14);
					miNegro.setForeground(cRojo);
					miNegro.addActionListener(this);
				mColorFondo.add(miNegro);
					miMorado = new JMenuItem("Morado");
					miMorado.setFont(fAMono14);
					miMorado.setForeground(cRojo);
					miMorado.addActionListener(this);
				mColorFondo.add(miMorado);
			mOpciones.add(mColorFondo);
				miNuevo = new JMenuItem("Nuevo");
				miNuevo.setFont(fAMono14);
				miNuevo.setForeground(cRojo);
				miNuevo.addActionListener(this);
			mOpciones.add(miNuevo);
				miSalir = new JMenuItem("Salir");
				miSalir.setFont(fAMono14);
				miSalir.setForeground(cRojo);
				miSalir.addActionListener(this);
			mOpciones.add(miSalir);
		mb.add(mOpciones);
			mCalcular = new JMenu("Clacular");
			mCalcular.setBackground(cRojo);
			mCalcular.setFont(fAMono14);
			mCalcular.setForeground(cBlanco);
				miCalculo = new JMenuItem("Vacaciones");
				miCalculo.setFont(fAMono14);
				miCalculo.setForeground(cRojo);
				miCalculo.addActionListener(this);
			mCalcular.add(miCalculo);
		mb.add(mCalcular);
			mAcercaDe = new JMenu("Acerca De");
			mAcercaDe.setBackground(cRojo);
			mAcercaDe.setFont(fAMono14);
			mAcercaDe.setForeground(cBlanco);
				miElCreador = new JMenuItem("El Creador");
				miElCreador.setFont(fAMono14);
				miElCreador.setForeground(cBlanco);
				miElCreador.addActionListener(this);
			mAcercaDe.add(miElCreador);
		mb.add(mAcercaDe);
		
		//Sección de Labels y Logo Superiores
		ImageIcon imgCoca = new ImageIcon( getClass().getResource("images/logo-coca.png") );
		lLogo = new JLabel(imgCoca);
		lLogo.setBounds(5, 5, 250, 100);
		add(lLogo);
		
		lBienvenido = new JLabel("Bienvenido "+nombreUsr);
		lBienvenido.setBounds(280, 30, 300, 50);
		lBienvenido.setFont(new Font("Andale Mono", 1, 32));
		lBienvenido.setForeground(cBlanco);
		add(lBienvenido);
		
		lTitle = new JLabel("Datos del trabajador para el calculo de vacaiones");
		lTitle.setBounds(45,140, 900, 25);
		lTitle.setFont(new Font("Andale Mono", 0, 24));
		lTitle.setForeground(cBlanco);
		add(lTitle);
		
		//Labels +TextArea || +ComboBox
		lNombre = new JLabel("Nombre Completo");
		lNombre.setBounds(25, 188, 180, 25);
		lNombre.setFont(fAMono12);
		lNombre.setForeground(cBlanco);
		add(lNombre);
		tfNombreTrabajador = new JTextField();
		tfNombreTrabajador.setBounds(25, 213, 150, 25);
		tfNombreTrabajador.setBackground(c224x3);
		tfNombreTrabajador.setFont(fAMono14);
		tfNombreTrabajador.setForeground(cRojo);
		add(tfNombreTrabajador);
		
		lAPaterno = new JLabel("Apellido Paterno");
		lAPaterno.setBounds(25, 248, 180, 25);
		lAPaterno.setFont(fAMono12);
		lAPaterno.setForeground(cBlanco);
		add(lAPaterno);
		tfAPaternoTrabajador = new JTextField();
		tfAPaternoTrabajador.setBounds(25, 273, 150, 25);
		tfAPaternoTrabajador.setBackground(c224x3);
		tfAPaternoTrabajador.setFont(fAMono14);
		tfAPaternoTrabajador.setForeground(cRojo);
		add(tfAPaternoTrabajador);
		
		lAMaterno = new JLabel("Apellido Materno");
		lAMaterno.setBounds(25, 308, 180, 25);
		lAMaterno.setFont(fAMono12);
		lAMaterno.setForeground(cBlanco);
		add(lAMaterno);
		tfAMaternoTrabajador = new JTextField();
		tfAMaternoTrabajador.setBounds(25, 334, 150, 25);
		tfAMaternoTrabajador.setBackground(c224x3);
		tfAMaternoTrabajador.setFont(fAMono14);
		tfAMaternoTrabajador.setForeground(cRojo);
		add(tfAMaternoTrabajador);
		
		lDepartamento = new JLabel("Selecciona el Departamento");
		lDepartamento.setBounds(220, 188, 180, 25);
		lDepartamento.setFont(fAMono12);
		lDepartamento.setForeground(cBlanco);
		add(lDepartamento);
		cbDepartamento = new JComboBox();
		cbDepartamento.setBounds(220, 213, 220, 25);
		cbDepartamento.setBackground(c224x3);
		cbDepartamento.setFont(fAMono14);
		cbDepartamento.setForeground(cRojo);
			cbDepartamento.addItem("");
			cbDepartamento.addItem("Atención al Cliente");
			cbDepartamento.addItem("Departamento de Logística");
			cbDepartamento.addItem("Departamento de Gerencia");
		add(cbDepartamento);
		
		lAntiguedad = new JLabel("Selecciona la Antiguedad");
		lAntiguedad.setBounds(220, 248, 180, 25);
		lAntiguedad.setFont(fAMono12);
		lAntiguedad.setForeground(cBlanco);
		add(lAntiguedad);
		cbAntiguedad = new JComboBox();
		cbAntiguedad.setBounds(220, 273, 220, 25);
		cbAntiguedad.setBackground(c224x3);
		cbAntiguedad.setFont(fAMono14);
		cbAntiguedad.setForeground(cRojo);
			cbAntiguedad.addItem("");
			cbAntiguedad.addItem("1 Año de Servicio");
			cbAntiguedad.addItem("2 a 6 años de Servicio");
			cbAntiguedad.addItem("7 años o más de servicio");
		add(cbAntiguedad);
		
		lResultado = new JLabel("Resultado del Calculo");
		lResultado.setBounds(220, 307, 180, 25);
		lResultado.setFont(fAMono12);
		lResultado.setForeground(cBlanco);
		add(lResultado);
		ta1 = new JTextArea();
		ta1.setEditable(false);
		ta1.setBackground(c224x3);
		ta1.setFont(new Font("Andale Mono", 1, 11));
		ta1.setForeground(cRojo);
		ta1.setText("\n\tAquí aparece el Resultado del calculo de vacaciones.");
		sp1 = new JScrollPane(ta1);
		sp1.setBounds(220, 333, 385, 90);
		add(sp1);
		
		lFooter = new JLabel("©2017 The Coca-Cola company | Todos los derechos reservados");
		lFooter.setBounds(135, 445, 500, 30);
		lFooter.setFont(fAMono12);
		lFooter.setForeground(cBlanco);
		add(lFooter);
	}
	
	public void actionPerformed(ActionEvent e){
		if( e.getSource()==miCalculo ) {
			String nombreTbj = tfNombreTrabajador.getText();
			String AP = tfAPaternoTrabajador.getText();
			String AM = tfAMaternoTrabajador.getText();
			String Departamento = cbDepartamento.getSelectedItem().toString();
			String Antiguedad = cbAntiguedad.getSelectedItem().toString();
			
			if( nombreTbj.equals("") || AP.equals("") || AM.equals("") || Departamento.equals("") || Antiguedad.equals("") ) {
				JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
			}else{
				String strMensaje = "El trabajador "+nombreTbj
						+"\n que trabaja en "+Departamento
						+", con "+Antiguedad+"\n recibe: ";
				//Se crea una Matriz de datos para simplificar las operaciones vacacionales
				int[][] PuestoDias = { //Van de 1, 2~6, 7+ años de servicio
						{ 6, 14, 20 }, //Atencion al Cliente
						{ 7, 15, 22 }, //Departamento de Logistica
						{10, 20, 30 }, //Departamento de Gerencia
				};
				
				if( Departamento.equals("Atención al Cliente") ) {
					if(Antiguedad.equals("1 Año de Servicio"))
						{ ta1.setText( strMensaje +PuestoDias[0][0]+" días de vacaciones"); }
					if(Antiguedad.equals("2 a 6 años de Servicio"))
						{ ta1.setText( strMensaje +PuestoDias[0][1]+" días de vacaciones"); }
					if(Antiguedad.equals("7 años o más de servicio"))
						{ ta1.setText( strMensaje +PuestoDias[0][2]+" días de vacaciones"); }
				}
				if( Departamento.equals("Departamento de Logística") ) {
					if(Antiguedad.equals("1 Año de Servicio"))
						{ ta1.setText( strMensaje +PuestoDias[1][0]+" días de vacaciones"); }
					if(Antiguedad.equals("2 a 6 años de Servicio"))
						{ ta1.setText( strMensaje +PuestoDias[1][1]+" días de vacaciones"); }
					if(Antiguedad.equals("7 años o más de servicio"))
						{ ta1.setText( strMensaje +PuestoDias[1][2]+" días de vacaciones"); }					
				}
				if( Departamento.equals("Departamento de Gerencia") ) {
					if(Antiguedad.equals("1 Año de Servicio"))
						{ ta1.setText( strMensaje +PuestoDias[2][0]+" días de vacaciones"); }
					if(Antiguedad.equals("2 a 6 años de Servicio"))
						{ ta1.setText( strMensaje +PuestoDias[2][1]+" días de vacaciones"); }
					if(Antiguedad.equals("7 años o más de servicio"))
						{ ta1.setText( strMensaje +PuestoDias[2][2]+" días de vacaciones"); }					
				}
			}
		}
		if( e.getSource()==miRojo ) { getContentPane().setBackground(cRojo); }
		if( e.getSource()==miNegro ){ getContentPane().setBackground(cNegro); }
		if( e.getSource()==miMorado){ getContentPane().setBackground(cMorado); }
		if( e.getSource()==miNuevo ){ //Se limpian campos
			tfNombreTrabajador.setText("");
			tfAPaternoTrabajador.setText("");
			tfAMaternoTrabajador.setText("");
			cbDepartamento.setSelectedIndex(0);
			cbAntiguedad.setSelectedIndex(0);
			ta1.setText("\n\tAquí aparece el Resultado del calculo de vacaciones.");
		}
		if( e.getSource()==miSalir ){
			Bienvenida winBienvenida = new Bienvenida();
			winBienvenida.setBounds(0, 0, 350, 450);
			winBienvenida.setVisible(true);
			winBienvenida.setResizable(false);
			winBienvenida.setLocationRelativeTo(null);
			
			this.setVisible(false);
		}
		if( e.getSource()==miElCreador ) {
			JOptionPane.showMessageDialog(null, "Desarrollado usando como base la \"La Geekipedia de Ernesto\""
					+"\n www.youtube.com/ErnestoPerezM"
					+"\n Actualizado y con modificaciones personales de: Darketzer"
					+"\n https://twitter.com/Darketzer"
					+"\n https://github.com/Imix-Dkz");
		}
	}
	public void stateChange(ChangeEvent e){
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal winPrincipal = new Principal();
		winPrincipal.setBounds(0, 0, 640, 535);
		winPrincipal.setVisible(true);
		winPrincipal.setResizable(false);
		winPrincipal.setLocationRelativeTo(null);
	}

}
