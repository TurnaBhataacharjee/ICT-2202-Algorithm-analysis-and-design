package bfs.traversal;

import java.util.LinkedList;
import java.util.Queue;

public class graph {
	
	@SuppressWarnings("unused")
	private int vertices;
	private LinkedList<Integer>[]adjacencylist;
	
	@SuppressWarnings("unchecked")
	graph(int vertices){
		this.vertices=vertices;
		this.adjacencylist=new LinkedList[vertices];
		
		for(int i=0;i<vertices;i++) {
			adjacencylist[i]=new LinkedList<Integer>();
		}
	}
	
	
	void addedge(int from,int to) {
		adjacencylist[from].add(to);
		adjacencylist[to].add(from);
	}
	
	void bfs(int start) {
		
		boolean []visited=new boolean[vertices];
		Queue<Integer>q=new LinkedList<Integer>();
		
		visited[start]=true;
		q.add(start);
		
		while(!q.isEmpty()) {
			
			int current=q.poll();
			System.out.print(current+" ");
			
			for(int neighbour:adjacencylist[current]) {
				if(!visited[neighbour]) {
					visited[neighbour]=true;
					q.add(neighbour);
				}
			}
		}
	}
	
	
	

}
