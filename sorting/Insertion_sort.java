package SORTING;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		
   
		
		int[] a = {29,3,4,6,1,6,7};
		
		inserition(a);
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void inserition(int[] a) {
		
     for(int i=1;i<a.length;i++) {
			
			int key =a[i];
			
			int range =i-1;
			
			while(range>=0&&a[range]>key) {
				
				a[range+1]=a[range];
				
				range--;
			}
			
			a[range+1]=key;
		}
	}

}
