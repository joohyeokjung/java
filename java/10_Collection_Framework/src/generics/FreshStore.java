package generics;

import java.util.HashMap;
import java.util.Map;

public class FreshStore {

	public static void main(String[] args) {
		Map<String, Box<? extends Fruit>> map = new HashMap<>(); // ? >> 와일드카드
		map.put("AppleBox", new Box<Apple>());
		map.put("OrangeBox", new Box<Orange>());
		
//		Map<String, Box<T extends Fruit>> map = new HashMap<>();
//		map.put("AppleBox", new Box<Fruit>());
//		map.put("OrangeBox", new Box<Fruit>());
	}

}
