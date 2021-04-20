package com.tp.string;

/*
 * The StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates an immutable sequence of characters, the StringBuilder class provides an alternative to String Class, as it creates a mutable sequence of characters. 
 * The function of StringBuilder is very much similar to the StringBuffer class, as both of them provide an alternative to String Class by making a mutable sequence of characters. However the StringBuilder class differs from the StringBuffer class on the basis of synchronization.
 * We will learn about their differences later, for now let's see how to create a StringBuilder and its important methods.
 * Constructors in Java StringBuilder:  
 * 1.) StringBuilder(): Constructs a string builder with no characters in it and an initial capacity of 16 characters.
 * 2.) StringBuilder(int capacity): Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument.
 * 3.) StringBuilder(CharSequence seq): Constructs a string builder that contains the same characters as the specified CharSequence.
 * 4.) StringBuilder(String str): Constructs a string builder initialized to the contents of the specified string.   
 */
public class Part6_StringBuilderBasics {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1 capacity : "+sb1.capacity());
		
		StringBuilder sb2 = new StringBuilder(20);
		System.out.println("sb2 capacity : "+sb2.capacity());
		
		CharSequence cs = "AbcdefGhiJ";
		StringBuilder sb3 = new StringBuilder(cs);
		System.out.println("sb3 capacity : "+sb3.capacity());
		
		String str = "AbcdefGhiJ";
		StringBuilder sb4 = new StringBuilder(str);
		System.out.println("sb4 capacity : "+sb4.capacity());
		//Note :- 
		//CharSequence is an interface that represents a sequence of characters. Mutability is not enforced by this interface. Therefore, both mutable and immutable classes implement this interface.
		//Of course, an interface can't be instantiated directly; it needs an implementation to instantiate a variable:

		//Few examples of how a create a CharSequence object.
		//CharSequence charSequence = "baeldung";
		//CharSequence charSequence = new StringBuffer("baeldung");
		//CharSequence charSequence = new StringBuilder("baeldung");
		
		//Important methods of StringBuilder:
		//Method1 :- StringBuilder append(X x) -> This method appends the string representation of the X type argument to the sequence
		sb1.append("Aman");
		sb1.append(false);
		sb1.append(14.356);
		System.out.println(sb1);
		
		//Method2 :- char charAt(int index) -> This method returns the char value in this sequence at the specified index.
		System.out.println(sb1.charAt(3));
		
		//Method3 :- StringBuilder delete(int start, int end) -> This method removes the characters from the string.According to given start index and end index.
		sb1.delete(2, 9);
		System.out.println(sb1);
		
		//Method4 :- StringBuilder deleteCharAt(int index) -> This method removes the char at the specified position in this sequence.
		sb1.deleteCharAt(1);
		System.out.println(sb1);
		
		//Method5 : - void ensureCapacity(int minimumCapacity) -> This method ensures that the capacity is at least equal to the specified minimum.
		sb1.ensureCapacity(5);
		
		//Method6 :- StringBuilder replace(int start, int end, String str) -> This method replaces the characters within the given range of indexes with specified String.
		//Appending "Saurabh" just to add few more characters in sb1. 
		sb1.append("Saurabh");
		System.out.println(sb1);
		sb1.replace(1, 5, "Manish");
		System.out.println(sb1);
		
		//Method7 :- StringBuilder reverse() -> This method causes this character sequence to be replaced by the reverse of the sequence.
		sb1.reverse();
		System.out.println(sb1);
		
		//Method8 :- CharSequence subSequence(int start, int end) -> This method returns a new character sequence that is a subsequence of this sequence.
		CharSequence cseq = sb1.subSequence(1, 8);
		System.out.println(cseq);
		
		//Method9 :- String substring(int startIndex, int optionalEndIndex): This method returns a new String that contains a subsequence of characters currently contained in this character sequence.
		//Similar to String class substring method.But here in case of StringBuilder also it returns String only.
		String str1 = sb1.substring(1, 5);
		System.out.println(str1);
		
		//Method10 :- String toString() -> This method returns a string representing the data in this sequence.
		String str2 = sb1.toString();
		System.out.println(str2);
		
		//Note :- Apart from above mentioned methods.StringBuilder class also has methods like length(), indexOf(), lastIndexOf(), substring() etc. which works exactly same as String hence not discussed here again.
	}
}
