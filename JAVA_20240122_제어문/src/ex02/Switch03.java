package ex02;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		
		System.out.println("점수 입력:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
	}

}
