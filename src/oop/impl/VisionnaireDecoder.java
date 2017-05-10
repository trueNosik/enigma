package oop.impl;

import oop.AlphabetConvertor;
import oop.AlphabetCreator;
import oop.Decoder;
import oop.KeyNormalizer;

public class VisionnaireDecoder extends VisionnaireAbsractCoder implements Decoder {
	public VisionnaireDecoder(String key) {
		super(key);
	}
	
	public VisionnaireDecoder(String key, KeyNormalizer keyNormalizer, AlphabetCreator alphabetCreator,
			AlphabetConvertor alphabetConvertor) {
		super(key, keyNormalizer, alphabetCreator, alphabetConvertor);
	}

	@Override
	public String decode(String text) {
		return processSourceTextViaAlphabet(text);
	}

	@Override
	protected char findCharInArray(char ch, String normilizedKeyWord) {
		for (int j = 0; j < array[j].length; j++) {
			if (array[j][0] == ch) {
				return processChar(j, 0, normilizedKeyWord);
			}	
		}
		System.err.println("Encode Error at: " + ch);
		System.exit(1);
		return 0;
	}

	@Override
	protected char processChar(int i, int j, String normilizedKeyWord) { // jxchx -> ztext keyke
		// TODO Auto-generated method stub
		return 0;
	}
}
