package Java;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2; 
	
		
		System.out.println("Digite o 1º número: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o 2º número: ");
		numero2 = leia.nextInt();
		
		if (numero1 >= numero2) {
			System.out.println("Intervalo inválido!");
			System.exit(0);
		}
		
		for (int i = numero1; i <= numero2; i ++){
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + "é múltiplo de 3 e 5");
				
			}
		}
		
		
		leia.close();


		
		
	}

}
