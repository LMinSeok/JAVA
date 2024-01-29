package ex04;

public class BankAccountcontrol {

	public static void main(String[] args) {
		
		BankAccount bank = new BankAccount(
				"001122",
				"가나다",
				10000
				);
		
		bank.displayBalance();
		bank.deposit(1000000); //100만원 입금
		
		bank.displayBalance();
		
		bank.withdraw(500000); //50만원 출금
		bank.displayBalance();
	}

}
