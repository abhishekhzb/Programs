import java.util.*;

//swap two numbers without using a third variable in Java

public class SwapNumbers {
    public static void main(String[] args) {
      int a = 1;
      int b = 2;
      
      a = a+b; // 1+2 = 3
      b = a-b; // 3-2 = 1
      a = a-b;
      
      System.out.println(b);
      System.out.println(a);
      
      
  }
}
