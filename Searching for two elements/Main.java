import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0; i<=n-1; i++)
      {
      arr[i]=in.nextInt();
      }
      int num1=in.nextInt();
      int num2=in.nextInt();
      int temp1=-1;
      int temp2=-1;
      for(int i=0; i<=n-1; i++)
      {
      if(num1==arr[i])
      {
      temp1=i;
      }
        if(num2==arr[i])
        {
        temp2=i;
        }
      }
        System.out.println(temp1);
        System.out.println(temp2);
      
    }
}