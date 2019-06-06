import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n;  i++ )
    {
      arr[i] = in.nextInt();
    }
    half_asc(n,arr);
    half_des(n,arr);
    
    for(int i = 0; i < n; i++)
    {
      System.out.print(arr[i]+ " ");
    }
  }
  public static void half_asc(int n, int arr[])
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
  }
  public static void half_des(int n, int arr[])
  {
    int temp;
    int front = n/2;
    int end = n;
    int middle = (front+end)/2;
    for(int i = front; i < n; i++)
    {
      for(int j = i+1; j < n ; j++)
      {
        if(arr[i] < arr[j])
        {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}