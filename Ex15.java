import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o custo do produto: ");
		float custo = entrada.nextFloat();
		
		System.out.print("Digite o número correspondente a origem do produto: 1- Sul, 2 -Norte, 3 - Leste, 4 - Oeste, 5 ou 6 - Nordeste,  7 ou 8 - Centro-oeste:");
		int cod = entrada.nextInt();
	
	
		System.out.println("O preço de custo do produto é de: R$ " + custo);
		if (cod == 1) {
		System.out.println(" Sul");
		}
		
        else if (cod == 2) {
		System.out.println(" Norte");
		}
		else if (cod == 3) {
		System.out.println(" Leste");
		}
         else if (cod == 4) {
		System.out.println(" Oeste");
		}
		 else if ((cod == 5 ) || (cod == 6)) {
		System.out.println(" Nordeste");
		}
		 else if ((cod == 7 ) ||(cod == 8)) {
		System.out.println(" Centro-oeste");
		}	

    
       else {
        	System.out.println(" Importado");
     }
		entrada.close();

	}

}
