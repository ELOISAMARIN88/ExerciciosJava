package Java;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia= new Scanner (System.in);
		
		int TotalPares = 0;
        int TotalImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = leia.nextInt();

            if (numero % 2 == 0) {
                TotalPares++;
            } else {
                TotalImpares++;
            }
        }

        System.out.println("\nTotal de números pares: " + TotalPares);
        System.out.println("Total de números ímpares: " + TotalImpares);

        leia.close();
		

	}

}
