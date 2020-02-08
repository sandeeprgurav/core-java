package com.string;

final public class CustomString {
	    private char[] characters;
	   private int length;
	   private final int DEFAULT_SIZE = 5;

	   public CustomString() {
	       length = DEFAULT_SIZE;
	       characters = new char[length];
	   }

	   public CustomString(char ch) {
	       length = DEFAULT_SIZE;
	       characters = new char[length];
	       characters[0] = ch;
	   }

	   public CustomString(char ch[]) {
	       length = ch.length;
	       characters = new char[length];
	       for (int i = 0; i < length; i++)
	           characters[i] = ch[i];
	   }

	   /**
	   * Initializes a newly created MyString object so that it
	   * represents the same string as otherMyString.
	   * @param otherMyString
	   */
	   public CustomString(CustomString otherMyString) {
	       length = otherMyString.myLength();
	       characters = new char[length];
	       for (int i = 0; i < length; i++)
	           characters[i] = otherMyString.myCharAt(i);
	   }

	   /**
	   * Returns true if, and only if, object o is a MyString
	   * object representing the same string as this string
	   */
	   public boolean equals(Object o) {
	       CustomString other;
	       if (!(o instanceof CustomString))
	           return false;
	       else
	           other = (CustomString) o;

	       // if lengths are different no need to check characters
	       if (this.length != other.length)
	           return false;

	       int i = 0;
	       while (i < this.length) {
	           if (this.characters[i] != other.characters[i])
	               return false; // as soon as one char differs they are not the
	                               // same
	           i++;
	       }
	       return true; // same length and all same chars -- they are the same
	   }

	   /**
	   * Returns the char at location index, where the first character is at location 0,
	   * etc. Throws MyStringIndexOutOfBoundsException exception
	   * @param index
	   * @return
	   */
	   public char myCharAt(int index) {
	       // we may talk about exception handling later this semester
	       if ((index < 0) || (index >= characters.length))
	           throw new StringIndexOutOfBoundsException(index);
	       return characters[index];
	   }

	   /**
	   * Returns this MyString object if otherMyString is the empty string,
	   * and otherwise returns a new MyString
	   * which represents the concatenation of this string with the other
	   * string following it.
	   * @param otherMyString
	   * @return
	   */
	   public CustomString myConcat(CustomString otherMyString) {
	       // Calculate the length of the concatenation.
	       int length = this.characters.length + otherMyString.characters.length;

	       // Allocate the space for the new myString.
	       char[] temp = new char[length];

	       // Copy in all the current object characters.
	       for (int i = 0; i < this.characters.length; i++)
	           temp[i] = this.characters[i];

	       // Copy after that all the characters from str.
	       for (int i = 0; i < otherMyString.characters.length; i++)
	           temp[this.characters.length + i] = otherMyString.characters[i];

	       // Create the new myString and return it.
	       return new CustomString(temp);
	   }

	   /**
	   * Displays the sequence of char to the screen with an end-of-line at
	   * the end (do not add extra spaces between chars).
	   */
	   public void myLineDisplay() {
	       for (int i = 0; i < this.characters.length; i++){
	           if (characters[i] == '\n') {
	               break;
	           } else {
	               System.out.format("%c", characters[i]);
	           }
	       }
	       System.out.println("");
	   }

	   /**
	   * returns -1 if ch does not occur in this string, and otherwise
	   * returns the smallest location of ch in this string
	   * @param ch
	   * @return
	   */
	   public int myIndexOf(char ch) {
	       int fromIndex = 0;
	       if (fromIndex < 0)
	           fromIndex = 0;
	       else if (fromIndex >= length)
	           return -1;

	       for (int i = fromIndex; i < length; i++)
	           if (characters[i] == ch)
	               return i;
	       return -1;
	   }

	   /**
	   * Returns the length of this string.
	   * @return
	   */
	   public int myLength() {
	       return length;
	   }
	  
	   /**
	   * Sets the character at location index to the character ch
	   * @param index
	   * @param ch
	   */
	   public void setAt(int index, char ch){
	       if (index < 0)
	           throw new StringIndexOutOfBoundsException(index);
	       if (index > length)
	           throw new StringIndexOutOfBoundsException(index);
	       characters[index]=ch;
	   }

	   /**
	   * Returns a new MyString representing the substring of this string from
	   * location low up through location high - 1. If (low == high) returns the
	   * empty string. Throws MyStringIndexOutOfBoundsException exception
	   *
	   * @param low
	   * @param high
	   * @return
	   */
	   public CustomString mySubString(int low, int high) {
	       if (low < 0)
	           throw new StringIndexOutOfBoundsException(low);
	       if (high > length)
	           throw new StringIndexOutOfBoundsException(high);
	       if (low > high)
	           throw new StringIndexOutOfBoundsException(high - low);

	       CustomString result = new CustomString();
	       result.length = high - low + 1;
	       result.characters = new char[result.length];

	       for (int i = 0; i < result.length; i++)
	           result.characters[i] = this.characters[low + i];

	       return result;
	   }

	   /**
	   * Converts this MyString to a new character array. It should return a newly
	   * allocated character array whose length is the length of this MyString and
	   * whose contents are initialized to contain the character sequence
	   * represented by this MyString.
	   *
	   * @return
	   */
	   public char[] myToCharArray() {
	       return characters;
	   }

	   
	}