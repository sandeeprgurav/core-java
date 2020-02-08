package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class AllCollections  {
	
	public static void main(String[] args) {
		System.out.println("/**--------------------------List-----------------------------------**/");
		String[] words = {"one", "two", "three", "one"};
		//Use Arrays utility class
		List<String> wordList = Arrays.asList(words);
		System.out.println("//List maintain insertion order, not sorted by default, accept duplicate values.");
		System.out.println("//slower when to insert and remove values compare to LinkedList");
		System.out.println("WordList = "+wordList.toString());
				
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("one");
		
		System.out.println("ArrayList = "+list.toString());		
		Collections.reverse(list);
		System.out.println("Reversed ArrayList = "+list);
		Collections.sort(list);
		System.out.println("Sorted ArrayList = "+list);
		Collections.synchronizedList(list);
		System.out.println("synchronizedList ArrayList = "+list);
		Collections.unmodifiableCollection(list);
		System.out.println("UnmodifiableCollection ArrayList = "+list);
		
				
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("one");
		linkedList.add("two");
		linkedList.add("three");
		linkedList.add("one");
		
		
		System.out.println("//LinkedList store elements within a doubly-linked list data structure. ArrayList store elements within a dynamically resizing array.");
		System.out.println("//LinkedList allows for constant-time insertions or removals, but only sequential access of elements.");
		System.out.println("Linked List = "+linkedList.toString());
		
		System.out.println("Linked List previous linking= "+linkedList.listIterator().hasPrevious());
		ListIterator<String> listIterator = linkedList.listIterator();
		while(listIterator.hasNext()) {
			String value =listIterator.next(); 
			if("two".equalsIgnoreCase(value)) {
				listIterator.remove();
				listIterator.add("six");
			}
		}
		
		System.out.println("Linked List After Add and Remove using ListIterator = "+listIterator.toString());
		
		CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
		copyOnWriteArrayList.add("one");
		copyOnWriteArrayList.add("two");
		copyOnWriteArrayList.add("three");
		copyOnWriteArrayList.add("one");
		System.out.println("//copyOnWriteArrayList works on fail safe concept due to this it allwas to add and insert while traverse");
		System.out.println("CopyOnWriteArrayList = "+copyOnWriteArrayList.toString());
		
		for(String value : copyOnWriteArrayList) {
			if("three".equalsIgnoreCase(value)) {
				copyOnWriteArrayList.remove(value);
				copyOnWriteArrayList.add("Ten");
			}
		}
		
		System.out.println("CopyOnWriteArrayList After Remove and Add Operation(Fail-safe iterators)= "+copyOnWriteArrayList.toString());
		
		
		System.out.println("/**--------------------------Set-----------------------------------**/");		

		Set<String> set = new HashSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		System.out.println("//HashSet doesn't allow duplicate values. Works on Hash mechanism");
		System.out.println("HashSet = "+set.toString());
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("one");
		treeSet.add("two");
		treeSet.add("three");
		treeSet.add("one");
		System.out.println("//TreeSet doesn't allow duplicate values. Sorted based on values by default");
		System.out.println("treeSet = "+treeSet.toString()); 
				
		
		System.out.println("/**--------------------------Map-----------------------------------**/");
		
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("one","oneValue");
		hashMap.put("two","twoValue");
		hashMap.put("three","threeValue");
		hashMap.put("one","oneValue");
		hashMap.put(null,"oneValue");
		System.out.println("//HasMap store key-value pairs. Allow one null value. No sorting maintain insertion order.");
		System.out.println("hashMap = "+hashMap.toString());
		
		Map<String, String> identityHashMap = new IdentityHashMap<String, String>();
		identityHashMap.put("one","oneValue");
		identityHashMap.put("two","twoValue");
		identityHashMap.put("three","threeValue");
		identityHashMap.put("one","oneValue");
		identityHashMap.put(null,"oneValue");
		System.out.println("//IdentityHashMap is similar to HashMap except that it uses reference equality when comparing elements."); 
		System.out.println("identityHashMap  = "+identityHashMap.toString());
		
		Map<String, String> weakHashMap = new WeakHashMap<String, String>();
		weakHashMap.put("one","oneValue");
		weakHashMap.put("two","twoValue");
		weakHashMap.put("three","threeValue");
		weakHashMap.put("one","oneValue");
		weakHashMap.put(null,"oneValue");
		System.out.println("//WeakHashMap is an implementation of the Map interface that stores only weak references to its keys.");
		System.out.println("//Storing only weak references allows a key-value pair to be garbage collected when its key is no longer referenced outside of the WeakHashMap."); 
		System.out.println("weakHashMap  = "+weakHashMap.toString());
		
		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		linkedHashMap.put("one","oneValue");
		linkedHashMap.put("two","twoValue");
		linkedHashMap.put("three","threeValue");
		linkedHashMap.put("one","oneValue");
		linkedHashMap.put(null,"oneValue");
		System.out.println("//LinkedHashMap is a Hash table and linked list implementation of the Map interface, with predictable iteration order.");
		System.out.println("//It is same as HashMap with additional feature that it maintains insertion order."); 
		System.out.println("linkedHashMap  = "+linkedHashMap.toString());
		
		Map<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("one","oneValue");
		treeMap.put("two","twoValue");
		treeMap.put("three","threeValue");
		treeMap.put("one","oneValue");
		//treeMap.put(null,"oneValue"); //Not accepted null key
		System.out.println("//TreeMap doesn't allow duplicate values and null key. Sort Map based on the key of map");
		System.out.println("TreeMap sorted values= "+treeMap.toString());
		
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		hashTable.put("one","oneValue");
		hashTable.put("two","twoValue");
		hashTable.put("three","threeValue");
		hashTable.put("one","oneValue");
		//hashTable.put(null,"oneValue"); //Not accepted null key
		System.out.println("//TreeMap doesn't allow duplicate values and null key. Sort Map based on the key of map");
		System.out.println("Hashtable = "+hashTable.toString());
		
		Map<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
		concurrentHashMap.put("one","oneValue");
		concurrentHashMap.put("two","twoValue");
		concurrentHashMap.put("three","threeValue");
		concurrentHashMap.put("one","oneValue");
		//concurrentHashMap.put(null,"oneValue"); //Not accepted null key
		System.out.println("//ConcurrentHashMap works on fail safe concept due to this it allwas to add and insert while traverse. Doent not allow null key.");
		System.out.println("concurrentHashMap = "+concurrentHashMap.toString());
		
		Set<String> keySet = concurrentHashMap.keySet();
		for(String key: keySet) {
			if("two".equalsIgnoreCase(key)) {
				concurrentHashMap.remove(key);
				concurrentHashMap.put("ten","tenValue");
			}
		}		
		System.out.println("concurrentHashMap After Remove and Add Operations= "+concurrentHashMap.toString());
		
		System.out.println("/**--------------------------Queue-----------------------------------**/");
		System.out.println("//The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue. ");
		System.out.println("//It follows FIFO concept.");
		Queue<Integer> queue = new LinkedList<>(); 
		  
		// Adds elements {0, 1, 2, 3, 4} to queue" 
	    for (int i=0; i<5; i++) 
	     queue.add(i); 
	  
	    // Display contents of the queue. 
	    System.out.println("Elements of queue-"+queue); 
	  
	    // To remove the head of queue. 
	    int removedele = queue.remove(); 
	    System.out.println("removed element-" + removedele); 
	  
	    System.out.println(queue); 
	  
	    // To view the head of queue 
	    int head = queue.peek(); 
	    System.out.println("head of queue-" + head); 
	  
	    // Rest all methods of collection interface,Like size and contains can be used with this implementation. 
	    int size = queue.size(); 
	    System.out.println("Size of queue-" + size); 
		
	    PriorityQueue<String> pQueue = new PriorityQueue<String>(); 

		// Adding items to the pQueue using add() 
		pQueue.add("C"); 
		pQueue.add("C++"); 
		pQueue.add("Java"); 
		pQueue.add("Python");
		System.out.println("//PriorityQueue doesn’t permit null.");
		System.out.println("//We can’t create PriorityQueue of Objects that are non-comparable");
		System.out.println("Priority Queue:"+ pQueue.toString());
		
		System.out.println("Head value using peek function:"+ pQueue.peek());
		pQueue.remove("Java"); 
        System.out.println("after removing Java with remove function:"+pQueue.toString());        
        System.out.println ( "Priority queue contains C or not?: " + pQueue.contains("C"));
        
        System.out.println("/**--------------------------Stack-----------------------------------**/");
        System.out.println("//The class is based on the basic principle of last-in-first-out.");
        System.out.println("//The class can also be said to extend Vector");
        Stack<String> stack = new Stack<>();
        stack.add("one");
        stack.add("two");
        stack.add("three");
        stack.add("one");
        System.out.println("Stack : "+stack.toString());
        stack.push("five");
        System.out.println("Stack after pusing item: "+stack.toString());        
        System.out.println("Stack capacity: "+stack.capacity());
        System.out.println("Stack is empty? : "+stack.empty());
        System.out.println("Stack search element 'two' at position? : "+stack.search("two"));
        System.out.println("Stack peek element? : "+stack.peek());        
	}	
}
