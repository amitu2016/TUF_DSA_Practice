package graph;

import java.util.*;

public class GraphUsingAdjMatrix {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int[][] createGraph(int n, int m){
		
		int[][] adjMatrix = new int[n + 1][n + 1];
		
		
		for(int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			adjMatrix[u][v] = 1;
			adjMatrix[v][u] = 1;
		}
		
		sc.close();
		return adjMatrix;
			
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter number of nodes : ");
		int n = sc.nextInt();
		
		System.out.println("Enter no. of edges : ");
		int m = sc.nextInt();
		
		int[][] ans = createGraph(n, m);
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < m; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
