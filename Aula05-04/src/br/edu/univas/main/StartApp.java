package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.*;

public class StartApp {
	
	static ArrayList<Funcionario> funcs = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aux;
		
		do {
			printMenu();
			aux = readInt(scan);
			calcOption(aux, scan);
		} while (aux!=9);
		
		scan.close();
	}
	
	public static void printMenu() {
		System.out.println("::::Cadastro de Funcionário::::");
		System.out.println("1 – Cadastrar Novo Funcionário");
		System.out.println("2 – Listar todos os Funcionários");
		System.out.println("9 - Sair ou Finalizar Programa");
	}
	
	public static void calcOption(int aux, Scanner scan){
		switch(aux) {
		case 1:
			cadFunc(aux, scan);
			break;
		case 2:
			listFunc(scan);
			break;
		case 9:
			System.out.println("Programa Finalizado :)");
			break;
		default:
			System.out.println("Opção Invalida, Por Favor tente Novamente");
		}
	}
	
	public static void cadFunc(int aux, Scanner scan) {
		
		Funcionario func = null;
		printMenuCadFunc();
		aux = readInt(scan);
		switch(aux) {
		case 1:
			func = new CLT(aux);
			cadCLT(func);
			break;
		case 2:
			func = new Estagiario(aux, aux);
			cadEstag(func);
			break;
		case 3:
			func = new CLT(aux);
			cadCLT(func);
			break;
		case 9:
			func = new Vendedor(aux, aux);
			cadVend(func);
			break;
		default:
			
		}
	}

	private static void cadCLT(Funcionario func) {
		
	}
	
	private static void cadEstag(Funcionario func) {
		
	}
	
	private static void cadVend(Funcionario func) {
		
	}

	static void printMenuCadFunc(){
		System.out.println("::::Cadastro de Funcionário::::");
		System.out.println("1 – CLT");
		System.out.println("2 – Estagiário");
		System.out.println("3 – Vendedor");
		System.out.println("9 - Sair");
	}
	
	public static void listFunc(Scanner scan) {
		
		for(int i=0; i<funcs.size(); i++) {
			
		}
		
	}
	
	//
	
	public static int readInt(Scanner scan) {
		int num = scan.nextInt();
		scan.nextLine();
		return num;
	}
}