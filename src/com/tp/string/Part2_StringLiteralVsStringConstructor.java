package com.tp.string;

/*
 * Inside JVM Heap area there is a special reserved area known as 'String pooled area'.
 * When we create a String using String literal, it internally calls intern() method of String class.
 * This first checks if the given string is already present inside the 'String pooled area'.If string is already present then it simply returns the reference of that existing string object and thus no new String object is created
 * And if the string is not present inside 'String pooled area' then a new String constant object will be created in String pooled area. As it is a constant, we can’t modify it, and that's the reason String class is immutable.
 * But when we create a String object using String constructor, a new String constant object is created directly in the heap area (here not talking about inside String pooled area) irrespective of whether it is already present or not.
 * And also with same value, a String constant object is created in String pooled area if it is not already present, but the variable will point to String object in heap area only.
 * As in case of strings created with constructors everytime a new object is created hence performance wise it is not at par with string literal. 
 * We will verify it in next part that what happens when we create two strings with same value using String literal and String constructor and we will see whether they both point to same object or not.
 * In this section let's see how assignment and reassignment works in strings created with String literal and String constructors 
 * and we will also see the difference in performance in creating Strings using String literal and String constructor.   
 */

public class Part2_StringLiteralVsStringConstructor {
	
	
	public static void main(String[] args) {
		//Part1 :- how assignment and reassignment works in strings created with String literal and String constructors.
		//Suppose now there is no String object in main heap area as well as in string pooled area. 
		String strLiteral = "First String using literal";
		//Now a new string constant object will be created inside string pooled area with given value and the variable 'strLiteral' will point to that constant.
		strLiteral = "Second String using literal";
		//Since String objects are immutable so previous string constant object will not be modified 
		//instead a new string constant object will be created inside string pooled area with given value and the variable 'strLiteral' will point to that new string constant now.
		//So now there should be two string constant objects in the string pooled area.
		strLiteral = "First String using literal";
		//Now since the given string is already present in the string pooled area so no new string constant will be created and it will only move the reference of 'strLiteral' variable from second string constant to the first constant.
		//So after this operation there will be no string object in the main heap area, 2 string objects in the string pooled area and 'strLiteral' variable is pointing to first string constant.
		String strLiteral2 = "First String using literal";
		//Now also there will be no string object in the main heap area, 2 string objects in the string pooled area and 'strLiteral' as well as 'strLiteral2' variable is pointing to first string constant.
		
		//Now let's do similar activity for string created with string constructor.
		//Again suppose now there is no String object in main heap area as well as in string pooled area.
		String strConstructor = new String("First String using constructor");
		//Now a new string constant object will be created inside main heap area as well as string pooled area with given value and the variable 'strConstructor' will point to that constant.
		strConstructor = "Second String using constructor";
		//Since String objects are immutable so previous string constant object will not be modified neither in the main heap area nor in the string pooled area 
		//instead a new string constant object will be created inside string pooled area with given value and not inside the main heap area.It is because we are not using constructor for reassignment in this case.Actually its string literal.
		//And now the variable 'strLiteral' will point to that new string constant created inside string pooled area.
		//So now there should be two string constant objects in the string pooled area and one string constant object in the main heap area.
		strConstructor = "First String using constructor";
		//Now again, since it is the case of string literal and not string constructor and the given string is already present in the string pooled area 
		//so no new string constant will be created anywhere and it will only move the reference of 'strConstructor' variable from second string constant of string pooled area to the first constant.
		//So after this operation there will be one string object in the main heap area, 2 string objects in the string pooled area and 'strConstructor' variable is pointing to first string constant of the string pooled area.
		String strConstructor2 = new String("First String using constructor");
		//Now again a new string constant object will be created inside main heap area with given value but no new constant will be created in the string pooled area as it is already present 
		//and the variable 'strConstructor2' will point to that new constant of main heap area.
		//So at this point there will be two string constant object in the main heap area with value "First String using constructor" for both and 2 string constant objects in the string pooled area with value "First String using constructor" and "Second String using constructor" respectively. 
		
		
		//Part 2 :- We will test which method performs better if we create multiple Strings with same value.
		// Initialization time for String literal
        long start1 = System.currentTimeMillis();
          
        for (int i = 0; i < 100000; i++)
        {
            String s1 = "This string is created using String literal";
        }
          
        long end1 = System.currentTimeMillis();
        long total_time = end1 - start1;
  
        System.out.println("Time taken to execute"+ 
                " string literal = " + total_time);
  
        // Initialization time for String object
        long start2 = System.currentTimeMillis();
          
        for (int i = 0; i < 100000; i++)
        {
            String s3 = new String("This string is created using String class constructor");
        }
          
        long end2 = System.currentTimeMillis();
        long total_time1 = end2 - start2;
  
        System.out.println("Time taken to execute"+
                   " string object = " + total_time1);
	}
}
