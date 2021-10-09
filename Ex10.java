import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int a = entrada.nextInt();

		System.out.print("Digite outro inteiro: ");
		int b = entrada.nextInt();

		System.out.print("Digite mais número inteiro: ");
		int c = entrada.nextInt();

		if ((a > b && a > c) && (b > c)) {
			System.out.println("Maior: " + a + ", Menor: " + c);

		} else if ((a > b && a > c) && (c > b)) {
			System.out.println("Maior: " + a + ", Menor: " + b);

		} else if ((b > a && b > c) && (a > c)) {
			System.out.println("Maior: " + b + ", Menor:" + c);

		} else if ((b > a && b > c) && (c > a)) {
			System.out.println("Maior; " + b + ", Menor:" + a);

		} else if ((c > a && c > b) && (a > b)) {
			System.out.println("Maior: " + c + ", Menor: " + b);

		} else {
			System.out.println("Maior: " + c + ", Menor" + a);

		}

		entrada.close();

	}

}
