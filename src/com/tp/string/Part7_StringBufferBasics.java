package com.tp.string;

/*
 * Java StringBuffer class is used to create mutable (modifiable) string.It is a thread-safe, mutable sequence of characters. 
 * StringBuffer is like a String, but unlike String, it can be modified. At any point in time it contains some particular sequence of characters, but the length and content of the sequence can be changed through certain method calls.
 * And Unlike StringBuilder class, StringBuffer is thread-safe and synchronized. 
 * i.e StringBuffers are safe for use by multiple threads. The methods are synchronized where necessary so that all the operations on any particular instance behave as if they occur in some serial order that is consistent with the order of the method calls made by each of the individual threads involved.
 * Constructors of Java StringBuilder class:
 * 1.) StringBuffer(): Constructs a string buffer with no characters in it and an initial capacity of 16 characters.
 * 2.) StringBuffer(int capacity): Constructs a string buffer with no characters in it and an initial capacity specified by the capacity argument.
 * 3.) StringBuffer(CharSequence seq): Constructs a string buffer that contains the same characters as the specified CharSequence and capacity is also according to the given CharSequence.
 * 4.) StringBuffer(String str): Constructs a string buffer that contains the same characters as the specified String and capacity is also according to the given String.
 * Complete syntax of StringBuffer class :-
 * public final class StringBuffer extends Object implements Serializable, Appendable, Comparable<StringBuilder>, CharSequence;
 * #Note :- From Java 11 StringBuffer class implements Comparable but does not override equals() method. Thus, the natural ordering of StringBuffer is inconsistent with equals. Care should be exercised if StringBuffer objects are used as keys in a SortedMap or elements in a SortedSet.
 */

public class Part7_StringBufferBasics {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println("sb1 capacity : "+sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer(20);
		System.out.println("sb2 capacity : "+sb2.capacity());
		
		CharSequence cs = "AbcdefGhiJ";
		StringBuffer sb3 = new StringBuffer(cs);
		System.out.println("sb3 capacity : "+sb3.capacity());
		
		String str = "AbcdefGhiJ";
		StringBuffer sb4 = new StringBuffer(str);
		System.out.println("sb4 capacity : "+sb4.capacity());
		
		//Important methods of StringBuffer:
		//StringBuffer class has almost same methods as StringBuilder class.Her are few important methods which we have discussed in StringBuilder also.
		
		//Method1 :- StringBuffer append(X x) -> This method appends the string representation of the X type argument to the sequence
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

		//Method3 :- StringBuffer delete(int start, int end) -> This method removes the characters from the string.According to given start index and end index.
		sb1.delete(2, 9);
		System.out.println(sb1);

		//Method4 :- StringBuffer deleteCharAt(int index) -> This method removes the char at the specified position in this sequence.
		sb1.deleteCharAt(1);
		System.out.println(sb1);

		//Method5 : - void ensureCapacity(int minimumCapacity) -> This method ensures that the capacity is at least equal to the specified minimum.
		sb1.ensureCapacity(5);

		//Method6 :- StringBuffer replace(int start, int end, String str) -> This method replaces the characters within the given range of indexes with specified String.
		//Appending "Saurabh" just to add few more characters in sb1. 
		sb1.append("Saurabh");
		System.out.println(sb1);
		sb1.replace(1, 5, "Manish");
		System.out.println(sb1);

		//Method7 :- StringBuffer reverse() -> This method causes this character sequence to be replaced by the reverse of the sequence.
		sb1.reverse();
		System.out.println(sb1);

		//Method8 :- CharSequence subSequence(int start, int end) -> This method returns a new character sequence that is a subsequence of this sequence.
		CharSequence cseq = sb1.subSequence(1, 8);
		System.out.println(cseq);

		//Method9 :- String substring(int startIndex, int optionalEndIndex): This method returns a new String that contains a subsequence of characters currently contained in this character sequence.
		//Similar to String class substring method.But here in case of StringBuffer also it returns String only.
		String str1 = sb1.substring(1, 5);
		System.out.println(str1);

		//Method10 :- String toString() -> This method returns a string representing the data in this sequence.
		String str2 = sb1.toString();
		System.out.println(str2);

		//Note :- Apart from above mentioned methods.StringBuffer class also has methods like length(), indexOf(), lastIndexOf(), substring() etc. which works exactly same as String hence not discussed here again.
		//And one more method we have already learned while learning about StringBuffer class constructor is "capacity()" which tells the current capacity of the StringBuffer.

	}
}
