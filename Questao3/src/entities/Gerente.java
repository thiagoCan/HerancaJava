package entities;

public class Gerente extends Funcionario {

	private int senha;

	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autenticar(int senha) {
		if(senha == 1234) {
			return true;
		}
		else {
			return false;
		}
	}
}
