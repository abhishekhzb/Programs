import java.util.*;

// sum of cube of all number == the number
// 153 = (1*1*1) + (5*5*5) + (3*3*3)

public class ArmStrongNumber {
    public static void main(String[] args) {
    
    int userInput = 153;
    int number = userInput;
    int sum = 0;
    
    while(number!=0){
      int reminder = number % 10;
      sum = sum + (reminder * reminder * reminder);
      number = number / 10;
    }
    
    System.out.println(userInput+"  :  "+sum);
      
    if(userInput == sum){
      System.out.println("Armstrong");
    }else{
      System.out.println("Not Armstrong");
    }
    
    
  }
}
