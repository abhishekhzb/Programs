import java.util.*;

public class SumOfArrayEvenOdd {
    public static void main(String[] args) {
     
    int[] arr = {1,2,3,4,5};
    int evenSum = 0;
    int oddSum = 0;
    
    for(int a: arr){
      if(a%2==0)
        evenSum = evenSum + a;
      else
        oddSum = oddSum + a;
    }
    
    System.out.println("Even Sum : "+evenSum);
    System.out.println("Odd Sum : "+oddSum);
    
  }
}
