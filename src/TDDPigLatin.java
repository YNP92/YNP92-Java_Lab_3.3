public class TDDPigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String w1 = "!dfasdf";
//		String w2 = "sdsd223df";
//		String w3 = "dfasdf.";
//		String w4 = "nospecialcharacter";
//		
//		System.out.println(containSpecialChar(w1));
//		System.out.println(containSpecialChar(w2));
//		System.out.println(containSpecialChar(w3));
//		System.out.println(containSpecialChar(w4));
	}

	public static String toLower(String in) {
		String toLower = "";
		try {
			if (in instanceof String) {
				toLower = in.toLowerCase();
			}
		} catch (Exception ex) {
			System.out.println("Your word was not of Type String, no piglatin for you!");
		}
		return toLower;
	}

	public static boolean containSpecialChar(String in) {
		String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}123456789";
		boolean out = false;
		for (int i = 0; i < in.length(); i++) {
			char ch = in.charAt(i);
			System.out.println("my char " + ch);
			System.out.println("contains special character " +specialCharactersString.contains(Character.toString(ch)));
			if (specialCharactersString.contains(Character.toString(ch))) {
				out = true;
				return out;
			} else {
				out = false;		
			}
		}
		return out;
	}

	public static boolean consonantORVowel(String in) {
		boolean out = false;
		char ch = in.charAt(0);
		if (ch == 'y' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			out = true;

		} else {
			out = false;
		}
		return out;
	}

	public static int consonantSubTranslate(String in) {
		int firstVowelElement = 0;
		for (int i = 0; i < in.length(); i++) {
			char ch = in.charAt(i);
			if (ch == 'y' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				firstVowelElement = i;
				break;
			} else {

			}
		}
		return firstVowelElement;
	}

	public static String translate(String in) {
		String stringLower = toLower(in);
		String ifVowel = "way";
		String ifConsonant = "ay";
		String pigLatin = "";
		if (containSpecialChar(stringLower) == true) {
			System.out.println("Your string" + stringLower + " contains a special character or number, goodbye");
		} else {
			if (consonantORVowel(stringLower) == true) {
				pigLatin = stringLower + ifVowel;
			} else {
				int vowelLocationl = consonantSubTranslate(stringLower);
				pigLatin = stringLower.substring(vowelLocationl) + stringLower.substring(0, vowelLocationl)
						+ ifConsonant;
			}
		}
		return pigLatin;

	}

}
