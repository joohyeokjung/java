package abstracts;

import java.util.Scanner;

public class PlayGame {
	private Character character;
	private int menu;
	private boolean flag;
	
	public PlayGame(Character character) {
		this.character = character; // 생성된 캐릭터를 받는다.
	}
	
	public void printMenu(Scanner sc, Character[] characterArr) {
		System.out.println("1.EAT 2.SLEEP 3.PLAY 4.TRAIN 5.CHANGE 0.EXIT");
		menu = sc.nextInt();
		
		playCharacter(characterArr);
	}
	
	private void playCharacter(Character[] characterArr) {
		switch (menu) {
		case 1:
			character.eat();
			break;
		case 2:
			character.sleep();
			break;
		case 3:
			character.play();
			break;
		case 4:
			character.train();
			break;
		case 5:
			swichCharacter(characterArr);
			break;
		default:
			flag = true;
			break;
		}
		character.printStatus();
	}

	private void swichCharacter(Character[] characterArr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 캐릭터를 선택하세요 > ");
		System.out.println("1.피카츄 2.꼬북이 3.이상해씨 4.파이리");
		int chNum = sc.nextInt();
		switch (chNum) {
		case 1:
			setCharacter(characterArr[0]);
			break;
		case 2:
			setCharacter(characterArr[1]);
			break;
		case 3:
			setCharacter(characterArr[2]);
			break;
		case 4:
			setCharacter(characterArr[3]);
			break;
		default:
			System.out.println("캐릭터를 잘 못 선택하였습니다");
			break;
		}
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
}
