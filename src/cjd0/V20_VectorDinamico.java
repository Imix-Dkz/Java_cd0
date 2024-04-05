package cjd0;
import java.util.Scanner;

public class V20_VectorDinamico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamano = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("Tamaño del Arreglo:");
		tamano = in.nextInt();

		int num[] = new int[tamano];
		for (int i = 0; i < num.length; i++) {
			System.out.print("Valor para ["+i+"]:");			
			num[i] = in.nextInt();
		}

		System.out.print("["+num[0]);
		for(int i=1; i<num.length; i++){ System.out.print(", "+num[i]); }
		System.out.print("]");
	}

}
