import java.util.*;

public class FindMissingElementInArray {
    public static void main(String[] args) {
      int[] a = {1,2,3,4,6};
      
      int sumWithMiss = 0;
      int sumWithoutMiss = 0;
      
      //sum without Miss
      for(int i= 0; i<=6; i++){
        sumWithoutMiss =sumWithoutMiss+i;
      }
      
      //sum with Miss
      for(int i=0; i<a.length;i++){
        sumWithMiss = sumWithMiss+a[i];
      }
      
      System.out.println("Without Miss : "+sumWithoutMiss);
      System.out.println("With Miss : "+sumWithMiss);
      
      System.out.println("Missing element is : "+(sumWithoutMiss-sumWithMiss));
      
  }
}
