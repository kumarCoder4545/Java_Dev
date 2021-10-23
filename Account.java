package account;

public class Account {
	private String cust_name;
	private long acc_no;
    private	String type_of_acc;
	public Account(String cust_name, long acc_no, String type_of_acc) {
//		super();
		this.cust_name = cust_name;
		this.acc_no = acc_no;
		this.type_of_acc = type_of_acc;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getType_of_acc() {
		return type_of_acc;
	}
	public void setType_of_acc(String type_of_acc) {
		this.type_of_acc = type_of_acc;
	}
	@Override
	public String toString() {
		return "Account [cust_name=" + cust_name + ", acc_no=" + acc_no + ", type_of_acc=" + type_of_acc + "]";
	}
	
    
	

}
