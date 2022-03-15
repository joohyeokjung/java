package list.hotel;

public class User1 {
	private String name;
	private int age;
	private char gen;
	
	public User1() {}

	public User1(String name, int age, char gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}

	@Override
	public String toString() {
		return "User1 [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}
	
	
}
