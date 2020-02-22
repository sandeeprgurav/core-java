package com.ocp.interface10;

//final interface Finder {  final is invalid keyword for interface
interface Finder {
	default long find() {
		return 20;
	}
}

abstract class Wanda {
	abstract long find();
}

final class Waldo extends Wanda implements Finder {
	//long find() {  scope was reduced from public to default  
	public long find() {  
		return 40;
	}

	public static final void main(String[] pictures) {
		final Finder f = new Waldo();
		System.out.print(f.find());
	}
}
