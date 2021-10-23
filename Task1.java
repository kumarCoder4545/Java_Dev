package array;

import java.util.*;
//import java.lang.Math;
public class Task1 {
	public static void main(String[] args) {
		int arr[][]=new int[2][3];
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=random.nextInt(100);
			}
		}
		for(int i[]:arr) {
			for(int j:i) {
				System.out.println(j+" ");
			}
		}
		
	}
}
