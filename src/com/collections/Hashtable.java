package com.collections;

import org.apache.log4j.varia.Roller;

public class Hashtable {

	private StudentList[] arr;
	private int size;
	private int totalStudents;

	public Hashtable() {
		this.size = 100;
		arr = new StudentList[size];
	}

	public int toHashCode(String rollNum) {
		int addAsciis = 0;
		int codeValue = 0;
		for (int i = 0; i < rollNum.length(); i++) {
			addAsciis = addAsciis + (int) rollNum.charAt(i);
		}
		codeValue = addAsciis % arr.length;
		return codeValue;
	}
	
	public boolean insert(Student data) {
		return insert(toHashCode(data.getRollNum()), data);
	}
	
	public boolean insert(int key, Student data) {
		if(arr[key] ==null) {
			arr[key] = new StudentList();			
		}
		arr[key].insert(data);
		totalStudents++;
		return true;
	}
	
	public int getTotal() {
		return totalStudents;
	}
	
	public Student fetchStdInfo(String rollNo) {
		int key = toHashCode(rollNo);
		if(arr[key] ==null) {
			return null;
		} else {
			Student std= arr[key].fetchData(rollNo);
			if(std!=null) {
				return std;				
			} else {
				return null;
			}
		}
	}
	
	public boolean deleteStd(String rollNo) {
		boolean have = arr[toHashCode(rollNo)].haveRollNum(rollNo);
		
		if(have) {
			int key = toHashCode(rollNo);
			arr[key].deleteStudent(rollNo);
			totalStudents--;
			return true;
		}
		
		return false;
	}
	
	public void showData() {
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=null) {
				System.out.println("Inside Block :"+i);
				arr[i].showAll();
			}
		}
	}		

}
