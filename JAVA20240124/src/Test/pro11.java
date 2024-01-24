package Test;

public class pro11 {

	public static void main(String[] args) {
		//500>5, 100>1, 50>1, 10>3
		int[]coinUnit = {500, 100, 50, 10};
		int money=2680;
		System.out.println("money : " +money);
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원 :"+money/coinUnit[i]+"	"+money);
			money = money%coinUnit[i];
		}

	}

}
