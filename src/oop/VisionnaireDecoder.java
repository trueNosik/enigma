package oop;

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
	protected char processChar(int i, int j) {	
		// TO DO
		return 0;
	}
}
