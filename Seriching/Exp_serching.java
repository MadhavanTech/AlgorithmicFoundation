package SERCHING;

import java.util.Arrays;
import java.util.Iterator;

public class Exp_serching {

	public static void main(String[] args) {
		
		int[] a = {12,3,4,5,76,8,9};
		
		int target =12;
		
		Arrays.sort(a);  // the Array must be sorted
		
		int resul = Exponation(a,target);
		
		if(resul==-1) {
			
			System.out.println("Not found");
		}else {
			System.out.println("possition="+(resul+1)+","+"Number="+a[resul]);
		}

	}
	
	public static int Exponation(int[] a,int target) {
		
		int n = a.length-1;
		
		
		if(a[0]==target) {
			
			return 0;
		}
		
		int i=1;
		
		while(i<=n&&a[i]<=target) {
			
			i=i*2;
		}
		
		return Binarysearch(a,i/2,Math.min(i, n),target);
	}
	
	public static int Binarysearch(int[] a,int low,int high,int target) {
		
		
		while(low<=high) {
			
			int mid = low +(high-low)/2;
			
			if(a[mid]==target) {
				
				return mid;
			}else if(a[mid]<target) {
				
				low = mid+1;
			}else {
				
				high = mid-1;
			}
		}
		
		return -1;
		
	}

}
