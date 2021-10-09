
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.print("Informe seu sexo:  F para feminino e M para masculino: ");
		String sexo = entrada.nextLine();
		
		System.out.print("Informe a sua altura: ");
		float altura = entrada.nextFloat();

		System.out.print("Informe seu peso: ");
		float peso = entrada.nextFloat();

	 
		
		if (sexo.equals("f")) { 
		 System.out.println("Sexo: Feminino, Peso: " + peso + ", Altura: " + altura);
		 System.out.println("O seu peso ideal é: " + ((62.1 * altura) - 44.7));		 
		  if ( peso > ((62.1 * altura) - 44.7)) {
			  System.out.println("Você está acima do peso!");
		   }else if (peso < ((62.1 * altura) - 44.7)){
		 		System.out.println("Você está abaixo do peso!");
		}else { 
					System.out.println("Você está no peso ideal");
		}
				
		}else if(sexo.equals("m")) {

	
		System.out.println("Sexo: Masculino, Peso: " + peso + ", Altura: " + altura);
		System.out.println("O seu peso ideal é: " + ((72.7 * altura) - 58));
		
		if ( peso > ((62.1 * altura) - 58)) {
			  System.out.println("Você está acima do peso!");
		   }else if (peso < ((62.1 * altura) -58)){
		 		System.out.println("Você está abaixo do peso!");
		}else { 
					System.out.println("Você está no peso ideal");
		}
				

	}else System.out.println("A letra digitada não confere");

	entrada.close();

}}
