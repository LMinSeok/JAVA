package ex04;

public class CarControll {

	public static void main(String[] args) {
		
		Car myCar = new Car();

		myCar.tire = new Tire();
		myCar.run();

		myCar.tire = new TireA();
		myCar.run();

		myCar.tire = new TireB();
		myCar.run();
	}

}
