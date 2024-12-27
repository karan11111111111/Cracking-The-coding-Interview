

public class JoinWordsExample {
    // Method to join words in a single string
    public static String joinWords(String[] words) {
        String sentence = ""; // Initialize an empty string
        for (String w : words) {
            sentence = sentence + w; // Concatenate each word
        }
        return sentence; // Return the final joined sentence
    }

    // Main function
    public static void main(String[] args) {
        // Example input
        String[] words = {"Hello", " ", "world", "!", " Welcome", " to", " Java."};

        // Call joinWords method
        String result = joinWords(words);

        // Print the joined sentence
        System.out.println("Joined Sentence: " + result);
    }
}
