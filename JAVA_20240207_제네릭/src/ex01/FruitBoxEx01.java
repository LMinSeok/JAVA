package ex01;

class Apple {// 사과
	public String toString() {
		return "I am an apple";
	}
}

class Orange {// 오렌지
	public String toString() {
		return "I am an Orange";
	}
}

public class FruitBoxEx01 {

	public static void main(String[] args) {
		Box<Apple> abox = new Box<Apple>(); // 사과 박스
		Box<Orange> bbox = new Box(); // 오렌지 박스

		abox.setObj(new Apple()); // 사과 담음
		bbox.setObj(new Orange()); // 오렌지 담음

		Apple ap = abox.getObj();
		Orange op = bbox.getObj();

		System.out.println(ap);
		System.out.println(op);
	}

}

class Box<T> { // 사과, 오렌지 담는 상자
	private T obj;

	void setObj(T obj) {
		this.obj = obj;
	}

	T getObj() {
		return obj;
	}
}
