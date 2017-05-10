package oop;

public class VisionnaireAlphabetCreator implements AlphabetCreator {

	@Override
	public String createAlphabet(String normilizedKeyWord) {
		StringBuilder defaultAlphabet = new StringBuilder();
		for (char chL = 'a'; chL <= 'z'; chL++) {
			defaultAlphabet.append(chL);
		}
		for (char chU = 'A'; chU <= 'Z'; chU++) {
			defaultAlphabet.append(chU);
		}
		defaultAlphabet.append(" 0123456789+-=_*/\\|[](),.;:!?@#$%\"&'<>");
		String result = shiftAlphabetAtOneSymbol(defaultAlphabet);
		return result;
	}

	private String shiftAlphabetAtOneSymbol(StringBuilder defaultAlphabet) {
		StringBuilder result = new StringBuilder(defaultAlphabet);
		for (int j = 0; j < defaultAlphabet.length()-1; j++){
			for (int i = 1 + j; i < defaultAlphabet.length(); i++) {
				result.append(defaultAlphabet.charAt(i));
			}
			for (int k = 0; k <= j; k++) {
				result.append(defaultAlphabet.charAt(k));
			}
		}
		return result.toString();
	}
}
