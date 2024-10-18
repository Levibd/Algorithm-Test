package utils;

public class StringUtils {

	public static int howMany(String phrase) {
		//Converto a String para uma cadeia de caracteres e deixo todas as palavras em um padrão
		String[] characters = phrase.toUpperCase().split("");
		
		int count = 0;
		
		//Faço a verificação do Array de String para verificar a quantidade de ocorrências
		for(String a : characters) {
			if(a.equals("A")) {
				count += 1;
			}
		}
		return count;
	}

}
