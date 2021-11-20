//$Id$
package com.learn.ds.graph;

import java.util.LinkedList;

public class Graph {
	
	int vertices;
	LinkedList<Integer> adjList[];
	
	public Graph(int vertices) {
		this.vertices = vertices;
		adjList = new LinkedList[vertices];
		
		for(int i = 0; i < vertices; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source, int destination) {
		adjList[source].add(destination);
		adjList[destination].add(source);
	}
	
	public void displayGraph() {
		for(int i = 0; i < vertices; i++) {
			if(adjList[i].size() > 0) {
				System.out.println("Vertex " + i + " connected to : ");
				for(int j = 0; j < adjList[i].size(); j++) {
					System.out.print(adjList[i].get(j) + " ");
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		Graph graph = new Graph(3);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		
		graph.displayGraph();
	}
}
