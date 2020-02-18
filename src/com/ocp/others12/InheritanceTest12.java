package com.ocp.others12;

public class InheritanceTest12 {

	public static void main(String[] args) {
		int iVar = 100;
		float fVar = 100.100f;
		double dVar = 123;
		//iVar = fVar; 
		fVar = iVar;
		dVar = fVar;
		//fVar = dVar;
		dVar = iVar;
		//iVar = dVar;
	}

	// Ans:
}