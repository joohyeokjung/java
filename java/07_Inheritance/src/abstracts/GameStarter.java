package abstracts;

import java.util.Scanner;

public class GameStarter {
// 2021-11-11 주말과제
	// 나머지 캐릭터를 생성하는 코드와 각 캐릭터 클래스를 만드세요
	// 현재는 게임을 종료하면 생성한 캐릭터가 사라지고 다시 게임을 시작하면 초기화 됩니다.
	// 이 구조에서 게임 종료 전에 캐릭터를 변경선택할 수 있는 구조로 만들고
	// 각 캐릭터들은 게임종료 전에는 캐릭터의 정보값이 초기화 되지 않고 사용할 수 있게 만드세요
	// 필요한 추상클래스, 클래스를 더 만드는 것도 가능합니다.
	// midaseye@naver.com > _java_hw_20211115_이름.zip > 월요일 수업 시작 전까지
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Character ch = null;
		PlayGame pg = null;
		Character[] characterArr = {new Picachu(), new Squirtle(),new Strange(),new Charmander()};
		
		System.out.println("원하는 캐릭터를 선택하세요 > ");
		System.out.println("1.피카츄 2.꼬북이 3.이상해씨 4.파이리");
		int chNum = sc.nextInt();
		switch (chNum) {
		case 1:
			pg = new PlayGame(characterArr[0]);
			break;
		case 2:
			pg = new PlayGame(characterArr[1]);
			break;
		case 3:
			pg = new PlayGame(characterArr[2]);
			break;
		case 4:
			pg = new PlayGame(characterArr[3]);
			break;
		default:
			System.out.println("캐릭터를 잘 못 선택하였습니다");
			break;
		}
//		if (ch == null) {
//			System.out.println("게임을 종료 합니다.");
//			return;
//		}else {
//			pg = new PlayGame(ch);
//		}
		while (true) {
			pg.printMenu(sc,characterArr);
			
			if (pg.isFlag()) {
				System.out.println("게임을 종료합니다");
				break;
			}
		}
	}
}
