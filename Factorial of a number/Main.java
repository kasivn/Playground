import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int c=1;
      for(int i=2; i<=num; i++)
      {
      c=c*i;
      }
      System.out.println(c);
	}
}