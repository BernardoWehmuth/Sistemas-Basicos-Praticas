package praticando.bernardo.corrida;

public class Moto extends Veiculo {
	private int cilindrada;
	public Moto(String nome, double velocidadeMaxima, int cilindrada) {
		super(nome, velocidadeMaxima);
		this.cilindrada = cilindrada;
	}
	public int getCilindrada() { return cilindrada; }
	public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }
	
	@Override
	public String exibirStatus() {
		return "🏍 - " + super.exibirStatus() + " - Cilindrada: " + cilindrada;
	}
	
}
