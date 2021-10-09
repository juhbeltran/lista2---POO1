import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a idade do primeiro aluno: ");
		int n1 = entrada.nextInt();
		System.out.print("Informe a idade do segundo aluno: ");
		int n2 = entrada.nextInt();
		System.out.print("Informe a idade do terceiro aluno: ");
		int n3 = entrada.nextInt();
		float media = (float) ((n1 + n2 + n3) / 3);

		System.out.println("A média de idade dos alunos é: " + media);

		if (media < 25) {
			System.out.println("Turma Jovem");

		}

		else if ((media > 25) && (media <= 40)) {
			System.out.println("Turma Adulta");

		} else {
			System.out.println(" Turma Idosa");
		}

		entrada.close();

	}

}