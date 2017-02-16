package ua.foxmind;

import org.junit.Assert;
import org.junit.Test;





public class AppTest {
    
	@Test
    public void testReversString() {
        String str = App.reverseWords("a1bcd efg!h");
        Assert.assertEquals("d1cba hgf!e", str);
    }
}
