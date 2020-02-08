package com.collections;

public class HashtableMain {
	public static void main(String[] args) {
       Hashtable hashtable = new Hashtable();
       Student std1 = new Student("Sandeep","1");
       Student std2 = new Student("Pranjali","2");
       Student std3 = new Student("Sachin","3");
       Student std4 = new Student("Pallavi","4");
       
       Student dupStd = new Student("Pallavi","4");
       
       hashtable.insert(std1);
       hashtable.insert(std2);
       hashtable.insert(std3);
       hashtable.insert(std4);
       
       //hashtable.showData();
              
       hashtable.insert(dupStd);
       //hashtable.showData();
       
       System.out.println(hashtable.fetchStdInfo("4"));
       
	}
}
