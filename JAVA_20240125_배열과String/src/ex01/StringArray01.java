package ex01;

public class StringArray01 {

	public static void main(String[] args) {
		String[] myArr = new String[3];
		
		//Scanner s = new Scanner(System.in);
		//System.out.println("3개 문자열을 입력하세요");
		//for(int i = 0; i<3; i++) {
		//	my Arr= s.nextLine();
		//	}
		
		myArr[0]="kor";
		myArr[1]="eng";

		for(int i =0; i<3; i++)
			System.out.println(myArr[i]+" ");
	}

}
