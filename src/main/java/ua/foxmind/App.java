package ua.foxmind;

public class App {
	public static void main(String[] args) {
		String sourceString = "a1bcd efg!h";
		System.out.println(splitString(sourceString));
	}

	static String splitString(String string) {
		char[] sourceStringToChar = string.toCharArray();
		int wordStartIndex = -1;

		for (int i = 0; i < sourceStringToChar.length; i++) {
			if (wordStartIndex < 0) {
				wordStartIndex = i;
			}
			if (i + 1 == sourceStringToChar.length
					|| sourceStringToChar[i + 1] == ' ') {
				reversWord(sourceStringToChar, wordStartIndex, i);
				wordStartIndex = -1;
			}
		}
		return new String(sourceStringToChar);
	}

	private static void reversWord(char[] sourceStringToChar,
			int wordStartIndex, int wordEndIndex) {
		
		while (wordStartIndex < wordEndIndex) {
			if (!Character.isAlphabetic(sourceStringToChar[wordStartIndex])) {
				wordStartIndex++;
			} else if (!Character
					.isAlphabetic(sourceStringToChar[wordEndIndex])) {
				wordEndIndex--;
			} else {
				char tempChar = sourceStringToChar[wordStartIndex];
				sourceStringToChar[wordStartIndex] = sourceStringToChar[wordEndIndex];
				sourceStringToChar[wordEndIndex] = tempChar;
				wordStartIndex++;
				wordEndIndex--;
			}
		}
	}
}
