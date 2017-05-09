package oop;

public class TrisemusEncoder extends TrisemusAbstractCoder implements Encoder {

	public TrisemusEncoder(String key) {
		super(key);
	}

	public TrisemusEncoder(String key, KeyNormalizer keyNormalizer, AlphabetCreator alphabetCreator,
			AlphabetConvertor alphabetConvertor) {
		super(key, keyNormalizer, alphabetCreator, alphabetConvertor);
	}

	@Override
	public String encode(String text) {
		return processSourceTextViaAlphabet(text);
	}

	@Override
	protected char processChar(int i, int j) {
		if (i != array.length - 1) {
			return array[i + 1][j];
		} else {
			return array[0][j];
		}
	}
}
