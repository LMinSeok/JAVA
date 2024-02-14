package ex05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArraryListCollection {

	public static void main(String[] args) {

		// ArrayList와 LinkedList 두 클래스 상위 클래스인 List사용하자
		// ArrayList와 LinkedList는 사용법이 같다. 다만 저장되는 메모리구조가 다르다.

		// ArrayList<String> list = new ArrayList<String>();
		// LinkedList<String> list = new LinkedList<String>();
		List<String> list = new ArrayList<String>();

		// 문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
//		list.add(10); -> 파일 일치x

		Iterator<String> it = list.iterator();

		while (it.hasNext())
			System.out.println(it.next() + '\t');

		System.out.println();
		System.out.println("한번 더 출력");

		it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next() + '\t');
	}

}
