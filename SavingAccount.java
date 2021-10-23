package account;

public class SavingAccount extends Account {
	public double balance;
//	public double interest;
	public SavingAccount(String cust_name, long acc_no, String type_of_acc) {
		super(cust_name, acc_no, type_of_acc);
		// TODO Auto-generated constructor stub
	}
	public void setBalance(double money) {
		balance=money;
	    setInterest();
	}
	public double getBalance() {
		return balance;
	}
	public void setInterest() {
		double interest=balance*0.02;
		balance=balance+interest;
		System.out.println("Balance: "+balance);
	}
	public void depositMoney(int money) {
		balance+=money;
		System.out.println("Amount Deposited: ");
		System.out.println("Balance: "+balance);
		setInterest();
	}
	public void withdrawl(int amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("Amount Withdrawl Successfully");
			System.out.println("Balance: "+balance);
		}else {
			System.out.println("Your balance is not sufficient to withdrawl");
		}
	}
	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", getCust_name()="
				+ getCust_name() + ", getAcc_no()=" + getAcc_no() + ", getType_of_acc()=" + getType_of_acc()
				+ "]";
	}

}
