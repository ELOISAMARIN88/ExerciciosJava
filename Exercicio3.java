package Java;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int idade, Totalmenor21 = 0,Totalmaior50 = 0;
		
		System.out.println("\nTotal de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos");
		System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();	
			
		while (idade >= 0) {
			
			
			if (idade < 21) {
				Totalmenor21= Totalmenor21 + 1;
			}else if ( idade > 50){
				Totalmaior50 ++;
				
			}
			System.out.print("Digite uma idade (ou uma idade negativa para encerrar): ");
            idade = leia.nextInt();
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + Totalmenor21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + Totalmaior50);
		
		leia.close();
	

	}

}


/*System.out.print("Digite o " + i + "º número: ");
            int numero = leia.nextInt();*/
