import java.util.Scanner;
class Main{
  	public static boolean isprime (int a)
  {
    boolean is_prime=true;
      for (int j=2; j<=(a/2); j++)
      {
        if (a%j==0)
        {
          is_prime=false;
        	break;
        }
      }
    return is_prime;
  }
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      for (int i=2; i<=n; i++)
      {
        if (isprime(i))
        {
          System.out.println(i);
        }
      }
         
	}
}