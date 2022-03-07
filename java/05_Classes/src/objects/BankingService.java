package objects;

import java.util.Iterator;
import java.util.Scanner;

class BankAccount {
	String myName;
	String bankNumber;
	int balance = 0;
	
	public BankAccount(String myName, String bankNumber, int balance) {
		this.myName = myName;
		this.bankNumber = bankNumber;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	public void withdrawal(int amount) {
		this.balance -= amount;
	}
}
	
public class BankingService {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankAccount myBankAccount = accountSeting(sc);

		int menu = 0;
		boolean flag = true;
		
		while (flag) {
			menu = printMenu(sc);
			switch (menu) {
			case 1:
				printAccountStatus(myBankAccount);
				break;
			case 2:
				deposit(myBankAccount, sc);
				break;
			case 3:
				withdrawal(myBankAccount, sc);
				break;
			
			default:
				System.out.println("시스템 종료");
				flag = false;
				break;
			}
		}
	}

	private static BankAccount accountSeting(Scanner sc) {
		System.out.println("예금주를 입력하세요");
		String myName = sc.next();
		System.out.println("계좌번호를 입력하세요");
		String bankNumber = sc.next();
		System.out.println("초기 금액을 입력하세요");
		int balance = sc.nextInt();
		BankAccount myBankAccount = new BankAccount(myName, bankNumber, balance);
		return myBankAccount;
	}

	private static void printAccountStatus(BankAccount myBankAccount) {
		System.out.println("예금주 : " + myBankAccount.myName + ", 계좌번호 : " + myBankAccount.bankNumber +
				", 계좌잔액 : " + myBankAccount.balance +"\n");
	}

	private static void withdrawal(BankAccount myBankAccount, Scanner sc) {
		System.out.println("출금할 금액은 입력하세요 \n");
		int amount = sc.nextInt();
		System.out.println(amount + "원 출금합니다");
		if (myBankAccount.balance < amount) {
			System.out.println("잔액이 부족합니다");
		}else {
			myBankAccount.withdrawal(amount);
		}
		System.out.println("잔액 : " + myBankAccount.balance);
	}

	private static void deposit(BankAccount myBankAccount, Scanner sc) {
		System.out.println("입금할 금액은 입력하세요 \n");
		int amount = sc.nextInt();
		System.out.println(amount + "원 입금합니다");
		myBankAccount.deposit(amount);
		System.out.println("잔액 : " + myBankAccount.balance);
	}

	private static int printMenu(Scanner sc) {
		System.out.println("=========== 은행 메뉴 ============");
		System.out.println("1:계좌현황  2:입금  3:출금  Etc:종료");
		System.out.println("---------------------------------");
		System.out.println(">>>>>>>>>>메뉴를 선택하세요>>>>>>>>>>\n");
		int menu = sc.nextInt();
		return menu;
	}

}
