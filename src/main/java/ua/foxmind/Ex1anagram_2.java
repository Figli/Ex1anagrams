package ua.foxmind;

public class Ex1anagram_2 {

	public static void main(String[] args) {
		System.out.println(reverseEachWordOfString("  a1bcd efg!h  "));
	}
	
	static String reverseEachWordOfString(String inputString) {
        String[] words = inputString.split(" ", inputString.length());
        String reversString = "";

        for (int i = 0; i < words.length; i++) {
            char[] wordToChar = words[i].toCharArray();

            int wordStartIndex = 0;
            int wordEndIndex = wordToChar.length - 1;

            while (wordStartIndex < wordEndIndex) {
                if (!Character.isAlphabetic(wordToChar[wordStartIndex])) {
                    wordStartIndex++;
                } else if (!Character.isAlphabetic(wordToChar[wordEndIndex])) {
                    wordEndIndex--;
                } else {
                    char tempChar = wordToChar[wordStartIndex];
                    wordToChar[wordStartIndex] = wordToChar[wordEndIndex];
                    wordToChar[wordEndIndex] = tempChar;
                    wordStartIndex++;
                    wordEndIndex--;
                }
            }
            if (i < words.length - 1) {
                reversString = reversString + new String(wordToChar) + " ";
            } else reversString = reversString + new String(wordToChar);
        }
        return reversString;
    }

}
