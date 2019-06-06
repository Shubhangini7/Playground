import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[][] = new int[n][n];
      print_spirally(a,n);
      for(int i = 0; i < n; i++)
      {
        for(int j = 0; j < n; j++)
        {
          System.out.print(a[i][j] + " ");
        }
        System.out.println();
      }
    }
  public static void print_spirally(int a[][],int n)
  {
    int val = 1;
    int row_min = 0, col_min = 0;
    int row_max = n-1, col_max = n-1;
    
    while((row_min <= row_max) && (col_min <= col_max))
    {
      //right to left
      for(int i = col_max; i >= col_min; i--)
      {
        a[row_min][i] = val++;
      }
      //top to bottom
      for(int i = row_min+1; i <= row_max; i++)
      {
        a[i][col_min] = val++;
      }
      //left to right 
      for(int i = col_min+1; i <= col_max; i++)
      {
        a[row_max][i] = val++;
      }
      //bottom to top
      for(int i = row_max-1; i >= row_min+1; i--)
      {
        a[i][col_max] = val++;
      }
      row_min++;
      col_min++;
      row_max--;
      col_max--;
    }
  }
  
}