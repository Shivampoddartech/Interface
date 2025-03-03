package Interface;

public class AccountHolder implements HDFC {
	@Override
	public void withdrawl() {
		System.out.println("withdrawl money");
	}

	@Override
	public void deposite() {
		System.out.println("Adding money to account ");
	}

	public static void main(String[] args) {
		AccountHolder ac = new AccountHolder();
		ac.deposite();
		ac.withdrawl();
	}

}
