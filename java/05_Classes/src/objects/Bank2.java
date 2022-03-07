package objects;

class BankAccount2 {
	private String owner = "joo_s"; // private 중요!
	private int accountNumber = 100200;
	private double deposit;
	
	public BankAccount2() {
		deposit = 0.0;
	}
	
	public void saving(int money) {
		deposit = deposit + money;
		printDeposit();
	}
	
	public void withdraw(int money ) {
		if (deposit < money) {
			System.out.println("잔액이 부족합니다!");
		} else {
			deposit = deposit - money;
		}
		printDeposit();
	}
	
	public void printDeposit() {
		System.out.println("현재 잔액 : " + deposit);
	}
	
}

public class Bank2 {

	public static void main(String[] args) {
		BankAccount2 myBa = new BankAccount2();
		
		myBa.saving(1000000);
//		System.out.println(myBa.deposit); // private 으로인해 외부 접근 불가
		myBa.withdraw(500000);
		
		
	}

}
