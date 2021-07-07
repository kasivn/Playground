import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = 0;
      for(int sum = 0 ; n >= sum ; sum = sum + 1 )
      {
        count = count + sum;
      }
      System.out.println(count);
	}
}