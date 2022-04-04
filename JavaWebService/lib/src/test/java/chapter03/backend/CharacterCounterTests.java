package chapter03.backend;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class CharacterCounterTests {
	
	//예상된 IllegalArgumentException이 호출되지 않으면 에러가 발생한다.
	@Test(expected=IllegalArgumentException.class)
	public void testNullInput() {
		CharacterCounter.counterCharacters(null);
	}
	@Test
	public void testStringInput() {
		Map<Character, Integer> map = CharacterCounter.counterCharacters("!a!A!");
		//assertEquals(int, int)
		assertEquals(map.size(), 3);
		assertEquals(map.get('a').intValue(), 1);
		assertEquals(map.get('!').intValue(), 3);
		assertEquals(map.get('A').intValue(), 1);
		
	}
	
	

}
