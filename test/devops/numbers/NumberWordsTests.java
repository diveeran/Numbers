package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void ones() {
		Assert.assertEquals( "1", "one", numberWords.convert( 1 ) ) ;
	}
	
	@Test
	public void hundreds() {
		Assert.assertEquals( "100", "one hundred", numberWords.convert( 100 ) ) ;
	}
	
	@Test
	public void thousands() {
		Assert.assertEquals( "1048", "one thousand forty eight", numberWords.convert( 1048 ) ) ;
	}
	
	@Test
	public void millions() {
		Assert.assertEquals( "134589", "one hundred thirty four thousand five hundred eighty nine", numberWords.convert( 134589 ) ) ;
	}
	
	@Test
	public void negatives() {
		Assert.assertEquals( "-1", "- one", numberWords.convert( -1 ) ) ;
	}

}
