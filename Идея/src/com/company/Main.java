package com.company;

import com.company.lec1.stecs.Stecs;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

   private static void StackOfStrings (Scanner in, PrintStream out) {
      Stecs stack = new Stecs ();
      while (in.hasNext() ) {
         String s = in.next ();
         if ((s.equals ("-"))) {
            out.print (stack.pop () + " ");
         } else {
            stack.push (s);
         }
      }
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      PrintStream out = System.out;
      StackOfStrings(in, out);
   }

}
