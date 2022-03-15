package enums;

public class EnumEx01 {

	public static void main(String[] args) {
		Directions d1 = Directions.EAST;
		Directions d2 = Directions.WEST;
		Directions d3 = Directions.valueOf("SOUTH"); // Sting
		Directions d4 = Enum.valueOf(Directions.class, "NORTH"); // Sting
		Directions d5 = Directions.valueOf("EAST");
		Directions d6 = Enum.valueOf(Directions.class, "WEST"); // Sting
		Directions d7 = Enum.valueOf(Directions.class, "SOUTH"); // Sting
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		System.out.println(d1 == d2); // false
		System.out.println(d3 == d4); // false
		
		System.out.println(d1 == d5); // true > String으로 가져와도 값이랑 똑같다
		System.out.println(d2 == d6); // true
		System.out.println(d3 == d7); // true
		System.out.println(d3.equals(d7)); // true
		
		Directions[] dirArr = Directions.values();
		
		for (Directions dirs : dirArr) {
			System.out.println(dirs.name() + " : " + dirs.ordinal());
		}
	}

}
