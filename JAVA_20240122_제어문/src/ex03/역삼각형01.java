package ex03;

import java.util.Scanner;

public class 역삼각형01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("길이");
		
		int len = s.nextInt();
		
		for(int i =0; i<len; i++) { //빈칸 출력
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*len)-1-(i*2); j++) { //별 찍기
				System.out.print("*");
			}
			System.out.println(""); //줄변경
		}
	}

}
