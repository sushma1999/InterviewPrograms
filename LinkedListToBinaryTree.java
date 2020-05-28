/*https://www.educative.io/edpresso/how-to-convert-a-sorted-list-to-a-binary-tree

import java.lang.reflect.Array;
import java.util.EmptyStackException;

public class LinkedListToBinaryTree {

    public class Node {
        int data;
        Node next;

        public Node(int value) {
            this.data = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void AddLast(int value) {
        var node = new Node(value);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void RemoveLast() {
        if (first == null) {
            throw new NullPointerException();
        }
        if (first == last) {
            first = last = null;
        } else {
            Node previous = GetPrevious(last);
            last = previous;
            previous.next = null;
        }
        size--;
    }

    public Node GetPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;

        }
        return null;
    }

    public void AddFirst(int value) {
        var node = new Node(value);
        if (first == null) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void RemoveFirst() {
        if (first == null) {
            throw new NullPointerException();
        } else if (first == last) {
            first = last = null;
        } else {
            var temp = first.next;
            first.next = null;
            first = temp;
        }
        size--;
    }

    public void reverse() {
        if (first == null)
            return;
        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int IndexOf(Node item) {
        Node current = first;
        int index = 0;
        while (current != null) {
            if (current.data == item.data) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }

    public int IndexOf(int item) {
        Node current = first;
        int index = 0;
        while (current != null) {
            if (current.data == item) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }

    public int getKthFromTheEnd(int k) {
        if (first == null)
            throw new IllegalStateException();

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

    public void printMiddle() {
        if (first == null)
            throw new IllegalStateException();

        var a = first;
        var b = first;
        while (b != last && b.next != last) {
            b = b.next.next;
            a = a.next;
        }

        if (b == last)
            System.out.println(a.data);
        else
            System.out.println(a.data + ", " + a.next.data);
    }


    public Node StartLoop() {
        var slow = first;
        var fast = first;
        boolean loopExists = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow.data == fast.data) {
                loopExists = true;
                break;
            }
        }
        if (loopExists) {
            slow = first;
            fast=first.next;
            while (slow.data != fast.data) {
                slow = slow.next;
                fast = fast.next.next;
            }

        } else {
            System.out.println("Loop doesnt Exist");
            slow = null;
        }
        return slow;
    }

    public static LinkedListMy createWithLoop() {
        var list = new LinkedListMy();
        list.AddLast(10);
        list.AddLast(20);
        list.AddLast(30);

        // Get a reference to 30
        var node = list.last;

        list.AddLast(40);
        list.AddLast(50);

        // Create the loop
        list.last.next = node;

        return list;
    }

    public void print() {
        var currentNode = first;
        while (currentNode.next != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public int length(Node first) {
        if (first == null) {
            return 0;
        } else {
            return 1 + length(first.next);
        }
    }


    public static void main(String[] args) {

        LinkedListToBinaryTree list = new LinkedListToBinaryTree();
        list.AddFirst(10);
        list.AddFirst(20);
        list.AddFirst(30);
        list.AddFirst(40);
        list.AddFirst(50);
        int kthFromTheEnd = list.getKthFromTheEnd(3);

        System.out.println(newList.StartLoop().data);

        //System.out.println(list.length(list.first));
//list.printMiddle();
    }


}

*/