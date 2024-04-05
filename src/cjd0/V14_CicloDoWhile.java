package cjd0;

public class V14_CicloDoWhile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1000;
		
		do{
			if(i>0)
				{ System.out.print(i+","); }
			else{ System.out.print(i); }
			
			i -=200;
		}while(i>=0);
	}
}
