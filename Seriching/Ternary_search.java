package SERCHING;

import java.util.Arrays;

public class Ternary_search {

	public static void main(String[] args) {
		
		int[] a = {2,34,5,61,4,1};
		
		int target =1;
		
		Arrays.sort(a);  // the Array is must be Sorterd
		
		int resul =solve(a,target);
		
		if(resul==-1) {
			
			System.out.println("Not found");
		}else {
			System.out.println("possition="+(resul+1)+","+"Number="+a[resul]);
		}
		

	}
	
	public static int solve(int[] a,int target) {
		
		int low =0,high=a.length-1;
		
		while(low<=high) {
			
			int mid1 =low+(high-low)/3;
			int mid2 =high-(high-low)/3;
			
			if(a[mid1]==target) {
				
				System.out.println(mid1);
				System.out.println(a[mid1]);
				return mid1;
				
			}else if(a[mid2]==target) {
				
				return mid2;
			}
			
			if(target<a[mid1]) {
				high =mid1-1;
			}else if(target>a[mid2]) {
				
				low = mid2+1;
			}else {
				
				high = mid1-1;
				low = mid2+1;
			}
		}
		
		return -1;
		
	}

}
