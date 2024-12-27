package Practice;

import java.util.LinkedList;

public class MyHashTable<K, V> {
    private class Entry<K, V> {
        K key;
        V value;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry<K, V>>[] table;
    private int size;
    private static final int INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public MyHashTable() {
        table = new LinkedList[INITIAL_CAPACITY];
        size = 0;
    }

    // Hash function
    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    // Put a key-value pair
    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update value if key exists
                return;
            }
        }

        table[index].add(new Entry<>(key, value));
        size++;
    }

    // Get a value by key
    public V get(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null; // Key not found
    }

    public static void main(String[] args) {
        MyHashTable<String, Integer> hashTable = new MyHashTable<>();
        hashTable.put("One", 1);
        hashTable.put("Two", 2);
        hashTable.put("Three", 3);

        System.out.println(hashTable.get("One")); // Output: 1
        System.out.println(hashTable.get("Two")); // Output: 2
    }
}
