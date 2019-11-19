package edu.cscc;

/**
 * autor@ MD BASHER
 * Date: 11/16/2019
 * ProjectName: CSCI-2467 Lab 11 – Refactor LinkedList Application to use Generics
 */

/**
 * Generic Class: LinkedList...
 * @param <T> - it takes a value of any type of T...
 */
public class LinkedList<T> {
    private Node<T> head;
    public LinkedList() {
        head = null;
    }
     public void addFirst (T content) {
    //public void addFirst(Object content) {
        Node<T> ptr = head;
        head = new Node<T>( content,ptr); }
     public void addLast(T content) {
    //public void addLast(Object content) {
        Node<T> last = new Node<T>( content,null);
        if (head == null) {
            head = last;
        } else {
            Node<T> ptr = head;
            while(ptr.getNext() != null) {
                ptr =  ptr.getNext();
            }
            ptr.setNext(last);
        }
    }

    public boolean deleteFirst() {
        if (head == null) {
            return false;
        } else {
            head =  head.getNext();
            return true;
        }
    }

    /**
     * Generic method deleateLast() - has a boolean return value which is true or false...
     * @return - it returns a boolean value
     */

    public boolean deleateLast() {
        if (head == null) {
            return false;
        }
        else if (head.getNext() == null) {
            head = null;
            return true;
        } else {
            Node<T> ptr = head;
            while ((ptr.getNext().getNext() != null)) {
                ptr = (Node) ptr.getNext();
            }
            ptr.setNext(null);
            return true;
        }
    }

    /**
     * Getter method geHead() - has a return value of head...
     * @return - it returns head values
     */
    public Node getHead() {
        return head;
    }

    /**
     * toString() - method  returns the desired output...
     * @return it returns the value of str
     */

    public String toString() {
        String str;
        if (head == null) {
            str = "<empty>";
        } else {
            Node<T> ptr = head;
            str = "("+ptr.getContent().toString()+")";
            while(ptr.getNext() != null) {
                str = str + "->";
                ptr =  ptr.getNext();
                str = str + "(" + ptr.getContent().toString() + ")";
            }
        }
        return str;
    }
}
