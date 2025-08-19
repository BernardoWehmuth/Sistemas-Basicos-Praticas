package praticando.bernardo.biblioteca;

public class Professor extends Usuario {

	public Professor(String nome, String cpf) {
		super(nome, cpf, "Professor");
		// TODO Auto-generated constructor stub
	}
	
	public int getLimiteEmprestimos() {
        return 5;
    }
}
