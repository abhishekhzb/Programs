import java.util.*;

public class LastThreeDigitOfString {
    public static void main(String[] args) {
      String str = "Abhishek";
      
      char[] ch = str.toCharArray();
      int size = ch.length;
      String result = "";
      
      for(int i=size-1;i>size-4;i--){
        result = ch[i] + result;
      }
      
      System.out.println("Reverse last three letters : "+result);
  }
}
