package oop.impl;

import oop.KeyNormalizer;

public class MatchKeyLengthToTextLength implements KeyNormalizer {
	@Override
	public String normilizeKeyWord(String keyWord, String sourceText) {
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
	/**Do nothing for VisionnaireCode,r use other key normilizer*/
	@Override
	public String normilizeKeyWord(String keyWord) {
		// Do nothing
		return null;
	}
}
