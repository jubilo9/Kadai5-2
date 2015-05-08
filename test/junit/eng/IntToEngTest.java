package junit.eng;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void test3() {
		IntToEng ite = new IntToEng();
		String expected = "three";
		String actual = ite.translateEng(3);
		assertEquals(actual,expected);
		
	}
	@Test
	public void test21(){
		IntToEng  ite = new IntToEng();
		String expected = "twenty one";
		String actual = ite.translateEng(21);
		assertEquals(actual,expected);
	}
	@Test
	public void test100(){
		IntToEng  ite = new IntToEng();
		String expected = "one hundred";
		String actual = ite.translateEng(100);
		assertEquals(actual,expected);
	}
	@Test
	public void test915(){
		IntToEng  ite = new IntToEng();
		String expected = "nine hundred fifteen";
		String actual = ite.translateEng(915);
		assertEquals(actual,expected);
	}
	@Test
	public void test987(){
		IntToEng  ite = new IntToEng();
		String expected = "nine hundred eighty seven";
		String actual = ite.translateEng(987);
		assertEquals(actual,expected);
	}
}
