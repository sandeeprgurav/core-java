package com.innerClass;

public class AnnonymousInnerClassUsingInterface {
	//Hello here is Interface
	static Hello d = new Hello() {
		public void show() {			
			System.out.println("i am in AnnonymousInnerClassUsingInterface class");
		}
	};

	public static void main(String[] args) {
		d.show();
	}
}

interface Hello { 
    void show(); 
} 
