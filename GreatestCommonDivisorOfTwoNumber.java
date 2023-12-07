import java.util.*;

public class GreatestCommonDivisorOfTwoNumber {
    public static void main(String[] args) {
     
     int fNum = 6;
     int sNum = 12;
     int gcd = 0;
     
     for(int i=1; i<=fNum && i<=sNum; i++){
       if(fNum%i==0 && sNum%i==0){
         gcd = i;
       }
     }
     
     System.out.println("GCD : "+gcd);
     
  }
}
