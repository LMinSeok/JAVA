package ex07;

/*
 * 자동차 클래스 만들기
 * 클래스 이름 Car
 * 속성 : make, model, year, color
 * 기능 : startEngine():엔진을 켜는 메소드
 * 		 stopEngine():엔진을 끄는 메소드
 * 		 displayCarDetails():자동차의 모든 정보를 출력하는 메소드
 * 초기화 : setter이용  
 */
public class Car {
	private String make;
	private String model;
	private String year;
	private String color;

	void setmake(String m) {
		make = m;
	}

	void setmodel(String mo) {
		model = mo;
	}

	void setyear(String y) {
		year = y;
	}

	void setcolor(String c) {
		color = c;
	}

	void setCar(String m, String mo, String y, String c) {
		make = m;
		model = mo;
		year = y;
		color = c;
	}

	void displayCarDetails() {
		System.out.println("제조사: " + make);
		System.out.println("모델: " + model);
		System.out.println("연식: " + year);
		System.out.println("색상: " + color);
	}

	private boolean engine;

	boolean startEngine() {
		return engine = true;
	}

	boolean stopEngine() {
		return engine = false;
	}

}
