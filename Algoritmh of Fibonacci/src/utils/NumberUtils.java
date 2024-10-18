package utils;

public class NumberUtils {

	public static boolean isFibonacci(int number) {
		//"Starta" os dois primeiros números da sequência de Fibonacci
		int a = 0, b = 1;
		
		//Gera a sequência até que o número informado seja alcançado ou ultrapassado
		
		while(a < number) {
			int temp = a;
			a = b;
			b = temp + a; // Esse é o próximo número da sequência
		}
		
		return (a == number); //Verifica se o número atual é igual ao número atual na sequência
	}

}
