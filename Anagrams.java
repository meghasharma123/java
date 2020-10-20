import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    String str1 = "baba";
    String str2 = "bees";

    // check if length is same
    if(str1.length() == str2.length()) {

      // convert strings to char array
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      // sort the char array
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      // if sorted char arrays are same
      // then the string is anagram
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println("Yes");
      }
      else {
        System.out.println("No");
      }
    }
