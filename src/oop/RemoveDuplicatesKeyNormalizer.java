package oop;

public class RemoveDuplicatesKeyNormalizer implements KeyNormalizer{

	public String normilizeKeyWord(String keyWord) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < keyWord.length(); i++) {
			char ch = keyWord.charAt(i);
			if (result.indexOf(String.valueOf(ch)) == -1) {
				result.append(ch);
			}
		}
		return result.toString();
	}
}
