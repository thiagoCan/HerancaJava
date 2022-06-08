package entities;

public class Peixe extends Animal {
	
	private String tipoHabitat;

	public Peixe(String nome, Double peso, String tipoHabitat) {
		super(nome, peso);
		this.tipoHabitat = tipoHabitat;
	}

	public String getTipoHabitat() {
		return tipoHabitat;
	}

	public void setTipoHabitat(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	}
	
	//m�todo toString implementado para a formata��o dos dados em tela.
	@Override
	public String toString() {
		return "nome: "
				+ nome
				+ "\n"
				+ "peso: "
				+ String.format("%.2f", peso)
				+ "\nHabitat: "
				+ getTipoHabitat();
	}
}
