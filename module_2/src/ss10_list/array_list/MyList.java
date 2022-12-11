package ss10_list.array_list;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
        if (index < 0) {
            size++;
            for (int i = size - 1; i > 0; --i) {
                elements[i] = elements[i - 1];
            }
            elements[0] = element;
        } else if (index >= size) {
            index = size++;
            elements[index] = element;
        } else {
            size++;
            for (int i = size - 1; i >= 0; --i) {
                elements[i] = elements[i - 1];
            }
            elements[0] = element;
        }
    }

    public E remove(int index) {
        E returnedElement = null;
        if (index < 0 || index >= size) {
            // do nothing
        } else {
            returnedElement = (E) elements[index];
            for (int i = index; i < size; ++i) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
        return returnedElement;
    }

    public int size() {
        if (size == elements.length) {
            return size;
        } else {
            size = elements.length;
            return size;
        }
    }

    public E clone() {
        Object[] copiedElements = Arrays.copyOf(elements, size);
        return (E) copiedElements;
    }

    public boolean contains(E object) {
        for (Object e : elements) {
            if (e.equals(object)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E object) {
        if (contains(object)) {
            for (int i = 0; i < size; ++i) {
                if (elements[i].equals(object)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean add(E element) {
        elements[size++] = element;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = size;
        if (size > minCapacity) {
            newSize = elements.length * 2;
        }
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }

    public void clear() {
        for (int i = size - 1; i >= 0; --i) {
            elements[i] = null;
            size--;
        }
        elements = Arrays.copyOf(elements, size);
    }
}
