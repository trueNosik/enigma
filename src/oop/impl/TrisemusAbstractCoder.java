package oop.impl;

import oop.AlphabetConvertor;
import oop.AlphabetCreator;
import oop.KeyNormalizer;

abstract class TrisemusAbstractCoder {
	private String key;
	protected final char[][] array;
	
	private KeyNormalizer keyNormalizer = new RemoveDuplicatesKeyAndReverseNormalizer();
	private AlphabetCreator alphabetCreator = new TrisemusAlphabetCreator();
	private AlphabetConvertor alphabetConvertor = new TrisemusAlphabetConvertor();
	
	public TrisemusAbstractCoder(String key, KeyNormalizer keyNormalizer, AlphabetCreator alphabetCreator,
			AlphabetConvertor alphabetConvertor) {
		super();
		this.key = key;
		this.array = createArray();
		this.keyNormalizer = keyNormalizer;
		this.alphabetCreator = alphabetCreator;
		this.alphabetConvertor = alphabetConvertor;
	}

	public TrisemusAbstractCoder(String key) {
		super();
		this.key = key;
		this.array = createArray();
	}

	private char[][] createArray() {
		String normilizedKeyWord = keyNormalizer.normilizeKeyWord(key);
		String alphabet = alphabetCreator.createAlphabet(normilizedKeyWord);
		return alphabetConvertor.convertAlphabetToArray(alphabet);
	}

	public String getKey() {
		return key;
	}
	
	protected String processSourceTextViaAlphabet(String sourceText) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < sourceText.length(); i++) {
			char ch = sourceText.charAt(i);
			char encodedCh = findCharInArray(ch);
			result.append(encodedCh);
		}
		return result.toString();
	}

	private char findCharInArray(char ch) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == ch) {
					return processChar(i, j);
				}
			}
		}
		System.err.println("Encode Error at: " + ch );
		System.exit(1);
		return 0;
	}
	
	protected abstract char processChar(int i, int j);
}
