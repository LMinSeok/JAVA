package ex10;

import java.util.Arrays;

public class ArraysFunction {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] arr2;

		Arrays.fill(arr, 10);

		Arrays.setAll(arr, i -> (int) (Math.random() * 10) + 1);

		System.out.println(Arrays.toString(arr));

		arr2 = Arrays.copyOf(arr, 5);
		System.out.println(Arrays.toString(arr2));
	}
}
