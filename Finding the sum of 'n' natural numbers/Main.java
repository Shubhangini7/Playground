import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in); 
    int n = in.nextInt();
    System.out.println(add(n));
  }
   public static int add(int n)
   {
     if(n == 1)
       return 1;
     else
       return(n + add(n-1));
   }
}