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
	@Test
	public void test1000(){
		IntToEng  ite = new IntToEng();
		String expected = "one thousand";
		String actual = ite.translateEng(1000);
		assertEquals(actual,expected);
	}
	@Test
	public void test2345(){
		IntToEng  ite = new IntToEng();
		String expected = "two thousand three hundred forty five";
		String actual = ite.translateEng(2345);
		assertEquals(actual,expected);
	}
	@Test
	public void test3412(){
		IntToEng  ite = new IntToEng();
		String expected = "three thousand four hundred twelve";
		String actual = ite.translateEng(3412);
		assertEquals(actual,expected);
	}
	@Test
	public void test3602(){
		IntToEng  ite = new IntToEng();
		String expected = "three thousand six hundred two";
		String actual = ite.translateEng(3602);
		assertEquals(actual,expected);
	}
	@Test
	public void test3440(){
		IntToEng  ite = new IntToEng();
		String expected = "three thousand four hundred forty";
		String actual = ite.translateEng(3440);
		assertEquals(actual,expected);
	}
	@Test
	public void test3012(){
		IntToEng  ite = new IntToEng();
		String expected = "three thousand twelve";
		String actual = ite.translateEng(3012);
		assertEquals(actual,expected);
	}
	
}
