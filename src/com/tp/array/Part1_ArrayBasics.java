package com.tp.array;

/*
 * An array is an indexed and ordered collection of similar type of elements which has contiguous memory location.
 * Every array in Java has a fixed length i.e we can store only a fixed set of elements in a Java array.
 * Array in Java is index-based and ordered, the first element of the array is stored at the 0th index, 2nd element at 1st index and so on.
 * However arrays in Java is used to store data i.e it works as data-structure but it is not based on any defined data-structure. 
 * Hence readymade method support of data-structures(like add(), remove(), size() etc. methods) are not available in Java Arrays.  
 * A Java array variable can be declared like other variables with [] after the data type or variable name. 
 * For example 'int[] x' or 'int x[]', 'String[] str' or 'String str[]', 'Student[] stud' or 'Student stud[]' etc.
 * In Java, array is an object of a dynamically generated class. Java array inherits the Object class, and implements the Serializable as well as Cloneable interfaces. 
 * We can store primitive values(i.e value types) or objects(i.e reference types) in an array in Java based on the declared type of the array.
 * In Java array size datatype is 'int' and hence to specify array size, allowed data-types are byte, short, char and int i.e which can be automatically converted into 'int'(using the concept of Widening primitive conversion).
 * If we try to use any other type(like long or double) then we will get compile time error.
 * In case of array of primitive data types, the actual values are stored in contiguous memory locations allocated to the array.
 * While in case of array of objects, the actual objects are stored in heap area and only the reference of those objects are stored in contiguous memory locations allocated to the array.
 * In java, since arrays are also objects so we can contain an array also as element in some other array.
 * So in Java we can have any level of nested arrays(i.e arrays within an array).Such arrays are known as multi-dimensional arrays.  
 * In this part we will see details about one dimensional array. In next parts we will see how to create and use multidimentional arrays.
 */

class Student{
	String name;
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student name : "+name;
	}
}

public class Part1_ArrayBasics {
	public static void main(String[] args) {
		//Array declaration :-
		int[] intArray;
		char charArray[];
		boolean boolArray[];
		String[] stringArray;
		Student studentArray[];
		//However both methods (i.e "type[] var-name;" and "type var-name[];") for declaration of array is valid in java but we should prefer to use first one.
		//It is standard method being followed extensively in Java community and even using second one can create confusion in some cases of multi-dimensional arrays.
		
		//Array initialization (or creation) :-	
		//Above declaration merely tells the compiler that these variable will hold an array of given type. 
		//For example first declaration will only tell the compiler that 'intArray' will hold an array of integers.
		//To link above declared array variables with an actual, physical array, you must create an instance of given type array using new operator and assign it to the declared variable as follows.
		//But please keep in mind that while creating instance of actual array, you must specify the array size also as every array in java is of fixed size and that can't be changed once array is created.
		//We can specity the array size in short or int type value but not in long type value, inside "[]" block while creating instance of actual array.     
		intArray = new int[5];
		charArray = new char[8];
		boolArray = new boolean[3];
		stringArray = new String[5];
		studentArray = new Student[6];
		//The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types or objects)
		//We will verify it after learning how to access java array elements.
		
		//Array declaration and initialization in a single line :-
		//In above examples examples first we have declared an array and then we have initialized it using new ketword.
		//But we can perform these activities in a single line also as follows.
		int[] intArray2 = new int[5];
		Student[] studentArray2 = new Student[6];
		
		//Accessing and setting Java array elements :-
		//Since java array is index-based and ordered and every element of Java array has a unique index like first element has index 0, second has index 1 and so on.
		//So we can use these index to access an element of the array.
		//For example :-		
		System.out.println(intArray[0]);		//will return element present at index 0(i.e 1st position) of intArray
		System.out.println(boolArray[1]);		//will return element present at index 1(i.e 2nd position) of boolArray
		System.out.println(studentArray[5]);	//will return element present at index 5(i.e 6th position) of studentArray
		
		//Note :- Above code will print 0, false, and null in the console respectively.It is because we have not set the value on above arrays yet.They are initialized by the JVM.
		//And as we have learned earlier an array is initialized to zero (for numeric types), false (for boolean), or null (for reference types or objects).This is proved from here.
		//Now let's see how we can set the value of an array using index.
		intArray[0] = 1536;
		boolArray[1] = true;
		studentArray[5] = new Student("Aman");
		System.out.println(intArray[0]);
		System.out.println(boolArray[1]);
		System.out.println(studentArray[5]);
		//But please note that if we try to access or set value for a index which is out of range for given array then it will throw ArrayIndexOutOfBoundsException.
		//For example following code will throw ArrayIndexOutOfBoundsException and hence commented.
		//System.out.println(intArray[5]);				//since intArray length is 5, so valid index range is 0-4.
		//System.out.println(intArray[-1]);				//since index starts from 0 and increases in incresing order so can't be negative.  
		//boolArray[7] = true;							//since boolArray length is 3, so valid index range is 0-2
		//studentArray[6] = new Student("Saurabh");		//since studentArray length is 6, so valid index range is 0-5
		
		//Array literals :-
		//In a situation, where elements of array are known beforehand, array literals can be used to declare and set array.
		//While using array literals we don't need to define the length of the array.In such situations array length is determined based on the elements inserted in the array while creating the array.
		int[] intArray3 = new int[] {20, 1, 15};
		Student[] studentArray3 = new Student[] {new Student("Mohan"), new Student("Sohan")};
		
		//In latest versions of Java, even we don't need 'new' operator to create an array using Array literals.we can create simply as follows:
		char[] charArray3 = {'a', 'c', 'e', 'g'};
		long[] longArray3 = {12, 65, 153, 89};
		String[] stringArray3 = {"One", "two", "Three"};
		
		//As we have learned every array is an object of dynamically created class and they are direct child class of Object class.We will verify it now.
		System.out.println(charArray3.getClass().getName());
		System.out.println(longArray3.getClass().getName());
		//It prints class name as "[C" , "[J" which is the name of dynamically created class.
		
		System.out.println(stringArray3.getClass().getSuperclass().getName());
		//It prints parent class name as java.lang.Object which verifies that array's dynamically created classes are direct child class of Object class. 
		
	}
}
