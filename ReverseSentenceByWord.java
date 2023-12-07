import java.util.*;
import java.util.List;

public class ReverseSentenceByWord {
    public static void main(String[] args) {
     
    String str = "This is a Statement";
    String[] words = str.split(" ");
    
    List<String> aList = Arrays.asList(words);
    Collections.reverse(aList);
    
    System.out.println(""+aList);
    
  }
}
