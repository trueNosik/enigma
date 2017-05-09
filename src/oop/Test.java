package oop;

public class Test {

	public static void main(String[] args) {
		String key = "key";
		String text = "ztext";
				
		Encoder encoder1 = CoderFactory.createCaesarEncoder(key);
		String encodedText1 = encoder1.encode(text);
		System.out.println(encodedText1);
		
		Decoder decoder1 = CoderFactory.createCaesarDecoder(key);
		System.out.println(decoder1.decode(encodedText1));
		
		Encoder encoder2 = CoderFactory.createTrisemusEncoder(key);
		String encodedText2 = encoder2.encode(text);
		System.out.println(encodedText2);
		
		Decoder decoder2 = CoderFactory.createTrisemusDecoder(key);
		System.out.println(decoder2.decode(encodedText2));
	}

}