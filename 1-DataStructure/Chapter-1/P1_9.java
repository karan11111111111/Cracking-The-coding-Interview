//String Rotation:Assumeyou have a method isSubstringwhich checks if oneword is a substring  of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").

public class P1_9 {

    private static boolean isRotation(String str1, String str2){

        if(str1.length() == str2.length() && str1.length()>0){
            String concatenated = str1+str2;
            return issubset(concatenated, str2);
        }
        return false;
    }
    
    private static boolean issubset(String str1, String sub){
        return str1.contains(sub);

    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        boolean result = isRotation(s1, s2);
        System.out.println("Is \"" + s2 + "\" a rotation of \"" + s1 + "\": " + result);
   
    }
}
