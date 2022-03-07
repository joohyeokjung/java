package abstracts;

public class Squirtle extends Character {
	
	public Squirtle() {
		hp = 80;
		mp = 80;
		name = "꼬북이";
		System.out.println("꼬북이 생성~ 꼬북 꼬북");
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
