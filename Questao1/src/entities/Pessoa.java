package entities;
//superclasse
public abstract class Pessoa {
	//O modificador de acesso "protected" permite que a superclasse
	//e a subclasse tenha acesso ao atributo
	protected String rg;
	protected String nome;
	
	public Pessoa(String rg, String nome) {
		this.rg = rg;
		this.nome = nome;
	}
	
	public abstract Double aumentar_salario(double percentual);
}
