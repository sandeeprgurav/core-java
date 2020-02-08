package com.generic.example3;

import java.util.ArrayList;
import java.util.List;

public class MumbaiCage extends Cage<Cat> {
    List<Cat> listCat= new ArrayList<Cat>();
	 
	@Override
	void addAnimal(Cat cat) {
		listCat.add(cat);		
	}
    //Unbound wildcard
	public void consumeListOfWildcardType(List<?> list) {
			
	}
	//Lower Bounded wildcard 
	public void consumeListOfAnimalType(List<? extends Animal> list) {
		
	}
	
	//Upper Bounded wildcard 
	public void consumeListOfSuperType(List<? super Animal> list) {
		
	}
}
