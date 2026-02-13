package SORTING;

import java.util.Arrays;

public class Selection_Sorting {

	public static void main(String[] args) {
		
		int[] a = {34,2,45,1,78};
		intsolve(a);
		
		
	}
	
	public static void intsolve(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			
			int inde =-1;
			int smal = Integer.MAX_VALUE;
			for(int j=i;j<a.length;j++) {
				
				if(smal>a[j]) {
					
					smal=a[j];
					inde=j;
				}
			}
			
			int temp = a[inde];
			a[inde]=a[i];
			a[i]=temp;
		}
		
		
		System.out.println(Arrays.toString(a));
	}

}
