package cjd0;

public class V15_EjercicoLogico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		System.out.println("Serie con FOR:");
		for(i=1; i<=10; i++) {
			if(i<10)
				{ System.out.print(i+","); }
			else{ System.out.print(i); }
		}
		
		i = 1; //Se reinicia ciclo
		System.out.println("");
		System.out.println("Serie con WHILE:");
		while(i<=10) {
			if(i<10)
				{ System.out.print(i+","); }
			else{ System.out.print(i); }
			i=i+1;
		}
		
		i = 1; //Se reinicia ciclo
		System.out.println("");
		System.out.println("Serie con DO WHILE:");
		do{
			if(i<10)
				{ System.out.print(i+","); }
			else{ System.out.print(i); }
			i=i+1;
		}while(i<=10);
		
		
	}

}
