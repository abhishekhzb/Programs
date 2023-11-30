import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
    
    int number = 50;
    int a = 1;
    int b = 1;
    int f = 0;
    
    System.out.println(""+a);
    System.out.println(""+b);
    
    while(f<=number){
      f = a+b;
      
      if(f>number)
        break;
      
      System.out.println(""+f);
      a = b;
      b = f;
      
    }
 
  }
}
