package basic;

public abstract class Electronic { // 전자제품 개념의 클래스
	protected boolean power;
	protected int button;
	protected String feature;
	
	public Electronic() {
		
	}
	
	abstract void buttonColor(String color);
		
	
	public boolean isPower() {
		return power ? true : false;
	}
	
	public int getButton() {
		return this.button;
	}
	
	public String getFeature() {
		return this.feature;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void setButton(int button) {
		this.button = button;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}
	
}
