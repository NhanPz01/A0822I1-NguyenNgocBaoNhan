package ss12_arraylist_linkedlist_java_collection_framework;

import java.util.Comparator;

public class AscendingSortById implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getId() - o2.getId();
    }
}
