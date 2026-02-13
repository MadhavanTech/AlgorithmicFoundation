package SORTING;

import java.util.Arrays;

public class Bubble_sorting {
	
	public static void main(String[] args)throws Exception {
		
		int[] a = {3,4,5,1,3};
		
		String[] s = {"Virat","Dhoni","Rohit"};
		
		
		Stringsort(s); //We can pass only numeric strings; otherwise, we will get a NumberFormatException.
		
		intsort(a);
		
		
	}
	
	public static void Stringsort(String[] a) throws Exception {
		
        for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				
				int resul=a[i].compareTo(a[j]);
				if(resul<0) {
					
					String temp1 = a[j];
					a[j]=a[i];
					a[i]=temp1;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	
	public static void intsort(int[] a) {
		
       for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					
					int temp1 = a[j];
					a[j]=a[i];
					a[i]=temp1;
				}
			}
		}
       
       System.out.println(Arrays.toString(a));
		
	}
	
	

}
