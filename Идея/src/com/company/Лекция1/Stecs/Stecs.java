package com.company.Лекция1.Stecs;

public class Stecs {
    private Node first = null;
    int size = 0;

    private class Node {
        String item;
        Node next;
    }

    public void push(String item) {
        size++;
        Node oldFirst = first;
        first = new Node ();
        first.item = item;
        first.next = oldFirst;
    }

    public String pop () {
        size--;
        String item = first.item;
        first = first.next; //gc works here
        return item;
    }

    boolean isEmpty () {
        return first ==null;}
}
