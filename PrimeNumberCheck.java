import java.util.*;

//Java program to check if the given number is a prime number.
// 2, 3, 5, 7, 11,13 

public class PrimeNumberCheck {
    public static void main(String[] args) {
     
     System.out.println(isPrime(5));
     System.out.println(isPrime(10));
      
  }
  
  public static boolean isPrime(int num){
    
    int count = 0;
    for(int i=1;i<=num;i++){
       if(num%i == 0){
        count++;
       }
    }
    
    if(count==2){
      return true;
    }else{
      return false;
    }
    
  }
}
