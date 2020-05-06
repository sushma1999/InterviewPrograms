import java.lang.reflect.Method;
import java.util.Scanner;

class LinkedList {

    class Node {
        int data;
        Node next = null;

        public Node(int value) {
            this.data = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void removeAtLast() {
        if (first == null) {
            return;
        } else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;

        }
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void removeDuplicates() {
        var current = first;
        while (current != null) {
            var checker = current;
            if (checker.next == null)
                return;
            if (checker.next.data == current.data) {
                checker.next = checker.next.next;
            } else {
                checker = checker.next;
            }
            current = current.next;
        }
    }

    public int getKthToLast(int k) {
        if (first == null) {
            throw new IllegalStateException();
        }
        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException();
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.data;

    }

    public void removeMiddleNode() {
        if (first == null)
            throw new IllegalStateException();

        var a = first;
        var b = first;
        while (b != last && b.next != last) {
            b = b.next.next;
            a = a.next;
        }

        if (b == last || b.next == last) {
            System.out.println(a.data);
            var previous = getPrevious(a);
            previous.next = a.next;
        }

    }

    public boolean isPalindrome(Node first) {
        Node reversed = reverseLinkedList(first);
        return isEqual(first, reversed);
    }

    Node reverseLinkedList(Node OriginalHead) {
        Node newHead = null;
        while (OriginalHead != null) {
            Node newNode = new Node(OriginalHead.data);
            newNode.next = newHead;
            newHead = newNode;
            OriginalHead = OriginalHead.next;
        }
        return newHead;
    }

    boolean isEqual(Node one, Node two) {
        while (one != null && two != null) {
            if (one.data != two.data) {
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }


    public void print() {

//        Example Static Method
//        String[] empty = {" "," "};
//        LinkedList.main(empty);

//        Example Instance Method
//        LinkedList list = new LinkedList();
//        list.isPalindrome(first);

        var current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.addLast(10);
        myList.addLast(20);
        myList.addLast(30);
        myList.addLast(20);
        myList.addLast(10);
        /*myList.addLast(40);
        myList.addLast(40);
        myList.addLast(50);
        myList.addLast(60);
        myList.addLast(70);

        System.out.println("Input:");
        myList.print();
        System.out.println();
        System.out.println("After Remove Last:");
        myList.removeAtLast();
        myList.print();
        System.out.println();
        myList.removeDuplicates();
        System.out.println("After Removing Duplicates:");
        myList.print();
        System.out.println();
        System.out.println("Getting Kth Node from the end:");
        var result = myList.getKthToLast(2);
        System.out.println(result);
        System.out.println();
        System.out.println("Removing Middle Element");
        myList.removeMiddleNode();
        myList.print();*/
        var result= myList.isPalindrome(myList.first);
        System.out.println("Given list is a Palindrome? " );
        System.out.print(result);

    }

}