import java.util.*;

public class StarLastFourChar {
    public static void main(String[] args) {
    String str = "123456789";
    System.out.println(convertToStarLastFour(str));
  }
  
  //convert last 4 digits ****
  public static String convertToStarLastFour(String str){
    char[] ch = str.toCharArray();
    String result = "";
    
    int digitLength = ch.length-4;
    
    for(int i=0;i<ch.length;i++){
      if(digitLength>i){
        result = result + ch[i];
      }else{
        result = result + "*";
      }
    }
    return result;
  } 
}
