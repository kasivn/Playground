import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int stars = in.nextInt();
    int count ;
    for (count = 1; count <= stars ; count++)
      System.out.println("*");
  }
}