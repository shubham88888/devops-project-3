package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	
	NumberWords numberWord = new NumberWords();
	@Test
	public void c
	() {
		Assert.assertEquals( "MinusOne", numberWord.convert( -1 ) ) ;
	}
	@Test
	public void testCase1() {
		Assert.assertEquals( "Fifty One", numberWord.convert( 51 ) ) ;
	}
	@Test
	public void testCase2() {
		Assert.assertEquals( "One Hundred", numberWord.convert( 100 ) ) ;
	}
	@Test
	public void testCase3() {
		Assert.assertEquals( "Five Hundred Seventy Two", numberWord.convert( 572 ) ) ;
	}
	@Test
	public void testCase4() {
		Assert.assertEquals( "One Thousand Two Hundred", numberWord.convert( 1200 ) );
	}
	@Test
	public void testCase5() {
		Assert.assertEquals( "Ninety Lakh",  numberWord.convert( 9000000 ) ) ;
	}
	

}
