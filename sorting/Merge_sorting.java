package SORTING;

import java.util.Arrays;

public class Merge_sorting {

	public static void main(String[] args) {
		
		
		int[] a  = {8,4,9,2,1,3,10};
		System.out.println(Arrays.toString(a));
		
		int h=a.length-1,l=0;
		solve(a,l,h);
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void solve(int[] a,int l,int h) {
		
		if(l>=h) {
			return;
		}
		
		
		int m=(h+l)/2;
		
		solve(a,l,m);
		solve(a,m+1,h);
		merge(a,l,m,h);
		
	}
	
	public static void merge(int[] a,int l,int m,int h) {
		
		int[] temp = new int[h-l+1];
		
		int x=0,r=m+1;
		
		while(l<=m&&r<=h) {
			
			if(a[l]<a[r]) {
				
				temp[x++]=a[l++];
			}else {
				temp[x++]=a[r++];
			}
		}
		while(l<=m) {
			temp[x++]=a[l++];
		}
		while(r<=h) {
			
			temp[x++]=a[r++];
		}
		
		int y=0;
		for(int k=l;k<=h;k++) {
			
			a[k]=temp[y++];
		}
		
	}

}
