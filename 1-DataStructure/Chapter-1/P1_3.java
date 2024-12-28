// URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: If implementing in Java, please use a character array so that you can perform this operation in place.) 
//EXAMPLE 
//Input: "Mr John Smith ", 13 
//Output: "Mr%20John%20Smith"

public class P1_3 {

    public static void placeWith(char[] str, int truelength){
    
      int count =0;

        for(int i=0; i<truelength; i++){
            if(str[i] == ' '){
            count++;
            }
        }

      System.out.println(count);

      int index = truelength + count*2;

      for(int i=truelength-1; i>=0; i--){
        if(str[i] == ' '){
            str[index -1] = '0';
            str[index -2] = '2';
            str[index -3] = '%';
            index -=3;
        }else{
            str[index-1] = str[i];
            index--;
        }
      }
    }

    public static String placeWithBuilder(char[] str, int trueLength) {
        StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                sb.append("%20");
            } else {
                sb.append(str[i]);
            }
        }
    
        return sb.toString();
    }
    public static void main(String[] args) {

         // Input string
    char[] str = "Mr John Smith    ".toCharArray(); // Extra spaces are ignored here
    int trueLength = 13;

    // // Call the method
    placeWith(str, trueLength);

    // // Output the modified string
    System.out.println(new String(str));

    // String result = placeWithBuilder(str, trueLength);

    // // Output the result
    // System.out.println(result);

        
    }
    
}
