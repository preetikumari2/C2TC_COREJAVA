import java.util.Scanner;
public class stringbuffer {
	public static void main(String args[])
	{   
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		char a[]=str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='A'& a[i]<='Z')
			{
				a[i]=(char) ((int)a[i]+32);
			}
			else if(a[i]>='a'& a[i]<='z')
			{
				a[i]=(char)((int)a[i]-32);
			}
		}
		System.out.println("after toggle");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
} 