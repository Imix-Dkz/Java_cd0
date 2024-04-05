package cjd0;
import java.util.Scanner;
public class V17_CadenaEquals {
	public static void main(String[] args) {
		
		String nombre1 = "", nombre2="";
		Scanner entrada = new Scanner(System.in);
		
		/*System.out.print("Ingresa el 1er Nombre:");
		nombre1 = entrada.nextLine();
		System.out.print("Ingresa el 2do Nombre");
		nombre2 = entrada.nextLine();
		
		if( nombre1.equals(nombre2) ) {
			System.out.println("Nombres coincidentes!!!");
		}else{
			System.out.println("Los nombres son diferentes");
		}*/
		
		//Caso con EqualsIgnore
		System.out.print("Ingresa el 1er Nombre:");
		nombre1 = entrada.nextLine();
		System.out.print("Ingresa el 2do Nombre");
		nombre2 = entrada.nextLine();
		
		if( nombre1.equalsIgnoreCase(nombre2) ) {
			System.out.println("Nombres coincidentes!!!");
		}else{
			System.out.println("Los nombres son diferentes");
		}
		
		
	}

}
