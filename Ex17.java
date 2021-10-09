import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
				

				Scanner entrada = new Scanner(System.in);

				System.out.print("Informe o primeira nota: ");
				float n1 = entrada.nextFloat();
				System.out.print("Informe a segunda nota: ");
				float n2 = entrada.nextFloat();
				float media = (float) ((n1 + n2) / 2);
			
			
				System.out.println("A média deste aluno é " + media);
				
				if ((media > 9) && (media <= 10))  {
				System.out.println(" Conceito: A");
				System.out.println(" APROVADO");
				}
				
		        else if ((media > 7.5) && (media <= 9)) {
				System.out.println(" Conceito: B");
				System.out.println(" APROVADO");
				}
				else if ((media > 6) && (media <= 7.5)) {
				System.out.println(" Conceito: C");
				System.out.println(" APROVADO");
				}
		         else if((media > 4) && (media <= 6)){
				System.out.println(" Conceito: D");
				System.out.println(" REPROVADO");
				}
				 else{  
				System.out.println(" Conceito: E");
				System.out.println(" REPROVADO");
				}
			
				entrada.close();

			}

		}