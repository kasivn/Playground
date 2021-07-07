import java.util.Scanner;
class Main{
    public static int powerFun(int a, int b)
    {
      int sum=1;
      for (int i=1; i<=b; i++)
      {
        sum=sum*a;
      }
      return sum;
    }
  
  public static void main (String[] args){
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int exp=sc.nextInt();
      System.out.print(powerFun(n,exp));
       
  }
}