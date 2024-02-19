import java.util.*;

//Print all possible subsrtings
public class SubStringAllPossible {
    public static void main(String[] args) {
      String str = "example";
      splitString(str);
  }
  
  public static void splitString(String str){
    for(int i=0;i<=str.length();i++){
      for(int j=i+1;j<=str.length();j++){
         System.out.println(str.substring(i,j));
      }
    }
  }
  
}
