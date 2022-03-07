package abstracts;

public class Strange extends Character {

	public Strange() {
		hp = 150;
		mp = 20;
		name = "이상해씨";
		System.out.println("이상해씨 생성~ 이상 이상");
		printStatus();
	}
	
	@Override
	public void eat() {
		mp += 10;
	}

	@Override
	public void sleep() {
		mp += 20;
	}

	@Override
	public void play() {
		mp -= 20;
		hp += 5;
	}

	@Override
	public boolean train() {
		mp -= 10;
		hp += 10;
		levelUp();
		return checkMp();
	}

	@Override
	public void levelUp() {
		if (hp >= 40) {
			hp -= 40;
			level++;
		}
	}
}
