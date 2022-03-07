package objects;

class Pet {
	String nickName = "냥이";
	boolean gender = false;
	int age = 2;
	char kind = 'A';
	
	void move() {
		// 독립 메서드
		System.out.println("어 움직인다!");
	}
	
	void sound() {
		System.out.println("야옹야옹");
	}
	
	void getOld() {
		// 종속 속성 메서드(연관관계)
		age++;
	}
}
public class Person {

	public static void main(String[] args) {
		Pet myCat = new Pet();
//		String myCatNick = myCat.nickName; // "냥이"
//		System.out.println(myCatNick);
		System.out.println(myCat.nickName);
		myCat.nickName = "냥냥이";
		System.out.println(myCat.nickName);
		
		System.out.println(myCat.age);
		myCat.getOld();
		System.out.println(myCat.age);
		
		// 계좌현황, 입금, 출금, 종료
		// 계좌 클래스는 예금주, 계좌번호, 잔액 속성을 갖는다
		// 계좌 클래스는 입금과 출금을 정상적으로 진행하는 메서드를 갖는다
		
		// 제출 : 2021-11-08 14:00 까지
		// midaseye@naver.com
		// java_hw_20211108_이름.java, zip
		
		// optional 과제 => 퀴즈2, 3, 4 클래스를 활용해서 코드 리팩토링 해보기
	}

}
