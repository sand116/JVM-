package chapter03.backend;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
	public static Map<Character, Integer> counterCharacters(String text){
		if(text==null) {
			throw new IllegalArgumentException("text must not be null");
		}
		
		Map<Character, Integer> map = new HashMap();
		for (char c: text.toCharArray()) {
			if(!map.containsKey(c))
				map.put(c,1);
			else {
				int curValue = map.get(c);
				map.put(c,++curValue);
			}
		} 
		
		
		return map;
		
	}

}
