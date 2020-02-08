package com.string;

public final class ImmutableClass {
	final String name;
	final int regNo;

	public ImmutableClass(String name, int regNo) 
    { 
        this.name = name; 
        this.regNo = regNo; 
    }

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}
}
