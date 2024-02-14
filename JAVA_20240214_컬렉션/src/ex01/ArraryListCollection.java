package ex01;

import java.util.ArrayList;

public class ArraryListCollection {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		// 문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
//		list.add(10); -> 파일 일치x

		// 저장된 리스트 출력
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();

		// 향상된 for문 이용
		for (String str : list)
			System.out.print(str + " ");
		System.out.println();

		// 삭제 ..
		list.remove(0); // 배열 첫번째 삭제 (Toy 제거)

		// System.out.println(list.get(0));
		// 앞자리가 삭제되면 뒤 데이터들이 전부 앞으로 한칸씩 이동한다.
		// 따라서 arraylist는 빈번한 삭제가 있는 경우에는 속도가 저하 될 수 있다.

		// 향상된 for문 이용
		for (String str : list)
			System.out.print(str + " ");
	}

}
