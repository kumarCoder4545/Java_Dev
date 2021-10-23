package account;
import java.util.Scanner;
public class UserMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Type of account: \nSaving \nCurrent");
		String acc_type=sc.nextLine();
		if(acc_type.equals("Saving")) {
			System.out.println("Enter Name of Account Holder: ");
			String name=sc.nextLine();
			System.out.println("Enter Account Number: ");
			long accno=Long.parseLong(sc.nextLine());
			SavingAccount user=new SavingAccount(name,accno,acc_type);
			System.out.println("Enter Amount to Deposit: ");
			double deposit=Double.parseDouble(sc.nextLine());
			user.setBalance(deposit);
			while(true) {
			System.out.println("1. Deposit");
			System.out.println("2. Display Balance");
			System.out.println("3. Compute and Deposit Interest");
			System.out.println("4. Withdrawl");
			System.out.println("5. Exit");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				System.out.println("Enter accno to Deposit amount: ");
				long accNo=Long.parseLong(sc.nextLine());
				if(user.getAcc_no()==accNo) {
					System.out.println("Enter Amount to be Deposit: ");
					int amt=Integer.parseInt(sc.nextLine());
					user.depositMoney(amt);
					break;
				}
				else {
					System.out.println("Invalid Acc no: ");
				}
			case 2:
				System.out.println(user);
				break;
			case 3:
				user.setInterest();
				break;
			case 4:
				System.out.println("Enter accno to withdrawl amount: ");
				long acc_no=Long.parseLong(sc.nextLine());
				if(user.getAcc_no()==acc_no) {
					System.out.println("Enter Amount to be Withdrawl: ");
					int amt=Integer.parseInt(sc.nextLine());
					user.withdrawl(amt);
					break;
				}
				else {
					System.out.println("Invalid Acc no: ");
				}
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid: ");
				
			}
			
			
		}
	}else {
		System.out.println("Enter Name of Account Holder: ");
		String name=sc.nextLine();
		System.out.println("Enter Account Number: ");
		long accno=Long.parseLong(sc.nextLine());
		CurrentAccount user=new CurrentAccount(name,accno,acc_type);
		System.out.println("Enter Amount to Deposit: ");
		double deposit=Double.parseDouble(sc.nextLine());
		user.setBalance(deposit);
		while(true) {
		System.out.println("1. Deposit");
		System.out.println("2. Display Balance");
		System.out.println("3. Check for Minimum Balance");
		System.out.println("4. Withdrawl");
		System.out.println("5. Exit");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:
			System.out.println("Enter accno to Deposit amount: ");
			long accNo=Long.parseLong(sc.nextLine());
			if(user.getAcc_no()==accNo) {
				System.out.println("Enter Amount to be Deposit: ");
				int amt=Integer.parseInt(sc.nextLine());
				user.depositMoney(amt);
				break;
			}
			else {
				System.out.println("Invalid Acc no: ");
			}
		case 2:
			System.out.println(user);
			break;
		case 3:
			user.checkMinBalance();
			break;
		case 4:
			System.out.println("Enter accno to withdrawl amount: ");
			long acc_no=Long.parseLong(sc.nextLine());
			if(user.getAcc_no()==acc_no) {
				System.out.println("Enter Amount to be Withdrawl: ");
				int amt=Integer.parseInt(sc.nextLine());
				user.withdrawl(amt);
				break;
			}
			else {
				System.out.println("Invalid Acc no: ");
			}
		case 5:
			System.exit(0);
		default:
			System.out.println("Invalid: ");
			
		}
		
		
	}
	}
	}

}
