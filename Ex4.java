import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um ano: ");
		int ano = entrada.nextInt();

		if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " � bissexto.");
		} else if (ano % 400 == 0) {
			System.out.println(ano + " � bissexto.");

		} else {
			System.out.println(ano + " n�o � bissexto");
		}

		entrada.close();
	}
}
