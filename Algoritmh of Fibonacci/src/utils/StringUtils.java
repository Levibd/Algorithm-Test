package utils;

public class StringUtils {

	public static int howMany(String phrase) {
		String[] characters = phrase.toUpperCase().split("");
		int count = 0;
		for(String a : characters) {
			if(a.equals("A")) {
				count += 1;
			}
		}
		return count;
	}

}
