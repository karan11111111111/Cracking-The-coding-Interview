//Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words. 1.5 1.6 
//EXAMPLE 
//Input: Tact Coa 
//Output: True (permutations: "taco cat", "atco eta", etc.)

import java.util.HashMap;
import java.util.Map;

public class P1_4 {

    private static boolean PermuPalindromeChecker(String str) {

        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        Map<Character, Integer> charCountMap = new HashMap<>();

        for(char c: str.toCharArray()){
            charCountMap.put(c,charCountMap.getOrDefault(c,0 )+1);
        }

       int oddcount =0;
       for(int count: charCountMap.values()){
        if(count%2!=0){
            oddcount++;
        }

        if(oddcount>1){
            return false;
        }
       }
        return true;
    }


    public static boolean isPalindromePermutation(String s) {
        int bitVector = 0;
        
        // Normalize the string (remove spaces and convert to lowercase)
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Toggle the corresponding bit for each character
        for (char c : s.toCharArray()) {
            int charValue = c - 'a'; // Get the index (0-25) for the character
            bitVector ^= (1 << charValue); // Toggle the bit corresponding to the character
        }

        // Check if there is at most one bit set to 1
        return (bitVector == 0 || (bitVector & (bitVector - 1)) == 0);
    }
    public static void main(String[] args) {


        String input= "Tact Coa";
        boolean result = PermuPalindromeChecker(input);
        boolean result1 = isPalindromePermutation(input);
        System.out.println(result);
        System.out.println(result1);
    }
}