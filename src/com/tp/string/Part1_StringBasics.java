package com.tp.string;

/*
 * String is a sequence of characters. 
 * In java, objects of String are immutable which means they are constant and cannot be changed once created.
 * There are mainly two ways to create a string in Java
 * 1.) Using String literal. (Ex -> String str = "Hello World!";)
 * 2.) Using String Class constructor. (Ex -> String str = new String("hello World!");)
 * We will see the advantage of using one over other in the next part.Now let's see how to create String objects using String literals as well as String class constructors.
 * There are several constructors available for String class(You can check details in GeeksForGeeks) but few important one are.
 * new String(String originalString);
 * new String(byte[] b);
 * new String(char[] c);
 * new String(StringBuffer sbr);
 * new String(StringBuilder sbl);
 * Complete Syntax of String class:-
 * public final class String extends Object implements Serializable, Comparable<String>, CharSequence;
 */
public class Part1_StringBasics {
	public static void main(String[] args) {
		String str1 = new String("Hello World!");
		System.out.println(str1);
		
		byte[] b = {'a', 'b' , 'c'};
		String str2 = new String(b);
		System.out.println(str2);

		char[] c = {'a', 'b', 'c'};
		String str3 = new String(c);
		System.out.println(str3);
		//From the above example it might seem byte and char, both are same but actually they are not.
		//The main difference between a byte and char data type is that byte is used to store raw binary data while others(including char) are used to store characters or text data. 
		//You can store character literal into a char variable e.g. char a = 'a';
		//Another difference between byte and char in Java is that the size of the byte variable is 8 bit while the size of the char variable is 16 bit. 
		//One more difference between char and byte is that byte can represent negative values as well but char can only represent positive values.
		//It is bacause a byte variable can hold any value(i.e its range is) from -128 to 127 but a char variable can hold any value between 0 and 255 i.e byte is a signed data type whereas char is unsigned.

		StringBuffer sbr = new StringBuffer("String buffer object");
		String str4 = new String(sbr);
		System.out.println(str4);
		
		StringBuilder sbl = new StringBuilder("String builder object");
		String str5 = new String(sbl);
		System.out.println(str5);
	}
}
