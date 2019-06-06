import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
	  Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      for(int index = 0; index < arr_size; index++)
      {
        arr[index] = sc.nextInt();
      }      
      int count = 1;
      for(int i = 0; i <= arr_size - 1; i++)
      {
        if(arr[i] == arr[i+1])
        {
          count++;
        }
        else
        {
          break;
        }
      }
      System.out.print(count);
    }
}