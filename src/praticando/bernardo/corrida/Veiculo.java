package praticando.bernardo.corrida;

public abstract class Veiculo {
	private String nome;
	private double velocidadeMaxima;
	
	public Veiculo(String nome, Double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public String exibirStatus() {
		return nome + " - " + velocidadeMaxima;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	
	public String getNome() {
		return nome;
	}
	
}
