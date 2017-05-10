package oop;

import oop.impl.CaesarAlphabetConverter;
import oop.impl.CaesarAlphabetCreator;
import oop.impl.CaesarDecoder;
import oop.impl.CaesarEncoder;
import oop.impl.MatchKeyLengthToTextLength;
import oop.impl.RemoveDuplicatesKeyNormalizer;
import oop.impl.TrisemusAlphabetConvertor;
import oop.impl.TrisemusAlphabetCreator;
import oop.impl.TrisemusDecoder;
import oop.impl.TrisemusEncoder;
import oop.impl.VisionnaireDecoder;
import oop.impl.VisionnaireEncoder;

public class CoderFactory {
	public static Encoder createTrisemusEncoder(String key) {
		return new TrisemusEncoder(key, 
				new RemoveDuplicatesKeyNormalizer(), 
				new TrisemusAlphabetCreator(),
				new TrisemusAlphabetConvertor());
	}
	
	public static Decoder createTrisemusDecoder(String key) {
		return new TrisemusDecoder(key, 
				new RemoveDuplicatesKeyNormalizer(), 
				new TrisemusAlphabetCreator(),
				new TrisemusAlphabetConvertor());
	}
	
	public static Encoder createCaesarEncoder(String key) {
		return new CaesarEncoder(key, 
				new CaesarAlphabetCreator(),
				new CaesarAlphabetConverter());
	}
	
	public static Decoder createCaesarDecoder(String key) {
		return new CaesarDecoder(key, 
				new CaesarAlphabetCreator(),
				new CaesarAlphabetConverter());
	}
	
	public static Encoder createVisionnaireEncoder(String key) {
		return new VisionnaireEncoder(key, 
				new MatchKeyLengthToTextLength(), 
				new TrisemusAlphabetCreator(),
				new TrisemusAlphabetConvertor());
	}
	
	public static Decoder createVisionnaireDecoder(String key) {
		return new VisionnaireDecoder(key, 
				new MatchKeyLengthToTextLength(), 
				new TrisemusAlphabetCreator(),
				new TrisemusAlphabetConvertor());
	}
}
