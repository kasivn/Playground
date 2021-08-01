import java.util.Scanner;
class Main
{
  public static int sum_of_digits(int m)
  {
  int temp = 0;
    for (int i = 0 ; i <= m ; i++)
    {
    temp = i + temp;
    }
    return temp;
  }
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int o = sum_of_digits(n);
      System.out.print(o);
	}
}