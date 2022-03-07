package objects;
// 추상화
// 은행계좌정보 > BankAccount (계좌는 소유자 정보를 갖고 있지 않음, 잔액)
// 사람은 은행계좌를 갖을 수 있습니다 (이름, 현금보유액, 은행계좌)
// 사람은 은행서비스를 통해서 은행계좌를 활용한다 (입금, 출금 등등등..)
class BankAccount5 {
//	private User owner;
	private int balance;
	
	public BankAccount5() {}
//	public BankAccount5(User owner) {
//		this.owner = owner;
//	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
//	public User getOwner() {
//		return owner;
//	}
	public boolean deposit(int money, User owner) {
		if (money > owner.getCashAmount()) {
			System.out.println("입금 실패!");
			System.out.println("잔고 : " + balance);
			System.out.println("현금보유 : " + owner.getCashAmount());
			return false;
		}else {
			balance += money;
			owner.setCashAmount(owner.getCashAmount() - money);
			System.out.println(money + "입금~");
			System.out.println("잔고 : " + balance);
			System.out.println("현금보유 : " + owner.getCashAmount());
			return true;
		}
	}
	public boolean withdraw(int money, User owner) {
		if (money > balance) {
			System.out.println("출금 실패!");
			System.out.println("잔고 : " + balance);
			System.out.println("출금액 : " + money);
			return false;
		}else {
			balance -= money;
			owner.setCashAmount(owner.getCashAmount() + money);
			System.out.println(money + "출금~");
			System.out.println("잔고 : " + balance);
			System.out.println("현금보유 : " + owner.getCashAmount());
			return true;
		}
	}
	public boolean transfer(User from, User to, int money) { // 파라미터 셋팅필요
		if (money > from.getAccount().getBalance()) { // 실패조건? 잔액보다 더 많은 금액을 이체할 때
			System.out.println("이체 실패!");
			System.out.println("잔고 : " + from.getAccount().getBalance());
			System.out.println("출금액 : " + money);
			return false;
		}else {
			from.getAccount().setBalance(from.getAccount().getBalance()-money);
			to.getAccount().setBalance(to.getAccount().getBalance()+money);
			// 파라미터를 셋팅하여 from: ?, to: ?, $$$ 이체완료를 출력하는 메서드
			printResult(from, to, money); 
			return true;
		}
	}
	private void printResult(User from, User to, int money) {
		System.out.println("From : " + from.getName() + "\t");
		System.out.println("To : " + to.getName() + "\t");
		System.out.println(money + "원 이체 완료!");
	}
	
}
class User {
	private String name;
	private int cashAmount;
	private BankAccount5 account;
	
	public User() {}

	public User(String name, int cashAmount) {
		this.name = name;
		this.cashAmount = cashAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}

	public BankAccount5 getAccount() {
		return account;
	}

	public void setAccount(BankAccount5 account) {
		this.account = account;
	}
	
}
public class Bank5 {

	public static void main(String[] args) {
		User me = new User("Joo", 20000);
		
		User you = new User();
		you.setName("kim");
		you.setCashAmount(100000);
		
//		BankAccount5 myBa = new BankAccount5(me);
//		BankAccount5 urBa = new BankAccount5(you);
		BankAccount5 myBa = new BankAccount5();
		BankAccount5 urBa = new BankAccount5();
		
		me.setAccount(myBa);
		you.setAccount(urBa);
		
		me.getAccount().setBalance(20000);
		you.getAccount().setBalance(10000);
		you.setCashAmount(you.getCashAmount() - 10000);
		
//		System.out.println(me.getAccount().getBalance());
		System.out.println("현재 잔고 : " + you.getAccount().getBalance());
		System.out.println("현재 현금보유 : " + you.getCashAmount());
		
		you.getAccount().deposit(50000, you);
		
//		System.out.println(myBa.getOwner());
		you.getAccount().withdraw(30000, you);
		
		me.getAccount().transfer(me, you, 10000); // 파라미터로 무엇을 셋팅할 것인가?
		
	}

}
