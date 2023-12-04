import java.util.*;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
      
    String str = "I am Abhishek Kumar";
    String [] words = str.split(" ");
    String reverseSentence = "";
    
    
    for(String word : words){
      String reverseWord = "";
      
      for(int i = word.length()-1 ; i>=0; i--){
         reverseWord = reverseWord + word.charAt(i);
      }
      reverseSentence = reverseSentence + reverseWord+" ";
    }
    
    System.out.println(""+reverseSentence); 
  }
}
