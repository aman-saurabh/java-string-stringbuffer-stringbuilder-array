package com.tp.array;

/*
 * Jagged arrays are special cases of multidimensional arrays.
 * A jagged array is an array of arrays such that member arrays can be of different sizes, 
 * i.e., we can create a 2-D array but with a variable number of columns in each row.
 * Let's see few examples of Jagged arrays 
 */

public class Part4_JaggedArray {
	public static void main(String[] args) {
		//Jagged array using array literal
		int[][] x = {{1,2}, {3,4,5}, {6,7,8,9}};	
		System.out.println(x[0].length);
		System.out.println(x[1].length);
		System.out.println(x[2].length);
		
		//Jagged array initialization with fixed top level array size.
		int[][] y = new int[3][];
		y[0] = new int[2];
		y[1] = new int[3];
		y[2] = new int[4];
		y[0][0] = 1;
		y[0][1] = 2;
		y[1][0] = 3;
		y[1][1] = 4;
		y[1][2] = 5;
		y[2][0] = 6;
		y[2][1] = 7;
		y[2][2] = 8;
		y[2][3] = 9;
		//Runnin loop on Jagged array
		for(int[] a: y) {
			for(int b: a) {
				System.out.println("Number : "+b);
			}
		}
	}
}
