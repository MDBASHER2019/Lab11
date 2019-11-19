package edu.cscc;

/**
 * autor@ MD BASHER
 * Date: 11/16/2019
 * ProjectName: CSCI-2467 Lab 11 – Refactor LinkedList Application to use Generics
 */

public class Main {// Main class...

    public static void main(String[] args) {// main method which is how java spit out the results...
        list1();
        list2();
    }


    /**
     * Using LinkedList with String...
     */
    public static void list1() {
       LinkedList <String> llist  = new LinkedList<String>();
        //LinkedList llist = new LinkedList();
        llist.addFirst("one");
        llist.addLast("two");
        llist.addLast("three");
        llist.addFirst("zero");
        llist.addLast("xxxx");
        llist.addFirst("yyyyy");
        llist.deleateLast();
        llist.deleteFirst();
        System.out.println(llist);
        llist.deleteFirst();
        llist.deleateLast();
        llist.deleteFirst();
        llist.deleateLast();
        System.out.println(llist);// To display the expected results...
    }


    /**
     * Using LinkedList with Integer...
     */
    public static void list2() {
        LinkedList <Integer> llist = new LinkedList<Integer>();
        //LinkedList llist = new LinkedList();
        llist.addFirst(1);
        llist.addLast(2);
        llist.addLast(3);
        llist.addFirst(0);
        llist.addLast(142);
        llist.addFirst(-97);
        llist.deleateLast();
        llist.deleteFirst();
        System.out.println(llist);
        llist.deleteFirst();
        llist.deleateLast();
        llist.deleteFirst();
        llist.deleateLast();
        System.out.println(llist); // To display the expected results...
    }
}
