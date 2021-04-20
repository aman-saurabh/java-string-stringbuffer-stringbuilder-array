package com.tp.string;

/*
 * In java there are basically 3 methods used for comparing two or more Strings.
 * "equals()" method: It compares values of the strings i.e it returns true if value of both strings are same and flase if they are not same.
 * "==" operator: It compares references of the strings and not their values i.e it returns true if and only of both strings are referring to same string constant objects.  
 * "compareTo()" method: It compares values of the strings lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
 * For example :- If str1 and str2 are two string variables then if 
 * str1 == str2 : return 0 
 * str1 > str2 : return a positive value 
 * str1 < str2 : return a negative value
 * Note: The positive and negative values returned by compareTo method is the difference of first unmatched character in the two strings.
 * let's see few examples of these methods and we will also verify two string with same value created using string literal, points(i.e refer) to the same object or not and we will check same for strings created with String class constructor also.
 * Apart from above mentioned 3 methods 2 more methods are used for String comparison name - equalsIgnoreCase() and compareToIgnoreCase().
 * Actually equalsIgnoreCase is similar to equals method and compareToIgnoreCase is similar to compareTo method.The only difference is in these methods(i.e equalsIgnoreCase() and compareToIgnoreCase()) case is ignored while in original methods case is considered for comparison.
 */

public class Part3_StringComparison {
	public static void main(String[] args) {
		String s1 = "Aman";
        String s2 = "Aman";
        String s3 = new String("Aman");
        String s4 = new String("Aman");
        String s5 = "Saurabh";
        String s6 = new String("Saurabh");
        String s7 = null;
        String s8 = null;
        String s9 = "aman";
 
        System.out.println("Comparing strings with equals method : ");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s3.equals(s6));
        //System.out.println(s7.equals(s8));
        //Will throw NullPointerException, hence commented
        
        System.out.println("Comparing strings with == operator : ");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s5);
        System.out.println(s3 == s6);
        System.out.println(s7 == s8);
        //Here we can see when we compare s1 with s2 it returns true, which verifies that in case of string literal all objects with same value points to the same object of string pooled area.
        //But when we compare s3 with s4 it returns false, which verifies that in case of string constructor, for two strings even with same value two seperate string objects are created in main thread area and those strings point to different objects.
        
        System.out.println("Comparing strings with compareTo method : ");
        System.out.println(s1.compareTo(s3)); 		//It return 0 as both have same value
        System.out.println(s1.compareTo(s5));		//It returns negative value since s1 first character is 'A'(ASCII value 65), while s5 first character is 'S'(ASCII value 83).So first string < second string and hence negative value.  
        System.out.println(s1.compareTo(s9));		//It returns negative value since s1 first character is 'A'(ASCII value 65), while s9 first character is 'a'(ASCII value 97).So first string < second string and hence negative value.
        //System.out.println(s7.compareTo(s8));
        //Will throw NullPointerException, hence commented
        
        System.out.println(s1.equalsIgnoreCase(s9));		//true, as case is ignored in this comparison
        System.out.println(s1.compareToIgnoreCase(s9));		//It returns 0, as case is ignored in this comparison
	}
}
