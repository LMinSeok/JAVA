package ex04;
/*
 * 은행계좌클래스
 * 클래스 이름 BankAccount
 * 속성 : accountNumber(계좌번호), accountHolder(계좌소유자), balance(잔액)
 * 기능: deposit(amount):입금메소드
 * 		withdraw(amount):출금메소드
 * 		displayBalance():잔액을 출력하는 메소드
 * 초기화 : 생성자 이용
 */

public class BankAccount {
	
	private String accountNumber;
	private String accountHolder;
	private int balance;
	
	BankAccount(){}
	
	BankAccount(String n, String h, int b){
		accountNumber = n;
		accountHolder = h;
		balance = b;
	}
	
	void deposit(int amount){
		balance +=amount;
	}
	void withdraw(int amount){
		balance -=amount;
	}
	void displayBalance(){
		System.out.println("잔고 : " +balance);
	}

}
