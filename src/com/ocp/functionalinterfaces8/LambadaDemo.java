package com.ocp.functionalinterfaces8;

interface TestI{
    void show();
}
public class LambadaDemo {
	public static void main(String[] args) {
        TestI test ;
        /*test= new A();
        test.show();*/
        test = () ->System.out.println("Hello,how are you?"); //lambda 
        test.show();
    }        
}
