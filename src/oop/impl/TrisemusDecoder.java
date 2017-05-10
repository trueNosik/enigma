package oop.impl;

import oop.AlphabetConvertor;
import oop.AlphabetCreator;
import oop.Decoder;
import oop.KeyNormalizer;

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
		if (i > 0) {
			return array[i - 1][j];
		} else {
			return array[array.length - 1][j];
		}
	}
}
