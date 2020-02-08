package com.collections;

public class StudentList {
	private Node h;

	public StudentList() {
		h = new Node();
		h.next = null;
		h.data = null;
	}

	public boolean insert(Student std) {
		Node n = new Node();
		n.data = std;
		n.next = h.next;
		h.next = n;
		return true;
	}

	public boolean haveRollNum(String rollNo) {
		Node a = h.next;
		boolean have = false;
		while (a != null) {
			if (rollNo.equals(a.data.getRollNum())) {
				have = true;
			}
			a = a.next;
		}
		return have;
	}

	public Student fetchData(String rollNo) {
		Student data = null;
		Node p = h.next;
		while (p != null) {
			if (p.data.getRollNum().equals(rollNo)) {
				data = p.data;
				break;
			}
			p = p.next;
		}
		return data;
	}

	public void deleteStudent(String rollNo) {
		Node p = h;
		Node q = h.next;
		while (q != null && !(q.data.getRollNum().equals(rollNo))) {
			p = q;
			q = q.next;
		}
		if (q != null) {
			p.next = q.next;
		} else {
			// print data not found
		}
	}

	public void showAll() {
		Node x = h.next;
		while (x != null) {
			System.out.println(x.data);
			x = x.next;
		}
	}

	class Node {
		private Student data;
		private Node next;
	}
}
