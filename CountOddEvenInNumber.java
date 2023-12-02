import java.util.*;

public class CountOddEvenInNumber {
    public static void main(String[] args) {
     
    int input = 123456;
    int number = input;
    
    int evenCount = 0;
    int oddCount = 0;
    
    while(number!=0){
      int reminder = number % 10;
      if(reminder%2==0){
        evenCount++;
      }else{
        oddCount++;
      }
      number = number/10;
    }
    
    System.out.println("Total Even count will be :"+evenCount);
    System.out.println("Odd Count will be: "+oddCount);
    
  }
}
