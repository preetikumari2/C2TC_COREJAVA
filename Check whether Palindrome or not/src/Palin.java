import java.util.Scanner;
public class Palin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int rem, rev = 0, temp = num;
		while(num > 0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		if(rev == temp)
			System.out.println(temp+" is a Palindrome Number");
		else
			System.out.println(temp+" is not a Palindrome Number");
	}

}