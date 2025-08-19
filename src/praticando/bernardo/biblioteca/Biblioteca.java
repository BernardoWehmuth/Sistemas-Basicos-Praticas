package praticando.bernardo.biblioteca;

public class Biblioteca {
	public static void main(String[] args) {
		Professor bernardo_wehmuth = new Professor("Bernardo Wehmuth", "107.128.389-88");
		Livro batman = new Livro("Dom Quixote", "Miguel de Cervantes");
		Livro cesar = new Livro("O Código Da Vinci", "Dan Brown");
		Livro heitor = new Livro("Macbeth", "William Shakespeare");
		bernardo_wehmuth.emprestarLivro(heitor);
		bernardo_wehmuth.emprestarLivro(cesar);
		bernardo_wehmuth.emprestarLivro(batman);
		bernardo_wehmuth.imprimirEmprestados();
	}
	
	
	
}
