package ss12_arraylist_linkedlist_java_collection_framework;

import java.util.Comparator;

public class DescendingSortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
