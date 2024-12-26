import java.util.ArrayList;

public class ArrayListResizableArrays {
    // Merge function
    public static ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();
        for (String w : words) sentence.add(w);
        for (String w : more) sentence.add(w);
        return sentence;
    }

    // Main function
    public static void main(String[] args) {
        // Sample inputs
        String[] words = {"Hello", "world"};
        String[] more = {"this", "is", "Java"};

        // Call merge method
        ArrayList<String> result = merge(words, more);

        // Print the merged result
        System.out.println("Merged ArrayList: " + result);
    }
}
