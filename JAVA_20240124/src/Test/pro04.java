package Test;

public class pro04 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		
		while(true) {
			i++;
		
		if(i%2 == 0) {
			sum=sum-i;
		}
		else {
			sum=sum+i;
		}
		if(sum>=100)
			break;
		}
		System.out.println("i = " +i +", sum = "+sum);
		
	}
}
