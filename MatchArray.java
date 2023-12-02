import java.util.*;

public class MatchArray {
    public static void main(String[] args) {
     
     int [] a = {1,2,3,4,5};
     int [] b = {1,2,3,4,5,6};
     
     boolean isMatched = false;
     
     if(a.length == b.length){
       for(int i=0;i<a.length;i++){
         if(a[i]==b[i]){
           isMatched = true;
         }
       }
     }else{
       isMatched = false;
     }
     
     if(isMatched)
      System.out.println("Array are same");
     else
      System.out.println("Array are not same");
     
  }
}
