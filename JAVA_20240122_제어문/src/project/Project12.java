package project;

import java.util.Scanner;

public class Project12 {

	public static void main(String[] args) {
		
		int Num_Book = 3;
		int Num_item = 7;
		String[][] mbook = new String[][];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String name = sc.nextLine();


		System.out.print("연락처를 입력하세요 : ");
		String number = sc.nextLine();
				
		while(true) {
		System.out.println("*********************************************");
		System.out.println("Welcome to Shopping Mall");
		System.out.println("Welcome to Book Market!");
		System.out.println("**********************************************");
		System.out.println("1. 고객 정보 확인하기 \t 4. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기 \t 5. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기 	\t 6. 장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기 	\t 8. 종료");
		System.out.println("**********************************************");
		System.out.print("메뉴 번호를 선택해주세요 : ");
		
		int Menu = sc.nextInt();
//		System.out.print(Menu +"번을 선택했습니다.");
//		System.out.print("\n");
		switch(Menu) {
		
		case 1:
//			System.out.println("고객 정보 확인하기");
			System.out.println("현재 고객 정보:");
			System.out.println("이름 :" +name +"\t연락처 : " +number);
			break;
		case 2:
			System.out.println("2. 장바구니 상품 목록 보기");
			break;
		case 3:
			System.out.println("장바구니 비우기");
			break;
		case 4:
			System.out.println("바구니에 항목 추가하기");
			break;
		case 5:
			System.out.println("장바구니의 항목 수량 줄이기");
			break;
		case 6:
			System.out.println("장바구니의 항목 삭제하기");
			break;
		case 7:
			System.out.println("영수증 표시하기");
			break;
		default:
			System.out.println("종료");
			break;
			}		
		}
	}		
}
