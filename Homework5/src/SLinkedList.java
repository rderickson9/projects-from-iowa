
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rderickson9
 */
public class SLinkedList {

    public void editAtIndex(int index, int newElement) {
        if (index < 0 || index >= size) {
            return;
        } else {
            Node cur = head;
            while (index > 0) {
                cur = cur.next;
                index--;
            }
            cur.setElement(newElement);
        }
    }

    public static void main(String[] args) {
        Node test = new Node(5);
        test.setElement(5);

        SLinkedList myList = new SLinkedList();
        //SLinkedList myList2 = new SLinkedList();
        System.out.println(myList.contains(5));
        myList.addFirst(7);
        myList.addFirst(6);
        myList.addFirst(4);
        myList.addLast(2);
        myList.addLast(3);
        /*myList.addFirst(453);
        myList.addLast(32);
        myList.addLast(83);
        myList.addLast(43);
        myList.addLast(10);
        myList.addLast(9);*/
        //System.out.println(myList.contains(5));
        //myList.printList();
        //System.out.println(myList.indexOf(5));
        //System.out.println(myList.indexOf(23));
        //myList.removeFirst();
        myList.printList();
        //myList2.printList();
        ///SLinkedList A = concatenateLists(myList, myList2);
        ///A.printList();
        //myList.removeLast();
        //myList.removeOdds();
        //myList.printList();

        //myList.editAtIndex(3, 123);
        //myList.printList();
        //myList.size();
        //System.out.println(myList.size);
        //System.out.println(myList.size());
    }

    private Node head, tail, prevNode;

    public Node getprevNode() {
        return prevNode;
    }

    public void setprevNode(Node prevNode) {
        this.prevNode = prevNode;
    }
    private int size;

    public SLinkedList() {

    }

    public int size() {
        int value = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            value++;
        }

        return value;
    }

    public void addFirst(int element) {
        head = new Node(element, head);
        size++;
        if (size == 1) {
            tail = head;
        }
    }

    public void addLast(int element) {
        Node last = new Node(element);
        if (size == 0) {
            head = last;
            tail = last;
        } else {
            tail.setNext(last);
            tail = last;
        }
        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            return;
        }
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
    }

    public void removeLast() {
        if (size <= 1) {
            head = null;
            tail = null;
            size = 0;
        } else {
            Node cur = head;
            while (cur.next != tail) {
                cur = cur.next;
            }
            tail = cur;
            size--;
            tail.next = null;
        }
    }

    public void removeOdds() {

        if (size <= 1) {
            return;
        } else {
            while(head.getElement() % 2 !=0){
                this.removeFirst();
            }           
            Node cur = head;
            Node prevNode = cur;            
            while (cur.next != tail) {
                if (cur.getElement() % 2 != 0) {
                    size--;
                    prevNode.next = cur.next;
                    cur = cur.next;
                }else{
                prevNode = cur;
                cur = cur.next;
                }
                
                }
            while (tail.getElement() % 2 !=0){
                this.removeLast();
            }
        }
    }

    public static SLinkedList concatenateLists(SLinkedList A, SLinkedList B) {
        if (A.tail == null) {
            A.head = B.head;
        } else {
            A.tail.next = B.head;
            if (B.head != null) {
                A.tail = B.tail;
            }
        }
        return A;
    }

    public boolean contains(int key) {
        Node cur = head;
        while (cur != null && cur.getElement() != key) {
            cur = cur.next;
        }
        if (cur == null) {
            return false;
        }
        return true;
    }

    public int indexOf(int key) {
        Node cur = head;
        int index = 0;
        while (cur != null) {
            if (cur.getElement() == key) {
                return index;
            }
            cur = cur.next;
            index++;
        }
        return -1;
    }

    public void printList() {
        System.out.println("A list of size " + size);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getElement() + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;

    }

    private static class Node {

        private int element;
        private Node next;

        public Node(int element) {
            this.element = element;
        }

        public Node(int element, Node next) {
            this.element = element;
            this.next = next;
        }

        public Node() {
            element = 0;
        }

        public int getElement() {
            return element;
        }

        public void setElement(int element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }
}
