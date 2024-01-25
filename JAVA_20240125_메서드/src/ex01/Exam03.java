
/*
 * 메서드명 : calculateEvenSum
 * 반환타임 : int
 * 매개변수 : int
 * 기능 : 주어진 정수 N까지의 모든 짝수의 합을 계산하는 함수를 작성하시오
 * 
 */

package ex01;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("N값 입력 : ");
		int N = sc.nextInt();

		int sum = calculateEvenSum(N);
		System.out.println("모든짝수의 합: " + sum);
	}

	public static int calculateEvenSum(int N) {
		int sum = 0;
		for (int i = 2; i <= N; i += 2) {
			sum += i;
			
		}
		return sum;
	}
}