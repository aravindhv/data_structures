//$Id$
package com.learn.pattern.basic;

public class OnesZeroesPattern {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(((i + j)%2) + " ");
			}
			System.out.println();
		}
	}
}
