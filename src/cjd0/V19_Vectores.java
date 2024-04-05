package cjd0;

public class V19_Vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = new int[5];

		num[0] = 5;
		num[1] = 220;
		num[2] = 8;
		num[3] = 458;
		num[4] = 22;
		
		System.out.print("["+num[0]);
		for(int i=1; i<5; i++){ System.out.print(", "+num[i]); }
		System.out.print("]");
	}
}
