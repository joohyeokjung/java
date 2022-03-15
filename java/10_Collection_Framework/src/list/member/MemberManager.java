package list.member;

import java.util.ArrayList;

public class MemberManager {

	public static void main(String[] args) {
		ArrayList<Member> memberList = new ArrayList<Member>();
		MemberController mc = new MemberController();
		mc.processor(memberList);
	}

}
