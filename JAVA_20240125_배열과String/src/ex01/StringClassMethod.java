package ex01;

public class StringClassMethod {

	public static void main(String[] args) {
		
		String str="korea";
		String str2="";
		String str3=str.substring(2);
				
		
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println(str.substring(2));
		System.out.println(str3);
		
		System.out.println(str.substring(1, 4));
		
		String str4 ="math";
		String str5 =(str.concat(str4));
		System.out.println(str5);
		
	}

}
