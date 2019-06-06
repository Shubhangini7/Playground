import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int last;
      int ans = 0;
      int temp = n;
      while(n>0)
      {
        last = n % 10;
        n = n / 10;
        ans = ans + (last * last * last);
      }
      if(ans == temp)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }


	}
}