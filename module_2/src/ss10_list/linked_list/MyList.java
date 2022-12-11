package ss10_list.linked_list;

import java.util.Date;
import java.util.LinkedList;

public class MyList<E> {
    public Node<E> head;
    private int numNodes;

    public MyList() {
        this.head = new Node<>(null);
        this.numNodes = 0;
    }

    public void add(int index, E element) {
        if (this.numNodes == 0) {
            this.head.data = element;
            this.numNodes++;
        } else {
            Node temp = this.head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; ++i) {
                temp = temp.next;
            }
            holder = temp;
            temp = new Node<E>(element);
            temp.next.next = holder;
            this.numNodes++;
        }
    }

    public void addFirst(E element) {
        this.add(0, element);
    }

    public void addLast(E element) {
        Node temp = this.head;
        for (int i = 0; temp.next != null; ++i) {
            temp = temp.next;
        }
        Node newNode = new Node<E>(element);
        temp.next = newNode;
        this.numNodes++;
    }
    public E remove(int index) {
        Node temp = this.head;
        Node holder;
        Node returnedNode;
        for (int i = 0; i < index - 1 && temp.next != null; ++i) {
            temp = temp.next;
        }
        holder = temp;
        returnedNode = temp.next;
        holder.next = temp.next.next;
        this.numNodes--;
        return (E) returnedNode;
    }

    public boolean remove(E element) {
        Node temp = head;
        for (int i = 0; temp.next != null; ++i) {
            if (temp.getData() == element) {
                this.remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return this.numNodes;
    }

    public E clone() {
        return (E) this.head;
    }
}
