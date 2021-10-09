import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		

		System.out.print("Informe seu sexo:  F para feminino e M para masculino");
		String sexo = entrada.nextLine();


		if (sexo.equals("f")) 
			System.out.println("Feminino");
		else if (sexo.equals("m")) 
			System.out.println("Masculino");
		else 
			System.out.println("A letra digitada não confere");
		entrada.close();
		
	
	
	}
}
