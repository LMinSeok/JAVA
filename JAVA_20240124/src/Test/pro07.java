package Test;

import java.util.Random;
import java.util.Scanner;

public class pro07 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		Scanner s = new Scanner(System.in);
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요:");
			input = s.nextInt();
			if(answer>input) {
				System.out.println("더 큰 수를 입력하세요");
			}
			else if(answer<input) {
				System.out.println("더 작은 수를 입력하세요");
			}
			else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는" +count +"입니다.");
			}
		}while(true);
		
		

	}

}
