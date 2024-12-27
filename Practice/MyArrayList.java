package Practice;

public class MyArrayList<E> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10]; // Initial capacity
        size = 0;
    }

    // Add an element
    public void add(E element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
    }

    // Get an element
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (E) elements[index];
    }

    // Remove an element
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        E oldValue = (E) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        elements[size] = null; // Avoid memory leaks
        return oldValue;
    }

    // Ensure enough capacity
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
    }

    // Get size
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("!");

        System.out.println(list.get(0)); // Output: Hello
        System.out.println(list.size()); // Output: 3

        list.remove(1);
        System.out.println(list.get(1)); // Output: !
    }
}
