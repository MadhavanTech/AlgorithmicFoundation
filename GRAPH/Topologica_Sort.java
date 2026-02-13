package GRAPH;

import java.util.ArrayList;
import java.util.Stack;

public class Topologica_Sort {

	public static void main(String[] args) {
		
		
		int V=4;
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<V;i++) {
			
			graph.add( new ArrayList<Integer>());
		}
		
		graph.get(0).add(1);
		graph.get(0).add(2);
		graph.get(1).add(3);
		
		
		boolean[] visiter = new boolean[V];
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<V;i++) {
			
			if(!visiter[i]) {
				
				dfs(i,visiter,stack,graph);
			}
		}
		
		
		while(!stack.isEmpty()) {
			
			System.out.print(stack.pop()+" ");
		}

	}
	
	public static void dfs(int node,boolean[] visiter,Stack<Integer> stack,ArrayList<ArrayList<Integer>> graph) {
		
		visiter[node]=true;
		
		for(int g:graph.get(node)) {
			
			if(!visiter[g]) {
				
				dfs(g,visiter,stack,graph);
			}
		}
		
		stack.push(node);
		
	}

}
