package GRAPH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Breadth_first_serch1 {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<6;i++) {
			
			graph.add(new ArrayList<>());
		}
		
		    graph.get(0).add(2);
	        graph.get(0).add(1);
	        graph.get(1).add(3);
	        graph.get(2).add(4);
	        graph.get(3).add(5);
	        
	        
	        int startNode = 0;
	        
	        int[] parent =BFS(startNode,graph);  
	        
	        System.out.println();
	        
	        List<Integer> path = pathgraph(0, 5, parent);
	        
	        System.out.println(path);
	}
	
	public static int[] BFS(int first,ArrayList<ArrayList<Integer>> graph ) {
		
		Queue<Integer> Q = new LinkedList<Integer>();
		
		boolean[] visit = new boolean[graph.size()];
		
		int[] parent = new int[graph.size()];
		
		Arrays.fill(parent, -1); // it will fill all value is like {-1,-1,-1,-1,-1,-1}
		
		visit[first]= true; // the Node is Visitard
		Q.add(first);
		
		while(!Q.isEmpty()) {
			
			int node = Q.poll();  // it will return the first node 
			
			System.out.print(node);
			
			for(int Nei : graph.get(node)) {
				
				if(!visit[Nei]) {
					
					visit[Nei]=true;
					parent[Nei]=node;
					Q.add(Nei);
				}
				
			}
		}
		
		return parent;
		
	}
	
	public static List<Integer> pathgraph(int start,int end ,int[] graph) {
		
		List<Integer> resul = new ArrayList<Integer>();
		
		int cur = end;
		
		while(cur!=-1) {
			
			resul.add(cur);
			cur =graph[cur];
		}
		
		Collections.reverse(resul);
		return resul;
	}

}
