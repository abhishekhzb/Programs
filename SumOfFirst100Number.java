import java.util.*;

public class SumOfFirst100Number {
    public static void main(String[] args) {
    
    int input = 100;
    int sum = 0;
    
    for(int i=1;i<=input; i++){
      sum = sum + i;
    }
    
    System.out.println(""+sum);
    
  }
}
