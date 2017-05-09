package oop;

public class RemoveDuplicatesKeyAndReverseNormalizer extends RemoveDuplicatesKeyNormalizer{
	
	@Override
	public String normilizeKeyWord(String keyWord) {
		String key = super.normilizeKeyWord(keyWord);
		StringBuilder s = new StringBuilder();
		for (int i = key.length()-1; i >= 0; i--) {
			s.append(key.charAt(i));
		}
		return s.toString();
	}

}
