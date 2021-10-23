package array;
import java.util.Random;
public class Employee {

	private int id;
	private String name;
	private int salary;
	private String designation;
	
	public Employee(String name,int salary) {
		Random random=new Random();
		this.name = name;
		this.salary = salary;
    this.id = random.nextInt(100); // auto generated through random number
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
//	public String toString() {
//		return "Id= "+this.id+" name= "+this.name+" salary "+this.salary+" destination= "+this.designation;
//	}
	public  boolean searchById(int ide,Employee arr[]) {
		//boolean isValid=false;
		for(int i=0;i<arr.length;i++) {
			if( arr[i].id==ide) {
				//arr[i].setDesignation("ITA");
				return true;
			}
		}
		return false;
	}
	
	
}
