import java.util.*;

public class Digits{
	  static int dc(int n)
		{
		if(n<=9)
		{
			return 1;
		}
		else
		{
			return 1+dc(n/10);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		 int n=sc.nextInt();
        System.out.println(dc(n));
	   
	}
	}
