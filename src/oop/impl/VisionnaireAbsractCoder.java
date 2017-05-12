package oop.impl;

import oop.AlphabetConvertor;
import oop.AlphabetCreator;
import oop.KeyNormalizer;

public abstract class VisionnaireAbsractCoder {
	private String key;
	private String sourceText;
	protected final char[][] array;
	
	private KeyNormalizer keyNormalizer = new MatchKeyLengthToTextLength();
	private AlphabetCreator alphabetCreator = new VisionnaireAlphabetCreator();
	private AlphabetConvertor alphabetConvertor = new VisionnaireAlphabetConverter();
	
	public VisionnaireAbsractCoder(String sourceText, String key, KeyNormalizer keyNormalizer, AlphabetCreator alphabetCreator,
			AlphabetConvertor alphabetConvertor) {
		super();
		this.key = key;
		this.sourceText = sourceText;
		this.array = createArray();
		this.keyNormalizer = keyNormalizer;
		this.alphabetCreator = alphabetCreator;
		this.alphabetConvertor = alphabetConvertor;
	}

	public VisionnaireAbsractCoder(String key) {
		super();
		this.key = key;
		this.array = createArray();
	}

	private char[][] createArray() {
		String alphabet = alphabetCreator.createAlphabet(key);
		return alphabetConvertor.convertAlphabetToArray(alphabet);
	}

	public String getKey() {
		return key;
	}
	
	public String getSourceText() {
		return sourceText;
	}
	
	public String getNormilizedKeyWord() {
		return keyNormalizer.normilizeKeyWord(key, sourceText);
	}
	
	protected String processSourceTextViaAlphabet(String sourceText) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < sourceText.length(); i++) {
			char chFromSourceText = sourceText.charAt(i);
			char chFromKey = getNormilizedKeyWord().charAt(i);
			char encodedCh = findCharInArray(chFromSourceText, chFromKey);
			result.append(encodedCh);
		}
		return result.toString();
	}

	protected abstract char findCharInArray(char chFromSourceText, char chFromKey);
		
	protected char processChar(int i, int j) {
		return array[i][j];
	}
}
