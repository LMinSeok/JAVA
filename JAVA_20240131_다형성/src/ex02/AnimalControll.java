package ex02;

/*
 * main 메소드에 각기 다른 종류의 동물들을 생성합니다.
 * 생성된 각 동물에 대해 makeSound()를 호출하여 해당 동물 소리를 출력합니다.
 */
public class AnimalControll {

	public static void main(String[] args) {

		/*
		 * Bird b = new Bird(); b.makeSound(); 
		 * Dog D = new Dog(); D.makeSound(); 
		 * Cat c = new Cat(); c.makeSound();
		 */

		sound(new Bird());
		sound(new Cat());
		sound(new Dog());
	}

	static void sound(Animal animal) {
		animal.makeSound();
	}
}
