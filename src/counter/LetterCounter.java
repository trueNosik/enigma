package counter;

public class LetterCounter {

	public static void main(String[] args) {
		String text = "Ptbndcb ymdptmq bnw yew, bnwzw raw rkbcriie wrze bd owktxnwa";
		letterCounter(text);
	}

	public static void letterCounter(String sourcetext) {

		for (int i = 0; i <= sourcetext.length() - 1; i++) {
			char current = sourcetext.charAt(i);
			for (int j = i; j <= sourcetext.length() - 1; j++) {
				if (current == sourcetext.charAt(j) && current != ' ') {
					// count++;
				}
			}

		}
	}
}
