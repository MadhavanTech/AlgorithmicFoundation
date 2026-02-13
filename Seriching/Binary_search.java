package SERCHING;

import java.util.Arrays;

public class Binary_search {

	public static void main(String[] args) {
		
		
      int [] a = {2,1,3,4,8,9};
		
		int target =8;
		
		int resul =solve(a,target);
		
		if(resul==-1) {
			
			System.out.println("Not Found");
		}else {
			
			System.out.println("possition="+(resul+1)+","+"Number="+a[resul]);
		}

	}
	
	public static int solve(int[] a,int target) {
		
		Arrays.sort(a); // the Array is must be sortard
		
		int low =0,large=a.length-1;
		
		while(low<=large) {
			
			int mid=(low+large)/2;
			
			if(a[mid]==target) {
				
				return mid;
				
			}else if(a[mid]<target) {
				low= mid+1;
			}else {
				large= mid-1;
			}
		}
		
		return -1;
	}

}
