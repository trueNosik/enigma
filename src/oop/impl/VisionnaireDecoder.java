package oop.impl;

import oop.AlphabetConvertor;
import oop.AlphabetCreator;
import oop.Decoder;
import oop.KeyNormalizer;

public class VisionnaireDecoder extends VisionnaireAbsractCoder implements Decoder {
	public VisionnaireDecoder(String key) {
		super(key);
	}
	
	public VisionnaireDecoder(String sourceText, String key, KeyNormalizer keyNormalizer, AlphabetCreator alphabetCreator,
			AlphabetConvertor alphabetConvertor) {
		super(sourceText, key, keyNormalizer, alphabetCreator, alphabetConvertor);
	}

	@Override
	public String decode(String text) {
		return processSourceTextViaAlphabet(text);
	}

	@Override
	protected char findCharInArray(char chFromSourceText, char chFromKey) {
		for (int j = 0; j < array[0].length; j++) {
			if (array[j][0] == chFromKey) {
				for (int i = 0; i < array[0].length; i++){
					if (array[j][i] == chFromSourceText) {
						return processChar(0, i);
					}
				}	
			}	
		}
		System.err.println("Encode Error at: " + chFromSourceText);
		System.exit(1);
		return 0;
	}
}
