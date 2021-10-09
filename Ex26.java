import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.print("Didite um numero inteiro: ");
		int n1 = entrada.nextInt();

		if (n1 % 2 == 0) {
			System.out.println("Par");

		}

		else {
			System.out.println("Ímpar");
		}

		entrada.close();
 
	}

}
