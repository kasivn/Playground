import java.util.Scanner;
class Main
{
  public static void summing(int n, int arr[])
  {
    int sum=arr[0]+arr[1]+arr[2];
    int sum1=1;
    for (int i=3; i<=(n-1); i=i+3)
    {
      sum1=arr[i]+arr[i+1]+arr[i+2];
    }
    if (sum1==sum)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for (int i=0; i<n; i++)
    {
      arr[i]=sc.nextInt();
    }
    summing(n,arr);
  }
}