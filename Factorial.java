import java.util.*;

// Factorial of 5 will be, 5*4*3*2*1

public class Factorial {
    public static void main(String[] args) {
    int input = 5;
    int result = factorial(input);
    System.out.println("factorial : "+result);
  }
  
  public static int factorial(int n){
    if(n==0){
       return 1;
    }else{
       return n * factorial(n-1); // 5*4*3*2*1*1
    }
  }
}
