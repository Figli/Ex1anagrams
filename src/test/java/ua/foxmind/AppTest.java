package ua.foxmind;

import org.junit.Assert;
import org.junit.Test;





public class AppTest {
    
	@Test
    public void testReversString() {
        String reversString = App.reverseWords("a1bcd efg!h");
        Assert.assertEquals("d1cba hgf!e", reversString);
    }
	
	@Test
    public void testReversStringWithDoubleSymbol() {
        String reversString = App.reverseWords("a12bcd efg!?h");
        Assert.assertEquals("d12cba hgf!?e", reversString);
    }
	
	@Test
    public void testReversStringWithOnlySymbol() {
        String reversString = App.reverseWords("12345 !?%@");
        Assert.assertEquals("12345 !?%@", reversString);
    }
	
	@Test
    public void testReversThreeWords() {
        String reversString = App.reverseWords("a1bcd efg!h 2rt4!");
        Assert.assertEquals("d1cba hgf!e 2tr4!", reversString);
    }
}
