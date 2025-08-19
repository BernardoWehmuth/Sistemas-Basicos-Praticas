package praticando.bernardo.corrida;

public class Carro extends Veiculo{
	private String tipoCombustivel;
	
	public Carro(String nome, double velocidadeMaxima, String tipoCombustivel) {
		super(nome, velocidadeMaxima);
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getTipoCombustivel() { return tipoCombustivel; }
	public void setTipoCombustivel(String tipoCombustivel) { this.tipoCombustivel = tipoCombustivel; }
	
	@Override
	public String exibirStatus() {
		return "🏎 - " + super.exibirStatus() + " - Tipo de Combustivel : " + tipoCombustivel;
	}
	
}
