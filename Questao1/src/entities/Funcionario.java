package entities;

public class Funcionario extends Pessoa {
	//o modificador de acesso "private" só permite que esta classe tenha acesso ao atributo.
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

	//a anotação "@Override" só serve para verificar erro de digitação
	//do cabeçalho do método. Caso não esteja de acordo com a superclasse,
	//será exibido um erro.
	@Override
	public Double aumentar_salario(double percentual) {
		salario *= (1 + (percentual / 100));
		
		return salario;
	}
	
}
