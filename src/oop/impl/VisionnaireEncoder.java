package oop.impl;

import oop.AlphabetConvertor;
import oop.AlphabetCreator;
import oop.Encoder;
import oop.KeyNormalizer;

public class VisionnaireEncoder extends VisionnaireAbsractCoder implements Encoder {
	public VisionnaireEncoder(String key) {
		super(key);
	}
	
	public VisionnaireEncoder(String key, KeyNormalizer keyNormalizer, AlphabetCreator alphabetCreator,
			AlphabetConvertor alphabetConvertor) {
		super(key, keyNormalizer, alphabetCreator, alphabetConvertor);
	}

	@Override
	public String encode(String text) {
		return processSourceTextViaAlphabet(text);
	}

	@Override
	protected char findCharInArray(char ch, String normilizedKeyWord) {
		for (int j = 0; j < array[0].length; j++) {
			if (array[0][j] == ch) {
				return processChar(0, j, normilizedKeyWord);
			}	
		}
		System.err.println("Encode Error at: " + ch);
		System.exit(1);
		return 0;
	}

	@Override
	protected char processChar(int i, int j, String normilizedKeyWord) { // ztext -> jxchx keyke
		// TODO Auto-generated method stub
		return 0;
	}
}
