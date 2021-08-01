import java.util.Scanner;
class Main
{
  public static int largestIndex(int len, int arr[])
  {
    int largest=0;
    int temp=arr[0];
    for (int i=0; i<len; i++)
    {
      if (arr[i]>temp)
      {
        temp=arr[i];
        largest=i;
      }
    }
    return largest;
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
    System.out.print(largestIndex(n,arr));
  }
}