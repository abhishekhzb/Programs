import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
    
    String str = "abhba";
    String revStr = "";
    
    char[] ch = str.toCharArray();
    int size = str.length();
    
    for(int i= size-1;i>=0 ;i--){
      revStr = revStr + ch[i];
    }
    
    if(str.equals(revStr)){
      System.out.println("Palindrome");
    }else{
       System.out.println("Not Palindrome");
    }
 
  }
}
