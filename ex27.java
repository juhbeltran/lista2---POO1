import java.util.Scanner;
public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		double num = entrada.nextDouble();
		double t = Math.floor(num);
		
		if (num != t)
			System.out.println("É decimal");
		else {
			System.out.println("É inteiro");
	}
		entrada.close();
	}

}