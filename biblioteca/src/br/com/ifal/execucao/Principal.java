package br.com.ifal.execucao;

import br.com.ifal.entidades.*;
import br.com.ifal.repositorio.ControladorBiblioteca;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		LivroFisico livro;
		Ebook ebook;
		Autor autor;
		// StringBuilder buffer = new StringBuilder();
		ControladorBiblioteca controlador = new ControladorBiblioteca();

		int opcao;
		do {

			System.out.println(" ===========================");
			System.out.println("|           MENU            |");
			System.out.println("|1. Adicionar livro         |");
			System.out.println("|2. Pesquisar livro         |");
			System.out.println("|3. Alterar dados do livro  |");
			System.out.println("|4. Deletar livro           |");
			System.out.println("|                           |");
			System.out.println("| DIGITE 0 (ZERO) PARA SAIR |");
			System.out.println(" ===========================");
			opcao = leitura.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Adicione nome do autor: ");
				String nome = leitura.next();

				System.out.println("Adicione ano de nascimento (autor): ");
				int anoNascimento = leitura.nextInt();

				autor = new Autor(nome, anoNascimento);

				System.out.println("Adicione um titulo: ");
				String titulo = leitura.next();

				System.out.println("Adicione isbn: ");
				String isbn = leitura.next();

				System.out.println("Adicione ano da edicao: ");
				int anoEdicao = leitura.nextInt();

				System.out.println("Adicione editora: ");
				String editora = leitura.next();

				System.out.println("Adicionar Livro: opção 1  |  Adicionar ebook: opção 2. ");
				int escolherOpcao = leitura.nextInt();

				if (escolherOpcao == 1) {
					System.out.println("Adicione quantidade de paginas: ");
					int quantidadePaginas = leitura.nextInt();

					System.out.println("Adicione peso do livro: ");
					double peso = leitura.nextDouble();

					livro = new LivroFisico(titulo, autor, isbn, anoEdicao, editora, quantidadePaginas, peso);
					// controlador.cadastrarLivro((LivroFisico) livro);
					controlador.cadastrarLivro(livro);
				} else if (escolherOpcao == 2) {
					System.out.println("Adicione o formato do ebook: ");
					String formato = leitura.next();

					System.out.println("Ebook tem marca d'aguá ? true/false");
					boolean marcaDagua = leitura.nextBoolean();

					ebook = new Ebook(titulo, autor, isbn, anoEdicao, editora, formato, marcaDagua);
					// controlador.cadastrarLivro((Ebook) ebook);
					controlador.cadastrarEbook(ebook);
				} else {
					System.out.println("Ocorreu um erro, tente novamente.");
					break;
				}

				break;
			case 2:
				System.out.println("Pesquisar livro: 1 | Pesquisar Ebook: 2 ");
				int escolhaOpcao = leitura.nextInt();

				if (escolhaOpcao == 1) {
					System.out.println("Adicione um titulo para pesquisar: ");
					String pesquisarTitulo = leitura.next();
					controlador.pesquisarLivro(pesquisarTitulo);
				} else if (escolhaOpcao == 2) {
					System.out.println("Adicione um titulo para pesquisar: ");
					String pesquisarTituloEbook = leitura.next();
					controlador.pesquisarEbook(pesquisarTituloEbook);
				} else {
					System.out.println("Ocorreu um erro, tente novamente.");
					break;
				}
				break;
			case 3:
				System.out.println("Alterar dados do livro: 1 | Alterar dados do Ebook: 2 ");
				int alterarLivro = leitura.nextInt();
				if (alterarLivro == 1) {
					System.out.println("Informe o nome do titulo a ser alterado: ");
					String tituloLivro = leitura.next();
					System.out.println("Informe o novo titulo do livro: ");
					String novoTitulo = leitura.next();
					controlador.alterarLivro(tituloLivro, novoTitulo);
				} else if (alterarLivro == 2) {
					System.out.println("Informe o nome do titulo a ser alterado: ");
					String tituloEbook = leitura.next();
					System.out.println("Informe o novo titulo do ebook: ");
					String novoTituloEbook = leitura.next();
					controlador.alterarEbook(tituloEbook, novoTituloEbook);
				} else {
					break;
				}
				break;
			case 4:
				leitura.nextLine();

				System.out.println("Deletar livro: 1 | Deletar Ebook: 2 ");
				int deletarOpcao = leitura.nextInt();
				if (deletarOpcao == 1) {
					System.out.println("Informe o titulo do livro a ser deletado: ");
					String deletarLivro = leitura.next();
					controlador.deletarLivro(deletarLivro);

				} else if (deletarOpcao == 2) {
					System.out.println("Informe o titulo do ebook a ser deletado");
					String deletarEbook = leitura.next();
					controlador.deletarEbook(deletarEbook);

				} else {
					System.out.println("Ocorreu um erro, tente novamente.");
					break;
				}
				break;
			}

		} while (opcao != 0);
	}
}
