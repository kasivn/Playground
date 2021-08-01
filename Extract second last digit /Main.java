import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int last = num%100;
      int ans = last/10;
      System.out.println(ans);
	}
}