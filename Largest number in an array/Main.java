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
      int maxno=0;
      for(int i=0; i<=n-1; i++)
      {
      if(arr[i]>maxno)
      {
      maxno=arr[i];
      }
      }
        System.out.println(maxno);
      
      
      
      
    }
     
    }
    