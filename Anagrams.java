import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
      
      String s1 = "listen";
      String s2 = "silent";
      
      boolean result = checkAnagram(s1,s2);
      System.out.println(result);
  }
  
  public static boolean checkAnagram(String s1, String s2){
    
    char[] s1Arr = s1.toCharArray();
    char[] s2Arr = s2.toCharArray();
    
    if(s1Arr.length != s2Arr.length){
      return false;
    }
    
    Arrays.sort(s1Arr);
    Arrays.sort(s2Arr);
    
    return Arrays.equals(s2Arr,s2Arr);
   
  }
  
}
