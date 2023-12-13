package exercicio1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Queue<String> banco = new LinkedList<String>();
		int op;
		
		do {
			System.out.println("\n------------------------------------------------------");
			System.out.println("\n\tMenu: ");
			System.out.println("\n1 - Adicionar Cliente na Fila");
			System.out.println("\n2 - Listar todos os Clientes");
			System.out.println("\n3 - Retirar Cliente da Fila");
			System.out.println("\n0 - Sair ");
			System.out.println("\n-------------------------------------------------------");
			System.out.println("\n Entre com a opção desejada:  ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome: ");
				banco.add(leia.nextLine());
				System.out.println("\nCliente Adicionado!");
				break;
				
			case 2: 
				System.out.println("\nLista dos nomes dos Cliente: ");
				System.out.println(banco);
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o nome que deseja retirar: ");
				String nome = leia.nextLine();
				if (banco.contains(nome)) {
					banco.remove(nome);
					System.out.println("\nO Cliente foi Chamado!");
					
					
				}else {
					System.out.println("\nCliente não encontrado!!!");
				}
				System.out.println("\nLista dos nomes dos Cliente: " + banco);
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
				
			default : 
				System.out.println("\nOpção Inválida");
				
			}
			
			
		}while (op != 0);

	}

}
