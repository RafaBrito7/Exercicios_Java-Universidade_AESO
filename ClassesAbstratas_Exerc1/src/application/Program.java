package application;

import java.util.Scanner;

import model.entities.Funcionario;
import model.entities.Gerente;
import model.entities.Programador;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String nome;
		Double salario;
		
		System.out.println("Bem vindo ao sistema de cadastro de Funcion�rios!");
		
		System.out.println("Cadastro do [Gerente] ");
		System.out.print("Informe o nome: ");
		nome = sc.nextLine();
		System.out.print("Informe o sal�rio: ");
		salario = sc.nextDouble();
		Funcionario gerent = new Gerente(nome,salario);
		
		System.out.println("Cadastro do [Programador] ");
		sc.nextLine();
		System.out.print("Informe o nome: ");
		nome = sc.nextLine();
		System.out.print("Informe o sal�rio: ");
		salario = sc.nextDouble();
		Funcionario program = new Programador(nome,salario);
		
		System.out.println("Escolha o que voc� deseja fazer: ");
		System.out.println("[0] Imprimir Dados");
		System.out.println("[1] Aumentar Sal�rio");
		int decisao = sc.nextInt();
		
		if (decisao == 0) {
			System.out.println("[0]Gerente");
			System.out.println("[1]Programador");
			decisao = sc.nextInt();
			
			if (decisao == 0) {
				System.out.println(gerent.toString());
			} 
			else if(decisao == 1) {
				System.out.println(program.toString());
			}else
				System.out.println("Erro! N�mero Inv�lido!");
			
		} else if (decisao == 1) {
			System.out.println("[0]Gerente");
			System.out.println("[1]Programador");
			decisao = sc.nextInt();
			
			if (decisao == 0) {
				gerent.setSalario(gerent.aumentaSalario());
				System.out.println("Sal�rio Atualizado: R$" + gerent.getSalario());
			} 
			else if(decisao == 1) {
				program.setSalario(program.aumentaSalario());
				System.out.println("Sal�rio Atualizado: R$" + program.getSalario());
			}else
				System.out.println("Erro! N�mero Inv�lido!");
		}
	
		sc.close();
		
	}

}
