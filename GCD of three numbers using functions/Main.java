import java.util.Scanner;
class Main{
  	public static int gcdOfTwoNumbers (int num1, int num2)
    {
     int min=1;
      int gcd=1;
      if (num1 > num2)
      {
        min=num2;
      }
      else
      {
        min=num1;
      }
      while (min>=1)
      {
        if (num1%min==0 && num2%min==0)
        {
          gcd=min;
          break;
        }
        min--;
      }
  return gcd;
    }
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      	int n1=sc.nextInt();
      	int n2=sc.nextInt();
      	int n3=sc.nextInt();
      int gcd=gcdOfTwoNumbers(n1,n2);
      System.out.print(gcdOfTwoNumbers(gcd,n3));
	}
}