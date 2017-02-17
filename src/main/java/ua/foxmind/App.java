package ua.foxmind;

public class App {
	public static void main(String[] args) {
		String sourceWord = "a1bcd efg!h";
		System.out.println(reverseWords(sourceWord));
	}

	static String reverseWords(String string) {
		char[] sourceWordToChar = string.toCharArray();
		int wordStartIndex = -1;

		for (int i = 0; i < sourceWordToChar.length; i++) {
			if (wordStartIndex < 0) {
				wordStartIndex = i;
			}
			if (i + 1 == sourceWordToChar.length || sourceWordToChar[i + 1] == ' ') {
				for (int firstCharInWord = wordStartIndex, lastCharInWord = i; firstCharInWord < lastCharInWord;) {
					if (!Character.isAlphabetic(sourceWordToChar[firstCharInWord])) {
						firstCharInWord++;
					} else if (!Character.isAlphabetic(sourceWordToChar[lastCharInWord])) {
						lastCharInWord--;
					} else {
						char tempChar = sourceWordToChar[firstCharInWord];
						sourceWordToChar[firstCharInWord] = sourceWordToChar[lastCharInWord];
						sourceWordToChar[lastCharInWord] = tempChar;
						firstCharInWord++;
						lastCharInWord--;
					}
				}
				wordStartIndex = -1;
			}
		}
		return new String(sourceWordToChar);
	}
}
