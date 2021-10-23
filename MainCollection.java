package array;
import java.util.*;
public class MainCollection {
	//HashMap<Integer, Device> map = new HashMap<>();
	

	public static void main(String[] args) {
		HashSet<Device> set = new HashSet<>();
		LinkedHashSet<Device> lset = new LinkedHashSet<>();
		Device d1 = new Device("HP1098",30000,4,"HP");
		Device e2 = new Device("HP1098",30000,4,"HP");
		Device e3 = new Device("ASUS1096",50000,3,"ASUS");
		Device e4 = new Device("HP1095",60000,4,"ACER");
		set.add(d1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		lset.add(d1);
		lset.add(e2);
		lset.add(e3);
		lset.add(e4);
		
		System.out.println("----------Output Throw Hashset----------");
		for(Device d:set) {
			System.out.println(d);
		}
		System.out.println("----------Output Throw LinkedHashset----------");
		for(Device d:lset) {
			System.out.println(d);
		}
	}
	
	
}
