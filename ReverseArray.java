import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
     
    int[] arr = {1,2,3,4,5};
    
    int start = 0;
    int end = arr.length-1;
    int temp;
    
    while(start<end){
      temp = arr[end];
      arr[end] = arr[start];
      arr[start] = temp;
      start++;
      end--;
    }
    
    System.out.println(""+Arrays.toString(arr));
     
  }
}
