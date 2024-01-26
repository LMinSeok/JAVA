package ex04;

public class Array03 {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30};
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		
		int[] numArr = arr;
		for(int i=0; i<arr.length; i++)
			numArr[i]+=100;
		
		System.out.println();
		
		//for(int i=0; i<arr.length; i++)
		//	System.out.print(arr[i]+" ");
		
		for(int n : arr)
			System.out.print(n +" ");
		
		System.out.print("\n");
		
		String[] str = {"kor","eng","math","com","sci"};
		
		for(String s : str)
			System.out.print(s+ " ");
		
		System.out.print("\n");
		
		for(int i=0; i<str.length; i++)	
			System.out.print(str[i] + " ");		
		
		System.out.print("\n");
		
		

	}

}
