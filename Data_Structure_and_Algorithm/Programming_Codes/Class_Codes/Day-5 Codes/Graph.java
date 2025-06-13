import java.util.*;

public class Graph {
	int g[][], visited[], v ;
	static Scanner sc = new Scanner(System.in);

	void createGraph(int nodes) {
		v = nodes;
		visited = new int[v];
		g = new int [v][v];
		for(int i = 0; i < v; i++) {
			for(int j = 0;j < v; j++) {
				System.out.println("Enter for v"+i+" v"+j+":");
				g[i][j] = sc.nextInt();
			}
		}
	}
	void print() {
		for(int i = 0; i < v; i++) {
			for(int j = 0; j < v; j++) {
				System.out.print(g[i][j] + " ");
			}
			System.out.println();
		}
	}
	void revisit() {
		for(int i = 0; i < v; i++) {
			visited[i] = 0;
		}
	}
	void DFS(int source) {
		 visited[source] = 1;
		 System.out.println("V" + source);
		 for(int i = 0; i < v; i++) {
			 if(g[source][i] == 1 && visited[i] != 1){
				 DFS(i);
			 }
		 }
	 }

	 void BFS(int source) {
		 int q[] = new int[v];
		 int front = 0;
		 int rear = -1;
		 visited[source] = 1;
		 q[++rear] = source;
		 while(front <= rear) {
			 int element = q[front++];
			 System.out.println("V" + element);
			 for(int i = 0; i < v; i++) {
				 if(g[element][i] == 1 && visited[i] != 1) {
					 visited[i] = 1;
					 q[++rear] = i;
				 }
			 }
		 }

	 }
	 public static void main(String[] args) {
		    Graph graph = new Graph();
		    System.out.println("Enter number of vertices:");
		    int nodes = sc.nextInt();
		    graph.createGraph(nodes);

		    System.out.println("Adjacency Matrix:");
		    graph.print();

		    System.out.println("DFS Traversal from 0:");
		    graph.revisit();
		    graph.DFS(0);

		    System.out.println("BFS Traversal from 0:");
		    graph.revisit();
		    graph.BFS(0);
		}

	}