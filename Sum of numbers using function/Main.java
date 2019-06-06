import java.util.Scanner;
class Main{
  
   public static int sum_of_no(int m)
   {
     int sum = 0;
     for(int i = 1; i <= m; i++)
     {
        sum = sum + i;
     }
     return sum;
   }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int s = sum_of_no(n);
      System.out.println(s);
    }
}