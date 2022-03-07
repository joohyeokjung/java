package basic;

public abstract class KimchiRef extends Freezer{ // 김치냉장 개념의 클래스
	@Override
	public boolean isPower() {
		return super.isPower();
	}
	@Override
	public int getButton() {
		return super.button;
	}
	@Override
	public String getFeature() {
		return super.feature;
	}
	@Override
	public void setButton(int button) {
		System.out.println("발효 버튼 추가");
		super.button = button;
	}
	@Override
	public void setFeature(String feature) {
		System.out.println("발효 과학 추가");
		super.feature = feature;
	}
	@Override
	public String toString() {
		return "This is Kimchiref";
	}
}
