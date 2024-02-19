import java.util.*;

//Print all possible subsrtings

public class SubStringBasic {
    public static void main(String[] args) {
      String str = "example";
      splitString(str);
  }
  
  public static void splitString(String str){
    for(int i=0;i<=str.length();i++){
      System.out.println(str.substring(0,i));
    }
  }
  
}
