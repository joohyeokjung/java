package overloading;

public class CalcArea {

	public static void main(String[] args) {
		
		int width = 100;
		int height = 40;
		squareArea(width, height);
		
		int w = 50;
		int h = 40;
		triangleArea(w, h);
		
		double r = 2.5;
		final double PI = 3.14;
		circleArea(r,PI);
	}

	private static void circleArea(double r, double PI) {
		System.out.println("원의 넓이 : " + r*r*PI);
	}

	private static void triangleArea(int w, int h) {
		System.out.println("삼각형의 넓이 : " + w*h*0.5);
	}

	private static void squareArea(int width, int height) {
		System.out.println("사각형의 넓이 : " + width*height);
	}

}
