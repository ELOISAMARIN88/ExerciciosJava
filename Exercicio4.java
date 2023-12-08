package Java;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int totalBackend = 0;
        int totalMulheresFrontend = 0;
        int totalHomensMobileAcima40 = 0;
        int totalNBFullStackMenor30 = 0;
        int totalPessoas = 0;
        int somaIdades = 0;
        
        char continuar = 'S';

        while (continuar == 'S' ) {
            System.out.print("Idade: ");
            int idade = leia.nextInt();

            System.out.print("Identidade de Gênero (1-6): ");
            int genero = leia.nextInt();

            System.out.print("Pessoa Desenvolvedora (1-4): ");
            int desenvolvedor = leia.nextInt();

            
            if (desenvolvedor == 1) {
                totalBackend++;
            }

            if ((genero == 1 || genero == 4) && desenvolvedor == 2) {
                totalMulheresFrontend++;
            }

            if ((genero == 2 || genero == 5) && desenvolvedor == 3 && idade > 40) {
                totalHomensMobileAcima40++;
            }

            if (genero == 3 && desenvolvedor == 4 && idade < 30) {
                totalNBFullStackMenor30++;
            }

           
            totalPessoas++;
            somaIdades += idade;

            
            System.out.print("Deseja continuar (S/N): ");
            continuar = leia.next().charAt(0);
        }

       
        double mediaIdade = (double) somaIdades / totalPessoas;

 
        System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + totalBackend);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalMulheresFrontend);
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalHomensMobileAcima40);
        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + totalNBFullStackMenor30);
        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
        System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f\n", mediaIdade);

        leia.close();
		

	}

}
