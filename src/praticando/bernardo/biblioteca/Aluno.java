package praticando.bernardo.biblioteca;

public class Aluno extends Usuario{
	
	public Aluno(String nome, String cpf) {
		super(nome, cpf, "Aluno");
		// TODO Auto-generated constructor stub
	}
	
	public int getLimiteEmprestimos() {
        return 3;
    }
}
