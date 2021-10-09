import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o primeiro lado do triangulo: ");
		int l1 = entrada.nextInt();

		System.out.print("Informe o segundo lado do triangulo: ");
		int l2 = entrada.nextInt();

		System.out.print("Informe o terceiro lado do triangulo: ");
		int l3 = entrada.nextInt();

		if ((l1 == l2) && (l2 == l3) && (l1 == l3)) {
			System.out.println("Triangulo Equilátero");

		} else if (((l1 == l2) && (l1 != l3)) || ((l2 == l3) && (l2 != l1)) || ((l1 == l3) && (l1 != l2))) {

			System.out.println("Triangulo Isósceles");
		} else {
			System.out.println("Triangulo Escaleno");
		}
		entrada.close();

	}
}
