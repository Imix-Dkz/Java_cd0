package cjd0;

public class V16_Fibonacci {
	public static void main(String[] args) {
		int i=0;
		int a=0, b=1, c=0;
		int limite = 15, penultimo= 14;
		
		
		System.out.print("Serie Fibo con FOR:");
		for(i=0; i<limite; i++){
			if(i<penultimo){
				System.out.print(a+", ");
			}else {
				System.out.print(a);
			}
			
			c=a+b;
			a=b;
			b=c;
		}
		
		System.out.println("");
		i=0; a=0; b=1; c=0;
		System.out.print("Serie Fibo con WHILE:");
		while(i<limite){
			if(i<penultimo){
				System.out.print(a+", ");
			}else {
				System.out.print(a);
			}
			
			c=a+b;
			a=b; b=c;
			i++;
		}
		
		System.out.println("");
		i=0; a=0; b=1; c=0;
		System.out.print("Serie Fibo con DO-WHILE:");
		do{
			if(i<penultimo){
				System.out.print(a+", ");
			}else {
				System.out.print(a);
			}
			
			c=a+b;
			a=b; b=c;
			i++;
		}while(i<limite);
	}
}
