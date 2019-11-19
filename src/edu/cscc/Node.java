package edu.cscc;

/**
 * autor@ MD BASHER
 * Date: 11/16/2019
 * ProjectName: CSCI-2467 Lab 11 – Refactor LinkedList Application to use Generics
 * SourceNotes:
 * Look at the linked articles and video to learn about linked lists.
 * Download the Lab11.zip starter file. Use 7zip to unzip the file using ‘Extract Here’. Open the project folder in IntelliJ.
 * The code consists of three files that implement and use a simple linked list.
 * The code was written in early Java style using the Object class in order to allow the linked list to be a list of objects of any type.
 * While the code works, it is not type safe. Refactor the code to use Java Generics.
 * You will need to change the Main class to create a linked list of Strings in the list1() method and a linked list of Integers in the list2() method.
 * You’ll then need to make appropriate modifications to the other two Java files so that they use Java Generics.
 * Do NOT use the built-in Java LinkedList class.
 */

/**
 *Generic Class...
 * @param <T> - takes parameter as the type of "T", i.e. any types...
 */

public class Node<T> {
//public class Node {
     private T content;
   // private Object content;
    private Node<T> next;
    //private Node next;

    /**
     * Generic constructor which has two parameters...
     * @param content - takes parameter as content
     * @param next - takes parameter as next
     */
     public Node (T content, Node<T> next) {
    //public Node(Object content, Node next) {
        this.content = content;
        //this.content = content;
        this.next = next;
        //this.next = next;
    }

    /**
     * Generic getter method...
     * @return - it returns content's value
     */
     public  T getContent() { return content;}
    //public Object getContent() {return content;}

    /**
     * Generic setter method...
     * @param content - it sets a value for content...
     */
     public void setContent( T content) {this.content = content;}
    //public void setContent(Object content) {this.content = content;}

    /**
     * Generic getter method...
     * @return - it has a return value as next
     */
    public Node<T> getNext() {return next;}
    //public Node getNext() {return next;}

    /**
     * Generic setter method...
     * @param next - it sets a value for next
     */
     public void setNext(Node<T> next) {this.next = next;}
    //public void setNext(Node next) {this.next = next; }
}
