package ex09;

class Box<T> { // T --> String전달
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return this.obj;
	}

	@Override
	public String toString() {
		return obj.toString();
	}
}

class Unboxer {
	public static <T> void openBox(Box<T> box) {
//		return box.get();
		System.out.println(box);
	}

	public static void peekBox(Box<?> box) { // ? 와일드 카드
		System.out.println(box);
	}
}

public class GenericMethod01 {
	public static void main(String[] args) {

		Box<String> sbox = new Box();
		sbox.set("Korea");

		Unboxer.<String>peekBox(sbox);
		Unboxer.<String>openBox(sbox);
	}
}