package br.com.ifal.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.com.ifal.entidades.Ebook;
import br.com.ifal.entidades.Livro;
import br.com.ifal.entidades.LivroFisico;

public class ControladorBiblioteca {

	private List<LivroFisico> livrosFisico;
	private List<Ebook> ebooks;

	public ControladorBiblioteca() {
		livrosFisico = new ArrayList<>();
		ebooks = new ArrayList<>();
	}

	public void cadastrarLivro(LivroFisico livro) {
		livrosFisico.add(livro);
		System.out.println("Livro cadastrado");
	}

	public void cadastrarEbook(Ebook ebook) {
		ebooks.add(ebook);
		System.out.println("Ebook cadastrado");
	}

	public void pesquisarLivro(String titulo) {
		for (Livro livro : livrosFisico) {
			if (livro.getTitulo().equals(titulo)) {
				System.out.println("Titulo : " + livro.getTitulo());
				System.out.println("Autor : " + livro.getAutor().getNome());
				System.out.println("Editora : " + livro.getEditora());
				System.out.println("ISBN: " + livro.getIsbn());
				System.out.println("Ano de edicao: " + livro.getAnoEdicao());
			}
		}
	}

	public void pesquisarEbook(String titulo) {
		for (Livro ebook : ebooks) {
			if (ebook.getTitulo().equals(titulo)) {
				System.out.println("Titulo : " + ebook.getTitulo());
				System.out.println("Autor : " + ebook.getAutor().getNome());
				System.out.println("Editora : " + ebook.getEditora());
				System.out.println("ISBN: " + ebook.getIsbn());
				System.out.println("Ano de edicao: " + ebook.getAnoEdicao());
			}
		}
	}

	public void alterarLivro(String titulo, String novoTitulo) {
		for (int i = 0; i < livrosFisico.size(); i++) {
			if (livrosFisico.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				livrosFisico.get(i).setTitulo(novoTitulo);
				System.out.println("Titulo alterado com sucesso ");

			} else {
				System.out.println("Erro ao inserir titulo");
			}
		}

	}

	public void alterarEbook(String titulo, String novoTitulo) {
		// for (Livro livro : livros) {
		// if (livro.getTitulo().equals(titulo)){
		// livro.setTitulo(novoTitulo);
		// System.out.println("Título alterado com sucesso");
		for (int i = 0; i < ebooks.size(); i++) {
			if (ebooks.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				ebooks.get(i).setTitulo(novoTitulo);
				System.out.println("Titulo alterado com sucesso ");
			} else {
				System.out.println("Erro ao inserir titulo");
			}
		}

	}

	public void deletarLivro(String titulo) {
		for (int i = 0; i < livrosFisico.size(); i++) {
			if (livrosFisico.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				livrosFisico.remove(i);
				System.out.println("Livro deletado com sucesso!!!");
			} else {
				System.out.println("Erro ao deletar livro");
			}
		}

	}

	public void deletarEbook(String titulo) {
		for (int i = 0; i < ebooks.size(); i++) {
			if (ebooks.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				ebooks.remove(i);
				System.out.println("Ebook deletado com sucesso!!!");
			} else {
				System.out.println("Erro ao deletar ebook");
			}
		}

	}

}
