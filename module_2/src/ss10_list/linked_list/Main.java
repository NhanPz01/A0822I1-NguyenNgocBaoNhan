package ss10_list.linked_list;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> linkedList = new MyList<>();
        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        Node<Integer> temp = linkedList.head;
        for (int i = 0; i < linkedList.size() && temp.getData() != null; ++i) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
        System.out.println((Integer) linkedList.remove(0));
        for (int i = 0; i < linkedList.size() && temp.getData() != null; ++i) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
}
