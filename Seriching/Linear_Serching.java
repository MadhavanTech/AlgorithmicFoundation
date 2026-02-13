package SERCHING;

public class Linear_Serching {

	public static void main(String[] args) {
		
		int [] a = {2,1,3,4,8,9};
		
		int target =8;
		
		int resul =solve(a,target)+1;
		
		if(resul==-1) {
			
			System.out.println("Not Found");
		}else {
			
			System.out.println("possition="+resul+","+"Number="+a[resul]);
		}
	}
	
	public static int solve(int[] a,int target) {
		
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==target) {
				return i;
			}
		}
		
		return -1;
	}

}
