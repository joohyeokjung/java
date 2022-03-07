package abstracts_hw;

import java.util.Scanner;

public class Inventory {
	private Picachu picachu;
	private KKobugi kkobugi;
	private LeeSangHaeSea leeSangHaeSea;
	private Pylee pyLee;
	
	public Character getCharacter(int cno) {
		Character ch = null;
		switch (cno) {
		case 1:
			ch = getPicachu();
			break;
		case 2:
			ch = getKkobugi();
			break;
		case 3:
			ch = getLeeSangHaeSea();
			break;
		case 4:
			ch = getPyLee();
			break;
		default:
			break;
		}
		return ch;
	}
	
	
	public Character choiceCharacter(int cno) { // 최초 게임시작할때와 캐릭터 변경시만 0을 받는다.
		Scanner sc = new Scanner(System.in);
		int chNum = 0;
		if (cno == 0) {
			System.out.println("원하는 캐릭터를 선택하세요 > ");
			System.out.println("1.피카츄  2.꼬북이  3.이상해씨  4.파이리");
			chNum = sc.nextInt();
		}else {
			chNum = cno;
		}
		
//		Character ch = null;
		
		switch (chNum) {
		case 1:
			if (getPicachu() == null) {
				setPicachu(new Picachu());
			}
//			ch = getPicachu();
			break;
		case 2:
			if (getKkobugi() == null) {
				setKkobugi(new KKobugi());
			}
//			ch = getKkobugi();
			break;
		case 3:
			if (getLeeSangHaeSea() == null) {
				setLeeSangHaeSea(new LeeSangHaeSea());
			}
//			ch = getLeeSangHaeSea();
			break;
		case 4:
			if (getPyLee() == null) {
				setPyLee(new Pylee());
			}
//			ch = getPyLee();
			break;

		default:
			System.out.println("캐릭터를 잘 못 선택하였습니다");
			return null;
		}
		return getCharacter(chNum);
	}
	
	public Picachu getPicachu() {
		return picachu;
	}
	public void setPicachu(Picachu picachu) {
		this.picachu = picachu;
	}
	public KKobugi getKkobugi() {
		return kkobugi;
	}
	public void setKkobugi(KKobugi kkobugi) {
		this.kkobugi = kkobugi;
	}
	public LeeSangHaeSea getLeeSangHaeSea() {
		return leeSangHaeSea;
	}
	public void setLeeSangHaeSea(LeeSangHaeSea leeSangHaeSea) {
		this.leeSangHaeSea = leeSangHaeSea;
	}
	public Pylee getPyLee() {
		return pyLee;
	}
	public void setPyLee(Pylee pyLee) {
		this.pyLee = pyLee;
	}

}
