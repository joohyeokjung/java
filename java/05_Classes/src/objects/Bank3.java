package objects;

class BankAccount3 {
	private String owner; // private 중요!
	private int accountNumber;
	private double deposit;
	
	public BankAccount3(String owner, int accountNumber) {
		this.deposit = 0.0;
		this.owner = owner;
		this.accountNumber = accountNumber;
	}
	public void saving(int money) {
		this.deposit += money;
		printDeposit();
	}
	public void withdraw(int money ) {
		if (this.deposit < money) {
			System.out.println("잔액이 부족합니다!");
		} else {
			this.deposit -= money;
		}
		printDeposit();
	}
	public void printDeposit() {
		System.out.println("현재 잔액 : " + this.deposit);
	}
	
}

public class Bank3 {

	public static void main(String[] args) {
		BankAccount3 myBa = new BankAccount3("OwnerName", 1111111111);
		myBa.saving(1000000);
		myBa.withdraw(500000);
	}

}
