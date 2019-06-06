import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in  = new Scanner(System.in);
	  int n = in.nextInt();
      int count = n;
      for(int i = 1; i <= count; i++)
      {
        
         if(i % 2 == 1)
	         {
                count = count + 1;
                System.out.println(i);   
             }
       
      }
	}
}