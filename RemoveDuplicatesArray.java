import java.util.*;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
     
    ArrayList<String> al = new ArrayList<String>();
    al.add("abhi");
    al.add("ab");
    al.add("ch");
    al.add("ab");
    
    
    ArrayList<String> alNew = new ArrayList<String>();
    
    for(String s : al){
       if(!alNew.contains(s)){
          alNew.add(s);
       }
    }
    
     System.out.println(alNew);
    }
}
