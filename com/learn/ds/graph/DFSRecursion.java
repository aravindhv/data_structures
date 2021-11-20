//$Id$
package com.learn.ds.graph;

import java.util.LinkedList;
import java.util.Scanner;

public class DFSRecursion {
	
	static class Graph {
		int vertices;
		LinkedList<Integer> adjList[];
		boolean visited[];
		
		public Graph(int vertices) {
			this.vertices = vertices;
			adjList = new LinkedList[vertices];
			for(int i = 0; i < vertices; i++) {
				adjList[i] = new LinkedList<Integer>();
			}
		}
		
		public void addEdge(int source, int destination) {
			adjList[source].addFirst(destination);
		}
		
		void DFS(int startVertex) {
			visited = new boolean[vertices];
			dfsRecursion(startVertex);
		}

		private void dfsRecursion(int startVertex) {
			visited[startVertex] = true;
			System.out.print(startVertex + " ");
			for(int i = 0; i < adjList[startVertex].size(); i++) {
				int dest = adjList[startVertex].get(i);
				if(!visited[dest]) {
					dfsRecursion(dest);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No. of vertices ::");
		int vertices = scanner.nextInt();
		Graph graph = new Graph(vertices);
		for(int i = 0; i < vertices; i++) {
			System.out.println("Enter source and Destination::");
			int source = scanner.nextInt();
			int destination = scanner.nextInt();
			graph.addEdge(source, destination);
		}
		
		graph.DFS(0);
	}

}
