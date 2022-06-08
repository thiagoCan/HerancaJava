package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		//aceita "." como separador decimal
		Locale.setDefault(Locale.US);
		//Objeto para leitura do teclado
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o rg: ");
		String rg = sc.next();
		//limpa o buffer do teclado para aceitar mais digitação.
		//foi usado porque o sc.next() foi usado antes do sc.nextLine()
		sc.nextLine();
		
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o salário: ");
		Double salario = sc.nextDouble();
		
		//instanciando um funcionário do tipo Funcionario.
		Funcionario pes = new Funcionario(rg, nome, salario);
		
		System.out.println();
		System.out.print("Digite a porcentagem sem o símbolo '%'\na ser acrescido no salario: ");
		
		double percentual = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("o salário novo é: " + pes.aumentar_salario(percentual));

		sc.close();
	}

}
