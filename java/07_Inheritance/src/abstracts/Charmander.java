package abstracts;

public class Charmander extends Character {

	public Charmander() {
		hp = 200;
		mp = 90;
		name = "파이리";
		System.out.println("파이리 생성~ 파이 파이");
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
