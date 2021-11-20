//$Id$
package com.learn.ds.graph;

import java.util.Scanner;

public class AdjacencyMatrixGraph {
	
	int vertices;
	int matrix[][];
	
	public AdjacencyMatrixGraph(int vertices) {
		this.vertices = vertices;
		matrix = new int[vertices][vertices];
	}
	
	public void addEdge(int source, int destination) {
		matrix[source][destination] = 1;
		matrix[destination][source] = 1;
	}
	
	public void printGraph() {
		for(int i = 0; i < vertices; i++) {
			for(int j = 0; j < vertices; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No. of vertices ::");
		int vertices = scanner.nextInt();
		AdjacencyMatrixGraph amg = new AdjacencyMatrixGraph(vertices);
		for(int i = 0; i < vertices; i++) {
			System.out.println("Enter source and destination for " + (i + 1) + " th vertex");
			int source = scanner.nextInt();
			int destination = scanner.nextInt();
			amg.addEdge(source, destination);
		}
		amg.printGraph();
	}
}
