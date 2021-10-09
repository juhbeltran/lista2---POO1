import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float media = (float) 0.0;

		System.out.print("Informe a primeira nota: ");

		float n1 = entrada.nextFloat();

		System.out.print("Informe a segunda nota: ");

		float n2 = entrada.nextFloat();

		if ((n1 + n2)/2 >= 7)
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");

		entrada.close();

	}

}
