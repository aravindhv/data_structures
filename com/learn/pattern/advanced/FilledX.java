//$Id$
package com.learn.pattern.advanced;

public class FilledX {
	
	public static void main(String[] args) {
		approach1();
	}

	private static void approach1() {
		int rows = 7;
		int n = rows / 2;
//		upper half
		for(int i = 1; i <= n; i++) {
			
//			1st part
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
//			spaces
			int spaces = 2 * (n - i);
			for(int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}
//			2nd part
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		lower half
		for(int i = n; i >= 1; i--) {
			
//			1st part
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
//			spaces
			int spaces = 2 * (n - i);
			for(int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}
//			2nd part
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
