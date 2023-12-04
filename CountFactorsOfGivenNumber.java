import java.util.*;

public class CountFactorsOfGivenNumber {
    public static void main(String[] args) {
      
      int number = 12;
      int countOfFactor = 0;
      
      for(int i=1;i<=number;i++){
         if(number%i==0){
           System.out.print(i+" ");
           countOfFactor++;  
         }
      }
      System.out.println(" ");
      System.out.println("Factors : "+countOfFactor);
  }
}
