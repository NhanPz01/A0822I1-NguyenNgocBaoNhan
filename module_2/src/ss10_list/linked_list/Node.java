package ss10_list.linked_list;

public class Node<E> {
    public Node next;
    public Object data = null;

    public Node(E data) {
        this.data = data;
        this.next = null;
    }

    public E getData() {
        return (E) this.data;
    }
}
