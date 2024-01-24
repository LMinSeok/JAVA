package ex03;

public class Continue {

	public static void main(String[] args) {
		
		//1부터 10사이의 홀 수의 합
		
//		int sum=0;
//		for(int i=1; i<11; i++) {			
//			if(i%2==1)
//				sum += i;	
//		}		
//			System.out.println("홀수의 합:" +sum);
	
		int sum=0;
		for(int i=1; i<11; i++) {
			
			if(i%2==0)
				continue;
				sum += i;	
		}		
			System.out.println("홀수의 합:" +sum);
	}

}
