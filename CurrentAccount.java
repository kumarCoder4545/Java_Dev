package account;

public class CurrentAccount extends Account {
	public double balance;
	public int min_balance=1000;

	public CurrentAccount(String cust_name, long acc_no, String type_of_acc) {
		super(cust_name, acc_no, type_of_acc);
		// TODO Auto-generated constructor stub
	}
	public void setBalance(double money) {
		if(money>=min_balance) {
			balance=money;
		}
		else {
			System.out.println("Deposit Money is less than Minimum Balance Required: ");
		}
		
	}
	public double getBalance() {
		return balance;
	}
	public void depositMoney(int money) {
		balance+=money;
		System.out.println("Amount Deposited: ");
		System.out.println("Balance: "+balance);
	}
	public String checkBookFacility() {
		return "Check Book Facility";
	}
	public void withdrawl(int amount) {
		if(balance - min_balance>=amount) {
			balance=balance-amount;
			System.out.println("Amount Withdrawl Successfully");
			System.out.println("Balance: "+balance);
		}else {
			System.out.println("Your Balance is not sufficient for withdrawl");
		}
	}
	public void checkMinBalance() {
		if(balance<500) {
			double penalty=balance*0.01;
			balance=balance-penalty;
			System.out.println("Your Balance is below the minimum to be maintain");
			System.out.println("Penality: "+penalty);
			System.out.println(toString());
			
		}else {
			System.out.println(toString());
		}
	}
	@Override
	public String toString() {
		return "CurrentAccount [balance=" + balance + ", min_balance=" + min_balance + ", getCust_name()="
				+ getCust_name() + ", getAcc_no()=" + getAcc_no() + ", getType_of_acc()=" + getType_of_acc()
				+ "]";
	}
	
	
	
	

}
