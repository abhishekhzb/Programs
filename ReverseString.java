import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
    
    String str = "Hello";
    char[] ch = str.toCharArray();
    String reverseStr = "";
    
    int size = str.length();
    
    for(int i = size-1; i>=0 ;i--){
      reverseStr = reverseStr+ch[i];
    }
    
    System.out.println(reverseStr);
 
  }
}
