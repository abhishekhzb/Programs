import java.util.*;

public class Anagrams_HashMap {
    public static void main(String[] args) {
      
      String s1 = "listen";
      String s2 = "silent";
      
      boolean result = checkAnagram(s1,s2);
      System.out.println(result);
  }
  
  public static boolean checkAnagram(String s1, String s2){
    
    char[] s1Arr = s1.toCharArray();
    char[] s2Arr = s2.toCharArray();
    
    if(s1Arr.length != s2Arr.length){
      return false;
    }
    
    
    HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
    HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
    
    for(int i=0;i<=s1Arr.length;i++){
       if(map1.containsKey(s1Arr[i])){
          map1.put(s1Arr[i],map1.get(s1Arr[i])+1);
       }else{
          map1.put(s1Arr[i],0);
       }
    }
    
     for(int i=1;i<=s2Arr.length;i++){
       if(map1.containsKey(s2Arr[i])){
          map1.put(s2Arr[i],map1.get(s2Arr[i])+1);
       }else{
          map1.put(s2Arr[i],0);
       }
    }
    
    return Arrays.equals(s1Arr,s2Arr);
   
  }
  
}
