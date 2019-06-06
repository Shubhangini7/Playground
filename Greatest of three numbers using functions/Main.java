import java.util.Scanner;
class Main{
  
  	public static int greatest(int a, int b, int c)
    {
       int max;
       if(a<b)
       {
          if(b<c)
          { 
             max = c;
             System.out.print(max);
            
          }
          else
          {
             max = b;
             System.out.print(max);
          }
       }
       else
       {
          max = a;
          System.out.print(max);
       }
      return max;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int greatest = greatest(n1,n2,n3);
	}
}
