package ex03;

public class Loop03 {

	public static void main(String[] args) {
		
		//1~100사이 홀수합과 짝수합을 구하시오
		
		int even = 0; //짝수합
		int odd = 0; //홀수합
		
		for(int i=1; i<101; i++) {
			if(i%2 == 0)
				even += i;
			
			else
				odd += i;

			
		}
		System.out.println("짝수합:" +even);
		System.out.println("홀수합" +odd);
	}

}