import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int num = entrada.nextInt();
		
		if ( num % 2 == 0)
			System.out.println(num + 1);
		else
			System.out.println(num + 1);
		
		entrada.close();
		 
		
	}

}
