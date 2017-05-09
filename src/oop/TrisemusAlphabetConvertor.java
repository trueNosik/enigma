package oop;

public class TrisemusAlphabetConvertor implements AlphabetConvertor{

	public char[][] convertAlphabetToArray(String alphabet) {
		char[][] array = new char[10][9];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int index = i * (array.length - 1) + j;
				array[i][j] = alphabet.charAt(index);
			}
		}
		return array;
	}
}
