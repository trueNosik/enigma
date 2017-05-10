package oop;

public class Test {
	public static void main(String[] args) {
		String key = "key";
		String text = "ztext";
				  
		Encoder encoder1 = CoderFactory.createCaesarEncoder(key);
		String encodedText1 = encoder1.encode(text);
		System.out.println("Caesar cipher: " + encodedText1);
		
		Decoder decoder1 = CoderFactory.createCaesarDecoder(key);
		System.out.println(decoder1.decode(encodedText1));
		
		Encoder encoder2 = CoderFactory.createTrisemusEncoder(key);
		String encodedText2 = encoder2.encode(text);
		System.out.println("Trisemus cipher: " + encodedText2);
		
		Decoder decoder2 = CoderFactory.createTrisemusDecoder(key);
		System.out.println(decoder2.decode(encodedText2));
		
		Encoder encoder3 = CoderFactory.createVisionnaireEncoder(key);
		String encodedText3 = encoder3.encode(text);
		System.out.println("Visionnaire cipher: " + encodedText3);
		
		Decoder decoder3 = CoderFactory.createVisionnaireDecoder(key);
		System.out.println(decoder3.decode(encodedText3));
	}
}
