import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n;  i++ )
    {
      arr[i] = in.nextInt();
    }
    half_sort(n,arr);
  }
  public static void half_sort(int n, int arr[])
  {
    int temp;
    int front = 0;
    int end = n;
    int middle = (front+end)/2;
    for(int i = 0; i < middle; i++)
    {
      for(int j = i+1; j < middle ; j++)
      {
        if(arr[i] > arr[j])
        {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for(int i = 0; i < n; i++)
    {
      System.out.print(arr[i]+ " ");
    }
  }
}