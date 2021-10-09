import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		String letra = entrada.nextLine();

		if ((letra.equals("a")) || (letra.equals("e")) || (letra.equals("i")) || (letra.equals("o"))
				|| (letra.equals("u")))
			System.out.println("É uma vogal");

		else
			System.out.println("É uma consoante");

		entrada.close();

	}

}
