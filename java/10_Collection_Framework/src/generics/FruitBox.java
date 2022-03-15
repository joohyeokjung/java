package generics;

public class FruitBox {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<>();
		Box<Apple> appleBox = new Box<>();
		Box<Toy> toyBox = new Box<>();
		
//		Box<Apple> appleBox2 = new Box<Orange>(); // Error, Generics에 의해 타입제한
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Orange()); // orange는 fruit 의 자식이라 가능 상속개념
		fruitBox.add(new Apple()); // 동일
//		fruitBox.add(new Toy()); // Fruit 타입과 연관성이 없으므로 Error
//		toyBox.add(new Apple()); // Toy 타입과 연관성이 없으므로 Error
		
	}

}
