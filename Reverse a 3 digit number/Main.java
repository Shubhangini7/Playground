import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int f = n1/100;
    int s = ((n1/10)%10);
    int t = n1%10;
    int rev = (t*100)+(s*10)+(f);
    System.out.println(rev);

  }
}