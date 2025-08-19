package praticando.bernardo.corrida;

import java.util.List;
import java.util.ArrayList;

public class Corrida {
	private String vencedor;
	private List<Veiculo> participantes = new ArrayList<>();
	
	public void adicionarVeiculo(Veiculo veiculo) {
		participantes.add(veiculo);
	}
	
	public void listarVeiculos() {
		for (Veiculo veiculo : participantes) {
			System.out.println(veiculo.exibirStatus());
		}
	}
	
	public String determinarVencedor() {
		double maiorVelocidade = 0;
		for(Veiculo veiculo : participantes) {
			if(veiculo.getVelocidadeMaxima() > maiorVelocidade) {
				maiorVelocidade = veiculo.getVelocidadeMaxima();
				vencedor = veiculo.getNome();
			}
		}
		return "🏆 - O vencedor é -> " + vencedor;
	}
	
}
