package oop;

public class CaesarAlphabetCreator implements AlphabetCreator {
	
	@Override
	public String createAlphabet(String key) {
		StringBuilder defaultAlphabet = new StringBuilder();
		for (char chL = 'a'; chL <= 'z'; chL++) {
			defaultAlphabet.append(chL);
		}
		for (char chU = 'A'; chU <= 'Z'; chU++) {
			defaultAlphabet.append(chU);
		}
		defaultAlphabet.append(" 0123456789+-=_*/\\|[](),.;:!?@#$%\"&'<>");
		String temp = createShiftedAlphabet(defaultAlphabet.toString(), key);
		StringBuilder result = new StringBuilder(defaultAlphabet);
		result.append(temp);
		return result.toString();
	}

	private String createShiftedAlphabet(String defaultAlphabet, String key) {
		StringBuilder result = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		char firstCharacter = key.charAt(0);
		for (int i = 0; i < defaultAlphabet.length(); i++) {
			char ch = defaultAlphabet.charAt(i);
			if (ch == firstCharacter) {
				for (; i < defaultAlphabet.length(); i++) {
					ch = defaultAlphabet.charAt(i);
					result.append(ch);
				}
				break;
			}	
			temp.append(ch);
		}
		result.append(temp);
		return result.toString();
	}
}
