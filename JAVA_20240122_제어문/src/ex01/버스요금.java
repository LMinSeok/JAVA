package ex01;

import java.util.Scanner;

public class 버스요금 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int CHARGE = 1500;
		double fee = 0;
		
		System.out.println("버스 기본요금은 1500원");
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age>0 && age<3) {
			System.out.println("할인율 100%");
			System.out.println((CHARGE*0) +"원");
		}
		else if(age>4 && age<13) {
			System.out.println("할인율 50%");
			System.out.println((CHARGE*1/2) +"원");
		}
		else if(age>14 && age<19) {
			System.out.println("할인율 25%");
			System.out.println((CHARGE*3/4) +"원");
		}
		else if(age>=65) {
			System.out.println("할인율 100%");
			System.out.println((CHARGE*0) +"원");
		}	
		else {
			System.out.println("할인율 0%");
			System.out.println((CHARGE*1) +"원");
		}
			

	}

}
