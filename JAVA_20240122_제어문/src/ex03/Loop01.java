package ex03;

import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
		
		//키보드로 입력받은 5개 숫자의 합
		
		int sum = 0;
		System.out.println("5개의 숫자를 입력하시오");
		
		for(int i =1; i<6;i++) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sum += num;
		}
		
		System.out.println("합계 : " +sum);
	}

}
