package com.tp.array;

/*
 * Sometimes we ight need an array to be used only once.For such requirements we can create an array without storing them in a variable.
 * Such nameless arrays are called anonymous arrays.Let's see with an example how to create and use nameless array.
 */

public class Part5_AnonymousArrays {
	public static int sum(int[] x) {
		int total = 0;
		for(int n : x) {
			total += n;
		}
		return total;
	}
	public static void main(String[] args) {
		int res = sum(new int[]{1,2,3,4,5});
		System.out.println("Sum : "+res);
		//Here we need array just to call the sum() method and we don't need it anywhere else.
		//So storing such array in some variable is not necessary.For such requirement we can use anonymous array.
		//Here one thing must be noted that in latest versions of Java we can declare and setvalue in an array variable without using 'new' operator also.
		//But that's not the case with anonymous arrays.In anonymous arrays we have to use new keyword. i.e following code is valid 
		int[] p = {12, 13, 14, 15};
		int q = sum(p);
		System.out.println(q);
		//But following code is not
		//sum({12, 13 ,14, 15});
		//We must use it as
		int m = sum(new int[] {12, 13, 14, 15});
		System.out.println(m);
	}
}
