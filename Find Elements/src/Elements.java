import java.util.Scanner;
public class Elements {

	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		int key = sc.nextInt();
		for(int i = 0; i < size; i++)
		{
			if(arr[i] == key)
			{
				flag = i;
				break;
			}
		}
		if(flag != -1)
			System.out.println("Index position of " +key+ " is :"+flag);
		else
			System.out.println("Element not found");
	}

}