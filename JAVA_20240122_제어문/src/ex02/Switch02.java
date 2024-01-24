package ex02;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		System.out.println("점수 입력:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		
		switch(num) {
		case 90:
			System.out.println("매우우수");
			break;
		case 80:
			System.out.println("우수");
			break;
		case 70:
			System.out.println("좋음");
			break;
		case 60:
			System.out.println("좀 더 열심히");
			break;
		case 50:
			System.out.println("미흡");
			break;
		default:
			System.out.println("잘못된 등급");
		}
		
	}

}
