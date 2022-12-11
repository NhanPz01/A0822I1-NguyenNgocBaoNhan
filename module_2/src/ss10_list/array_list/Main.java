package ss10_list.array_list;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList();
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(4);
        myList.remove(1);
        for (int i = 0; i < myList.size(); ++i) {
            if (myList.get(i) != null) {
                System.out.println(myList.get(i));
            }
        }
    }
}
