package ex07;

public class Carcontroll {

	public static void main(String[] args) {

		Car car1 = new Car();

		car1.displayCarDetails();
		System.out.println("------------------------");

		car1.setCar("제조", "현대", "2000", "검정");
		car1.displayCarDetails();

		System.out.println("------------------------");
		car1.setmake("제조");
		car1.setmodel("기아");
		car1.setyear("2001");
		car1.setcolor("흰색");
		car1.displayCarDetails();

	}

}
