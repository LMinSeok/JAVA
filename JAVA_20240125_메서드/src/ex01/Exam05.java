
/*
 * 메서드명 : calculateEvenSum
 * 반환타임 : int
 * 매개변수 : int
 * 기능 : 주어진 정수 N까지의 모든 짝수의 합을 계산하는 함수를 작성하시오
 * 
 */

package ex01;

public class Exam05 {

	public static void main(String[] args) {
		System.out.println("sum(10,20의 값 : "+Sum(10, 20));
		System.out.println("sum(10,20의 값 : "+Sum(10, 20, 30));
		System.out.println("sum(10,20의 값 : "+Sum(10.5, 20.5));
	}


	public static int Sum(int x, int y) {
		return(x + y);
	}
	public static int Sum(int x, int y, int z) {
		return(x + y + z);
	}
	public static double Sum(double x, double y) {
		return(x + y);
	}
}		
	