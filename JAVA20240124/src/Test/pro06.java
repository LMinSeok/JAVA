package Test;

public class pro06 {

	public static void main(String[] args) {
		//(1,5) (2,4) (3,3) (4,2) (5,1)
		
		int i; //주사위1
		int j; //주사위2
		int sum = 0;
		
		for(i=1; i<=6; i++) {
			for(j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.print("X=:" +i);
					System.out.println("Y=:" +j);
					sum++;
				}
			}
		}
		System.out.println("sum : " +sum);
	}

}
