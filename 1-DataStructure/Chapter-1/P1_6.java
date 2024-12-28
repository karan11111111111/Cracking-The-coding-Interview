// String Compression: Implement a method to perform basic string compression using the counts 
// of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the 
// "compressed" string would not become smaller than the original string, your method should return 
// the original string. You can assume the string has only uppercase and lowercase letters (a - z).


public class P1_6 {
  
    public static String compressString(String str) {
        // Handle edge cases
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            // Check if next character is different or end of string
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i)).append(countConsecutive);
                countConsecutive = 0; // Reset counter
            }
        }

        // Return original string if compressed version is not smaller
        return compressed.length() < str.length() ? compressed.toString() : str;
    }


    private static String stringCompress(String str){
        
      if(str == null || str.length() ==0){
        return str;
      }

     StringBuilder compressed = new StringBuilder();
     int countConsecutive = 1;
     int n = str.length();

     for(int i=1; i<n; i++){
        if(str.charAt(i) == str.charAt(i-1)){
            countConsecutive++;
        }else{
            compressed.append(str.charAt(i-1));
            compressed.append(countConsecutive);
            countConsecutive =1;
        }
     }

        compressed.append(str.charAt(n-1));
        compressed.append(countConsecutive);

        return compressed.length() <n ? compressed.toString():str;
    }


    public static void main(String[] args) {

        String[] testCases = {
            "aabcccccaaa",
            "abcdef",
            "aabbcc",
            "aabbaa",
            "",
            "a",
            "AAaaBBbb"
        };

        for (String testCase : testCases) {
            System.out.println("Original: " + testCase + " -> Compressed: " + compressString(testCase));
        }
        
        for (String testCase : testCases) {
            System.out.println("Original: " + testCase + " -> Compressed: " + stringCompress(testCase));
        }
        
    }
}