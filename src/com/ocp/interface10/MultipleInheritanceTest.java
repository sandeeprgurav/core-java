package com.ocp.interface10;

interface CanWalk {
default void walk() { System.out.println("Walking"); }
public abstract void run();
 }
interface CanRun {
 public default void walk() { System.out.println("Walking"); }
 public abstract void run();
 }

public interface MultipleInheritanceTest extends CanWalk, CanRun {

	@Override
	default void walk() {		
		CanWalk.super.walk();
	}

}
