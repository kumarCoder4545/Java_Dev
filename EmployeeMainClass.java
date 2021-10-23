package array;
import java.util.Scanner;
public class EmployeeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee obj[]=new Employee[3];
        Scanner sc=new Scanner(System.in);
       // obj.setDesignation("ASE");
//        for(Employee emp:obj) {
//        	emp=new Employee("Mayank",1000);
//        	emp.setDesignation("ASE");
//        	
//        }
//        for(Employee emp:obj) {
//        	System.out.println(emp.toString());
//        	
//        }
        for(int i=0;i<3;i++) {
//        	String name=sc.next();
//        	int salary=sc.nextInt();
        	obj[i]=new Employee("Mayank",10000);
        	obj[i].setDesignation("ASE");
        }
        for(int i=0;i<3;i++) {
        	System.out.println(obj[i].toString());
        }
        //boolean e=Employee.searchByUserName("Mayank",52,obj);
        //System.out.println(e);
        
//        
//       EmployeeMainClass e=new EmployeeMainClass();
//       boolean ans=e.search(obj,"Mayank");
//       System.out.println(ans);
//       
        
        //System.out.println(searchByUserName("Mayank",52,obj));
        //Employee e=new Employee("Mayank",1000);
        int ide=sc.nextInt();
        for(int i=0;i<3;i++) {
        	if(obj[i].searchById(ide,obj)) {
        		
        		System.out.println("User Found");
        		break;
        	}
        }
        
//        boolean t=searchByUserName("Mayank",52,obj);
//        System.out.println(t);
//        
        //System.out.println();
//        String ans=obj[0].toString();
//        System.out.println(ans);
	}
//	 public boolean search(Employee arr[],String nam) {
//		 boolean f=false;
//     	for(int i=0;i<3;i++) {
//     		if(arr[i].getName()==nam) {
//     			f=true;
//     			break;
//     		}
//     	}
//     	return f;
//     }

}
