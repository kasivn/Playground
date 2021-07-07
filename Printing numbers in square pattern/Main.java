import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    for(int row = 1 ; row <= a ; row++)
    {
    for(int col = 1 ; col <= a ; col++)
    {
      System.out.print(row);
    }
    System.out.print("\n");
    }
  }
}