package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphUsingAdjList {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static List<List<Integer>> createGraph(int n, int m){
		
		List<List<Integer>> adjList = new ArrayList<>(n + 1);
		
		for(int i = 0; i <= n; i++) {
			adjList.add(new ArrayList<>());
		}
		
		for(int i= 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			adjList.get(u).add(v);
			adjList.get(v).add(u);
		}
		
		sc.close();
		
		return adjList;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number of nodes : ");
		int n = sc.nextInt();
		
		System.out.println("Enter no. of edges : ");
		int m = sc.nextInt();
		
		List<List<Integer>> ans =createGraph(n, m);
		
		System.out.println(ans);
	}

}
