package dijkstras.problem;

public class shortestpath {
	static final int V=6;
	public int mindist(int dist[],boolean spt[]) {
		int min=Integer.MAX_VALUE;
		int min_index=-1;
		for(int i=0;i<V;i++) {
			if(dist[i]<=min && spt[i]==false) {
				min=dist[i];
				min_index=i;
			}
		}
		
		return min_index;
	}
	void printdistance(int dist[]) {
		System.out.println("Vertex\t\tDistance from source");
		for(int i=0;i<V;i++) {
		System.out.println(i+"\t\t"+dist[i]);
		}
		
	}
	void dijkstra(int graph[][],int src) {
		
		
		int []dist=new int[V];
		boolean[]spt=new boolean[V];
		
		for(int i=0;i<V;i++) {
			dist[i]=Integer.MAX_VALUE;
			spt[i]=false;
		}
		dist[src]=0;
		for(int count=0;count<V-1;count++) {
			
			int u=mindist(dist, spt);
			spt[u]=true;
			
			for(int v=0;v<V;v++) {
				if(!spt[v] && graph[u][v]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u]+graph[u][v]<dist[v]) {
					dist[v]=dist[u]+graph[u][v];
					
				}
			}
			
			
		}
		printdistance(dist);
	}

	
}
