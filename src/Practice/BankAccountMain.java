package Practice;

class InsufficientBalanceException extends Exception{
	@Override
	public String toString(){
		return "You have insufficient balance";
	}
}

class Account{
	private int balance;
	private int accountNumber;

	public void deposit(int amount){
		if(amount <= 0){
			System.out.println("Invalid amount");
			return;
		}
		balance += amount;
	}

	public void withdraw(int amount) throws InsufficientBalanceException{
		if(amount <= 0){
			System.out.println("Invalid amount");
			return;
		}
		if(amount >= balance){
			throw new InsufficientBalanceException();
		}
	}

	public int getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
}

public class BankAccountMain {
	public static void main(String... args){

	}
}
