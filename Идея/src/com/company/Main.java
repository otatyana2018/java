package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static void StackOfStrings (Scanner in, PrintStream out) {
        StackOfStrings stack = new StackOfStrings ();
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
	// write your code here
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
    }
}
