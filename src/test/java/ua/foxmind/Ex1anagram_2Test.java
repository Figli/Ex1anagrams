package ua.foxmind;

import org.junit.Assert;
import org.junit.Test;

public class Ex1anagram_2Test {
	
	@Test
    public void testReversString() {
        String reversString = Ex1anagram_2.reverseEachWordOfString("a1bcd efg!h");
        Assert.assertEquals("d1cba hgf!e", reversString);
    }

    @Test
    public void testReversStringWithDoubleSymbol() {
        String reversString = Ex1anagram_2.reverseEachWordOfString("a12bcd efg!?h");
        Assert.assertEquals("d12cba hgf!?e", reversString);
    }

    @Test
    public void testReversStringWithOnlySymbol() {
        String reversString = Ex1anagram_2.reverseEachWordOfString("12345 !?%@");
        Assert.assertEquals("12345 !?%@", reversString);
    }

    @Test
    public void testReversThreeWords() {
        String reversString = Ex1anagram_2.reverseEachWordOfString("a1bcd efg!h 2rt4!");
        Assert.assertEquals("d1cba hgf!e 2tr4!", reversString);
    }

    @Test
    public void testReversSpaceStart() {
        String reversString = Ex1anagram_2.reverseEachWordOfString("  a1bcd efg!h");
        Assert.assertEquals("  d1cba hgf!e", reversString);
    }

    @Test
    public void testReversSpaceCenter() {
        String reversString = Ex1anagram_2.reverseEachWordOfString("a1bcd    efg!h");
        Assert.assertEquals("d1cba    hgf!e", reversString);
    }

    @Test
    public void testReversSpaceEnd() {
        String reversString = Ex1anagram_2.reverseEachWordOfString("a1bcd efg!h  ");
        Assert.assertEquals("d1cba hgf!e  ", reversString);
    }
}
