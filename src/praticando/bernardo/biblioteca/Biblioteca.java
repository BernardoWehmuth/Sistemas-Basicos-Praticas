package praticando.bernardo.biblioteca;

public class Biblioteca {
	public static void main(String[] args) {
		Professor bernardo_wehmuth = new Professor("Bernardo Wehmuth", "107.128.389-88");
		Livro dom_quixote = new Livro("Dom Quixote", "Miguel de Cervantes");
		Livro codigo_da_vinci = new Livro("O Código Da Vinci", "Dan Brown");
		Livro macbeth = new Livro("Macbeth", "William Shakespeare");
		bernardo_wehmuth.emprestarLivro(dom_quixote);
		bernardo_wehmuth.emprestarLivro(codigo_da_vinci);
		bernardo_wehmuth.emprestarLivro(macbeth);
		bernardo_wehmuth.imprimirEmprestados();
	}
	
	
	
}
