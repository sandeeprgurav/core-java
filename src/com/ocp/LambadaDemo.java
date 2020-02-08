package com.ocp;

interface testI{
    void show();
}
public class LambadaDemo {
	public static void main(String[] args) {
        testI test ;
        /*test= new A();
        test.show();*/
        test = () ->System.out.println("Hello,how are you?"); //lambda 
        test.show();
    }        
}
