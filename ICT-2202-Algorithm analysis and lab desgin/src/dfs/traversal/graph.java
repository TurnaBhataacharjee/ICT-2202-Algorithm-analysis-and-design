package dfs.traversal;

import java.util.LinkedList;

public class graph {
	@SuppressWarnings("unused")
	private int vertices;
	private LinkedList<Integer>[]adjancenylist;
	
	@SuppressWarnings("unchecked")
	graph(int vertices){
		this.vertices=vertices;
		this.adjancenylist=new LinkedList[vertices];
		
		for(int i=0;i<vertices;i++) {
			adjancenylist[i]=new LinkedList<Integer>();
		}
	}
	
	
	void addedge(int from,int to) {
		adjancenylist[from].add(to);
		adjancenylist[to].add(from);
	}
	
	void dfs(int start) {
		boolean[]visited=new boolean[vertices];
		
		dfsutill(start,visited);
		
	}
	private void dfsutill(int current,boolean[]visited) {
		visited[current]=true;
		System.out.println(current+" ");
		
		for(int neighbour:adjancenylist[current]) {
			if(!visited[neighbour]) {
				dfsutill(neighbour, visited);
			}
		}
		
	}

}
