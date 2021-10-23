package array;

public class ArrayMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysWork obj=new ArraysWork();
		int ans[]=obj.getRepeatedValues();
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
		short res=obj.getSum();
		System.out.println(res);
		int answer[]=obj.getUniqueValues();
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}

}
