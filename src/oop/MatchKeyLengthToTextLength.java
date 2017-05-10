package oop;

public class MatchKeyLengthToTextLength implements KeyNormalizer {

	public static String normilizeKeyWord(String keyWord, String sourceText) {
		StringBuilder result = new  StringBuilder();
		for (int i = 0; i < sourceText.length(); i++) {
			if (i < keyWord.length()) {
				result.append(keyWord.charAt(i));
			} else {
				result.append(keyWord.charAt(i - keyWord.length() * (i / keyWord.length())));
			}	
		}
		return result.toString();
	}
	/**Do nothing for VisionnaireCoder use other key normilizer*/
	@Override
	public String normilizeKeyWord(String keyWord) {
		// Do nothing
		return null;
	}
}
