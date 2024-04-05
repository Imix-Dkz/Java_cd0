package cjd0;
import java.util.Scanner;

public class V18_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaOri = "", cadenaSub="";
		int cadenaOriLargo = 0,  desde=0, hasta=0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Escribe cadena:");
		cadenaOri = in.nextLine();
		
		cadenaOriLargo = cadenaOri.length();
		System.out.println("La cadena \""+cadenaOri+"\", tienen "+cadenaOriLargo+"caracteres de largo");
		
		System.out.print("Inicio de corte de cadena(min 0):");
		desde = in.nextInt();
		if(desde<0) { desde = 0; }
		System.out.print("Fin de corte de cadena(max "+cadenaOriLargo+"):");
		hasta= in.nextInt();
		if(hasta>cadenaOriLargo){ hasta = cadenaOriLargo; }
		
		cadenaSub = cadenaOri.substring(desde, hasta);
		System.out.println("Resultado: "+cadenaSub);
		

	}

}
