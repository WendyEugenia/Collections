package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opicao;
		Scanner leia = new Scanner (System.in);

		Stack<String> livros = new Stack <String>();


		do {

			System.out.println("\n***********************************************");
			System.out.println("\n\t1 - Adicionar Livro na Pilha");
			System.out.println("\t2 - Listar todos os Livros");
			System.out.println("\t3 - Retirar Livro da pilha");
			System.out.println("\t0 - Sair");
			System.out.println("\n***********************************************");
			System.out.println("\nEntre com a opção desejada: ");
			System.out.println();	
			opicao = leia.nextInt();

			switch(opicao) {

			case 1:
				leia.nextLine();
				System.out.println("Digite o nome: ");
				String nome = leia.nextLine();
				livros.add(nome);
				System.out.println("Livro Adicionado!");
				break;

			case 2:
				leia.nextLine();
				System.out.println("\nLista de Livros na Pilha: "+livros);
				break;

			case 3:
				leia.nextLine();
				System.out.println("\n\tLivro "+livros.pop()+" foi retirado!");
				System.out.println("\nLista de Livros na Pilha:"+livros);
				break;

			case 0:
				System.out.println("\nPrograma Finalizado!");

			}
		} while (opicao != 0);

	}

}