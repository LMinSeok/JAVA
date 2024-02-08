package ex03;

class A {
	@Override
	public String toString() {
		return "A Class";
	}
}

class B extends A {
	@Override
	public String toString() {
		return "B Class";
	}
}

class C extends B {
	@Override
	public String toString() {
		return "C Class";
	}
}
//A클래스 이거나 A를 상속한 클래스만 T 전달 가능!!

class Box<T extends A> {
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

public class BoxEx01 {
	public static void main(String[] args) {
		Box<A> abox = new Box<A>();
		Box<B> bbox = new Box<B>();
		Box<C> cbox = new Box<C>();

//		Box<Integer> ibox = new Box<Integer>();
	}
}