package com.tp.string;

/*
 * In this part we will see few important methods of String class in details
 */

public class Part4_StringMethods {
	public static void main(String[] args) {
		String str1 = "Welcome to TechPassel!";
		String str2 = "Thanks for joing us.";
		String str3 = "Wish you a very successful career ahead.";
		
		//Method 1 :- int length();
		System.out.println(str1.length());
		//Note that in String, length is a method so we need to add parenthesis to call it while in Array, length is a property, so we don't need parenthesis, and even adding parenthesis can lead to error.
		String[] strArray = {"one", "two", "three"};
		System.out.println(strArray.length);
		
		//Method 2 :- char charAt(int index);
		char c = str1.charAt(5);
		System.out.println(c);
		
		//Method 3 :- String substring (int startIndex, int endIndex) -> Returns the substring from startIndex (inclusive) to endIndex (exclusive)
		//Here 'endIndex' is optional.i.e we can use it as "String substring (int startIndex)" also. If we don't provide endIndex, it will consider elements to the end.
		System.out.println(str2.substring(4));
		System.out.println(str2.substring(4, 10));
		
		//Method 4 :- String concat( String str) -> Concatenates specified string to the end of first string.
		String newString = str1.concat(str2);
		System.out.println(newString);
		
		//Method 5 :- int indexOf (String subString) -> Returns the index of the first occurrence of the specified substring within the string.
		System.out.println(str3.indexOf("very"));
		//It has an overload also as follows : int indexOf (String subString, int startIndex) ->  This method is also same as previous one, 
		//the only difference is in this overload it will not start searching from the beginning, but it will start searching from the specified index.However index counting of the found substring will start from beginning as 0.
		System.out.println(str3.indexOf("s"));
		System.out.println(str3.indexOf("s", 5));
		
		//Method 6 :- int lastIndexOf (String subString) -> Returns the index of the last occurrence of the specified substring within the string.
		//So it is also similar to previous one but the only difference is it checks for last occurrence instead of first occurrence.
		//Like indexOf method it also has an overload as follows : int lastIndexOf (String subString, int endIndex) -> This method is also same as previous one, 
		//the only difference is in this overload it will not start searching from the last, but it will start searching before the specified index. However index counting of the found substring will start from beginning as 0.
		System.out.println(str3.lastIndexOf("s"));
		System.out.println(str3.lastIndexOf("s", 15));
		
		//Method 7 :- String toLowerCase() -> Converts all the characters in the String to lower case.
		System.out.println(str1.toLowerCase());
		
		//Method 8 :- String toUpperCase(): Converts all the characters in the String to upper case.
		System.out.println(str1.toUpperCase());
		
		//Method 9 :- String trim() -> Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.
		String helloStr = "   Hello World!   ";
		System.out.println("Before trimming ---"+helloStr+"---");
		System.out.println("After trimming ---"+helloStr.trim()+"---");
		
		//Method 10 :- String replace(char oldChar, char newChar): Returns new string by replacing all occurrences of oldChar with newChar.
		//We can also use this method to replace a sub-string with some other sub-string as follows
		String replacedStr1 = str1.replace("TechPassel","My World");
		System.out.println(replacedStr1);
	}
}
