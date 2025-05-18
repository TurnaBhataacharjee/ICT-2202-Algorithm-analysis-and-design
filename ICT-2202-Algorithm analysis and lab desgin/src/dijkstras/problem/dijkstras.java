package dijkstras.problem;

public class dijkstras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graph[][]
				=new int[][] { {0,4,5,0,0,0},
							{4,0,11,9,7,0},
							{5,11,0,0,3,0},
							{0,9,0,0,13,2},
							{0,7,3,13,0,6},
							{0,0,0,2,6,0} };
							
							
			shortestpath t=new shortestpath();
			t.dijkstra(graph, 0);
		

	}

}
