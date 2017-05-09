package oop;

public class CaesarEncoder extends CaesarAbstractCoder implements Encoder {

	public CaesarEncoder(String key) {
		super(key);
	}

	public CaesarEncoder(String key, AlphabetCreator alphabetCreator, AlphabetConvertor alphabetConvertor) {
		super(key, alphabetCreator, alphabetConvertor);
	}

	@Override
	public String encode(String text) {
		return processSourceTextViaAlphabet(text);
	}

	@Override
	protected char processChar(int i, int j) {
		return array[i + 1][j];
	}

	@Override
	protected char findCharInArray(char ch) {
		for (int j = 0; j < array[0].length; j++) {
			if (array[0][j] == ch) {
				return processChar(0, j);
			}
		}
		System.err.println("Encode Error at: " + ch);
		System.exit(1);
		return 0;
	}
}
