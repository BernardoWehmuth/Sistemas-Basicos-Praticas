package praticando.bernardo.biblioteca;

public class Biblioteca {
	public static void main(String[] args) {
		Professor bernardo_wehmuth = new Professor("Bernardo Wehmuth", "107.128.389-88");
		Livro batman = new Livro("BATMAN", "SILVA & SILVA");
		Livro cesar = new Livro("CESAR", "CLARA & ROMARIO");
		Livro heitor = new Livro("HEITOR", "ALVARO & CASTRO");
		bernardo_wehmuth.emprestarLivro(heitor);
		bernardo_wehmuth.emprestarLivro(cesar);
		bernardo_wehmuth.emprestarLivro(batman);
		bernardo_wehmuth.imprimirEmprestados();
	}
	
	
	
}
