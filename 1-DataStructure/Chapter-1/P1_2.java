// Check Permutation: Given two strings, write a method to decide if one is a permutation of the  other

import java.util.Arrays;
import java.util.HashMap;


public class P1_2 {

    //HastTable      ( TC - O(n)  , SP O(n))
    public static boolean CheckPermutationDS(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        HashMap<Character, Integer> charcount= new HashMap<>();
        for(char c:str1.toCharArray()){
            charcount.put(c,charcount.getOrDefault(c,0 )+1);
            
        }


        for(char c:str2.toCharArray()){
            if(!charcount.containsKey(c)){
                return false;
            }

            charcount.put(c,charcount.get(c)-1);
            if(charcount.get(c)<0){
                return false;
            }
        }


        return true;
    }

 
    // Using sorting    ( TC - O(nlogn)  , SP O(n))
public static Boolean CheckPermutationSort(String str1, String str2){
    
    if(str1.length() != str2.length()){
        return false;
    }

    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    return Arrays.equals(arr1, arr2);

  
}

// character count   ( TC - O(n)  , SP O(1))
public static boolean CheckPermutation(String str1 , String str2){
   if(str1.length() != str2.length()){
    return false;
   }

   int[]  charcount = new int[128];
   for(char c: str1.toCharArray()){
    charcount[c]++;
   
   }


   for(char c: str2.toCharArray()){
    charcount[c]--;

    if(charcount[c]<0){
        return false;
    }
   }


    return true;
}

    public static void main(String[] args) {

        System.out.println(CheckPermutationSort("abc","bca"));
        System.out.println(CheckPermutationSort("abc","dbca"));
        System.out.println(CheckPermutationDS("abc","dbca"));
        System.out.println(CheckPermutationDS("abdc","bdca"));
        System.out.println(CheckPermutationDS("aabc","bca"));
        System.out.println(CheckPermutation("abc","bca"));
        System.out.println(CheckPermutation("abc","dbca"));
        System.out.println(CheckPermutation("aabc","bca"));
        
    }
    
}
