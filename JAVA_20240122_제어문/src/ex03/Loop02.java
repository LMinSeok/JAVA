package ex03;

public class Loop02 {

	public static void main(String[] args) {
		
		//1~100사이 3의 배수이면서 5의 배수의 합을 구하고, 갯수를 구하시오
		
		int sum=0;
		int cnt=0;
		
		for(int i=1; i<=100; i++) {
		
			if(i%3 == 0 && i%5 ==0) {
				sum += i;
				cnt++;
			}				
		}		
		
		System.out.println("갯수 :" +cnt);
		System.out.println("3의 배수이면서 5의 배수의 합:" +sum);
			
	}

}