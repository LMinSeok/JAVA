package ex02;

class Dbox<L, R> {
	private L left;
	private R right;

	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return left + "&" + right;
	}
}

public class MultiTypeGen {
	public void main(String[] args) {
		MultiTypeGen<String, Integer> box = new MultiTypeGen<String, Integer>();
		box.set("Apple", 10);
		System.out.println(box);
	}
}
