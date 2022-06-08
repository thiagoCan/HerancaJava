package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Gerente;

public class Empresa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do Gerente 1: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o cpf do Gerente 1: ");
		String cpf = sc.next();
		
		System.out.print("Digite o sal�rio do Gerente 1: ");
		double salario = sc.nextDouble();
		
		System.out.print("Digite a senha do Gerente 1: ");
		int senha = sc.nextInt();
		//instanciando a classe: vari�vel de refer�ncia "g1"
		Gerente g1 = new Gerente(nome, cpf, salario, senha);
		
		System.out.println();
		System.out.println("senha v�lida: " + g1.autenticar(senha));
		System.out.println();
		
		sc.nextLine();
		System.out.print("Digite o nome do Gerente 2: ");
		nome = sc.nextLine();
		
		System.out.print("Digite o cpf do Gerente 2: ");
		cpf = sc.next();
		
		System.out.print("Digite o sal�rio do Gerente 2: ");
		salario = sc.nextDouble();
		
		System.out.print("Digite a senha do Gerente 2: ");
		senha = sc.nextInt();
		
		Gerente g2 = new Gerente(nome, cpf, salario, senha);
		
		System.out.println();
		System.out.println("senha v�lida: " + g2.autenticar(senha));
		System.out.println();
		
		System.out.println();
		//formata��o dos dados a serem impressos.
		System.out.println("Gerente 1:\n"
				+ "nome: "
				+ g1.getNome()
				+ "\n"
				+ "cpf: "
				+ g1.getCpf()
				+ "\n"
				+ "sal�rio: "
				+ g1.getSalario());
		
		System.out.println();
		
		System.out.println("Gerente 2:\n"
				+"nome: "
				+ g2.getNome()
				+"\n"
				+ "cpf: "
				+ g2.getCpf()
				+ "\n"
				+ "sal�rio: "
				+ g2.getSalario());
		
		System.out.println();
		
		sc.close();
	}

}
