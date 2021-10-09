import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe em qual turno você estuda(M matutino, V para Vespertino e N para Noturno): ");
		String turno = entrada.nextLine();

		if (turno.equals("m")) {
			System.out.println("Bom dia!");

		} else if (turno.equals("v")) {
			System.out.println("Boa tarde!");
		} else
			System.out.println("Boa noite!");

		entrada.close();

	}
}