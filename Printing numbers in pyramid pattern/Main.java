import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=1;
      for(int i=0; i<n; i++)
      {
      for(int j=n-i-1; j>0; j--)
      {
      System.out.print(" ");
      }
        for(int j=0; j<=i; j++)
        {
        System.out.print(num);
          if(j!=i) {
          	System.out.print(" ");
          }
          num++;
        }
        System.out.println();
      }
    }    
}