package com.ocp;

interface Toy { String play(); }
public class InheritanceTest5 {
   public static void main(String[] matrix) {
      abstract class Robot {}
      class Transformer extends Robot implements Toy {
         public String name = "GiantRobot";
         public String play() {return "DinosaurRobot";}
      }
      Transformer prime = new Transformer () {
         public String play() {return name;}  // y1
      };
      //System.out.print(prime.play()+" "+name); name is not accessible
   }
}

// Ans: Non of the above
