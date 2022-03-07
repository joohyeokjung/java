package creation;

public class MakeMethod {

	public static void main(String[] args) {
		// 메서드는 반드시 이름을 갖는다
		// 사용중인 main 메서드를 분석해보자
		// [public : 접근제한자] [static : 저장특성] 리턴타입 메서드명([파라미터]) { 메서드 실행 로직 영역 }
		// void => 리턴을 하지 않는 메서드
		// 리턴타입이 존재하면 반드시 메서드 실행 로직영역에 
		// return 리턴타입과 일치하는 데이터 를 만들어야 함!
		// 파라미터 또한 데이터타입을 지정해주어야 함!
		
		// 메서드 명은 소문자로 시작할 것 => 클래스와 구분
		
		/* 메서드 모양의 예제
		 * void method1() {
		 * 
		 * }
		 * 
		 * void method2(int i) {
		 * 
		 * }
		 * 
		 * int method3(String str, char ch) { return 0; }
		 */
		// 메서드가 다른 메서드를 호출할 때
		// 호출하려는 메서드가 static 속성이거나
		// 호출하려는 메서드를 갖고 있는 클래스의 주소값이 필요하다 => new 를 통해 인스턴스화 된 객체
	}

}
