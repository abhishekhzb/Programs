import java.util.*;

//Reverse words in a given string
public class ReverseWordInString {
    public static void main(String[] args) {
      
      String str = "I am Abhishek Kumar";
      System.out.println(reverseWord(str));
  }
  
  public static String reverseWord(String str){
    String[] words = str.split(" ");
    String result = "";
    
    for(int i=words.length-1;i>=0;i--){
      result = result +" "+words[i];
    }
    
    return result;
  }
}
