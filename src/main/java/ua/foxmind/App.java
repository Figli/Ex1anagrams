package ua.foxmind;


public class App 
{
    public static void main( String[] args )
    {

        String str = "a1bcd efg!h";
        System.out.println(reverseWords(str));
    }
    
    static String reverseWords(String string) {

        char[] c = string.toCharArray();
        int wordStartIndex = -1;

        for (int i = 0; i < c.length; i++) {

            if (wordStartIndex < 0) {
                wordStartIndex = i;
            }
            if (i + 1 == c.length || c[i + 1] == ' ') {

                for (int a = wordStartIndex, b = i; a < b; ) {

                    if (!Character.isAlphabetic(c[a])) {
                        a++;
                    } else if (!Character.isAlphabetic(c[b])) {
                        b--;
                    } else {
                        char tempChar = c[a];
                        c[a] = c[b];
                        c[b] = tempChar;
                        a++;
                        b--;
                    }
                }
                wordStartIndex = -1;
            }
        }
        return new String(c);
    }
}
