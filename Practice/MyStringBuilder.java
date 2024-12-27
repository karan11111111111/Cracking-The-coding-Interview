package Practice;

public class MyStringBuilder {
    private char[] buffer;
    private int size;

    public MyStringBuilder() {
        buffer = new char[16]; // Initial capacity
        size = 0;
    }

    // Append a string
    public MyStringBuilder append(String str) {
        if (str == null) return this;

        ensureCapacity(size + str.length());
        for (int i = 0; i < str.length(); i++) {
            buffer[size++] = str.charAt(i);
        }
        return this;
    }

    // Ensure enough capacity
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > buffer.length) {
            int newCapacity = buffer.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            char[] newBuffer = new char[newCapacity];
            System.arraycopy(buffer, 0, newBuffer, 0, size);
            buffer = newBuffer;
        }
    }

    // Convert to string
    public String toString() {
        return new String(buffer, 0, size);
    }

    public static void main(String[] args) {
        MyStringBuilder sb = new MyStringBuilder();
        sb.append("Hello").append(" ").append("World!");
        System.out.println(sb.toString()); // Output: Hello World!
    }
}
