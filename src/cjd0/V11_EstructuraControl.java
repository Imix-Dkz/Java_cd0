package cjd0;
import java.util.Scanner;

public class V11_EstructuraControl {
	
	public static void elResultado(String nombre, int res){
		System.out.println("El resultado de la "+nombre+" es: "+res);						
	}
	
	public static void main(String[] args) {
		int num1=5, num2=3, res=0;
		
		int opcion = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Los numeros son "+num1+" y "+num2
				+"...\n Seleccione un tipo de operacion\n"
				+"1.-Suma( a + b ) \n"
				+"2.-Resta( a - b ) \n"
				+"3.-Multiplicacion( a * b )\n"
				+"4.-División( a / b )\n");
		opcion = entrada.nextInt();
		System.out.println("");
		
		switch(opcion){
			case 1: elResultado("SUMA", (num1+num2)); break;
			case 2: elResultado("RESTA", (num1-num2)); break;
			case 3: elResultado("MULTIPLICACIÓN", (num1*num2)); break;
			case 4: elResultado("DIVISIÓN", (num1/num2)); break;
			default: System.out.println("La opción no existe!!!"); break;
		}
	}
}
