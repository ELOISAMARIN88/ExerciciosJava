package Java;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		
		do {
			System.out.println("\nDigite um número (utiliza o 0 para interromper a execução): ");
			numero = leia.nextInt();
			
			if (numero > 0 ) {
				soma=+numero;
			}
		}while (numero != 0 );
		System.out.println("A soma dos números positivos é: " + soma);

        leia.close();

	}

}
