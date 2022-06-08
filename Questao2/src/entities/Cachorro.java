package entities;

public class Cachorro extends Animal {

	private String raca;

	public Cachorro(String nome, Double peso, String raca) {
		super(nome, peso);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	//método toString implementado para a formatação dos dados em tela.
	@Override
	public String toString() {
		return "nome: "
				+ nome
				+ "\n"
				+ "peso: "
				+ String.format("%.2f", peso)
				+ "\nraca: "
				+ getRaca();
	}
}
