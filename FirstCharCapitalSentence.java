import java.util.*;

public class FirstCharCapitalSentence {
    public static void main(String[] args) {
      
      String str = "i am abhishek kumar";
      String capStr = "";
      
      String [] words = str.split(" ");
      
      for(String word :words){
        char[] ch = word.toCharArray();
        String firstChar = String.valueOf(ch[0]);
        
        String capitalWord = firstChar.toUpperCase();
        
        for(int i=1;i<ch.length;i++){
          capitalWord = capitalWord + ch[i];
        }
        capStr = capStr + capitalWord+" ";
        
      }
      
      System.out.println(""+capStr);
      
  }
}
