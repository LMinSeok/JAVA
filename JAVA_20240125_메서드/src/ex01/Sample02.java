/*
 * 메서드명 : change
 * 매개변수 : int
 * 반환타입 : int[]
 * 기능 : change함수 정수값을 전달하면, 그 정수 수 만큼 배열을 생성해서 전달
 * 		 배열안에는 1~10까지 난수 입력
 */
package ex01;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		System.out.println("change 입력: " +a1);
		
		
		int[] numArr = change(a1);
		
		for(int i=0; i<numArr.length; i++);
		
		System.out.println("출력:"+numArr);
	}
		
		public static int[] change(int a1) {
			
			int[] arrNum = new int[];
			
			for(int i=0; i<arrNum.length; i++) {
				arrNum[i] = (int)(Math.random()*10)+1;
		
				
				return arrNum;
			}
		}	
	

}
