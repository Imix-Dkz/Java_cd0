package cjd0;
import java.util.Scanner;

public class V17_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String usuario = "", password="";
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingresa nombre de usuario:");
		usuario = entrada.nextLine();
		System.out.print("Ingresa su contraseña:");
		password = entrada.nextLine();
		
		if(usuario.equals("imix") && password.equals("zaq1")) {
			System.out.println("Acceso Correcto");
		}else {
			System.out.println("Contraseña Incorrecta");
		}

	}

}
