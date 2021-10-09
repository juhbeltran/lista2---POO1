import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite um número: ");
		float x = entrada.nextFloat();

		System.out.print("Digite outro número: ");
		float y = entrada.nextFloat();

		
		if(x > y)
			
			System.out.println(x);
		
		else if(y > x)
			System.out.println(y);
		else 
			System.out.println("Os números são iguais");

	}

}
