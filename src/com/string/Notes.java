package com.string;

public class Notes {
	/*
	 * https://www.journaldev.com/1321/java-string-interview-questions-and-answers
	 * 
	 * String is a Class in java and defined in java.lang package. It’s not a
	 * primitive data type like int and long.
	 * 
	 * String in immutable and final in Java and JVM uses String Pool to store all
	 * the String objects.
	 * 
	 * We can use intern() method to store the String object into String pool or
	 * return the reference if there is already a String with equal value present in
	 * the pool.
	 * 
	 * A String is said to be Palindrome if it’s value is same when reversed.
	 * Example "aba"
	 * 
	 * str.replaceAll(Character.toString('c'), "")
	 * 
	 * toUpperCase and toLowerCase
	 * 
	 * new String(byte[] arr) to convert byte array to String.
	 * 
	 * String getBytes() method to convert String to byte array
	 * 
	 * String in switch statement supported in Java 1.7
	 * 
	 * StringBuffer and StringBuilder are mutable classes. StringBuffer operations
	 * are thread-safe and synchronized.
	 * 
	 * Why String is immutable or final in Java There are several benefits of String
	 * because it’s immutable and final.
	 * 
	 * String Pool is possible because String is immutable in java. It increases
	 * security because any hacker can’t change its value and it’s used for storing
	 * sensitive information such as database username, password etc. Since String
	 * is immutable, it’s safe to use in multi-threading and we don’t need any
	 * synchronization. Strings are used in java classloader and immutability.
	 * 
	 * split(String regex) to split the String into String array based on the
	 * provided regular expression provides security that correct class is getting
	 * loaded by Classloader.
	 * 
	 * Why Char array is preferred over String for storing password? String is
	 * immutable in Java and stored in String pool. Once it’s created it stays in
	 * the pool until unless garbage collected, so even though we are done with
	 * password it’s available in memory for longer duration and there is no way to
	 * avoid it. It’s a security risk because anyone having access to memory dump
	 * can find the password as clear text. If we use a char array to store
	 * password, we can set it to blank once we are done with it. So we can control
	 * for how long it’s available in memory that avoids the security threat with
	 * String.
	 * 
	 * String s1 = "abc"; String s2 = "abc"; String s3= new String("abc");
	 * System.out.println("s1 == s2 ? "+(s1==s2)); //true
	 * System.out.println("s1 == s3 ? "+(s1==s3)); //false
	 * System.out.println("s1 equals s3 ? "+(s1.equals(s3))); //true
	 * 
	 * String Pool is a pool of Strings stored in Java heap memory.
	 * 
	 */
}
