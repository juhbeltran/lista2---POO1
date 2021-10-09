import java.util.Scanner;
public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe primeira nota do aluno: ");
		int n1 = entrada.nextInt();
		System.out.print("Informe a segunda nota do aluno: ");
		int n2 = entrada.nextInt();
		System.out.print("Informe a terceira nota do aluno: ");
		int n3 = entrada.nextInt();
		float media = (float) ((n1 + n2+ n3) / 3);
	
	
		
		
		if (media == 10) {
		System.out.println("Média: " + media + " - Aprovado com Distinção");
		
		}
		
        else if (media >=7)  {
		System.out.println("Média: " + media + " - Média alcançada - Aprovado");
		
		}
		else {
		System.out.println("Média: " + media + " - Reprovado");
		}
	
		entrada.close();

	}

}