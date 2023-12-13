package exercicio1;

import java.util.Scanner;
import java.util.Stack;

public class Pilha_Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int op;
		
		Stack<String> livro = new Stack<String>();
		
		do {
			System.out.println("*****************************************");
			System.out.println("\n\tMenu:");
			System.out.println("\n1 - Adicionar Livro na pilha");
			System.out.println("\n2 - Listar todos os Livros");
			System.out.println("\n3 - Retirar Livro da pilha");
			System.out.println("\n0 - Sair");
			System.out.println("*****************************************");
			
			System.out.println("\nEntre com o opção desejada: ");
			op = leia.nextInt();
			
			switch (op) {
			
			case 1: 
				leia.nextLine();
				System.out.println("\nInsira o nome do Livro: ");
				String nome = leia.nextLine();
				livro.push(nome);
				break;
				
			case 2: 
				System.out.println("\nLista de todos os livros:");
				System.out.println(livro);
				break;
				
			case 3:
				if (!livro.isEmpty()) {
					String livroRetirado = livro.pop();
					System.out.println("\nUm Livro foi retirado da pilha!");
					
				}else {
					System.out.println("\nA Pilha está vazia!");
				}
				System.out.println("\nLista de todos os livros:");
				System.out.println(livro);
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default: 
				System.out.println("\nOpção Inválida");
				
			
			}
			
		}while (op != 0);
		

	}

}
