package cjd0;
import java.util.Scanner;

public class V10_SistemaVacaciones {
	
	public static void TieneDerecho(String nombre, int dias){
		System.out.println("El trabajador "+nombre+" tiene derecho a "+dias+" días de vacaciones");						
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String nombre = "";
		int clave =0, antiguedad=0;
		
		System.out.println("**********************************");
		System.out.println("*Bienvenido al sistema vacacional*");
		System.out.println("\n");
		
		//Se pide nombre de trabajador
		System.out.println("Cual es el nombre del trabajador?(fulano):");
		nombre = entrada.nextLine();
		System.out.println("");
		//Tiempo de servicio
		System.out.println("Cuanto tiempo de servicio tiene el trabajador(años)?:");
		antiguedad = entrada.nextInt();
		System.out.println("");
		//Clave del trabajador
		System.out.println("Cual es la clave del trabajador?:");
		clave = entrada.nextInt();
		System.out.println("");
		
		//Inicialización para pruebas
		if(nombre==""){ nombre ="Fulano"; }
		//if(antiguedad==0){ antiguedad=5; }
		if(clave==0){ clave=2; }
		
		switch(clave){
			case 1:
				if(antiguedad==1){	TieneDerecho(nombre, 6); }
				else if(antiguedad >=2 && antiguedad <=6){ TieneDerecho(nombre, 14); }
				else if(antiguedad >=7 ){ TieneDerecho(nombre, 20); }
								
				break;
			case 2:
				if(antiguedad==1){	TieneDerecho(nombre, 7); }
				else if(antiguedad >=2 && antiguedad <=6){ TieneDerecho(nombre, 15); }
				else if(antiguedad >=7 ){ TieneDerecho(nombre, 22); }
				
				break;
			case 3:
				if(antiguedad==1){	TieneDerecho(nombre, 10); }
				else if(antiguedad >=2 && antiguedad <=6){ TieneDerecho(nombre, 20); }
				else if(antiguedad >=7 ){ TieneDerecho(nombre, 30); }
				
				break;
			default:
				System.out.println("ERROR: Clave de departamento Incorrecta");
				//exit();
				break;
		}
	}

}
