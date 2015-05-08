package junit.eng;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void test() {
		IntToEng ite = new IntToEng();
		String expected = "three";
		String actual = ite.translateEng(3);
		assertEquals(actual,expected);
		
	}
}
