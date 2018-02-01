import java.io.*;
import java.util.*;

public class ReverseString {
   public static void main(String[] args) {
   rev("abcd efgh ");
   }

    
  public static void rev(String str)
  {
      
      String input = str;
      char[] revchar = input.toCharArray();
      for (int i = revchar.length-1;i>=0;i--) 
      {
          System.out.print(revchar[i]);
      }
      System.out.print(".");
      
  }    
    
    
}
