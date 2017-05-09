package oop;

public class CaesarDecoder extends CaesarAbstractCoder implements Decoder {

	public CaesarDecoder(String key) {
		super(key);
	}

	public CaesarDecoder(String key, AlphabetCreator alphabetCreator, AlphabetConvertor alphabetConvertor) {
		super(key, alphabetCreator, alphabetConvertor);
	}

	@Override
	public String decode(String text) {
		return processSourceTextViaAlphabet(text);
	}

	@Override
	protected char processChar(int i, int j) {
		return array[i - 1][j];
	}

	@Override
	protected char findCharInArray(char ch) {
		for (int j = 0; j < array[1].length; j++) {
			if (array[1][j] == ch) {
				return processChar(1, j);
			}
		}
		System.err.println("Encode Error at: " + ch);
		System.exit(1);
		return 0;
	}
}
