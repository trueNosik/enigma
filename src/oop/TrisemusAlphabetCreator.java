package oop;

public class TrisemusAlphabetCreator implements AlphabetCreator{

	public String createAlphabet(String normilizedKeyWord) {
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
}
