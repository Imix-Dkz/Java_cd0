package cjd0;
import java.util.Scanner;
public class V23_MatrizDinam {
	
	public static void sysprntl(String str) {
		System.out.println(str);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filas=0, columnas=0, cont=1;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ingrese Filas:");
		filas = in.nextInt();
		System.out.print("Ingrese Columnas:");
		columnas = in.nextInt();
		
		int nums[][] = new int[filas][columnas];
		for (int i = 0; i < nums.length; i++){
			for (int j = 0; j < nums[i].length; j++){
				nums[i][j] = cont;
				cont++;
				//sysprntl("["+i+"]["+j+"]:"+nums[i][j]);
				System.out.print("["+nums[i][j]+"]");
			}
			sysprntl("");
		}
	}

}
