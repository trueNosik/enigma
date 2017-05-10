package oop.impl;

import oop.AlphabetCreator;

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
		result.insert(0, '\u0000');
		for (int i = 0; i < defaultAlphabet.length(); i++) {
			result.append(defaultAlphabet.charAt(i));
			for (int j = 0 + i; j < defaultAlphabet.length(); j++) {
				result.append(defaultAlphabet.charAt(j));
			}
			for (int k = 0; k < i; k++) {
				result.append(defaultAlphabet.charAt(k));
			}
		}
		return result.toString();
	}
}
