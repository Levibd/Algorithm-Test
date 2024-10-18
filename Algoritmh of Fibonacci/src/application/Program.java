package application;

import java.util.Scanner;

import utils.NumberUtils;

public class Program {

	public static void main(String[] args) {
		
		//Questão de Fibonacci 1ª
		
		//Inicia o scanner para ler o número a ser verificado informando pelo usuário
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Insira o número a ser verificado na sequência:");
		int numberTest = sc.nextInt();
		
		//Verifico se o número está na sequência
		if(NumberUtils.isFibonacci(numberTest)) {
			System.out.println("O número informado está na sequência!");
		}
		else {
			System.out.println("O número informado não está na sequência!");
		}
		
		sc.close();
	
	}

}
