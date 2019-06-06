import java.util.regex.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
    
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      Pattern ptn = Pattern.compile("(,| |and|or)");
      String arr[] = ptn.split(str);
      for(String s:arr)
      {
        System.out.println(s);
      }
    }
}