import java.util.*;
import java.util.List;

// penultimate : sentence before just last word.
public class PenultimateWordOfSentence {
    public static void main(String[] args) {
     
    String str = "This is one Statement";
    String [] strArray = str.split(" ");
    
    if(strArray.length>1)
        System.out.println(""+strArray[strArray.length-2]);
    
  }
}
