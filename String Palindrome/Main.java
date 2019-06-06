import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner scan = new Scanner(System.in);
      String s1 = scan.nextLine();
      int str_len = s1.length();
	  int front = 0;
      int end = (str_len - 1);
      boolean is_palindrome = true;
      
      while(front < end)
      {
        if(s1.charAt(front) != s1.charAt(end))
        {
          is_palindrome = false;
          break;
        }
        front++;
        end--;
      }
      if(is_palindrome == true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    } 
}