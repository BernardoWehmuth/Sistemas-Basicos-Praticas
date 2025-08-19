package praticando.bernardo.corrida;

public class Caminhao extends Veiculo{
	private double cargaMaxima;
	
	public Caminhao(String nome, double velocidadeMaxima, double cargaMaxima) {
		super(nome, velocidadeMaxima);
		this.cargaMaxima = cargaMaxima;
	}
	
	public void setCargaMaxima(double cargaMaxima) { this.cargaMaxima = cargaMaxima; }
	public double getCargaMaxima() { return cargaMaxima; }
	
	
	@Override
	public String exibirStatus() {
		return "🚛 - " +  super.exibirStatus() + " - Carga Maxima: " + cargaMaxima + " kg";
	}
	
}
