package com.tp.array;

import java.text.MessageFormat;

/*
 * Generally we run two types of loops on array to access or set elements of an array.
 * 1.) for loop
 * 2.) forEach loop
 * But we can also run 'while' loop on it based on our requirement with some workaround.
 * In this part we will see how to run these loops on an array one by one. 
 */
public class Part2_LoopOnArray {
	public static void main(String[] args) {
		//First we are creating 3 arrays to run 3 types of loops.
		String[] fruits = {"Apple", "Banana", "Guava", "Pineapple", "Orange"};
		int[] nums = {7, 15, 29, 83, 95, 56, 121};
		//Here we are using same Student class whichwe defined in previous part(i.e part1)
		Student[] students = {
				new Student("Aman"),
				new Student("Pawan"),
				new Student("Mohan"),
				new Student("Pankaj"),
				new Student("Nitin")
		};
		//For loop
		for(int i =0; i< fruits.length; i++) {
			System.out.println(MessageFormat.format("Fruit at position {0} : {1}", i, fruits[i]));
		}
		
		//Foreach loop
		int count = 0;
		for(int n: nums) {
			System.out.println(MessageFormat.format("Number at position {0} : {1}",(count++), n ));
		}
		
		//While loop
		int studentCount = 0;
		while (studentCount < students.length) {
			System.out.println(MessageFormat.format("Student name at position {0} : {1}", (studentCount), students[studentCount++]));
		}
	}
}
