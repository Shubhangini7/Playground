import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
    {
      arr[i] = in.nextInt();
    }
    sub_seq(n,arr);
  }
  public static void sub_seq(int n, int arr[])
  {
    for(int i = 0;  i < n; i++)
    {
      for(int j = 0; j < n; j++)
      {
        if((arr[i]<arr[j]) && (i<j))
        {
          System.out.println(arr[i]+","+arr[j]);
        }
      }
    }
  }
}