package proced;
public class EnigmaProcedural {

	public static void main(String[] args) {
		String keyWord = "I Love Java";
		String text = "select pr.name, cat.name, p.description from product p , category cat, producer pr where p.id_category = cat.id and p.id_producer= pr.id and pr.name ilike '%air%' and p.description ilike '%silver%';";
		String result = encode(text, keyWord);
		result.equals(result);
		System.out.println(result);
		System.out.println(decode(result, keyWord));
	}

	public static String encode(String sourceText, String keyWord) {
		String normilizedKeyWord = normilizeKeyWord(keyWord);
		String alphabet = createAlphabet(normilizedKeyWord);
		char[][] array = convertAlphabetToArray(alphabet);
		return processSourceTextViaAlphabet(sourceText, array, true);
	}
	
	public static String decode(String encryptedText, String keyWord) {
		String normilizedKeyWord = normilizeKeyWord(keyWord);
		String alphabet = createAlphabet(normilizedKeyWord);
		char[][] array = convertAlphabetToArray(alphabet);
		return processSourceTextViaAlphabet(encryptedText, array, false);
	}

	private static String processSourceTextViaAlphabet(String sourceText, char[][] array, boolean encode) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < sourceText.length(); i++) {
			char ch = sourceText.charAt(i);
			char encodedCh = encode ? encodeChar(ch, array) : decodeChar(ch, array);
			result.append(encodedCh);
		}
		return result.toString();
	}

	private static char decodeChar(char ch, char[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == ch) {
					if (i > 0) {
						return array[i - 1][j];
					} else {
						return array[array.length - 1][j];
					}
				}
			}
		}
		System.err.println("Decode Error at: " + ch );
		System.exit(1);
		return 0;
	}

	private static char encodeChar(char ch, char[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == ch) {
					if (i != array.length - 1) {
						return array[i + 1][j];
					} else {
						return array[0][j];
					}
				}
			}
		}
		System.err.println("Encode Error at: " + ch );
		System.exit(1);
		return 0;
	}

	private static char[][] convertAlphabetToArray(String alphabet) {
		char[][] array = new char[10][9];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int index = i * (array.length - 1) + j;
				array[i][j] = alphabet.charAt(index);
			}
		}
		return array;
	}

	private static String createAlphabet(String normilizedKeyWord) {
		StringBuilder result = new StringBuilder(normilizedKeyWord);
		for (char chL = 'a'; chL <= 'z'; chL++) {
			char chU = Character.toUpperCase(chL);
			if (result.indexOf(String.valueOf(chL)) == -1) {
				result.append(chL);
			}
			if (result.indexOf(String.valueOf(chU)) == -1) {
				result.append(chU);
			}
		}
		result.append(" 0123456789+-=_*/\\|[](),.;:!?@#$%\"&'<>");
		return result.toString();
	}

	private static String normilizeKeyWord(String keyWord) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < keyWord.length(); i++) {
			char ch = keyWord.charAt(i);
			if (result.indexOf(String.valueOf(ch)) == -1 && keyWord.charAt(i) != ' ') {
				result.append(ch);
			}
		}
		return result.toString();
	}
}
