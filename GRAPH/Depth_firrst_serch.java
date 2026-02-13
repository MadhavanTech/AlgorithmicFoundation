package GRAPH;

public class Depth_firrst_serch {

	public static void main(String[] args) {
		
		int[][] a = {{1,1,1,1,0},
				     {1,0,1,1,0},
                     {1,1,1,1,0},
                     {0,0,1,1,1},
                     {1,1,0,1,0}};
		
		int resul = solve(a);
		
		System.out.println(resul);

	}
	
	
	public static int solve(int[][] a) {
		
		
		int resul = 0;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
				if(a[i][j]==1) {
					
					resul++;
					
					DSF(a,i,j);
				}
			}
		}
		return resul;
	}
	
	public static void DSF(int [][] a,int i,int j) {
		
		
		if(i<0||j<0||i>=a.length||j>=a[i].length||a[i][j]==0) {
			
			return ;
		}
		
		a[i][j]=0;
		
		DSF(a,i+1,j);
		DSF(a,i-1,j);
		DSF(a,i,j+1);
		DSF(a,i,j-1);
		
	}

}
