package list.quizMember;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMenu {
	
	private Scanner sc = new Scanner(System.in);
	private int menu;
	private boolean flag = true;
	private String menuStr = "1.회원가입  2.로그인  3.종료";

	public void processor(ArrayList<User> userDatas) {
		while (flag) {
			System.out.println(menuStr);
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				userDatas.add(inputUserObj());
				break;
			case 2:
				loginUser(userDatas);
				break;
			case 3:
				flag = false;
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				break;
			}
		}
	}

	private int loginUser(ArrayList<User> userDatas) {
		System.out.println("아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.println("비밀번호를 입력하세요 : ");
		String pw = sc.next();
		
		for (int i = 0; i < userDatas.size(); i++) {
			if (id.equals(userDatas.get(i).getId()) && pw.equals(userDatas.get(i).getPw())) {
				System.out.println(userDatas.get(i).getId() + "님이 로그인에 성공하였습니다.");
				return i;
			}else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}
		return -1;
	}

	private User inputUserObj() {
		System.out.println("아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.println("비밀번호를 입력하세요 : ");
		String pw = sc.next();
		System.out.println("입력 완료");
		
		return new User(id, pw);
	}

}
