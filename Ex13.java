import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float INSS = (float) 0.0;
		float sindicato = (float) 0.0;
		float IR = (float) 0.0;
		float SL = (float) 0.0;
		float salario = (float) 0.0;
		float fgts = (float) 0.0;
		
		

		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quanto você ganha por hora? ");
		float s = entrada.nextFloat();

		System.out.print("Informe quantas horas trabalhadas: ");
		int h = entrada.nextInt();
		
		 salario = (float) (s * h);
		 
		 INSS = (float)(salario* 0.10);
		sindicato = (float) (salario* 0.03);
	
			fgts = (float)(salario *0.11);
			
		
		System.out.println("Salario bruto: ("+s +" * "+h +"): R$" + salario );
		if (salario <= 900) {
		
		IR = (float) (salario* 0.00);
		System.out.println("(-)IR (0%) : " + IR );
		}else if ((salario > 900) && (salario <=1500)){
		
		IR = (float) (salario* 0.05);
		System.out.println("(-)IR (5%) : " + IR );
		}else if ((salario > 1500) && (salario <=2500)){
			
		IR = (float) (salario* 0.10);
		System.out.println("(-)IR (10%) : " + IR );
		}else {
		IR = (float) (salario* 0.20);
		System.out.println("(-)IR (20%) : " + IR );
		
		}
		SL = (salario - INSS - sindicato - IR + fgts);
		
		System.out.println("(-) INSS(10%): R$" + INSS );
		System.out.println("(-) Sindicato(3%): R$" + sindicato );
		System.out.println("FGTS(11%)" + fgts);
		System.out.println("Total dos descontos: R$ " + (IR + sindicato + INSS ));
		System.out.println("O seu salário líquido é " + SL + " reais");
		
		
		
		entrada.close();
	
	}

}




