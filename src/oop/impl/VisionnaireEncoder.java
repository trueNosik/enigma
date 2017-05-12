package oop.impl;

import oop.AlphabetConvertor;
import oop.AlphabetCreator;
import oop.Encoder;
import oop.KeyNormalizer;

public class VisionnaireEncoder extends VisionnaireAbsractCoder implements Encoder {
	public VisionnaireEncoder(String key) {
		super(key);
	}
	
	public VisionnaireEncoder(String sourceText, String key, KeyNormalizer keyNormalizer, AlphabetCreator alphabetCreator,
			AlphabetConvertor alphabetConvertor) {
		super(sourceText, key, keyNormalizer, alphabetCreator, alphabetConvertor);
	}

	@Override
	public String encode(String sourceText) {
		return processSourceTextViaAlphabet(sourceText);
	}

	@Override
	protected char findCharInArray(char chFromSourceText, char chFromKey) {
		for (int j = 0; j < array[0].length; j++) {
			if (array[0][j] == chFromSourceText) {
				for (int i = 0; i < array[0].length; i++){
					if (array[i][0] == chFromKey) {
						return processChar(i, j);
					}
				}	
			}	
		}
		System.err.println("Encode Error at: " + chFromSourceText);
		System.exit(1);
		return 0;
	}
}
