package cjd0;

public class V21_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int num [][] = new int[2][2];
		int num[][] = { {5,2}, {2,5} };
		System.out.println("Num.length:"+num.length);
		
		for(int i=0; i<num.length; i++) {
			//System.out.println("["+i+"][0]:"+num[i][0]+", ["+i+"][1]:"+num[i][1]);
			System.out.println("["+num[i][0]+"]["+num[i][1]+"]");
		}
	}

}
