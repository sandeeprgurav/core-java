package com.ocp.generics9;

import java.util.List;

class Roller<E extends Wheel> {
	public void roll(E e) {
	}
}

class Wheel {
}

class CartWheel extends Wheel {
}

public class RollingContest {
	Roller<CartWheel> wheel1 = new Roller<CartWheel>();
	//Roller<Wheel> wheel2 = new Roller<CartWheel>(); This will not compile
	Roller<? extends Wheel> wheel3 = new Roller<CartWheel>();
	Roller<? extends Wheel> wheel4 = new Roller<Wheel>();
	//Roller<? super Wheel> wheel5 = new Roller<CartWheel>(); This will not compile
	Roller<? super Wheel> wheel6 = new Roller<Wheel>();
}

//Ans: TWO 