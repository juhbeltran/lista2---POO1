import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				

				Scanner entrada = new Scanner(System.in);

				System.out.print("Digite o número correspondente ao dia da semana: 1- Domingo, 2 - Segunda-feira, 3 - Terça-feira, 4 - Quarta-feira, 5 - Quinta-feira, 6 - Sexta-feira,  7 - Sábado ");
				int dia = entrada.nextInt();
				
			
				if (dia == 1) {
				System.out.println("1 - Domingo");
				}
				
		        else if (dia == 2) {
				System.out.println("2 - Segunda-feira");
				}
				else if (dia == 3) {
				System.out.println("3 - Terça-feira");
				}
		         else if (dia == 4) {
				System.out.println("4 - Quarta-feira");
				}
				 else if (dia == 5) {
				System.out.println("5 - Quinta-feira");
				}
				 else if (dia == 6) {
				System.out.println("6 - Sexta-feira");
				}	

		        else if (dia == 7) {
				System.out.println("7 - Sábado");
					
		       } else {
		        	System.out.println("Valor inválido");
		     }
				entrada.close();

			}

		}