package praticando.bernardo.biblioteca;

import java.util.List;
import java.util.ArrayList;

public abstract class Usuario {
	private String nome;
	private String cpf;
	private String ocupacao;
	private List<Livro> listaEmprestados;
	
	public Usuario(String nome, String cpf, String ocupacao) {
		this.nome = nome;
		this.cpf = cpf;
		this.ocupacao = ocupacao;
		this.listaEmprestados = new ArrayList<>();
	}
	
	void emprestarLivro(Livro livro) {
		if(podeEmprestar()) {
			listaEmprestados.add(livro);
			System.out.println("👨‍🎓 - " + nome + " emprestou o livro: " + livro.getTitulo());
		}else {
			System.out.println("O limite de emprestimos de " + nome + " foi atingido!");
		}
	}
	
	List<Livro> getListaEmprestados() {
		return listaEmprestados;
	}
	
	public boolean podeEmprestar() {
        return listaEmprestados.size() < getLimiteEmprestimos();
    }
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getOcupacao() {
		return ocupacao;
	}
	
	public List<String> getLivrosEmprestados() {
	    List<String> detalhes = new ArrayList<>();
	    for (Livro livro : getListaEmprestados()) {
	        detalhes.add(livro.toString());
	    }
	    return detalhes;
	}
	public void imprimirEmprestados() {
	    System.out.println("📌 - Livros emprestados de " + getNome() + ":\n");
	    for (String livro : getLivrosEmprestados()) {
	        System.out.println("📙  " + livro);
	    }
	}
	

	public abstract int getLimiteEmprestimos();
}
