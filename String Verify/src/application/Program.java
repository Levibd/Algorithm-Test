package application;

import java.util.Scanner;

import utils.StringUtils;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a string a ser verificada:");
		String phrase = sc.nextLine();
		
		System.out.println("O número de ocorrências da letra 'a' é: " + StringUtils.howMany(phrase));
		sc.close();
	
	}

}
