package Practice;

public class AmortizedArray {
    private int[] array;  // Underlying array
    private int size;     // Number of elements in the array

    public AmortizedArray() {
        array = new int[2]; // Start with a small size
        size = 0;
    }

    // Add a new element
    public void add(int value) {
        if (size == array.length) {
            resize();  // Double the array size when full
        }
        array[size] = value;
        size++;
    }

    // Resize the array (double the capacity)
    private void resize() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    // Get element at index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    // Return the current size
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        AmortizedArray amortizedArray = new AmortizedArray();

        // Insert elements
        for (int i = 0; i < 10; i++) {
            amortizedArray.add(i);
            System.out.println("Added: " + i + ", Current Size: " + amortizedArray.size());
        }
    }
}
