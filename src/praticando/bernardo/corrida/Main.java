package praticando.bernardo.corrida;

public class Main {
	public static void main(String[] args) {
		Moto moto1 = new Moto("Honda CG", 130, 150);
		Carro carro1 = new Carro("Fusca", 150, "Gasolina");
		Caminhao caminhao1 = new Caminhao("Moto", 90, 20000);
		
		Corrida corrida1 = new Corrida();
		
		corrida1.adicionarVeiculo(moto1);
		corrida1.adicionarVeiculo(carro1);
		corrida1.adicionarVeiculo(caminhao1);
		
		System.out.println(moto1.exibirStatus());
		System.out.println(carro1.exibirStatus());
		System.out.println(caminhao1.exibirStatus());
		
		System.out.println(corrida1.determinarVencedor());
		
	}
}
