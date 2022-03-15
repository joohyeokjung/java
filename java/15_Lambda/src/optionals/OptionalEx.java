package optionals;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// java 1.8 이상
		// 데이터를 변수에 저장할 때 데이터의 null 여부를 판단하여
		// NullPointerException 발생을 사전에 필터링 할 수 있음
		
		Optional<String> option = Optional.ofNullable("빈 값이 아니에요");
		System.out.println(option);
		System.out.println(option.get());
		System.out.println(option.isPresent());
		System.out.println(option.isEmpty());
		
		if (option.isEmpty()) {
			System.out.println("null이면 요롷게 저렇게 처리 하세요");
		}
		
		Optional<String> option2 = Optional.empty(); // null 셋팅
		System.out.println(option2.orElse("빈 옵셔널 객체 입니다"));
		System.out.println(option.orElseGet(String::new));
		
	}
}
