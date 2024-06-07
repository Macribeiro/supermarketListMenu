package main;

import implementation.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final int TAMANHO = 3;
		Scanner scanner = new Scanner(System.in);
		Supermarket supermarket = new SupermarketArray(TAMANHO);
		int opcao;

		do {
			System.out.println("\nLista de Compras");
			System.out.println("1 - Inserir");
			System.out.println("2 - Listar");
			System.out.println("3 - Remover");
			System.out.println("4 - Sair");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o item a ser inserido: ");
				String item = scanner.next();
				supermarket.add(item);
				break;
			case 2:
				supermarket.print();
				break;
			case 3:
				System.out.println("Digite a posição do item a ser removido: ");
				int index = scanner.nextInt();
				supermarket.delete(index);
				break;
			case 4:
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("Opção Inválida. Digite novamente: ");
			}
		} while (opcao != 4);

		scanner.close();
	}
}