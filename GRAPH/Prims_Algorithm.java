package GRAPH;

public class Prims_Algorithm {

	public static void main(String[] args) {
		
		int[][] g = {
	            {0,2,6},
	            {2,0,3},
	            {6,3,0}
	        };
		
		int V =3;
		boolean[] visi = new  boolean[V];
		visi[0]=true;
		
		
		for(int i=0;i<V-1;i++) {
			
			int min = Integer.MAX_VALUE;
			
			int x=0 ,y=0;
			
			for(int j=0;j<V;j++) {
				
				if(visi[j]) {
					
					for(int v=0;v<V;v++) {
						
						if(!visi[v]&& g[j][v]!=0&& g[j][v]<min) {
							
							min=g[j][v];
							x=j;
							y=v;
							
						}
						
					}
				}
				
			}
			
			
			System.out.println(x + " - " + y + " = " + min);
			
			visi[y]=true;
			
			
		}

	}

}
