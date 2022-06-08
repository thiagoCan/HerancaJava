package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Animal;
import entities.Cachorro;
import entities.Peixe;

public class Zoo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do peixe 1: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o peso do peixe 1 em quilos: ");
		Double peso = sc.nextDouble();
		
		sc.nextLine();
		
		
		System.out.print("Digite o Hábitat do peixe 1: ");
		String tipoHabitat = sc.nextLine();
		
		//Polimorfismo: uma variável de referência do tipo superclasse tem várias formas de ser instanciada.
		Animal p1 = new Peixe(nome, peso, tipoHabitat);
		
		
		System.out.print("Digite o nome do peixe 2: ");
		nome = sc.nextLine();
		
		System.out.print("Digite o peso do peixe 2 em quilos: ");
		peso = sc.nextDouble();
		
		sc.nextLine();
		
		
		System.out.print("Digite o Hábitat do peixe 2: ");
		tipoHabitat = sc.nextLine();
		
		Animal p2 = new Peixe(nome, peso, tipoHabitat);
		
		
		System.out.print("Digite o nome do cachorro 1: ");
		nome = sc.nextLine();
		
		System.out.print("Digite o peso do cachorro 1 em quilos: ");
		peso = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Digite a raça do cachorro 1: ");
		String raca = sc.nextLine();
		
		Animal c1 = new Cachorro(nome, peso, raca);
		
		System.out.print("Digite o nome do cachorro 2: ");
		nome = sc.nextLine();
		
		System.out.print("Digite o peso do cachorro 2 em quilos: ");
		peso = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Digite a raça do cachorro 2: ");
		raca = sc.nextLine();
		
		Animal c2 = new Cachorro(nome, peso, raca);
		
		//Como o "toString" foi implementado na subclasse, não é obrigatório explicitar o ".toString()"
		//nas chamadas p1, p2...
		System.out.println("\npeixe 1:\n\n" + p1
							+ "\n\n"
							+ "peixe 2:\n\n" + p2);
		
		System.out.println("\ncachorro 1:\n\n" + c1
				+ "\n\n"
				+ "cachorro 2:\n\n" + c2);
		
		
		sc.close();
	}

}
