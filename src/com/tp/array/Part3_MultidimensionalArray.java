package com.tp.array;

/*
 * Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other array.
 * A multidimensional array is declared and created by appending one set of square brackets (i.e []) per dimension. Examples:
 * int[][] intArray = new int[10][20]; 			//A 2 dimensional array or matrix
 * int[][][] intArray = new int[10][20][10]; 	//A 3 dimensional array
 * As we have learned in part1 that a one dimensional array can be declared in formats "type[] array_name" as well as "type array_name[]".
 * Similarly a multidimensional array ca be created using above format as well as some other formats(discussed in main() method).
 * But as discussed in part1 also we should always use above format only.
 * We will learn other formats just for reference, since we should have knowledge of all possible formats.
 * But using those formats can create confusion(we will see it through example) and hence we should avoid using them.
 * Even the java community preferred way is also above one.   
 */

public class Part3_MultidimensionalArray {
	public static void main(String[] args) {
		// Declaration of 2 dimensional array.
		// Recommended way.
		int[][] x;
		// Other ways - valid but not recommended.
		int[][] x1;
		int x2[][];
		int[][] x3;
		int[] x4[];
		int[] x5[];
		
		//Initialization of 2D arrays :-
		x = new int[2][3];
		x1 = new int[2][3];
		x2 = new int[2][3];
		
		// We can declare two or more similar type of arrays together as follows :-
		int[] a, b;
		// Here a and b, both are one-dimensional arrays.we can use them as individual
		// arrays as follows:
		a = new int[4];
		b = new int[3];

		// Now let's see some conclusions based on this concpet
		int[] c[], d;
		// Here c is a 2D array(1D from int and 1D from self) while d is 1D(only from int).
		int[] e[], f[];
		// Here e and f both are 2D arrays(1D from int and 1D from each).
		int[][] g, h;
		// Here again g and h both are 2D arrays. In such case it seems like second [] symbol is attached to g but actually it is attached to int only.
		// And that's the reason why [] symbol is allowed before first element only.If you use [] symbol before any other element, then you will get compile time error.
		// i.e following code will throw error and hence commented.
		// int[] i, []j;
		// int[] k[], []l;
		int[][] m, n[];
		// Here k is 2D(both from int) while l is 3D(2D from int and 1D from self).
		int o[], p[];
		//Here o and p both are one dimensional(each 1D from self)
		
		//Declaration and initialization of 3 dimensional array
		//Recommended way
		String[][][] threeDArray1 = new String[7][2][3];
		//Other ways - valid but not recommended
		String [][][]threeDArray2 = new String[7][2][3];
		String[] [][]threeDArray3 = new String[7][2][3];
		String[][] []threeDArray4 = new String[7][2][3];
		String[][] threeDArray5[] = new String[7][2][3];
		String[] threeDArray6[][] = new String[7][2][3];
		String []threeDArray7[][] = new String[7][2][3];
		//and many more.
		
		//Accessing and setting multidimensional array.
		threeDArray1[2][1][0] = "Aman";
		threeDArray1[2][1][1] = "Saurabh";
		threeDArray1[2][1][2] = "Vivek";
		System.out.println(threeDArray1[2][1][0]);
		System.out.println(threeDArray1[2][1][1]);
		System.out.println(threeDArray1[2][1][2]);
		
		//Loop through a multidimensional array.
		for(int i=0; i< threeDArray1.length; i++) {
			//applying condition to display desired results only.Not necessary to run a loop on elements of a multidimensional array. 
			if(i == 2) {
				for(int j = 0; j < threeDArray1[i].length; j++) {
					if(j == 1) {
						for(int k=0; k< threeDArray1[i][j].length; k++) {
							System.out.println("Element : "+threeDArray1[i][j][k]);
						}
					}
				}
			}
		}
		
	}
}