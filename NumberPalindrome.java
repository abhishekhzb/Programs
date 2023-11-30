import java.util.*;

public class NumberPalindrome {
    public static void main(String[] args) {
      
      int originalNumber = 1234;
      int number = originalNumber;
      int revNumber = 0;
      
      while(number!=0){
        int reminder = number % 10;
        revNumber = (revNumber*10)+reminder;
        number = number/10;
      }
      
         //4321          //1234
      if(revNumber == originalNumber)
        System.out.println("Palindrome");
      else
        System.out.println("Not Palindrome");
      
  }
}
