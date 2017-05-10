package oop.impl;

import oop.AlphabetConvertor;

public class VisionnaireAlphabetConverter implements AlphabetConvertor {
	@Override
	public char[][] convertAlphabetToArray(String alphabet) {
		char[][] array = new char[91][91];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {		
				int index = i * (array[i].length) + j;
				array[i][j] = alphabet.charAt(index);
			}
		}
		return array;
	}
}
