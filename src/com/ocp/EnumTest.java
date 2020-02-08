package com.ocp;

public class EnumTest {

	public enum AnimalClasses {

		MAMMAL(true), FISH(Boolean.FALSE), BIRD(false), REPTILE(false), AMPHIBIAN(false), INVERTEBRATE(false);
		// ; is mandatory line
		boolean hasHair;

		private AnimalClasses(boolean hasHair) { // private permitted not public access modifier
			this.hasHair = hasHair;
		}

		public boolean hasHair() {
			return hasHair;
		}

		public void giveWig() {
			hasHair = true;
		}
	}
}
