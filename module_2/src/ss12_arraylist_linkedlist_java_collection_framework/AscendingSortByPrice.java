package ss12_arraylist_linkedlist_java_collection_framework;

import java.util.Comparator;

public class AscendingSortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
