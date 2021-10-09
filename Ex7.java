import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		

	Scanner entrada = new Scanner(System.in);

	System.out.print("Digite um número inteiro: ");
	int a = entrada.nextInt();
	
	System.out.print("Digite outro inteiro: ");
	int b = entrada.nextInt();
	
	System.out.print("Digite mais número inteiro: ");
	int c = entrada.nextInt();
	
	if ((a > b  && a > c) &&  (b > c)) {
	 System.out.println(a + ", "+ b + ", " + c); 
	 
	} else if (( a > b && a > c) &&  (c > b)) {
		 System.out.println(a + ", "+ c + ", " + b); 
		 
		
	} else if (( b > a && b > c) &&  (a > c)) {
		 System.out.println(b + ", "+ a + ", " + c); 
		 
	} else if (( b > a && b > c) &&  (c > a)) {
		 System.out.println(b + ", "+ c + ", " + a); 
		 
		
	}else  if (( c> a && c>b) &&  (a> b)) {
		 System.out.println(c + ", "+ a+ ", " + b); 
		 
		
	}else {
		 System.out.println(c + ", "+ b + ", " + a); 
		 
	}
	 
	
	
      entrada.close();
	
	
     }
}

		