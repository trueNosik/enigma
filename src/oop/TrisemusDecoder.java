package oop;

public class TrisemusDecoder extends TrisemusAbstractCoder implements Decoder {

	public TrisemusDecoder(String key) {
		super(key);
	}

	public TrisemusDecoder(String key, KeyNormalizer keyNormalizer, AlphabetCreator alphabetCreator,
			AlphabetConvertor alphabetConvertor) {
		super(key, keyNormalizer, alphabetCreator, alphabetConvertor);
	}

	@Override
	public String decode(String text) {
		return processSourceTextViaAlphabet(text);
	}

	@Override
	protected char processChar(int i, int j) {
		// TO DO
		return 0;
	}
}
