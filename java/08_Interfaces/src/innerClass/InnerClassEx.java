package innerClass;

class Outer {
	int value = 100;
	
	public Outer() {
		Inner inner = new Inner();
//		inner.value;
	}
	
	private class Inner {
		
		public Inner() {
			Outer.this.value = innerMethod();
		}
		int value = 200;
		
		int innerMethod() {
			
			int value = 300;
			
			System.out.println("           value : " + value);
			System.out.println("      this.value : " + this.value);
			System.out.println("Outer.this.value : " + Outer.this.value);
			return Outer.this.value + this.value;
		}
	}
}

public class InnerClassEx {

	public static void main(String[] args) {
		Outer outer = new Outer();
//		Outer.Inner inner = outer.new Inner();
//		inner.innerMethod();
	}

}
