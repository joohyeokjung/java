package dataType;

public class TypeConversion {

	public static void main(String[] args) {
		// 타입 변환의 이해
		// 형식과 크기의 다름에서 시작된다
		
		// Casting => 타입의 변환의 방식
		// auto casting (자동형변환) : widening casting
		// byte -> short -> char -> int -> long -> float -> double 작은거에서 큰거
		
		byte b1 = 1;
		short s1 = b1; // ok // 묵시적 형변환
		char ch1 = (char)s1; // 명시적 형변환 (데이터의 형식이 달라서 명확히 타입의 변환을 기재)
		int i = ch1;
		long l = i;
		float f = l;
		double d = f;
		
		// manual casting(강제형변환) : narrowing casting
		// 자동형변환의 방향을 반대로 시도
		double d2 =314.21432;
		float f2 = (float)d2; // 명시적 형변환 (데이터의 크기가 달라서 명확히 타입의 변환을 기재)
		long l2 = (long)f2;
		int i2 = (int)l2;
		char ch2 = (char)i2; // 지금은 괜찮지만 실행했을 때 i2의 크기로 char가 표현되지 못할 가능성이 있음
		short s2 = (short)ch2;
		byte b2 = (byte)s2;
		
		// 문자를 숫자로 
		String str = "1234567";
		int num = Integer.parseInt(str);
		System.out.println(str instanceof String);
		System.out.println(num);
		
		// 숫자를 문자로
		int num2 = 212314;
		String str2 = String.valueOf(num2);
		String str3 = Integer.toString(num2);
		
	}

}
