
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int s = in.nextInt();
 	  
      switch(s)          
        {
          case 1:
          		int side = in.nextInt();
      	  		System.out.println(square(side));
          		break;
          case 2:
          		int length = in.nextInt();
          		int breadth = in.nextInt();
          		System.out.println(rect(length,breadth));
          		break;
          case 3: 
      			int base = in.nextInt();
      			int height = in.nextInt();
          		System.out.println(tri(base,height));
          		break;
          case 4: 
      			int radius = in.nextInt();
      			System.out.println(circle(radius));
          		break;
          default:System.out.println("Invalid");
                  break;
        }
    }
  public static int square(int x)
  {
  	int result=0;
  	result = x * x;
    return result;
  }
  public static int rect(int x, int y)
  {
  	int result=0;
  	result = x * y;
    return result;
  }
  public static int tri(int x, int y)
  {
  	int result=0;
  	result = (x * y)/2;
    return result;
  }
  public static double circle(int x)
  {
    final double PI = 3.14;
  	double result=0;
  	result = PI * x * x;
    return result;
  }
}
