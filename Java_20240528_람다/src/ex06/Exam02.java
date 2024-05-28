package ex06;

interface printVariable {
	void printVar(String name, int i);
}

public class Exam02 {

	public static void main(String[] args) {

		printVariable p = new printVariable() {

			@Override
			public void printVar(String name, int i) {
				System.out.println(name + "=" + i);
			}
		};
		p.printVar("치킨", 20);
	}
}
