package lab01092025;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }
}

class Node {

    private Person data;
    private Node next;
    private Node prev;

    Node(Person P) {
        this.data = P;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node x) {
        next = x;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node y) {
        prev = y;
    }

    public String toString() {
        return data.toString();
    }
}

class LinkedList {

    private Node head;
    private Node tail;
    private int count;

    public void addFirst(Node x) {
        if (head == null) {
            head = x;
            tail = x;
        } else {
            x.setNext(head);
            head.setPrev(x);
            head = x;
        }
        count++;
    }

    public void addLast(Node x) {
        if (head == null) {
            head = x;
            tail = x;
        }
        else{
            tail.setNext(x);
            x.setPrev(tail);
            tail = x;
        }
        count++;
    }

    public void deleteFirst() {
        if (head != null) {
            if(count == 1){
                head = null ;
                tail = null ;
            }else{
                Node p = head;
                head = p.getNext();
                head.setPrev(null);
            }
            count -- ;
        }
    }

    public void deleteLast() {
        if (head != null) {
            Node p = tail;
            tail = p.getPrev();
            tail.setNext(null);
        }
    }

    public void print() {
        Node p = head;
        while (p != null) {
            System.out.print(p + ", ");
            p = p.getNext();
        }
        System.out.println("");
    }

    public void printBack() {
        Node p = tail;
        while (p != null) {
            System.out.print(p + ", ");
            p = p.getPrev();
        }
        System.out.println("");
    }
}

public class Lab01092025 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addFirst(new Node(new Person("A", 20)));
        l1.addFirst(new Node(new Person("B", 18)));
        l1.addFirst(new Node(new Person("C", 32)));
        l1.addFirst(new Node(new Person("D", 49)));
        l1.addLast(new Node(new Person("E", 19)));
        l1.print();
        l1.printBack();
        l1.deleteFirst();
        l1.deleteLast();
        l1.deleteFirst();
        l1.deleteLast();
        l1.deleteFirst();
        l1.print();
    }

}
