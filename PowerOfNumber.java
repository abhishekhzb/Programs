import java.util.*;

public class PowerOfNumber {
    public static void main(String[] args) {
    
    int input = 5;
    int power = 3;
    
    int initialNumber = input;
    
    for(int i=1; i<power; i++){
      initialNumber = initialNumber * input ; // 5*5*5
    }
    
    System.out.println(""+initialNumber);
    
  }
}
