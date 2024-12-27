

public class JoinWordsStringBuilder {
    // Method to join words in a single string using StringBuilder
    public static String joinWords(String[] words) {
        StringBuilder sentence = new StringBuilder(); // Efficient for string concatenation
        for (String w : words) {
            sentence.append(w); // Append each word to the StringBuilder
        }
        return sentence.toString(); // Convert StringBuilder to String and return
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
