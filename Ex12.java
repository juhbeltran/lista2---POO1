import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float r1 = (float) 0.20;
		float r2 = (float) 0.15;
		float r3 = (float) 0.10;
		float r4 = (float) 0.05;
		float NS = (float) 0.0;
		System.out.print("Informe seu salário: ");
		float salario = entrada.nextFloat();

		if (salario <= 280) {
			float ns= (float) (salario + (salario * r1));
			System.out.println("Salário antes do reajuste: " + salario);
			System.out.println(" Percentual de ajuste: " + r1 + " (20%)");
			System.out.println("O valor do aumento foi: " + (ns - salario));
			System.out.println("O salário após o aumento é: " + ns);
		} else if (salario > 280 && salario <= 700) {
			float ns = (float) (salario + (salario * r2));
			System.out.println("Salário antes do reajuste: " + salario);
			System.out.println(" Percentual de ajuste: " + r2 + " (15%)");
			System.out.println("O valor do aumento foi: " + (ns - salario));
			System.out.println("O salário após o aumento é: " + ns);
		} else if (salario > 700 && salario <=1500) {
			float ns = (float) (salario + (salario * r3));
			System.out.println("Salário antes do reajuste: " + salario);
			System.out.println(" Percentual de ajuste: " + r3 + " (10%)");
			System.out.println("O valor do aumento foi: " + (ns - salario));
			System.out.println("O salário após o aumento é: " + ns);
		} else {
			float ns = (float) (salario + (salario * r4));
			System.out.println("Salário antes do reajuste: " + salario);
			System.out.println(" Percentual de ajuste: " + r4 + " (5%)");
			System.out.println("O valor do aumento foi: " + (ns - salario));
			System.out.println("O salário após o aumento é: " + ns);

		}
		entrada.close();

	}

}
