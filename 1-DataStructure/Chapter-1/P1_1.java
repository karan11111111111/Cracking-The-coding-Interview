// Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

import java.util.Arrays;
import java.util.HashSet;

public class P1_1 {
    //Using Hashtable (TC = O(n)   , SP = O(n))       

    public static boolean IsUniqueWithDs(String str){
        HashSet<Character>CharSet = new HashSet<>();
        for(char c: str.toCharArray()){

            if(CharSet.contains(c)){
                return false;
            }
            CharSet.add(c);
        }
        return true;
    }

    //not using any ds  (TC = O(nlogn)   )          

    public static boolean IsUniqueNoDs(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for(int i=0; i<chars.length-1; i++){
            if(chars[i] == chars[i+1]){
                return false;
            }
        }
        return true;

    }


    //using bit   (TC = O(n)   , SP = O(1))
    public static boolean IsUniqueBit(String str){
        int checker =0;
        for(char c: str.toCharArray()){
            int val = c-'a';
            if((checker &(1<<val))>0){
                return false;
            }
            checker |= (1<<val);
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(IsUniqueWithDs("hello"));
        System.out.println(IsUniqueNoDs("worlld"));
        System.out.println(IsUniqueBit("worlld"));
       
    }

    
}
