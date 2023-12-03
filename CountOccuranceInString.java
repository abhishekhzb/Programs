import java.util.*;

public class CountOccuranceInString {
    public static void main(String[] args) {
      
      String str = "AbhishekKumar";
      String occ = "k";
      
      int totalLength = str.length();
      int replaceLength = str.toLowerCase().replaceAll("k","").length();
      
      System.out.println("Occurance of "+occ+" is :"+(totalLength-replaceLength));
      
  }
}
