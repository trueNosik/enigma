package oop;

abstract class CaesarAbstractCoder {
	private String key;
	protected final char[][] array;

	private AlphabetCreator alphabetCreator = new CaesarAlphabetCreator();
	private AlphabetConvertor alphabetConvertor = new CaesarAlphabetConverter();

	public CaesarAbstractCoder(String key, AlphabetCreator alphabetCreator, AlphabetConvertor alphabetConvertor) {
		super();
		this.key = key;
		this.array = createArray();
		this.alphabetCreator = alphabetCreator;
		this.alphabetConvertor = alphabetConvertor;
	}
	
	public CaesarAbstractCoder(String key) {
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
	
	protected String processSourceTextViaAlphabet(String sourceText) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < sourceText.length(); i++) {
			char ch = sourceText.charAt(i);
			char encodedCh = findCharInArray(ch);
			result.append(encodedCh);
		}
		return result.toString();
	}

	protected abstract char findCharInArray(char ch);
	
	protected abstract char processChar(int i, int j);
}
