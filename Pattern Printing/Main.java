import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int c = sc.nextInt();
      for(int row = 1; row <= r; row++)
      {
        for(int col = c; col > c - row; col--)
        {
          System.out.print(col);
        }
        for(int col = 1; col <= c - row; col++)
        {
          System.out.print(r - row + 1);
        }
         System.out.println();
      }
    }
}