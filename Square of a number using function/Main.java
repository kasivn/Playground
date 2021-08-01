import java.util.Scanner;
class Main
{
  public static int square(int m)
  {
  int digit = m * m;
  return digit;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int o = square(n);
      System.out.print(o);	
    } 
}