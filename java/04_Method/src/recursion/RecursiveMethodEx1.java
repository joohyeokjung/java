package recursion;

public class RecursiveMethodEx1 {
	//재기함수
	public static void main(String[] args) {
		int sum = recursion(10);
		System.out.println(sum);
	}

	private static int recursion(int i) {
		if (i > 0) {
			return i + recursion(i-1);
		}else {
			return 0;
		}
	}
}
