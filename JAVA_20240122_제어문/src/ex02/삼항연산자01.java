package ex02;

public class 삼항연산자01 {

	public static void main(String[] args) {
		
		int a = 69;
		
		if(a>=60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		//삼항 연산자 이용해서 변형
		
		String msg = (a>=60) ? "합격" : "불합격";
		//String msg = "합격"
		System.out.println(msg);
	}

}
