import java.util.Scanner;
class Main
{
   public static int power(int m, int n) //arguments received here
   {
     int p = 1;
     while(n != 0)
     {
        p = p * m;
        n--;
     }
     return p;
   }
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int b = in.nextInt();
      int e = in.nextInt();
      int c = power(b,e);  
      System.out.println(c); 
   }
}