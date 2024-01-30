package ex02;

public class Smartphone extends phone {
	private String model;
	private String color;

	private boolean Wifi;

	public Smartphone() {
		System.out.println("SmartPhone()");
	}

	public Smartphone(boolean Wifi) {
		System.out.println("SmartPhone(boolean wifi)");
		this.Wifi = Wifi;

	}
	public Smartphone(String model, String color, boolean wifi) {
		super(model, color);
		System.out.println("String color, boolean wifi");
		this.Wifi=wifi;
	}
	
	

	@Override
	public String toString() {
		System.out.println(super.toString()); // 상위클래스 toString 메소드 호출
		return "Smartphone [ Wifi=" + Wifi + "]";
	}

	public void internet() {
		System.out.println("인터넷 연결!!");
	}
}
