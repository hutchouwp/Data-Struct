package javaapplication1;

import java.util.LinkedList;
import java.util.Queue;

class Student {

    private String name;
    private int id;
    private double gpa;

    Student(String newName, int newId, double newGpa) {
        this.name = newName;
        this.id = newId;
        this.gpa = newGpa;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public int getId() {
        return id;
    }
    
}

class Node {

    private Student std; // student 
    private Node left;
    private Node right;

    Node(Student std) {
        this.std = std;
    }

    public void setStudent(Student newStd) {
        this.std = newStd;
    }

    public Student getStd() {
        return this.std;
    }

    public void setLeft(Node newLeft) {
        left = newLeft;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node newRight) {
        right = newRight;
    }

    public Node getRight() {
        return right;
    }

//    public String toString() {
////        return std.id + " " + std.name + " " + std.gpa;
//    }
}

class CBT {

    // complete binary tree 
    private Node root;

    public void add(Node x) {
        if (root == null) {
            root = x;
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        // starter 
        while (!queue.isEmpty()) {
            // while queue is not empty still do it until queue empty         
            Node current = queue.poll(); // .poll = remove front data of queue 
            if (current.getLeft() == null) {
                current.setLeft(x);
//                System.out.println(queue); // debug
                return; // skip
            } else {
                queue.add(current.getLeft());
            }
            if (current.getRight() == null) {
                current.setRight(x);
//                System.out.println(queue); // debug
                return; // skip
            } else {
                queue.add(current.getRight());
            }
        }
    }

    public void BestFirstSearch() {
        if (root == null) {
            System.out.println("tree is empty");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.getData() + " ");

            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }
            // check left before right 
            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
        }
        System.out.println();
    }
}

public class JavaApplication1 {

    public static void main(String[] args) {
        CBT cbt = new CBT();        // root 
        Node x1 = new Node(1);
        Node x2 = new Node(2);
        cbt.add(x1);
        cbt.add(x2);
        cbt.add(new Node(3));
        cbt.add(new Node(4));
        cbt.add(new Node(5));
//        for (int i = 0; i < 10; ++i) {
//            cbt.add(new Node(i));
//        }
        cbt.BestFirstSearch();
    }
}
