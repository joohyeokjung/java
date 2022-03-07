package objects;

class BankAccount4 {
	private String owner; // private 중요!
	private int accountNumber;
	private double deposit;
	
	public BankAccount4() { // 디폴트 생성자
		this.deposit = 0.0;
		System.out.println("계좌가 생성되었습니다 > 현재 잔액 : " + this.deposit);
		// 여러 줄의 코드가 추가로 있다고 가정
		// 오버로딩 생성자를 사용할경우 디폴트 생성자가 꼭 필요함 !!
		// 오버로딩 생성자만 사용한다면 디폴트 생성자 없어도 됨
		// 하지만 디폴트 생성자(파라미터 없음 : 8번라인)와 오버로딩 생성자(파라미터 있음 : 17번 라인)를 같이 사용할경우 디폴트 생성자 필히 선언해야 됨
		// 디폴트 생성자만 사용한다면 사용하든 안하든 상관 없음
		
		// 주의 사항 => 생성자의 복잡한 연산은 하지않는게 좋음 => 복잡한 연산은 메서드를 통해 구현한다.
	}
	public BankAccount4(String owner) { // 오버로딩 생성자
		this();
		this.owner = owner;
		// 코드가 존재 한다고 가정
	}
	public BankAccount4(String owner, int accountNumber) {
		this(owner);
		this.accountNumber = accountNumber;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setAccountNumber(int accountNumber) {
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

public class Bank4 {

	public static void main(String[] args) {
		BankAccount4 kimba = new BankAccount4();
		kimba.setOwner("joo");
		kimba.setAccountNumber(123123);
		
		BankAccount4 myBa = new BankAccount4("OwnerName", 1111111111);
		myBa.saving(1000000);
		myBa.withdraw(500000);
	}

}
