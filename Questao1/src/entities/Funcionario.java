package entities;

public class Funcionario extends Pessoa {
	//o modificador de acesso "private" s� permite que esta classe tenha acesso ao atributo.
	private Double salario;

	public Funcionario(String rg, String nome, Double salario) {
		super(rg, nome);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	//a anota��o "@Override" s� serve para verificar erro de digita��o
	//do cabe�alho do m�todo. Caso n�o esteja de acordo com a superclasse,
	//ser� exibido um erro.
	@Override
	public Double aumentar_salario(double percentual) {
		salario *= (1 + (percentual / 100));
		
		return salario;
	}
	
}
