package array;

public class ArraysWork {

	int arr[] = {15,19,6,3,74,84,62,100,20,38,415,3,74,16,15,9,650,67};
	
	
	public int[] getRepeatedValues()
	{
		// code to return arr[] containing only duplicate values, such as 15,3 etc
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		int res[]=new int[count];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					//count++;
					res[k++]=arr[i];
					
				}
			}
		}
		return res;
	}
	
	public short getSum()
	{
		// code to return the total of all values;
		short sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public static int[] getUniqueValues()
	{
		// code to return arr[] containing all unique values only;
		 ArraysWork e=new  ArraysWork();
		int count=0;
		for(int i=0;i<e.arr.length;i++) {
			for(int j=0;j<e.arr.length;j++) {
				if(e.arr[i]==e.arr[j] && i!=j) {
					count++;
				}
			}
		}
		int res[]=new int[e.arr.length-count];
		int k=0;
		for(int i=0;i<e.arr.length;i++) {
			int f=0;
			for(int j=0;j<e.arr.length;j++) {
				if(e.arr[i]==e.arr[j] && i!=j) {
					//count++;
					//continue;
					f=1;
				}
			}
			if(f==0) {
				res[k++]=e.arr[i];
			}
		}
		return res;
	}
	
}
