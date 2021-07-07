import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int temp=num;
      int sum=0;
      while(num>0)
      {
      int r=num%10;
        int fact=1;
        for(int i=1; i<=r; i++)
        {
        fact=fact*i;   
        }
        sum=sum+fact;
        num=num/10;
        
      }
      if(temp==sum)
      {
        System.out.println("Yes");
      }
      else
        System.out.println("No");
    }
      
        }
