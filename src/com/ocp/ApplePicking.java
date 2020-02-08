package com.ocp;

interface Edible {
	void eat();
}

public class ApplePicking {
	public static void main(String[] food) {
        Edible apple = new Edible() {
           @Override
           public void eat() {  // can not reduce the visiblity need to specify public to override
              System.out.print("Yummy!");
          }
       };  // ; is needed else compile error will come
    }
}
//Ans : Two lines of this application fail to compile.

