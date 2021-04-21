package com.tp.string;

/*
 * The StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates an immutable sequence of characters, the StringBuilder class provides an alternative to String Class, as it creates a mutable sequence of characters. 
 * The function of StringBuilder is very much similar to the StringBuffer class, as both of them provide an alternative to String Class by making a mutable sequence of characters. However the StringBuilder class differs from the StringBuffer class on the basis of synchronization.
 * We will learn about their differences later, for now let's see how to create a StringBuilder and its important methods.
 * Constructors of Java StringBuilder class:  
 * 1.) StringBuilder(): Constructs a string builder with no characters in it and an initial capacity of 16 characters.
 * 2.) StringBuilder(int capacity): Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument.
 * 3.) StringBuilder(CharSequence seq): Constructs a string builder that contains the same characters as the specified CharSequence  and capacity as well according to the given CharSequence.
 * 4.) StringBuilder(String str): Constructs a string builder that contains the same characters as the specified String and capacity as well according to the given String.   
 * Complete syntax of StringBuilder class :-
 * public final class StringBuilder extends Object implements Serializable, Appendable, Comparable<StringBuilder>, CharSequence;
 * #Note :- From Java 11 StringBuffer class implements Comparable but does not override equals. Thus, the natural ordering of StringBuffer is inconsistent with equals() method. Care should be exercised if StringBuffer objects are used as keys in a SortedMap or elements in a SortedSet.
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
		//Implementation classes of CharSequence are - CharBuffer, String, StringBuffer, StringBuilder etc.
		
		//Few examples of how a create a CharSequence object.
		//CharSequence charSequence = "Aman";
		//CharSequence charSequence = new String("Aman");
		//CharSequence charSequence = new StringBuffer("Aman");
		//CharSequence charSequence = new StringBuilder("Aman");
		
		//Important methods of StringBuilder:
		//Method1A :- StringBuilder append(X x) -> This method appends the string representation of the X type argument to the sequence
		sb1.append("Aman");
		sb1.append(false);
		sb1.append(14.356);
		System.out.println(sb1);
		//Method1B :- StringBuilder	insert​(int offset, X x) -> Inserts the string representation of the X type argument into this sequence at the specified position(index).
		sb1.insert(4, "Mohit");
		sb1.insert(9, 12);
		sb1.insert(0, 'o');					//To insert at the beginning.
		sb1.insert(sb1.length(), true);		//To insert at the end.
		System.out.println(sb1);
		//Note :- 
		//1.) Both methods i.e append() and insert() are used to add text in the substring.The only difference is with append() method we append text at the end of the StringBuilder only but with insert() we can insert at any position.
		//2.) Both methods have several overloads, we have discussed only few here. 
		
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
		//And one more method we have already learned while learning about StringBuilder class constructor is "capacity()" which tells the current capacity of the StringBuilder.
	}
}
