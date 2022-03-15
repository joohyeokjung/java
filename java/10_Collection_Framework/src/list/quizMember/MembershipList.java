package list.quizMember;

import java.util.ArrayList;

public class MembershipList {

	public static void main(String[] args) {
		ArrayList<User> userDatas = new ArrayList<>();
		UserMenu userMenu = new UserMenu();
		userMenu.processor(userDatas);
	}

}
