import java.io.*;
class Fibonacci extends Thread
{
  public void run()
  {
    try
    {
      int a=0,b=1,c=0;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the limit for Fibonacci: ");
      int l = Integer.parseInt(br.readLine());
      System.out.println(l);
      if(l <= 0)
      {
        throw new Exception("Exception");
      }
      else
      {
        System.out.print("The Fibonacci series is :");
        while(l > 0)
        {
          System.out.print(c + " ");
          a = b;
          b = c;
          c = a+b;
          l = l-1;
        }
      }
    }
    catch(Exception e)
    {
      System.out.println("Exception occurred");
    }
  }
}
class Main
{
     public static void main(String[] args) 
     {
        Fibonacci f = new Fibonacci();
       f.start();
     }
}