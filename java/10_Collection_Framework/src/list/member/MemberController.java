package list.member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	private Scanner sc = new Scanner(System.in);
	private final String MENU_STR = "1.회원가입  2.로그인  3.종료";
	private boolean flag = true;

	public void processor(ArrayList<Member> memberList) {
		
		while (flag) {
			System.out.println(MENU_STR);
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				String id = checkDuple(memberList, "join");
				if (id != null) {
					System.out.println("비밀번호 입력 > ");
					String pw = sc.next();
					memberList.add(new Member(id, pw));
				}
				break;
			case 2:
				String loginId = checkDuple(memberList, "login");
				if (loginId != null) {
					memberLogin(memberList, loginId);
				}else {
					System.out.println("존재하지 않는 아이디 입니다!");
				}
				break;
			case 3:
				flag = false;
				break;

			default:
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}

	private void memberLogin(ArrayList<Member> memberList, String id) {
		System.out.println("비밀번호 입력 > ");
		String pw = sc.next();
		
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).getId().equals(id)) { // 입력한 id 찾기
				if (memberList.get(i).getPw().equals(pw)) { // 입력한 pw 비교하기
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호가 틀렸습니다");
					break;
				}
			}
		}
	}

	private String checkDuple(ArrayList<Member> memberList, String sign) {
		System.out.println("아이디를 입력 > ");
		String id = sc.next();
		
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).getId().equals(id)) {
				if (sign.equals("join")) {
					System.out.println("이미 존재하는 아이디 입니다!");
				}
				return sign.equals("join") ? null : id;
			}
		}
		return sign.equals("join") ? id : null;
	}

}
