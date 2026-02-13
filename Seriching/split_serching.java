package SERCHING;

import java.util.Arrays;

public class split_serching {

	public static void main(String[] args) {
	
		int[] a = {2,3,4,5,1,23,44,5,6,77};
		
		Arrays.sort(a);
		
		int target =77;
		
		int resul = splitSerch(a,target);
		
        if(resul==-1) {
			
			System.out.println("Not found");
		}else {
			System.out.println("possition="+(resul+1)+","+"Number="+a[resul]);
		}

	}
	
	public static int splitSerch(int[] a ,int target) {
		
		int n = a.length;
		
		int split = Math.max(1, n/3);;
		
		int i=0;
		while(i<n&&a[i]<target) {
			
			i=i+split;
			
		}
		
		i = i-split;
		
		return Linearseach(a, i, i+split, target);
		
	
	}
	
	public static int Linearseach(int[] a,int low ,int high ,int target) {
		
		
		for(int i=low;i<=high &&i<a.length;i++) {
			
			if(a[i]== target) {
				
				return i;
			}
		}
		
		return -1;
	}

}
