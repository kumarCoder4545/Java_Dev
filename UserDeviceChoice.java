package array;
import java.util.Scanner;

public class UserDeviceChoice {
	DeviceDatabase record=new DeviceDatabase();
	static Scanner sc=new Scanner(System.in);
	public static void main(String []args) {
		UserDeviceChoice device=new UserDeviceChoice();
		while(true)
		{
			System.out.println(" ------- Admin Operations ----");
			System.out.println("1. Insert New Device ");
			System.out.println("2. Search Device based on ModelNumber ");
			System.out.println("3. View All Devices ");
			System.out.println("4. Print Devices within Price Range ");
			System.out.println("5.  Filter Device based on Price Range and BrandName ");
//			System.out.println("6. View Employees By Designation ");
			System.out.println("0. EXIT ");
			
			System.out.println("\n\n Enter Choice :-  ");
			int userChoice = Integer.parseInt(sc.nextLine());
		
			
			switch (userChoice) {
			case 1:
				device.insertNewDevice();
				break;
				
			case 2:
				device.searchByModelNumber();
				break;
				
			case 3:
				device.getAllDevices();
				break;
				
			case 4:
				device.viewDeviceByPriceRange();
				break;
			case 5:
				device.filterByPriceAndBrandName();
				break;
				
			
			case 0:
				System.exit(0);
				break;
				
			

			default:
				break;
			}
			
		}//end of while
			
	}
	public void insertNewDevice() {
		System.out.println("Enter device name ");
		String s=sc.nextLine();
		System.out.println("Enter device cost ");
		int c=Integer.parseInt(sc.nextLine());
		System.out.println("Enter device Rating ");
		int a=Integer.parseInt(sc.nextLine());
		System.out.println("Enter device Brand ");
		String b_name=sc.nextLine();
//		System.out.println("Enter device ModelNumber ");
//		String modelno=sc.nextLine();
//		
		Device d=new Device(s,c,a,b_name);
		
		boolean ans=record.insertNewDevice(d);
		System.out.println("is Inserted : "+ans);
		
	}
	public void searchByModelNumber() {
		System.out.println("Enter device ModelNumber ");
		String modelno=sc.nextLine();
		boolean ans=record.searchByModelNumber(modelno) ;
		System.out.println("is Find : "+ans);
	}
	public void getAllDevices() {
		Device data[]=record.getAllDeviceData();
		for(Device detail:data) {
			System.out.println(detail);
		}
	}
	public void viewDeviceByPriceRange() {
		System.out.println("Enter starting range : ");
		int a=Integer.parseInt(sc.nextLine());
		System.out.println("Enter ending range : ");
		int b=Integer.parseInt(sc.nextLine());
		Device ans[]=record.printDeviceWithinRange(a,b);
		for(Device data:ans) {
			if(data!=null) {
				System.out.println(data);
			}
		}
	}
	public void filterByPriceAndBrandName() {
		System.out.println("Enter starting range : ");
		int a=Integer.parseInt(sc.nextLine());
		System.out.println("Enter ending range : ");
		int b=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Brand name : ");
		String bname=sc.nextLine();
		Device data[]= record.getDeviceBasedOnRangeAndBrandName(a,b,bname);
//		double avgrating=0;
		int j=0;
		for(Device detail:data) {
			if(detail!=null) {
				System.out.println(detail);
				
				j++;
			}
		}
		System.out.println("Enter Avgrating to apply filters : ");
		int avgrating=Integer.parseInt(sc.nextLine());
		for(Device detail:data) {
			if(detail.getAvgRating()>avgrating) {
				System.out.println(detail);
				
				//j++;
			}
		}
		
	}
	
	

}
