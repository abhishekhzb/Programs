import java.util.*;

//Java program to check if a vowel is present in a string.

public class StringContainsVowels {
    public static void main(String[] args) {
      
      System.out.println(checkVowel("Hello")); // true
	  	System.out.println(checkVowel("TV")); // false
	  	
  }
  
    public static boolean checkVowel(String input){
      return input.toLowerCase().matches(".*[aeiou].*");
    }
}
