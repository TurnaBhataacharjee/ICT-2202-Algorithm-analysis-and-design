package bfs.traversal;

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph g=new graph(5);
		g.addedge(0, 1);
		g.addedge(0, 2);
		g.addedge(1, 2);
		g.addedge(1, 3);
		g.addedge(2, 4);
		g.addedge(3, 4);
		
		System.out.println("BFS travsal starting from Node 0: ");
		g.bfs(0);
		
		

	}

}
