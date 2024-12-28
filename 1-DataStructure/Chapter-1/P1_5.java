//One Away: There are three types of edits that can be performed on strings: insert a character,  remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away. 
//EXAMPLE 
//pale, ple -> true 
//pales, pale -> true 
//pale, bale -> true 
//pale, bake -> false

public class P1_5 {

    private static boolean checkedits(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }

        String shorter = str1.length() < str2.length() ? str1 : str2;
        String longer = str1.length() < str2.length() ? str2 : str1;

        int i = 0;
        int j = 0;

        boolean foundDifference = false;

        while (i < shorter.length() && j < longer.length()) {
            if (shorter.charAt(i) != longer.charAt(j)) {
                if (foundDifference) {
                    return false;
                }

                foundDifference = true;

                if (shorter.length() == longer.length()) {
                    i++;
                }

            }else{
                i++;
            }
            j++;
        }

        return true;

    }

    public static void main(String[] args) {

        System.out.println(checkedits("pale", "ple"));  // true
        System.out.println(checkedits("pales", "pale")); // true
        System.out.println(checkedits("pale", "bale"));  // true
        System.out.println(checkedits("pale", "bake"));  // false
  

    }
}
