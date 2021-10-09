import java.util.Scanner;
public class Ex16 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		
		System.out.print("Informe a primeira nota: ");

		float n1 = entrada.nextFloat();

		System.out.print("Informe a segunda nota: ");

		float n2 = entrada.nextFloat();

		float media = (float)((n1 + n2)/2);
			
			
			
		if (media < 3) {
			System.out.println("Reprovado");

		}

		else if ((media > 3) && (media <= 6.9)) {
			System.out.println("Em exame");

		} else {
			System.out.println(" Aprovado");
		}

		entrada.close();

	}

}